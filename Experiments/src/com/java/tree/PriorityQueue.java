package com.java.tree;

public class PriorityQueue {
	
	private Integer[] queue;
	private Integer count = 0;
	
	public PriorityQueue(Integer n) {
		
		queue = new Integer[n];
	}
	
	public void heapifyDown(Integer root){
		
		Integer left = new Integer(root*2);
		Integer right = new Integer(root*2+1);
		Integer larg = root;
		
		if(queue[left] != null && queue[root] < queue[left] ){
			
			larg = left;
		}
		if(queue[right] != null && queue[larg] < queue[right]  ){
			
			larg = right;
		}
		
		if(root != larg){
			
			int temp = queue[root];
			queue[root] = queue[larg];
			queue[larg] = temp;
			heapifyDown(larg);
		}
	}
	
	public void HeapifyUP(Integer child){
		
		Integer root = child/2;
		if(queue[root] != null && queue[root] < queue[child] ){
			
			int temp = queue[root];
			queue[root] = queue[child];
			queue[child] = temp;
			HeapifyUP(root);
		}
	}
	
	public void addNode(int value){
		
		count++;
		queue[count] = value;
		HeapifyUP(count);
	}
	
	public Integer getMax(){
		
		Integer max = queue[1];
		queue[1] = queue[count];
		heapifyDown(1);
		count--;
		return max;
	}
	
	
	public void printTree(){
		
		System.out.println("heap array !!");
		for(int i=1;i<=count;i++){
			
			System.out.println(queue[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		PriorityQueue priorityQueue = new PriorityQueue(10);
		priorityQueue.addNode(12);
		priorityQueue.printTree();
		priorityQueue.addNode(2);
		priorityQueue.printTree();
		priorityQueue.addNode(22);
		priorityQueue.printTree();
		priorityQueue.addNode(3);
		priorityQueue.printTree();
		System.out.println("getmax");
		System.out.println(priorityQueue.getMax());
		priorityQueue.printTree();
		System.out.println("getmax");
		System.out.println(priorityQueue.getMax());
		priorityQueue.printTree();
		
	}
}
