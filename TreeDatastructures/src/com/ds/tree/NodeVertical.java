package com.ds.tree;

public class NodeVertical {
	
	protected int value;
	protected int verticalLevel;
	protected NodeVertical lchild,rchild;
	
	public int getVerticalLevel() {
		return verticalLevel;
	}
	public void setVerticalLevel(int verticalLevel) {
		this.verticalLevel = verticalLevel;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public NodeVertical getLchild() {
		return lchild;
	}
	public void setLchild(NodeVertical lchild) {
		this.lchild = lchild;
	}
	public NodeVertical getRchild() {
		return rchild;
	}
	public void setRchild(NodeVertical rchild) {
		this.rchild = rchild;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+value;
	}
	
	public static void main(String[] args) {
		
		
	}

}
