package com.darmod.mud;

import java.util.ArrayList;

public class BlockGroup {
	private Block master;
	private ArrayList<Block> subs;
	
	public BlockGroup(Block master) {
		this.master = master;
		subs = new ArrayList<Block>();
	}

	public Block getMaster() {
		return master;
	}

	public void addSub(Block b) {
		subs.add(b);
	}
	
	public void remSub(Block b) {
		if(subs.contains(b))
			subs.remove(b);
	}
	
}
