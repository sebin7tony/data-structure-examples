package com.java.subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintAllSubSets {
	
	Set<List<String>> powerSet;
	public int count;
	
	public PrintAllSubSets() {
		
		powerSet = new LinkedHashSet<List<String>>();
	}
	
	public void PrintAllSebSets(List<String> mainList){
		
		powerSet.add(mainList);
		count++;
		
		for(int i=0;i<mainList.size();i++){
			
			List<String> temp = new ArrayList<String>(mainList);
			temp.remove(i);
			PrintAllSebSets(temp);
		}
		
	}
	
	public void displaySubsets(){
		
		for(List<String> cur : powerSet){
			
			System.out.println(cur);
		}
	}
	
	
	public static void main(String[] args) {
		
		String[] t = {"1","2","3","4"};
		List<String> input = new ArrayList<String>(Arrays.asList(t));
		
		PrintAllSubSets ps = new PrintAllSubSets();
		ps.PrintAllSebSets(input);
		ps.displaySubsets();
		System.out.println(ps.count);
	}

}
