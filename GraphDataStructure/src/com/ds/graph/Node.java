package com.ds.graph;

public class Node<T> {
	
	private T value;
	private Node next;
	
	public Node(String value) {
		
		if(Character.isDigit(value.charAt(0))){
			
			this.value = (T)((Integer)Integer.parseInt(value));
		}else{
			
			this.value = (T) value;
		}
		
	}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Node){
			
			if(((Node) obj).getValue() == this.value){
				
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (Integer) this.value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.value.toString();
	}
}
