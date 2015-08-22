package com.hacker.zopper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WobblyNumbers {
	
	public static void FindWobblyNumber(int K,int N){
		
		int count = 0;
		for(int i=1;i<10;i++){
			
			for(int j=0;j<10;j++){
				
				if(i != j){
					String subs = "";
					boolean bool = true;
					for(int t = 0;t < N;t++){
						
						if(bool){
							
							subs+=i;
							bool = false;
						}
						else{
							
							subs+=j;
							bool = true;
						}
					}
					count++;
					if(count == K){
						
						System.out.println(subs);
						return;
					}
				}
			}
		}
		System.out.println("-1");
	}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int testCases = Integer.parseInt(line);
		
		int k ,n;
		String input = null;
		String tocken[];
		for(int i=0 ; i< testCases ;i++){
			
			input = br.readLine();
			tocken = input.split(" ");
			n = Integer.parseInt(tocken[0]);
			k = Integer.parseInt(tocken[1]);
			FindWobblyNumber(k,n);
		}
	}

}
