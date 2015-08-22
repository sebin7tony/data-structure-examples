package com.hacker.japan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideArray {
	
	Integer[] input;
	Integer divident;
	
	public static void main(String[] args) {
		
		DivideArray sk = new DivideArray();
		
		int arrayLength,numOfqueries = 0;
		
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		String curLine = null;
		
		
		try {
			curLine = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		arrayLength = Integer.parseInt(curLine);
		
		
		try {
			curLine = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sk.input = new Integer[arrayLength];
		String[] elements = curLine.split(" ");
		int count=0;
		for(String element : elements){
			
			sk.input[count] = Integer.parseInt(element);
			count++;
		}
		
		try {
			numOfqueries = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		sk.divident = 1;
		
		for(int i=0;i<numOfqueries;i++){
			
			try {
				
				sk.divident *= Integer.parseInt(br.readLine());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//System.out.println(sk.divident);
		for(Integer in : sk.input){
			
			int temp = in / sk.divident;
			System.out.print(temp+" ");
		}
	}
}
