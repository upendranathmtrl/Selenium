package week1.day2;

public class ForEach {
 public static void main(String[] args) {
	String employees[] = {"Raj", "Suresh","Ramesh","Rahul"};
	
	System.out.println("Printing using for loop");
	System.out.println("The length os the array is "+employees.length);
	for(int i=0;i<employees.length;i++ )
		System.out.println(employees[i]);
	
	System.out.println("\nPrinting using for each loop");
	for(String print : employees)
		System.out.println(print);
}
}
