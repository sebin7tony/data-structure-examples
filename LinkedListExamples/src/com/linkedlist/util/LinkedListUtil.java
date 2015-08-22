package com.linkedlist.util;

import java.util.LinkedList;

public class LinkedListUtil {
	
	public static void main(String[] args) {
		
		// Java is providing by default linkedList implementation
		// Lets go through the details
		
		LinkedList<String> ll = new LinkedList<String>();
		
		// http://www.tutorialspoint.com/java/java_linkedlist_class.htm
		// the above link is having all the details about the same
		
		ll.add("Sebin");
		ll.add("Tony");
		ll.add(1,"Antony");
		ll.addLast("last");
		ll.remove(3);
		
		System.out.println("COntents of the linkedList :"+ll);
	}

}
