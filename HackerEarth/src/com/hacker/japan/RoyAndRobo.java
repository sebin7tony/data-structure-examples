package com.hacker.japan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Button{
	
	private int number;
	private int clicks;
	
	public Button(int number, int clicks) {
		super();
		this.number = number;
		this.clicks = clicks;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getClicks() {
		return clicks;
	}
	public void setClicks(int clicks) {
		this.clicks = clicks;
	}
	
	
}

public class RoyAndRobo {
	
	Map<Character, Button> keymap = new HashMap<Character, Button>();

	public RoyAndRobo() {

		Button btn11 = new Button(1, 1);
		keymap.put('.', btn11);
		Button btn12 = new Button(1, 2);
		keymap.put(',', btn12);
		Button btn13 = new Button(1, 3);
		keymap.put('?', btn13);
		Button btn14 = new Button(1, 4);
		keymap.put('!', btn14);
		Button btn15 = new Button(1, 5);
		keymap.put('1', btn15);
		
		Button btn21 = new Button(2, 1);
		keymap.put('a', btn21);
		Button btn22 = new Button(2, 2);
		keymap.put('b', btn22);
		Button btn23 = new Button(2, 3);
		keymap.put('c', btn23);
		Button btn24 = new Button(2, 4);
		keymap.put('2', btn24);
		
		Button btn31 = new Button(3, 1);
		keymap.put('d', btn31);
		Button btn32 = new Button(3, 2);
		keymap.put('e', btn32);
		Button btn33 = new Button(3, 3);
		keymap.put('f', btn33);
		Button btn34 = new Button(3, 4);
		keymap.put('3', btn34);
		
		Button btn41 = new Button(4, 1);
		keymap.put('g', btn41);
		Button btn42 = new Button(4, 2);
		keymap.put('h', btn42);
		Button btn43 = new Button(4, 3);
		keymap.put('i', btn43);
		Button btn44 = new Button(4, 4);
		keymap.put('4', btn44);
		
		Button btn51 = new Button(5, 1);
		keymap.put('j', btn51);
		Button btn52 = new Button(5, 2);
		keymap.put('k', btn52);
		Button btn53 = new Button(5, 3);
		keymap.put('l', btn53);
		Button btn54 = new Button(5, 4);
		keymap.put('5', btn54);
		
		Button btn61 = new Button(6, 1);
		keymap.put('m', btn61);
		Button btn62 = new Button(6, 2);
		keymap.put('n', btn62);
		Button btn63 = new Button(6, 3);
		keymap.put('o', btn63);
		Button btn64 = new Button(6, 4);
		keymap.put('6', btn64);
		
		Button btn71 = new Button(7, 1);
		keymap.put('p', btn71);
		Button btn72 = new Button(7, 2);
		keymap.put('q', btn72);
		Button btn73 = new Button(7, 3);
		keymap.put('r', btn73);
		Button btn74 = new Button(7, 4);
		keymap.put('s', btn74);
		Button btn75 = new Button(7, 5);
		keymap.put('7', btn75);
		
		Button btn81 = new Button(8, 1);
		keymap.put('t', btn81);
		Button btn82 = new Button(8, 2);
		keymap.put('u', btn82);
		Button btn83 = new Button(8, 3);
		keymap.put('v', btn83);
		Button btn84 = new Button(8, 4);
		keymap.put('8', btn84);
		
		Button btn91 = new Button(9, 1);
		keymap.put('w', btn91);
		Button btn92 = new Button(9, 2);
		keymap.put('x', btn92);
		Button btn93 = new Button(9, 3);
		keymap.put('y', btn93);
		Button btn94 = new Button(9, 4);
		keymap.put('z', btn94);
		Button btn95 = new Button(9, 5);
		keymap.put('9', btn95);
		
		Button btn01 = new Button(0, 1);
		keymap.put('_', btn01);
		Button btn02 = new Button(0, 2);
		keymap.put('0', btn02);
	}
	
	public void getRoboTime(String input){
		
		int prevButton = 1,time = 0;
		for(int i=0 ; i< input.length();i++){
			
			Button button = keymap.get(input.charAt(i));
			if(button.getNumber() != prevButton){
				
				prevButton = button.getNumber();
				time = time+1;
			}
			time = time+button.getClicks();
			
		}
		System.out.println(time);
	}
	
	public static void main(String[] args) {
		
		RoyAndRobo rb = new RoyAndRobo();
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		
		try {
			
			count = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<count;i++){
			
			try {
				
				String line = br.readLine();
				line = line.trim();
				rb.getRoboTime(line);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
