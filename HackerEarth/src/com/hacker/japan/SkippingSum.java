package com.hacker.japan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class SkippingSum {
	
	Integer[] input ;
	
	
	public void skipSum(int L, int R, int K) {
		
		long sum = 0;
		while(L <= R ){
			
			sum = sum + input[L];
			L = L + K;
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		SkippingSum sk = new SkippingSum();
		
		int arrayLength,numOfqueries;
		
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		String curLine = null;
		
		
		try {
			curLine = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] temp = curLine.split(" ");
		arrayLength = Integer.parseInt(temp[0]);
		numOfqueries = Integer.parseInt(temp[1]);
		
		try {
			curLine = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sk.input = new Integer[arrayLength+1];
		String[] elements = curLine.split(" ");
		int count=1;
		for(String element : elements){
			
			sk.input[count] = Integer.parseInt(element);
			count++;
		}
		
		for(int i=0;i<numOfqueries;i++){
			
			try {
				curLine = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String[] queries = curLine.split(" ");
			sk.skipSum(Integer.parseInt(queries[0]),Integer.parseInt(queries[1]),Integer.parseInt(queries[2]));
		}
	}

	

}
