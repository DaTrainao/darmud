package com.darmod.mud.ui;

import java.util.HashMap;

import com.darmod.mud.Block;
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

	protected abstract void exec(Block user, Object[] args);

	public static void parse(String c, Block user, Object[] args) {
		System.out.println("[SERVER] Running command '"+c+"' args '"+args+"'.");
		if (commands.containsKey(c)) {
			System.out.println("[SERVER] Command found!");
			commands.get(c).exec(user, args);
		} else
			System.out.println("[SERVER] Command '"+c+"' not found.");
	}

	@SuppressWarnings("unused")
	private static final Command look = new Command("look") {

		@Override
		protected void exec(Block user, Object[] args) {
			Player p = (Player) user;
			System.out.println("[SERVER] Command LOOK: player set to " + p.toString());
			if(args != null) {
				if (args.length > 1) {
					Room r;
					if ( (r=p.getAboveRoom()) != null) {
						for (Object s : args) {
							if(r.contains(s)) {
								p.sendText(""+r.getSub().getAttr("desc"));
							}
						}
					} else {
						p.sendText(""+p.getAboveRoom().getAttr("desc"));
					}
				} else {
					p.sendText(""+p.getAboveRoom().getAttr("desc"));
				}
			}
		}

	};
	
	@SuppressWarnings("unused")
	private static final Command move = new Command("move") {
		@Override
		protected void exec(Block user, Object[] args) {
			// TODO Auto-generated method stub
			
		}
		
	};
}
