package com.darmod.mud;

import java.util.ArrayList;

class World {
	private static int OBJECT_NUMBER = 0;
	private ArrayList<Room> rooms;

	public World(String name) {

	}
	
	public int getNextId() {
		return OBJECT_NUMBER++;
	}

}
