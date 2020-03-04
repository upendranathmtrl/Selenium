package week3.day2;
import java.util.*;
public class _2HA_UniqueCharInString {
	public static void main(String[] args) {
		Map<Character,Integer> obj = new LinkedHashMap<Character,Integer>();
		String input = "PayPal India";
		System.out.println("Input: PayPal India");
		char[] charArray = input.toCharArray();
		System.out.print("Output: ");
		for(char ch : charArray) {
			if(obj.containsKey(ch)) {
				Integer integer = obj.get(ch);
				obj.put(ch, integer+1);
				
			}
			else {
				obj.put(ch, 1);
				
			}
				
		}
		//Printing
		for(char ch :charArray) {
			if(obj.get(ch)==1 && !Character.isWhitespace(ch)) {
				System.out.print(ch);
			}
		}
	}
}
