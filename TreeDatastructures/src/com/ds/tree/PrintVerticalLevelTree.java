package com.ds.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintVerticalLevelTree {
	
	private VerticalTree tree;
	private Map<Integer, List<NodeVertical>> vertLevel;
	
	public PrintVerticalLevelTree() {

		tree = new VerticalTree();
		tree.addNode(50, tree.getRoot());
		tree.addNode(45, tree.getRoot());
		tree.addNode(65, tree.getRoot());
		tree.addNode(99, tree.getRoot());
		tree.addNode(52, tree.getRoot());
		tree.addNode(58, tree.getRoot());
		tree.addNode(31, tree.getRoot());
		tree.addNode(47, tree.getRoot());
		tree.addNode(42, tree.getRoot());
		
		vertLevel = new HashMap<Integer, List<NodeVertical>>();
	}
	
	public void addLevel(Integer level,NodeVertical node){
		
		if(vertLevel.containsKey(level)){
			
			vertLevel.get(level).add(node);
		}
		else{
			
			List<NodeVertical> list = new ArrayList<NodeVertical>();
			list.add(node);
			vertLevel.put(level, list);
		}
		
	}
	
	public void processTree(NodeVertical ptr,int verticalLevel){
		
		if(ptr != null){
			
			//ptr.setVerticalLevel(verticalLevel);
			addLevel(verticalLevel,ptr);
			processTree(ptr.getLchild(),verticalLevel-1);
			System.out.print(ptr.getValue()+" ");
			processTree(ptr.getRchild(),verticalLevel+1);
			
		}
	}
	
	public void printVerticalTree(){
		
		processTree(tree.getRoot(),0);
		System.out.println(vertLevel);
	}
	
	public static void main(String[] args) {
		
		PrintVerticalLevelTree pvlt = new PrintVerticalLevelTree();
		pvlt.printVerticalTree();
		
	}

}
