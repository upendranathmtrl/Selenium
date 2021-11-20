package week3.day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//character count
public class Map_EachCharCount {
	public static void main(String[] args) {
		// creating empty map
		HashMap<Character, Integer> obj = new HashMap<Character, Integer>();

		String name = "upendranath";
		//int nameLength = name.length();
		
		char[] charArray = name.toCharArray();
		for (char ch : charArray) {
		
			if (obj.containsKey(ch)) {
				Integer integer = obj.get(ch);
				integer++;
				obj.put(ch, integer);
			}
			else {
				obj.put(ch, 1);
			}
		}
		//Printing directly
		System.out.println(obj);
		//Printing using for Entryset
		for(Entry<Character, Integer> eachChar: obj.entrySet())
			System.out.println(eachChar.getKey()+ " "+ eachChar.getValue());
	}
}
