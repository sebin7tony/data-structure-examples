package com.java.array;

import java.util.Arrays;

public class LargestSubset {
	
	public void method1(Integer[] input){
		
		Arrays.sort(input);
		
		Integer start = 0, length = 1,tempStart = 0, tempLength=1;
		
		for(int i=0;i<input.length-1;i++){
			
			if(input[i+1] - input[i] == 1){
				
				tempLength++;
			}
			else{
				
				if(tempLength > length){
					
					length = tempLength;
					start = tempStart;
				}
				tempLength = 1;
				tempStart = i+1;
			}
		}
		if(tempLength > length){
			
			length = tempLength;
			start = tempStart;
		}
		
		System.out.println("Lets check the answers !!");
		for(int i=start;i<(start+length);i++){
			
			System.out.print(input[i]+" ");
		}
	}
	
	public void method2(Integer[] input){
		
		Integer larg = input[0];
		for(int i=1;i<input.length;i++){
			
			if(larg < input[i]){
				
				larg = input[i];
			}
		}
		
		larg = Math.max(larg, input.length);
		
		int[] buffer = new int[larg+1];
		
		for(int i=0;i<input.length;i++){
			
			buffer[input[i]] = buffer[input[i]]+1; 
		}
		
		Integer start = 0, length = 0,tempStart = 0, tempLength=0;
		
		for(int i=0;i<buffer.length-1;i++){
			
			if(buffer[i] == 1){
				
				tempLength++;
			}
			else{
				
				if(tempLength > length){
					
					length = tempLength;
					start = tempStart;
				}
				tempLength = 0;
				tempStart = i+1;
			}
		}
		if(tempLength > length){
			
			length = tempLength;
			start = tempStart;
		}
		

		System.out.println("Lets check the answers !!");
		for(int i=start;i<(start+length);i++){
			
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		
		LargestSubset subset = new LargestSubset();
		Integer[] input = new Integer[]{5,6,10,4,7,9,1};
		subset.method2(input);
	}
}
