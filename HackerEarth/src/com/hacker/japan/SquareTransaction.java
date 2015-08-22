package com.hacker.japan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


// Find memory effiecient method to solve the problem

//tip add all the transactions while console.


public class SquareTransaction {
	
	public List<Integer> transaction ;
	public List<Integer> target;
	
	public SquareTransaction() {
		
		transaction = new ArrayList<Integer>();
		target = new ArrayList<Integer>();
	}
	
	public int printTarget(){
		
		for(int tar : target){
			
			//int temp = tar;
			for(int i=0;i < transaction.size();i++){
				
				tar = tar - transaction.get(i);
				if(tar < 1){
					
					System.out.println(i+1);
					break;
				}
			}
			
			if(tar > 0){
				System.out.println(-1);
			}
			
		}
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		
		SquareTransaction st  = new SquareTransaction();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int count=0;
		String[] tocken;
		
		do{
			line = br.readLine();
			tocken = line.split(" ");
			
			for(String tock : tocken){
				
					count++;
					st.transaction.add(Integer.parseInt(tock));
			}
		}
		while(count < N);
		
		line = br.readLine();
		
		int Num = Integer.parseInt(line);
		
		for(int i=0;i <Num;i++){
			
			line = br.readLine();
			st.target.add(Integer.parseInt(line));
			
		}
		
		st.printTarget();
		
		
	}

}
