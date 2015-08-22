package com.hacker.metric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinCollection {
	
	public static void getNumber(String[] input,long k){
		
		long numb,total = 0, maxT = 0;
		for(String num : input){
			
			numb = Integer.parseInt(num);
			if(numb <= k){
				
				total = total+numb;
			}
			else{
				
				if(total > 0){
					
					maxT = Math.max(maxT, total);
					total = 0;
				}
			}
		}
		if(total > 0){
			
			maxT = Math.max(maxT, total);
		}
		System.out.println(maxT);
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int testCases = Integer.parseInt(line);
		int size;long k;
		for(int i=0;i< testCases;i++ ){
			
			line = br.readLine();
			String[] el = line.split(" ");
			size = Integer.parseInt(el[0]);
			k = Integer.parseInt(el[1]);
			line = br.readLine();
			String[] input = line.split(" ");
			if(input.length == size){
				
				getNumber(input,k);
			}
		}
	}
}
