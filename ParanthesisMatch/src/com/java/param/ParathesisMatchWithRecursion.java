package com.java.param;

import java.util.HashMap;
import java.util.Map;

public class ParathesisMatchWithRecursion {
	
	public Map<Character, Character> brackMap = new HashMap<Character, Character>();
	
	public ParathesisMatchWithRecursion() {
		
		brackMap.put('(', '\u0000');
		brackMap.put(')', '(');
		brackMap.put('[', '\u0000');
		brackMap.put(']', '[');
	}
	
	
	public char paramMatch(char[] input,int jumper,int current){
		
		if(input.length > current+jumper){
			
			if(brackMap.containsKey(input[current+jumper])){
				
				if(brackMap.get(input[current+jumper]) == '\u0000'){
					
					for(int i =current+jumper;i<input.length;i++ ){
						
						char value = paramMatch(input, jumper, current+1);
						if(value == '\u0000'){
							
							jumper = jumper+2;
							
						}
						else if(brackMap.containsKey(value)){
							
							return '\u0000';
						}
						else{
							
							return 'f';
						}
						
					}
					
					
					
				}
				else{
					
					return input[current+jumper];
				}
				
			}
		}
		else{
		
			return 'f';
		}
		
		return '\u0000';
	}
	
	public static void main(String[] args) {
		
		ParathesisMatchWithRecursion pr = new ParathesisMatchWithRecursion();
		
		if(pr.paramMatch("())([])".toCharArray(), 0, 0) == '\u0000'){
			
			System.out.println("paranthesis matching");
		}
		else{
			
			System.out.println("Paranthesis is not matching");
		}
	}

}
