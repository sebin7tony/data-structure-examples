package com.java.array;

import java.util.ArrayList;
import java.util.List;

public class DeletedElement {
	
	private int[] oldA = new int[]{2,5,4,3,7,9,12};
	private int[] newA = new int[]{2,5,4,3,12};
	
	public void findElement(){
		
		int oldp = 0, newp = 0;
		List<Integer> deleted = new ArrayList<>();
		
		while(oldA.length > oldp && newA.length > newp){
			
			if(oldA[oldp] == newA[newp]){
				
				oldp++;
				newp++;
			}
			else{
				
				deleted.add(oldA[oldp]);
				oldp++;
			}
			
		}
		
		System.out.println("delete elements are "+deleted);
	}
	
	public static void main(String[] args) {
		
		DeletedElement dlel = new DeletedElement();
		dlel.findElement();
	}

}
