package com.builder.houses;

/**
 * Just another feature of a house.
 */
public class Garden {
	private boolean flowersNeeded;
	private boolean treesNeeded;
	private int size;

	public Garden(boolean flowersNeeded, boolean treesNeeded, int size) {
		super();
		this.flowersNeeded = flowersNeeded;
		this.treesNeeded = treesNeeded;
		this.size = size;
	}

	public boolean isFlowersNeeded() {
		return flowersNeeded;
	}

	public void setFlowersNeeded(boolean flowersNeeded) {
		this.flowersNeeded = flowersNeeded;
	}

	public boolean isTreesNeeded() {
		return treesNeeded;
	}

	public void setTreesNeeded(boolean treesNeeded) {
		this.treesNeeded = treesNeeded;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Garden [flowersNeeded=" + flowersNeeded + ", treesNeeded=" + treesNeeded + ", size=" + size + "]";
	}
	
	

}
