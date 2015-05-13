package com.darmod.mud.ui;

import com.darmod.mud.Block;
import com.darmod.mud.darmud;

public class Player {
	
	private Block player;
	
	public Player(String name) {
		player = new Block(darmud.curr, name);
	}
	
}