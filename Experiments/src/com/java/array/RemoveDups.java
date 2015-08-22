package com.java.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDups {
	
	//Time complexity - O(n) Space complexity - O(1)
	public void remove1(Integer[] array,int N){
		
		Integer frequencey[] = new Integer[N];//default set is null,0 for int
		
		for(int i=0;i<array.length;i++){
			
			if(frequencey[array[i]] == null){
				
				frequencey[array[i]] = 1;
			}
			else{
				
				//duplicate
				frequencey[array[i]] = frequencey[array[i]] + 1;
			}
		}
		
		/*System.out.println("input array ");
		for(Integer k : array){
			
			System.out.print(k+" ");
		}
		System.out.println("Input frequency ");
		for(Integer k : frequencey){
			
			System.out.print(k+" ");
		}*/
		
		
		System.out.println("input array before");
		for(Integer k : array){
			
			System.out.print(k+" ");
		}
		
		int curr=0;
		
		while(curr < array.length){
			
			if(array[curr] == null){
				
				break;
			}
			else if(frequencey[array[curr]] > 1){
				
				frequencey[array[curr]] = frequencey[array[curr]] -1;
				reStructureArray(array, curr);
			}
			else{
				
				curr++;
			}
		}
		
		System.out.println("input array ");
		for(Integer k : array){
			
			System.out.print(k+" ");
		}
		System.out.println("Input frequency ");
		for(Integer k : frequencey){
			
			System.out.print(k+" ");
		}
		
	}
	
	private void reStructureArray(Integer[] array,int index){
		
		for(int i=0;i< array.length-1;i++){
			
			if(i >= index){
				
				array[i] = array[i+1];
			}
		}
		array[array.length-1] = null;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		RemoveDups rd = new RemoveDups();
		Integer[] array = new Integer[]{1,1,3,4,4,5};
		rd.remove1(array, 6);
	}

}
