package com.darmod.mud;

import java.util.ArrayList;

import com.darmod.mud.math.Vector3;

public class World {
	private static int OBJECT_NUMBER = 0;
	private int width, height;
	private ArrayList<Room> rooms=new ArrayList<Room>();
	private String name;

	public World(String name) {
		this.name=name;
	}
	
	public World(String name, int height, int width) {
		this.name=name;
		fillWorld(height, width, width);
	}
	
	public String getName() {
		return this.name;
	}

	public int getNextId() {
		return OBJECT_NUMBER++;
	}
	
	public void fillWorld(int layers) {
		for(int z = 0; z < layers; z++) {
			for(int x = 0; x < width; x++) {
				for(int y = 0; y < height; y++) {
					rooms.add(new Room(this,"Room #" + OBJECT_NUMBER, new Vector3(x,y,z)));
				}
			}
		}
	}
	
	public void fillWorld(int layers, int width, int height) {
		this.width = width;
		this.height = height;
		for(int z = 0; z < layers; z++) {
			for(int x = 0; x < width; x++) {
				for(int y = 0; y < height; y++) {
					rooms.add(new Room(this, "Room #" + OBJECT_NUMBER, new Vector3(x,y,z)));
				}
			}
		}
	}

}
