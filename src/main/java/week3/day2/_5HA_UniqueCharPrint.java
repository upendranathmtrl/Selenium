package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _5HA_UniqueCharPrint {
	 public static void main(String[] args) {
		Map<Character, Integer> obj = new LinkedHashMap<Character, Integer>();
		String input="Amazon India Private Limited";
		System.out.println("Input: "+input);
		
		char[] charArray = input.toCharArray();
		
		 for(char ch : charArray) {
			if(obj.containsKey(ch)) {
				Integer integer = obj.get(ch);
				obj.put(ch, integer+1);
			}
			else
				obj.put(ch, 1);

		 }
		
		 System.out.print("Output: ");
		 for (Entry<Character,Integer> each : obj.entrySet()) {
			 if(!Character.isWhitespace(each.getKey()))
			 System.out.print(each.getKey());
			
		}
		 
	}
}
