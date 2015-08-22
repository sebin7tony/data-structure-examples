package com.ds.tree;

import java.util.Stack;

public class FindKLengthNodes {
	
	private Tree tree;
	
	public FindKLengthNodes() {
		
		tree = new Tree();
		
		/*tree.addNode(20, tree.getRoot());
		tree.addNode(8, tree.getRoot());
		tree.addNode(22, tree.getRoot());
		tree.addNode(25, tree.getRoot());
		tree.addNode(4, tree.getRoot());
		tree.addNode(12, tree.getRoot());
		tree.addNode(10, tree.getRoot());
		tree.addNode(14, tree.getRoot());*/
		
		
		tree.addNode(32, tree.getRoot());
		tree.addNode(25, tree.getRoot());
		tree.addNode(65, tree.getRoot());
		tree.addNode(13, tree.getRoot());
		tree.addNode(30, tree.getRoot());
		tree.addNode(27, tree.getRoot());
		tree.addNode(31, tree.getRoot());
		tree.addNode(11, tree.getRoot());
		tree.addNode(19, tree.getRoot());
		tree.addNode(17, tree.getRoot());
		
		tree.addNode(16, tree.getRoot());
		tree.addNode(18, tree.getRoot());
		tree.addNode(97, tree.getRoot());
		tree.addNode(81, tree.getRoot());
		tree.addNode(100, tree.getRoot());
		
	}
	
	public void findDistance(Node run,int dist,int currDist){
		
		if(run != null){
			
			if(dist == currDist ){
				
				System.out.print(" "+run.getValue());
				return;
			}
			
			if(run.getLchild() != null){
				
				findDistance(run.getLchild(), dist, currDist+1);
			}
			
			if(run.getRchild() != null){
				
				findDistance(run.getRchild(), dist, currDist+1);
			}
		}
		
	}

	public void finDistancefromParent(Node run,int dist,int currDist,int value){
		
		if(dist == currDist){
			
			System.out.print(" "+run.getValue());
		}
		
		if(run.getValue() > value){
			
			findDistance(run.getRchild(), dist, currDist+1);
		}
		
		if(run.getValue() < value){
			
			findDistance(run.getLchild(), dist, currDist+1);
		}
	}
	
	public void printKdistantNodes(int dist,int valueTocheck){
		
		Stack<Node> parentStack = new Stack<Node>();
		
		Node run = tree.getRoot();
		boolean valueFound = false;
		
		while(run != null){
			
			if(run.getValue() > valueTocheck){
				
				parentStack.push(run);
				run = run.getLchild();
			}
			else if(run.getValue() < valueTocheck){
				
				parentStack.push(run);
				run = run.getRchild();
			}
			else{
				
				valueFound = true;
				break;
			}
		}
		
		if(valueFound == true){
			
			findDistance(run, dist, 0);
			int i = 1;
			
			while(dist >= i){
				
				if(!parentStack.empty()){
					
					Node temp = parentStack.pop();
					finDistancefromParent(temp, dist, i,valueTocheck);
					i++;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		FindKLengthNodes fn = new FindKLengthNodes();
		fn.printKdistantNodes(1, 13);
	}

}
