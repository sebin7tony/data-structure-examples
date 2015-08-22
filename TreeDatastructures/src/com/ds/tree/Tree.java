package com.ds.tree;

public class Tree {
	
	private Node root;
	
	public Node getRoot(){
		
		return root;
	}
	
	public boolean addNode(int value,Node run){
		
		if(root == null){
			
			Node temp = new Node();
			temp.setValue(value);
			root = temp;
			return true;
		}
		if(value > run.getValue()){
			
			if(run.getRchild() == null){
				
				Node temp = new Node();
				temp.setValue(value);
				run.setRchild(temp);
				return true;
			}
			else{
				
				addNode(value, run.getRchild());
			}
		}
		else{
			
			if(run.getLchild() == null){
				
				Node temp = new Node();
				temp.setValue(value);
				run.setLchild(temp);
				return true;
			}
			else{
				
				addNode(value, run.getLchild());
			}
		}
		
		
		return false;
	}
	
	
	public void inorder(Node ptr){
		
		if(ptr != null){
			
			inorder(ptr.getLchild());
			System.out.print(ptr.getValue()+" ");
			inorder(ptr.getRchild());
			
		}
	}
	
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		tree.addNode(50, tree.getRoot());
		tree.addNode(45, tree.getRoot());
		tree.addNode(65, tree.getRoot());
		tree.addNode(99, tree.getRoot());
		tree.addNode(52, tree.getRoot());
		tree.addNode(58, tree.getRoot());
		tree.addNode(31, tree.getRoot());
		tree.addNode(47, tree.getRoot());
		tree.addNode(42, tree.getRoot());
		
		tree.inorder(tree.getRoot());
		
	}

}
