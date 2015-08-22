package com.java.array;

public class TargetSequence {

	//http://www.careercup.com/question?id=6305076727513088
	
	public static boolean findTarget(String input,int target){
		
		//Expecting input as comma seperated
		
		int i=0;
		String[] tock = input.split(",");
		int[] data = new int[tock.length];
		for(String tocken : tock){
			
			data[i] = Integer.parseInt(tocken);
			i++;
		}
		
		i=0;
		int sum = 0,start=0;
		
		while(i < data.length){
			
			if(data[i] <= target){
				
				sum = sum + data[i];
				if(sum > target){
					
					while(sum > target){
						
						sum = sum - data[start];
						start = start +1;
					}
				}
				if(sum == target){
					
					System.out.println("start: "+data[start]);
					System.out.println("end :"+data[i]);
					return true;
				}
			}
			else{
				
				start = i+1;
				sum = 0;
			}
			i++;
		}
		
		System.out.println("No luck !!");
		return false;
	}
	
	
	public static void main(String[] args) {
		
		String input = "23,5,4,7,2,11";
		System.out.println(TargetSequence.findTarget(input, 20));
		
		input = "1,3,5,23,2";
		System.out.println(TargetSequence.findTarget(input, 8));
		
		System.out.println(TargetSequence.findTarget(input, 7));
	}
}
