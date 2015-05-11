package com.darmod.mud;

import java.util.ArrayList;
import java.util.HashMap;

import com.darmod.mud.math.*;

class Room {
	private ArrayList<Block> items;
	private int id;
	private World w;
	private ArrayList<String> flags;
	private HashMap<String, Object> attributes;
	private Vector3 loc;

	public Room(World w) {
		id = w.getNextId();
		this.w = w;
	}
	
	public Room(World w, String name) {
		id = w.getNextId();
		this.w = w;
	}
	
	public void add(Block b) {
		id = w.getNextId();
		items.add(b);
	}
	
	public void rem(Block b) {
		if(items.contains(b))
			items.remove(b);
	}

	public Room(World w, Vector3 loc) {
		id = w.getNextId();
		this.w = w;
		setCoor(loc);
	}
	
	public Room(World w, String name, Vector3 loc) {
		id = w.getNextId();
		this.w = w;
		setCoor(loc);
	}
	
	public void add(Block b, Vector3 loc) {
		items.add(b);
		setCoor(loc);
	}
	
	public void setCoor(Vector3 location) {
		this.loc = location;
	}
	
	public int getId() {
		return id;
	}
	
	public Vector3 getCoor() {
		return loc;
	}
	
	public World getWorld() {
		return w;
	}

	public void addFlag(String s) {
		flags.add(s.toLowerCase());
	}

	public void attr(String key, Object val) {
		attributes.put(key.toLowerCase(), val);
	}
	
}