package week3.day2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class _3HA_SecondMostRepeatingChar {
	public static void main(String[] args) {
		Map<Character, Integer> obj = new TreeMap<Character, Integer>();
		int max = 0;
		String input = "PayPal India";
		System.out.println("Input: PayPal India");
		char[] charArray = input.toCharArray();
		System.out.print("Output: ");
		for (char ch : charArray) {
			if (obj.containsKey(ch)) {
				Integer integer = obj.get(ch);
				obj.put(ch, integer + 1);
			}
			else
				obj.put(ch, 1);
		}
		for (char ch : charArray) {
			if (obj.get(ch) > max)
				max = obj.get(ch);
		}
		// System.out.println(max);
		int i = 0;
		for (Entry<Character, Integer> eachChar : obj.entrySet()) {
			// int val =eachChar.getValue();
			if (i != 1)
				if (eachChar.getValue() == max - 1) {
					System.out.println(eachChar.getKey());
					i++;
					break;
				}
		}
	}
}
