package com.ds.tree;

public class Node {
	
	protected int value;
	protected Node lchild,rchild;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getLchild() {
		return lchild;
	}
	public void setLchild(Node lchild) {
		this.lchild = lchild;
	}
	public Node getRchild() {
		return rchild;
	}
	public void setRchild(Node rchild) {
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
