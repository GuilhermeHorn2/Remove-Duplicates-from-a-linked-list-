package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;


public class main_misc {
    //private static HashMap<String,String> cache = new HashMap<>();
	public static void main(String[] args) {
	   
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(0);
		l.add(2);
		l.add(3);
		l.add(1);
		l.add(4);
		l.add(0);
		l.add(5);
		l.add(1);
		System.out.println(remove_dups(l));
		System.out.println(remove_dups_no_buffer(l));
	}
		
	private static LinkedList<Integer> remove_dups(LinkedList<Integer> l){
	    	
		HashMap<Integer,Integer> h = new HashMap<>();
		LinkedList<Integer> buffer = new LinkedList<>();
		
		for(int i = 0;i < l.size();i++){
			if(h.containsKey(l.get(i))){
				h.replace(l.get(i),h.get(l.get(i))+1);
			}
			if(!h.containsKey(l.get(i))) {
				h.put(l.get(i),1);
				buffer.add(l.get(i));
			}
		}

		return buffer;
	}
	
	private static LinkedList<Integer> remove_dups_no_buffer(LinkedList<Integer> l){
		
		//
		//System.out.println(l);
		
		for(int i = 0;i < l.size();i++) {
			for(int j = i;j < l.size();j++){
				if(i != j && l.get(i) == l.get(j)) {
					l.remove(j);
				}
			}
		}
		
		
		return l;
	}
	
   
	
	
	
	
    
		
	}
	
	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

