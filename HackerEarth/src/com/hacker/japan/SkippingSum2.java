package com.hacker.japan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Node{
	
	long sum;
	int start,end,skip;
	
	public Node(long sum, int start, int end, int skip) {
		
		this.sum = sum;
		this.start = start;
		this.end = end;
		this.skip = skip;
	}
	
	public long getSum() {
		return sum;
	}
	public void setSum(long sum) {
		this.sum = sum;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getSkip() {
		return skip;
	}
	public void setSkip(int skip) {
		this.skip = skip;
	}
	
	
}
public class SkippingSum2 {
	
	Integer[] input ;
	Map<Integer, Map<Integer,List<Node>>> startSkip;
	Map<Integer, Map<Integer,List<Node>>> endSkip;
	
	public SkippingSum2() {
		
		startSkip = new HashMap<Integer, Map<Integer,List<Node>>>();
		endSkip = new HashMap<Integer, Map<Integer,List<Node>>>();
	}
	
	public long skipSum(long sum,int L, int R, int K,boolean sign) {
		
		while(L <= R ){
			
			if(sign){
				
				sum = sum + input[L];
			}
			else{
				
				sum = sum - input[L];
			}
			
			L = L + K;
		}
		
		System.out.println(sum);
		return sum ;
	}
	
	public void FindSum(int L, int R, int K) {
		
		if(startSkip.containsKey(L)){
			
			if(startSkip.get(L).containsKey(K)){
				
				List<Node> node = startSkip.get(L).get(K);
				
				Node MinNode = null;
				for(Node nd : node){
					
					//Already solution found
					if(nd.getEnd()-R == 0){
						
						System.out.println(nd.getSum());
						return;
					}
					
					//Initial condition when MInNode = null
					if(MinNode == null){
						
						MinNode = nd;
						continue;
					}
					
					if( Math.abs(MinNode.getEnd()-R) > Math.abs(nd.getEnd()-R)){
						
						MinNode = nd;
					}
				}
				
				if(MinNode != null){
					
					if(MinNode.getEnd() < R){
						
						boolean sign = true;
						long sum1 = skipSum(MinNode.getSum(),MinNode.getEnd()+1,R,K,sign);
						Node tmp = new Node(sum1, L, R, K);
						startSkip.get(L).get(K).add(tmp);
					}
					else if(MinNode.getEnd() > R){
						
						boolean sign = false;
						long sum1 = skipSum(MinNode.getSum(), R+1, MinNode.getEnd(), K, sign);
						Node tmp = new Node(sum1, L, R, K);
						startSkip.get(L).get(K).add(tmp);
					}
				}
				else{
					//to be done !!
				}
				
			}
			else{
				
				boolean sign = true;
				long sum1 = skipSum(0, L, R, K, sign);
				Node tmp = new Node(sum1, L, R, K);
				
				if(startSkip.get(L).containsKey(K)){
					
					startSkip.get(L).get(K).add(tmp);
				}
				else{
					
					List<Node> temp1 = new ArrayList<Node>();
					startSkip.get(L).put(K, temp1);
					startSkip.get(L).get(K).add(tmp);
				}
			}
			
		}
		else{
			
			boolean sign = true;
			long sum1 = skipSum(0, L, R, K, sign);
			Node tmp = new Node(sum1, L, R, K);
			
			if(startSkip.containsKey(L)){
				
				startSkip.get(L).get(K).add(tmp);
			}
			else{
				Map<Integer, List<Node>> temp = new HashMap<Integer, List<Node>>();
				List<Node> temp1 = new ArrayList<Node>();
				temp.put(K, temp1);
				startSkip.put(L, temp);
				startSkip.get(L).get(K).add(tmp);
			}
			
			//startSkip.get(L).get(K);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		SkippingSum2 sk = new SkippingSum2();
		
		int arrayLength,numOfqueries;
		
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		String curLine = null;
		
		
		try {
			curLine = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] temp = curLine.split(" ");
		arrayLength = Integer.parseInt(temp[0]);
		numOfqueries = Integer.parseInt(temp[1]);
		
		try {
			curLine = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sk.input = new Integer[arrayLength+1];
		String[] elements = curLine.split(" ");
		int count=1;
		for(String element : elements){
			
			sk.input[count] = Integer.parseInt(element);
			count++;
		}
		
		for(int i=0;i<numOfqueries;i++){
			
			try {
				curLine = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String[] queries = curLine.split(" ");
			sk.FindSum(Integer.parseInt(queries[0]),Integer.parseInt(queries[1]),Integer.parseInt(queries[2]));
		}
	}

	

}
