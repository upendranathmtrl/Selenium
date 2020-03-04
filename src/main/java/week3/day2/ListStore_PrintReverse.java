package week3.day2;
import java.util.*;

public class ListStore_PrintReverse {
	public static void main(String[] args) {
		 List<String> obj = new ArrayList<String>();
		 obj.add("Ramesh");
		 obj.add("Suresh");
		 obj.add("Balaji");
		 obj.add("Upendranath");
		 obj.add("Rahul");
		 obj.add("Sarath");
		 
		 int size = obj.size();
		 
		 for (int i = size-1; i >= 0; i--) {
			System.out.println(obj.get(i));
		}
	}
}
