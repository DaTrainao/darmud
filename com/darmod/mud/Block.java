package com.darmod.mud;

import java.util.ArrayList;
import java.util.HashMap;

public class Block {
	private int id;
	private ArrayList<String> flags = new ArrayList<String>();
	private HashMap<String, Object> attributes;

	public Block(World w) {
		id = w.getNextId();
		attributes = new HashMap<String, Object>();
		attr("room", null);
		attr("name", "nill");
		attr("desc", "Object #" + id + "\n name: " + this.getAttr("name"));

	}

	public Block(World w, String name) {
		id = w.getNextId();
		attributes = new HashMap<String, Object>();
		attr("name", name);
		attr("room", null);
		attr("desc", "Object #" + id + "\n name: " + this.getAttr("name"));
		
	}

	public Block(World w, String name, String description) {
		id = w.getNextId();
		attributes = new HashMap<String, Object>();
		attr("name", name);
		attr("description", description);
		attr("room", null);
		attr("desc", "Object #" + id + "\n name: " + this.getAttr("name"));

	}

	public Block(Room r) {
		id = r.getWorld().getNextId();
		attributes = new HashMap<String, Object>();
		attr("room", r);
		attr("name","nill");
		attr("desc", "Object #" + id + "\n name: " + this.getAttr("name"));
		r.add(this);

	}

	public Block(Room r, String name) {
		id = r.getWorld().getNextId();
		attributes = new HashMap<String, Object>();
		attr("name", name);
		attr("room", r);
		attr("desc", "Object #" + id + "\n name: " + this.getAttr("name"));
		r.add(this);

	}

	public Block(Room r, String name, String description) {
		id = r.getWorld().getNextId();
		attributes = new HashMap<String, Object>();
		attr("name", name);
		attr("description", description);
		attr("room", r);
		attr("desc", "Object #" + id + "\n name: " + this.getAttr("name"));
		r.add(this);

	}

	public void addFlag(String s) {
		flags.add(s.toLowerCase());
	}

	public void attr(String key, Object val) {
		attributes.put(key.toLowerCase(), val);
	}
	
	public Room getAboveRoom() {
		return (Room) attributes.get("room");
	}
	
	public Object getAttr(String attr) {
		return attributes.get(attr);
	}
	
	public int getId() {
		return id;
	}

	public String toString() {
		String temp = "Object #" + id + "\n";
		for (String i : attributes.keySet())
			temp += "\t" + i + "\t:\t" + attributes.get(i);
		return temp;
	}

}
