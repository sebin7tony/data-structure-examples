package com.sap.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectMoney {

	private int maxSum;
	private List<Integer> maxList; 
	private int[][] MainData ;
	
	
	public CollectMoney() {

		
	}
	
	public void createData(int size, String input){
		
		MainData = new int[size][size];
		int len = input.length();
		int i=0,start=0;
		
		int a=0,b=0;
		
		while(i < len){
			
			if(input.charAt(i) == '('){
				start = i;
			}
			if(input.charAt(i) == ')'){
				
				String row = input.substring(start+1, i);
				String[] temp = row.split(",");
				
				b=0;
				for(String tm : temp){
					
					MainData[a][b] = Integer.parseInt(tm);
					b++;
				}
				a++;
			}
			i++;
		}
		
		for(int[] tmp: MainData){
			
			for(int tm :tmp){
				System.out.print(tm+" ");
			}
			System.out.println("");
		}
	}
	
	public int findMax(int[][] data,int cSum,int i,int j,List<Integer> curList){
		
		if(i >= 0 && i < data.length && j >=0 && j < data[0].length){
		
			if(i == data.length-1 && j == data[0].length-1){
				
				cSum = cSum + data[i][j];
				if(maxSum < cSum){
					
					curList.add(data[i][j]);
					maxSum = cSum;
					maxList = new ArrayList<Integer>(curList);
					curList.remove(curList.size()-1);
					return 0;
				}
				
			}
			
			curList.add(data[i][j]);
			findMax(data, cSum+data[i][j], i+1, j, curList);
			
			findMax(data, cSum+data[i][j], i, j+1, curList);
			curList.remove(curList.size()-1);
		}
		
		return 0;
	}
	
	public void collectMoneyProblem(String input){
		
		createData(4,input);
		List<Integer> curList = new ArrayList<Integer>();
		findMax(MainData, 0, 0, 0, curList);
		
		System.out.println("Now we will check the output ");
		System.out.println("Max sum "+maxSum);
		System.out.println("Max list "+maxList);
	}
	
	public static void main(String[] args) {
		
		String input = "(1,7,5,2),(5,12,3,6),(100,9,23,16),(16,4,5,9)";
		CollectMoney cm = new CollectMoney();
		cm.collectMoneyProblem(input);
	}
}
