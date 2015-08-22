package com.linkedlist.self;

public class Node<T> {
	
	private T value;
	private Node next;
	
	//default constructor
	public Node(){
		
		this(null,null);
	}
	
	//constructor with 2 arguments
	public Node(T value,Node next){
		
		this.value = value;
		this.next = next;
	}
	
	public void setValue(T value){
		
		this.value = value;
	}
	
	public T getValue(){
		
		return this.value;
	}
	
	public void setNext(Node<T> next){
		
		this.next = next;
	}
	
	public Node<T> getNext(){
		
		return this.next;
	}
}
