package com.java.tree;

class Node{
	
	private int data;
	private Node lchild;
	private Node rchild;
	
	public Node(int data) {
		
		this.data = data;
		this.lchild = null;
		this.rchild = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
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
	
}

public class MyTree {
	
	private Node root;
	
	public Node getRoot(){
		
		return root;
	}

	public void addNode(Node newNode){
		
		Node runner = root,parent = null;
		if(root == null){
			
			root = newNode;
		}
		else{
			
			while(runner != null){
				
				parent = runner;
				if(runner.getData() > newNode.getData()){
					
					runner = runner.getLchild();
				}
				else if(runner.getData() < newNode.getData()){
					
					runner = runner.getRchild();
				}
				else{
					
					System.out.println("Value already exists !!");
				}
			}
			
			if(parent.getData() > newNode.getData() && parent.getLchild() == null){
				
				parent.setLchild(newNode);
			}
			else if(parent.getData() < newNode.getData() && parent.getRchild() == null){
				
				parent.setRchild(newNode);
			}
			else{
				
				System.out.println("Something is wrong !!");
			}
			
		}
		
	}
	
	
	public void print(Node runner){
		
		if(runner != null){
			
			print(runner.getLchild());
			System.out.println(runner.getData()+" ");
			print(runner.getRchild());
		}
	}
	
	public static void main(String[] args) {
		
		MyTree myTree = new MyTree();
		myTree.addNode(new Node(34));
		myTree.addNode(new Node(24));
		myTree.addNode(new Node(56));
		myTree.addNode(new Node(12));
		myTree.addNode(new Node(23));
		myTree.addNode(new Node(3));
		myTree.addNode(new Node(47));
		myTree.addNode(new Node(21));
		myTree.print(myTree.getRoot());
	}
}
