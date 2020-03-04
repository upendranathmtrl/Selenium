package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1HA_Reverse {
	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		obj.add("HCL");
		obj.add("CTS");
		obj.add("Aspire Systems");
		System.out.println("Before sorting :" +obj);
		
		Collections.reverse(obj);
		System.out.println("After reverse sorting :"+obj);
		
	}
}
