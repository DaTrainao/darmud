package com.darmod.mud.ui;

import com.darmod.mud.Block;
import com.darmod.mud.darmud;

public class Player {
	
	private Block player;
	
	public Player(String name) {
		player = new Block(darmud.curr, name);
		player.addFlag("player");
		player.attr("desc", "A large dark man with an afro. He wears a suit.");
	}
	
}
