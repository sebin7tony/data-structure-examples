package com.ds.tree;

public class LevelWisePrint {
	
	Tree tree;
	Queue<Node> queue;
	
	public LevelWisePrint() {
		
		tree = new Tree();
		
		/*tree.addNode(20, tree.getRoot());
		tree.addNode(8, tree.getRoot());
		tree.addNode(22, tree.getRoot());
		tree.addNode(25, tree.getRoot());
		tree.addNode(4, tree.getRoot());
		tree.addNode(12, tree.getRoot());
		tree.addNode(10, tree.getRoot());
		tree.addNode(14, tree.getRoot());*/
		tree.addNode(50, tree.getRoot());
		tree.addNode(45, tree.getRoot());
		tree.addNode(65, tree.getRoot());
		tree.addNode(99, tree.getRoot());
		tree.addNode(52, tree.getRoot());
		tree.addNode(58, tree.getRoot());
		tree.addNode(31, tree.getRoot());
		tree.addNode(47, tree.getRoot());
		tree.addNode(42, tree.getRoot());
	}
	
	public void print(){
		
		Node dummy = new Node();
		dummy.setValue(-1);
		
		queue = new Queue<Node>(50);
		queue.enqueue(dummy);
		queue.enqueue(tree.getRoot());
		boolean flag = true;
		
		while(queue.isEmpty()){
			
			
			Node current = queue.dequeue();
			if(current != null){
				if(current.getValue() < 0 && flag == true){
					
					System.out.println("");
					queue.enqueue(dummy);
					flag = false;
				}
				else{
					if(current.getValue() > -1){
						System.out.print(current.getValue()+" ");
						
						queue.enqueue(current.getLchild());
						queue.enqueue(current.getRchild());
						flag = true;
					}
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		LevelWisePrint lp = new LevelWisePrint();
		lp.print();
	}
	

}
