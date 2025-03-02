import java.util.HashMap;
import java.util.Map;

public class Occuranceofword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str= "Aman is a good boy and good boy aman vikas also good boy";
		String arr[]= str.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//Iterator the 
		for(String word:arr) {
			if(!map.containsKey(word)) {
				map.put(word, 1);
				}else {
					map.put(word, map.get(word)+1);
			}
			
		    }
		
	System.out.println(map);
	for(String word:map.keySet()) {
		System.out.println("Occurance of word:"+word +" "+map.get(word));
		
	}
	
	}
	}