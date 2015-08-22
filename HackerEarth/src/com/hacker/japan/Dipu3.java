package com.hacker.japan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dipu3 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		double leftSqrt,rightSqrt;
		Long L,R;
		
		for(int i=0;i < N ;i++){
			
			line = br.readLine();
			String[] num = line.split(" ");
			leftSqrt = Math.sqrt(Long.parseLong(num[0]));
			rightSqrt = Math.sqrt(Long.parseLong(num[1]));
			L = (long) leftSqrt;
			R = (long) rightSqrt;
			if(leftSqrt % 1 != 0){
				
				L++;
			}
			
			System.out.println(R-L+1);
		}
	}
	

}
