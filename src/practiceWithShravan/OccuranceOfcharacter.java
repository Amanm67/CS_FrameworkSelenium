package practiceWithShravan;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Welocome to goa aman is goa";
		
		String s=str.replace(" ", "");
		Map<Character, Integer> map = new HashMap<>();
		for(Character c: s.toCharArray()) {
			if(!map.containsKey(c)) {
				
				map.put(c, 1);
			}else {
				map.put(c, map.get(c)+1);
				
			}
			
			
		}System.out.println(map);

	}

}
