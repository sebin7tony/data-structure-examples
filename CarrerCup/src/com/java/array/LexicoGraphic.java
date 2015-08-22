package com.java.array;

public class LexicoGraphic {
	
	boolean isFound;
	
	//http://www.careercup.com/question?id=6185570560638976
	
	public boolean lexico(int num,String value,int length,int target){
		
		if(num > length){
			
			return false;
		}
		
		String tmp;
		for(int i=0;i<=9;i++){
			
			tmp = value;
			tmp = tmp+i;
			if(Integer.parseInt(tmp.toString()) == target){
				isFound = true;
				return false;
			}
			System.out.println(tmp);
			
			
		}
		
		for(int i=0 ; i<=9 ; i++){
			
			if(!lexico(num+1,value+i, length, target))
				break;
		}
		
		//System.out.println("this is the last statement");
		if(isFound){
			
			return false;
		}
		else{
		
			return true;
		}
		
	}
	
	public void finalLex(){
		
		
		for(Integer i=1;i<=9;i++){
			
			System.out.println(i);
			String val = i.toString();
			if(!lexico(2,val, 4, 34)){
				//System.out.println("Break in the loop");
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		LexicoGraphic lx = new LexicoGraphic();
		lx.finalLex();
	}

}
