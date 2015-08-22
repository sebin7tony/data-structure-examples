package com.hacker.metric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BattleOfWords {
	
	
	public static void winner(String word1,String word2){
		
		if(word1 == null || word2 == null){
			
			throw new IllegalArgumentException("words coming are empty");
		}
		
		Map<Character, Integer> wordCount1 = new HashMap<Character, Integer>();
		
		for(Character ch : word1.toCharArray()){
		
			if(ch > 'a' && ch < 'z'){
				
				if(wordCount1.containsKey(ch)){
					
					int k = wordCount1.get(ch);
					wordCount1.put(ch, k+1);
				}
				else{
					
					wordCount1.put(ch, 1);
				}
			}
		}
		
		int wordCount2 = 0;
		for(Character ch : word2.toCharArray()){
			
			if(ch > 'a' && ch < 'z'){
				
				if(wordCount1.containsKey(ch)){
					
					int k = wordCount1.get(ch);
					wordCount1.put(ch, k-1);
					if(k == 1){
						wordCount1.remove(ch);
					}
				}
				else{
					
					wordCount2++;
				}
			}
		}
		
		
		if(wordCount1.size() > 0 && wordCount2 > 0){
			
			System.out.println("You draw some.");
		}
		else if( wordCount1.size() > 0){
			
			System.out.println("You win some.");
		}
		else if(wordCount2 > 0){
			
			System.out.println("You lose some.");
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int testCases = Integer.parseInt(line);
		
		String word1 = null,word2=null;
		for(int i=0 ; i< testCases ;i++){
			
			word1 = br.readLine();
			word2 = br.readLine();
			winner(word1.trim(),word2.trim());
		}
	}

}
