package week1.day1;

public class Calculator {
  public static void main(String[] args) {
	  int num1=12, num2=2;
	Calculator c = new Calculator();
	System.out.println("The addition is "+ c.add(num1, num2));
	System.out.println("The subtraction is "+c.sub(num1, num2));
	System.out.println("The Multiplication is "+c.mul(num1, num2));
	System.out.println("The division is "+c.div(num1, num2));
}
  public int add ( int num1 , int num2){
	  return (num1+num2);
	  }

	  public int sub (int num1 , int num2){
	  return (num1-num2);
	  }

	  public int mul (int num1 , int num2){
	  return (num1*num2);
	  }

	  public int div(int num1 , int num2){
	  return (num1/num2);
	  }
  
}
