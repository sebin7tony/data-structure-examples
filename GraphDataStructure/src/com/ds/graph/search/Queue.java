package com.ds.graph.search;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
	
	private List<T> queue;
	private int size;
	private int frontPointer;
	
	public Queue(int size) {
		
		if(size == 0){
			
			System.out.println("Queue cannot be made");
			return;
		}
		queue = new ArrayList<T>();
		this.size = size;
		this.frontPointer = 0;
	}
	
	public boolean isEmpty(){
		
		if(queue.size() > 0){
			
			return false;
		}
		else{
			
			return true;
		}
	}
	
	public void enqueue(T tmp){
		
		if(tmp != null){
			if(frontPointer <= size){
				
				queue.add(tmp);
				frontPointer++;
			}
			else{
				
				System.out.println("Error : size exceeded");
			}
		}
		
	}

	public T dequeue(){
		
		if(queue.size() != 0){
			
			T temp = queue.remove(0);
			return temp;
		}
		else{
			System.out.println("Error : No more elements to dequeue");
			return null;
		}
			
	}
	
	public void display(){
		
		System.out.println("Displaying the contents of the queue");
		
		for(T entry : queue){
			
			System.out.print(entry+ " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new Queue<Integer>(10);
		q.enqueue(12);
		q.enqueue(21);
		q.enqueue(31);
		q.enqueue(41);
		q.enqueue(54);
		q.enqueue(65);
		
		q.display();
		System.out.println("Dequeued "+q.dequeue());
		System.out.println("Dequeued "+q.dequeue());
		System.out.println("Dequeued "+q.dequeue());
		System.out.println("Dequeued "+q.dequeue());
		q.display();
		
		q.enqueue(21);
		q.display();
		
	}
}
