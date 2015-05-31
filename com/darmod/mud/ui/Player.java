package com.darmod.mud.ui;

import java.io.PrintStream;

import com.darmod.mud.Block;
import com.darmod.mud.World;

public class Player extends Block {
	
	private Block player;
	private PrintStream o = System.out;
	
	public Player(String name, World w) {
		super(w, name);
		player = new Block(w, name);
		player.addFlag("player");
		player.attr("desc", "A large dark man with an afro. He wears a suit.");
	}
	
	public void sendText(String s) {
		o.println(s);
	}
	
	public void exec(String cmd) {
		if (cmd.contains(" "))
			Command.parse(cmd.split(" ")[0], this, cmd.substring(cmd.indexOf(' ')).split(" "));
		else
			Command.parse(cmd, this, null);
	}
	
}
