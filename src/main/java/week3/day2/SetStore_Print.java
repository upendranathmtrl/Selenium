package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class SetStore_Print {
	public static void main(String[] args) {
		Set<String> obj = new HashSet<String>();
		 obj.add("Ramesh");
		 obj.add("Suresh");
		 obj.add("Balaji");
		 obj.add("Upendranath");
		 obj.add("Rahul");
		 obj.add("Sarath");
		 
		 for (String oneItem : obj) {
			 if(oneItem.startsWith("S"))
					 System.out.println(oneItem);
		 }
	}
}
