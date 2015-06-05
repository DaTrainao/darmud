package com.darmod.mud.ui;

import java.util.HashMap;

import com.darmod.mud.Block;
import com.darmod.mud.Room;
import com.darmod.mud.World;

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
		System.out.println("[SERVER] Running command '" + c + "' args '" + args + "'.");
		if (commands.containsKey(c)) {
			System.out.println("[SERVER] Command found!");
			commands.get(c).exec(user, args);
		} else
			System.out.println("[SERVER] Command '" + c + "' not found.");
	}

	@SuppressWarnings("unused")
	private static final Command look = new Command("look") {

		@Override
		protected void exec(Block user, Object[] args) {
			Player p = (Player) user;
			System.out.println("[SERVER] Command LOOK: player set to "+ p.toString());
			if (args != null) {
				if (args.length > 1) {
					Room r;
					if ((r = p.getAboveRoom()) != null) {
						p.sendText((String)r.getAttr("desc"));
						for (Object s : args) {
							if (r.contains(s)) {
								p.sendText("\n" + r.getSub().getAttr("desc"));
							}
						}
					} else {
						p.sendText("\n" + p.getAboveRoom().getAttr("desc"));
					}
				} else {
					
					Room r;
					if ((r = p.getAboveRoom()) != null) {
						p.sendText((String)r.getAttr("desc"));
						for (Object s : args) {
							p.sendText("\n" + r.getSub().getAttr("desc"));
						}
					}
					
					p.sendText("\n" + p.getAboveRoom().getAttr("desc"));
				}
			} else {

				Room r;
				if ((r = p.getAboveRoom()) != null) {
					p.sendText((String)r.getAttr("desc"));
					for (Block s : r.getSubs()) {
						p.sendText("\n" + r.getSub().getAttr("desc"));
					}
				}
				
			}
		}

	};

	@SuppressWarnings("unused")
	private static final Command move = new Command("move") {
		@Override
		protected void exec(Block user, Object[] args) {
			World w;
			if( ( w = (World) user.getAboveRoom().getWorld()) != null ) {
				Room r;
				(r=w.getRoom((String)args[0])).add(user);
				user.attr("room", r);
			}

		}

	};

	@SuppressWarnings("unused")
	private static final Command make = new Command("create") {
		@Override
		protected void exec(Block user, Object[] args) {
			if (user.getClass().equals(Player.class)) {
				Player p = (Player) user;
				System.out.println("[SERVER] [WARNING] Command \"create\" invoked.");
				if (args != null) {
					System.out.println("[SERVER] args are " + (String) args[0] + ".");
					Room r = p.getAboveRoom();
					if (p.getAboveRoom() != null) {
						if (args.length > 1) {
							Block b = new Block(r, (String) args[1]);
							p.exec("look");
							System.out.println("[SYSTEM] Object #" + b.getId() + " created in room #" + r.getId() + "." );
						} else {
							
						}
					}
				}
			} else {

			}
		}
	};

}
