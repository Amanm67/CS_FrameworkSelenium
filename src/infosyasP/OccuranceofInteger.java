package infosyasP;

import java.util.HashMap;
import java.util.Map;

public class OccuranceofInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "My name is anupam";
		
		char a[]= str.toCharArray();
	  // int a[]= {1, 2, 3, 2, 4, 5,6, 6 };		
	   //String arr[]= str.split(" ");
	
	
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		//Iterator the 
		for(char count:a) {
			if(count!=' ') {
			
				
			if(!map.containsKey(count)) {
				map.put(count, 1);
				}else {
					map.put(count, map.get(count)+1);
			}
			
		    }
		
	System.out.println(map);
	/*for(Character word:map.keySet()) {
	
		System.out.println("Occurance of word:"+word +" "+map.get(word));
		*/
	}
	
	}
	

	}


