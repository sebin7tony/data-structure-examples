package com.ds.graph;

public class GraphTest {
	
	public static void main(String[] args) {
		
		Graph<Integer> graph = new Graph<Integer>();
		graph.buildGraph("/home/setony/workspace/GraphDataStructure/src/com/ds/graph/graphInput");
		graph.showGraph();
		Node<Integer> node = new Node<Integer>("2");
		System.out.println(graph.getNodeEdges(node));
	}

}
