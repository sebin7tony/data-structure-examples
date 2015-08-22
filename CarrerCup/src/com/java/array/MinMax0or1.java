package com.java.array;

public class MinMax0or1 {
	
	//http://www.careercup.com/question?id=5644609608744960
	
	private static void printSubset(int[] a)
    {
    	int start=0,finalStart=0,length = 0, finallength = 0;
    	int min = a[start],i=0;
    	while(i < a.length ){
    		
    		if( (a[i] - min >= -1) && (a[i] - min <= 1) ){
    			
    			if(a[i] < min){
    				min = a[i];
    			}
    			length++;
    			i++;
    		}
    		else{
    			
    			if(finallength < length){
    				
    				finallength = length;
    				finalStart = start;
    			}
    			start = start+1;
    			i = start+1;
    			length = 1;
    			min = a[start];
    		}
    		
    	}
    	
    	System.out.println("Printing the sequence");
    	
    	for(int j = 0; j < finallength ;j++){
    		
    		System.out.print(a[finalStart+j]+" ");
    	}
    	
    }
	public static void main(String[] args) {
		
		int[] k =  {9, 7, 7, 6, 5, 4, 4, 2};
		
		MinMax0or1.printSubset(k);
	}

}
