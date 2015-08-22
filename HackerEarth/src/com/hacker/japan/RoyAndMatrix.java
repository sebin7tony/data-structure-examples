package com.hacker.japan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyAndMatrix {
	
	public static void getMatrixSum(Integer num){
		
		long sum = 0,count=1;
		
		for(int i = num-1; i > 0 ;i--){
			
			sum = sum + i*2*count;
			count++;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		
		try {
			
			count = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<count;i++){
			
			try {
				
				Integer line = Integer.parseInt(br.readLine());
				getMatrixSum(line);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
