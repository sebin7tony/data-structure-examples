package com.hacker.japan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DipuNumber {
	
	public static void main(String[] args) {
		
		DipuNumber dn = new DipuNumber();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = 0;
		
		try {
			testCases = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String curline = null;
		for(int i=0;i < testCases ;i++){
			
			try {
				curline = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String[] values = curline.split(" ");
			findOddFactors(Long.parseLong(values[0]),Long.parseLong(values[1]));
		}

	}
	private static void findOddFactors(Long i, Long j) {
		
		Long start=(long) 0;
		
		for(Long k=i ; k <= j ;k++){
			
			if(k == 1){
				start = k;
				break;
			}
			
			for(Long l=(long) 1 ;l <= k/2 ;l++){
				
				if(k%l == 0){
					
					if(k/l == l){
						
						start = l;
						break;
					}
				}
			}
			if(start > 0){
				break;
			}
		}
		
		Long end = (long) 0;
		
		for(Long k=j ; k >= i ;k--){
			
			if(k == 1){
				
				end = (long) 1;
				break;
			}
			
			for(Long l=(long) 1 ;l < k/2 ;l++){
				
				if(k%l == 0){
					
					if(k/l == l){
						
						end = l;
						break;
					}
				}
			}
			if(end > 0){
				break;
			}
		}
		
		if(end == 0){
			System.out.println(0);
		}else{
			System.out.println(end - start+1);
		}
		
		
		
	}

}
