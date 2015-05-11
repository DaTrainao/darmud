package com.darmod.mud;

import java.util.ArrayList;

class World {
	private static int OBJECT_NUMBER = 0;
	private int width, height;
	private ArrayList<Room> rooms;

	public World(String name) {

	}
	
	public World(String name, int height, int width) {
		
	}
	
	public int getNextId() {
		return OBJECT_NUMBER++;
	}
	
	public void fillWorld(int layers, int x, int y) {
		
	}

}
