package com.geek.amazon181;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Node{
	
	private Character ch;
	
	public Node(Character c) {
		
		this.ch = c;
	}

	public Character getCh() {
		return ch;
	}

	public void setCh(Character ch) {
		this.ch = ch;
	}
	
}

public class FirstNonRepeating {

	
	public static void findFirstNonRepeating(char[] input){
		
		if(input.length == 0){
			
			throw new IllegalArgumentException("please provide valid character stream");
		}
		
		boolean done = true;
		
		for(int i=0;i<input.length ; i++){
			
			done = true;
			for(int j=0; j < input.length ;j++){
				
				if(i != j && input[i] == input[j] ){
					
					done =false;
					break;
				}
			}
			if(done){
				
				System.out.println("The first non repeating character : "+input[i]);
				break;
			}
		}
		
	}
	
	//time complexity O(n) space complexity O(1)
	public static void findFirstNonRepeating1(char[] input){
		
		if(input.length == 0){
			
			throw new IllegalArgumentException("please provide valid character stream");
		}
		
		byte[] count = new byte[256];
		
		for(char c : input){
			count[c]++; 
		}
		
		for(char c : input){
			
			if(count[c] == 1){
				
				System.out.println("The first non repeating character : "+c);
				break;
			}
		}
		
	}
	
	
	
	public static void findFirstNonRepeating2(char[] input){
		
		LinkedList<Node> linkedList = new LinkedList<Node>();
		Map<Character, Node> map = new HashMap<Character, Node>();
		
		for(Character c : input){
			
			if(map.containsKey(c)){
				
				linkedList.remove(map.get(c));
				Node node = new Node(c);
				linkedList.addLast(node);
				map.put(c, node);
			}
			else{
				
				Node node = new Node(c);
				linkedList.addLast(node);
				map.put(c, node);
			}
		}
		
		Node node = linkedList.getFirst();
		System.out.println("This is the first non repeating character "+node.getCh());
	}
	
	public static void main(String[] args) {
		
		
		char[] input = "sebinsben".toCharArray();
		FirstNonRepeating.findFirstNonRepeating2(input);
		
		System.out.println();
		
		//char[] input1 = "".toCharArray();
		//FirstNonRepeating.findFirstNonRepeating(input1);
	}
}
