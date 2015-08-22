package com.ds.graph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Graph<T> {
	
	Map<Node<T>, List<Node<T>>> adjacencyList ;
	
	public Graph() {

		adjacencyList = new LinkedHashMap<Node<T>, List<Node<T>>>();
	}
	
	public void buildGraph(String filePath){
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(filePath));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String curLine;
		try {
			
			while((curLine = br.readLine()) != null){
				
				String[] elements = curLine.split(",");
				Node<T> node = new Node<T>(elements[0]);
				List<Node<T>> vertices = new ArrayList<Node<T>>();
				
				for(int i=1;i < elements.length ; i++){
					
					Node<T> tmp = new Node<T>(elements[i]);
					vertices.add(tmp);
				}
				
				if(adjacencyList.containsKey(node)){
					
					System.out.println("Incorrect format of the input");
				}
				else{
					
					adjacencyList.put(node, vertices);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public boolean addNode(Node<T> node,List<Node<T>> edges){
		
		if(node == null){
			
			return false;
		}
		
		adjacencyList.put(node, edges);
		
		return true;
	}
	
	public List<Node<T>> getNodeEdges(Node<T> node){
		
		if(node == null){
			
			return null;
		}
		
		if(adjacencyList.containsKey(node)){
			
			return adjacencyList.get(node);
		}
		return null;
	}
	
	public void showGraph(){
		
		Set<Entry<Node<T>, List<Node<T>>>> keys = adjacencyList.entrySet();
		
		System.out.println("Printing all the graph values");
		
		for(Entry<Node<T>, List<Node<T>>> key : keys){
			
			System.out.println(key.getKey()+" :: "+key.getValue());
		}
		
	}
}
