package com.darmod.mud;

class Factory {
	private static World curr;

	public static Block genEntity(String name) {
		Block b = new Block(curr, name);
		
		return b;
	}

	public static void setWorld(World w) {
		curr = w;
	}

}
