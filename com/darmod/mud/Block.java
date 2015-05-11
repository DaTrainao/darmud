package com.darmod.mud;

import java.util.ArrayList;
import java.util.HashMap;

class Block {
	private int id;
	private ArrayList<String> flags = new ArrayList<String>();
	private HashMap<String, Object> attributes;

	public Block(World w) {
		id = w.getNextId();
		attributes = new HashMap<String, Object>();

	}

	public Block(World w, String name) {
		id = w.getNextId();
		attributes = new HashMap<String, Object>();
		attr("name", name);

	}

	public Block(World w, String name, String description) {
		id = w.getNextId();
		attributes = new HashMap<String, Object>();
		attr("name", name);
		attr("description", description);

	}

	public Block(Room r) {
		id = r.getWorld().getNextId();
		attributes = new HashMap<String, Object>();

	}

	public Block(Room r, String name) {
		id = r.getWorld().getNextId();
		attributes = new HashMap<String, Object>();
		attr("name", name);

	}

	public Block(Room r, String name, String description) {
		id = r.getWorld().getNextId();
		attributes = new HashMap<String, Object>();
		attr("name", name);
		attr("description", description);

	}

	public void addFlag(String s) {
		flags.add(s.toLowerCase());
	}

	public void attr(String key, Object val) {
		attributes.put(key.toLowerCase(), val);
	}

	public String toString() {
		String temp = "Object #" + id + "\n";
		for (String i : attributes.keySet())
			temp += "\t" + i + "\t:\t" + attributes.get(i);
		return temp;
	}

}
