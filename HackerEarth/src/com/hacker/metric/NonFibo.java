package com.hacker.metric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class NonFibo {
	
	Map<Long,Node> trackingList;
	long factor = 100000;
	public NonFibo() {
		
		trackingList = new HashMap<Long,Node>();
	}
	
	
	
	public void printNonFib(long kthValue,long curValue,long fib1,long fib2,long index){
		
		long i = curValue;
		while(index < kthValue){
			
			if(fib1 + fib2 == i){
				
				fib1 = fib2;
				fib2 = i;
			}
			else{
				
				index++;
				
				if(index % factor == 0 ){
					
					if(!trackingList.containsKey(index/factor)){
						
						long t = index/factor;
						Node node = new Node(i, fib1, fib2);
						trackingList.put(t,node);
					}
					
				}
			}
			i++;
		}
		
		System.out.println(i-1);
		
		
	}
	
	public void findNonFibo(long kthValue){
		
		
		long trackIndex = kthValue/factor;
		
		while(trackIndex != 0){
			
			if(trackingList.containsKey(trackIndex)){
				break;
			}
			trackIndex--;
		}
		
		
		if(trackIndex != 0 && trackingList.size() != 0){
			
			Node node = trackingList.get(trackIndex);
			printNonFib(kthValue, node.getIthValue(), node.getFib1(), node.getFib2(), trackIndex*factor-1);
		}else{
			
			printNonFib(kthValue, 4, 2, 3, 0);
		}
		
	}

	public static void main(String[] args) throws IOException {
		
		NonFibo nfb = new NonFibo();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int testCases = Integer.parseInt(line);
		
		for(int i=0 ;i < testCases ;i++){
			
			line = br.readLine();
			nfb.findNonFibo(Long.parseLong(line));
		}
	}
}
class Node{
	
	long ithValue;
	long fib1,fib2;
	
	public Node(long i,long fb1,long fb2) {
		
		this.ithValue = i;
		this.fib1 = fb1;
		this.fib2 = fb2;
	}
	
	public long getIthValue() {
		return ithValue;
	}
	public void setIthValue(long ithValue) {
		this.ithValue = ithValue;
	}
	public long getFib1() {
		return fib1;
	}
	public void setFib1(long fib1) {
		this.fib1 = fib1;
	}
	public long getFib2() {
		return fib2;
	}
	public void setFib2(long fib2) {
		this.fib2 = fib2;
	}
	
	
}