package com.java.recursion;

public class DiscontinousMatches {
	
	//http://www.careercup.com/question?id=5757597581836288
	
	public static void discoMatch(String smallString,String largeString,int smalli,String result){
		
		if(smalli == smallString.length()){
			System.out.println(result+largeString.toLowerCase());
			return;
		}
		
		if(smalli < smallString.length()){
			
			char curChar = smallString.charAt(smalli);
			for(int i=0;i<largeString.length();i++){
				
				if(curChar == largeString.charAt(i)){
					
					result = result +Character.toUpperCase(curChar);
					discoMatch(smallString, largeString.substring(i+1), smalli+1, result);
					result = result.substring(0, result.length()-1)+Character.toLowerCase(result.charAt(result.length()-1));
				}
				else{
					
					result = result+Character.toLowerCase(largeString.charAt(i));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		String result = new String();
		DiscontinousMatches.discoMatch("cat", "catapult", 0, result);
	}

}
