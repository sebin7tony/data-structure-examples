package com.java.bitMan;

public class PrintAllSubSets {
	
	public void printSubSets(int[] input){
		
		int len = input.length,temp;
		int currSubset = (int) Math.pow(2, len)-1;
		
		while(currSubset > 0){
			
			System.out.print("(");
			temp = currSubset;
			for(int i=0;i< len ;i++){
				
				if((temp & 1) > 0){
					
					System.out.print(input[i]);
				}
				temp = temp>>1;
			}
			System.out.println(")");
			currSubset--;
		}
	}
	
	public static void main(String[] args) {
		
		int[] input = {1,2,3,4};
		PrintAllSubSets ps = new PrintAllSubSets();
		ps.printSubSets(input);
	}

}
