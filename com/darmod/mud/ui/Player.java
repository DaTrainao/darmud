package com.darmod.mud.ui;

import java.io.PrintStream;

import com.darmod.mud.Block;
import com.darmod.mud.World;
import com.darmod.mud.darmud;

public class Player extends Block {
	
	private Block player;
	private PrintStream o = System.out;
	
	public Player(String name, World w) {
		super(w, name);
		player = new Block(darmud.curr, name);
		player.addFlag("player");
		player.attr("desc", "A large dark man with an afro. He wears a suit.");
	}
	
	public void sendText(String s) {
		o.println(s);
	}
	
}
