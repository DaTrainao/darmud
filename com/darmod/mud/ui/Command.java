package com.darmod.mud.ui;

import java.util.HashMap;

import com.darmod.mud.Room;

public abstract class Command {

	public static HashMap<String, Command> commands = new HashMap<String, Command>();

	public Command(String command) {
		commands.put(command.toLowerCase(), this);
	}

	@SuppressWarnings("static-access")
	public Command(String command, String[] aliases) {
		commands.put(command.toLowerCase(), this);
		if (aliases != null) {
			for (String s : aliases)
				this.commands.put(s.toLowerCase(), this);
		}
	}

	protected abstract void exec(Object[] args);

	public void parse(String c, Object[] args) {
		commands.get(c).exec(args);
	}

	private static final Command look = new Command("look") {

		@Override
		protected void exec(Object[] args) {
			Player p = (args[0].getClass().equals(Player.class) ? (Player) args[0]
					: null);
			if (args.length > 1) {
				Room r;
				if ( (r=p.getAboveRoom()) != null) {
					for (Object s : args) {
						if(r.contains(s)) {
							p.sendText(""+r.getSub().getAttr("desc"));
						}
					}
				}
			} else {
				p.sendText(""+p.getAboveRoom().getAttr("desc"));
			}
		}

	};
	
	private static final Command move = new Command("move") {

		@Override
		protected void exec(Object[] args) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
}