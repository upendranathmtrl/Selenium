package week1.day1;

public class CallCalculator {
	public static void main(String[] args) {
		
		int num1=12, num2=2;
		Calculator c = new Calculator();
		c.add(num1, num2);
		
		int sum = c.add(num1,num2);
		System.out.println("The addition is  :"+ sum);

		int subtraction = c.sub(num1,num2);
		System.out.println("The subtraction is :"+ subtraction);

		int multiplication = c.mul(num1,num2);
		System.out.println("The multiplication is :"+ multiplication);


		int division= c.div(num1,num2);
		System.out.println("The division is :"+ division);

		
	}

	
}
