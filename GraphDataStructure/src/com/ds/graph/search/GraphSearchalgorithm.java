package com.ds.graph.search;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import com.ds.graph.Graph;
import com.ds.graph.Node;

public class GraphSearchalgorithm {

	Graph<Integer> graph;
	Map<Integer, Boolean> isVisited;
	Queue<Node<Integer>> queue;
	
	public GraphSearchalgorithm() {
		
		graph = new Graph<Integer>();
		graph.buildGraph("/home/setony/workspace/GraphDataStructure/src/com/ds/graph/graphInput");
		isVisited = new HashMap<Integer, Boolean>();
		queue = new Queue<Node<Integer>>(20);
	}
	
	public void BFSSearch(String startNode){
		
		isVisited.clear();
		Node<Integer> node = new Node<Integer>(startNode);
		queue.enqueue(node);
		
		while(!queue.isEmpty()){
			
			//System.out.println("Reached here");
			Node tmp;
			if((tmp = queue.dequeue()) != null && !isVisited.containsKey(tmp.getValue()) ){
				
				System.out.print(tmp.getValue()+" ");
				isVisited.put((Integer) tmp.getValue(), true);
				List<Node<Integer>> children = graph.getNodeEdges(tmp);
				
				for(Node<Integer> child : children){
					
					queue.enqueue(child);
				}
			}
		}
	}
	
	public void DFSSearch(String startNode){
		
		isVisited.clear();
		Stack<Node<Integer>> stack = new Stack<Node<Integer>>();
		Node<Integer> node = new Node<Integer>(startNode);
		
		stack.push(node);
		
		while(!stack.isEmpty()){
			
			Node<Integer> tmp;
			
			if((tmp = stack.pop()) != null && !isVisited.containsKey(tmp.getValue())){
				
				System.out.print(tmp.getValue()+" ");
				isVisited.put(tmp.getValue(), true);
				
				List<Node<Integer>> vertices = graph.getNodeEdges(tmp);
				
				for(Node<Integer> child : vertices){
					
					if(!isVisited.containsKey(child.getValue())){
						
						stack.push(child);
					}
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		GraphSearchalgorithm bfs = new GraphSearchalgorithm();
		System.out.println("Printing BFS");
		bfs.BFSSearch("7");
		System.out.println("");
		System.out.println("Printing DFS");
		bfs.DFSSearch("7");
	}
	
}
