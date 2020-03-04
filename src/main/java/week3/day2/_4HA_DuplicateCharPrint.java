package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class _4HA_DuplicateCharPrint {
	 public static void main(String[] args) {
		Map<Character, Integer> obj = new LinkedHashMap<Character, Integer>();
		String input="Infosys Limited";
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
		 
		 //Printing
		 System.out.print("Output: ");
		 for (Entry<Character,Integer> each : obj.entrySet()) {
			 if(!Character.isWhitespace(each.getKey()) && !(each.getValue()==1))
			 System.out.print(each.getKey()+ "->"+each.getValue() +"   ");
		 }
		 System.out.println();
		 //System.out.println(obj);
	 }
}
