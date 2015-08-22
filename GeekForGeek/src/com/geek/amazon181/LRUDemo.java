package com.geek.amazon181;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

class Page{
	
	Character name;
	Page next,prev;
	
}

public class LRUDemo {
	
	public LinkedList<Page> ll;
	public Map<Character, Page> map ;
	
	public LRUDemo() {
		
		ll = new LinkedList<Page>();
		map = new HashMap<Character, Page>();
	}
	
	public void addPage(Page page){
		
		if(map.containsKey(page.name)){
			
			Page pg = map.get(page.name);
			ll.remove(pg);
			ll.addFirst(pg);
			
		}
		else{
			
			ll.addFirst(page);
			map.put(page.name, page);
		}
		
	}
	
	public void print(){
		
		Iterator<Page> iter = ll.listIterator();
		while(iter.hasNext()){
			
			Page pg = iter.next();
			System.out.print(pg.name+" ");
		}
	}
	
	
	public static void main(String[] args) {
		
		LRUDemo lru = new LRUDemo();
		
		Page page1 = new Page();
		page1.name = 'S';
		lru.addPage(page1);
		
		Page page2 = new Page();
		page2.name = 'E';
		lru.addPage(page2);
		
		Page page3 = new Page();
		page3.name = 'B';
		lru.addPage(page3);
		
		Page page4 = new Page();
		page4.name = 'I';
		lru.addPage(page4);
		
		Page page5 = new Page();
		page5.name = 'S';
		lru.addPage(page5);
		
		Page page6 = new Page();
		page6.name = 'B';
		lru.addPage(page6);
		
		lru.print();
	}

}
