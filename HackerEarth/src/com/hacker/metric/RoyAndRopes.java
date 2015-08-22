package com.hacker.metric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RoyAndRopes {
	
	public static void RopeTime(long lenght,List<Long> upList,List<Long> lowerList){
		
		List<Long> dp = new ArrayList<Long>();
		dp.add(0, (long) 0);
		for(int i=1;i<lenght;i++){
			
			Long max = Math.max(dp.get(i-1), upList.get(i-1));
			max = Math.max(max, lowerList.get(i-1));
			dp.add(i, max-1);
		}
		System.out.println(dp.get((int)lenght-1)+ lenght-1);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int testCases = Integer.parseInt(line);
		
		int k ,n;
		long length;
		String input = null;
		String tocken[];
		for(int i=0 ; i< testCases ;i++){
			
			input = br.readLine();
			length = Long.parseLong(input);
			List<Long> upperList = new ArrayList<Long>();
			List<Long> lowerList = new ArrayList<Long>();
			long[] lower = new long[(int) (length-1)];
			long count = 0;
			
			while((input = br.readLine()) != null){
				
				tocken = input.split(" ");
				for(String tock : tocken){
					
					if(count < length){
						
						upperList.add(Long.parseLong(tock));
					}
					else{
						
						lowerList.add(Long.parseLong(tock));
					}
					count++;
				}
				
				
			}
			
			RopeTime(length,upperList,lowerList);
		}
	}

}
