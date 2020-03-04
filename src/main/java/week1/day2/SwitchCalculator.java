package week1.day2;

public class SwitchCalculator {
	public static void main(String[] args) {

		SwitchCalculator sc = new SwitchCalculator();
		int num1 = 12, num2 = 2, choice;
		System.out.println("Calculator");
		for (choice = 1; choice < 5; choice++) {

			switch (choice) {
			case 1:
				System.out.println("The addition is " + sc.add(num1, num2));
				break;
			case 2:
				System.out.println("The subtraction is " + sc.sub(num1, num2));
				break;
			case 3:
				System.out.println("The multiplication is " + sc.mul(num1, num2));
				break;
			case 4:
				System.out.println("The Division is " + sc.div(num1, num2));
				break;

			default:
				System.out.println("Enter the choice between 1 to 4");
			}
		}
		System.out.println("calculator exited");
	}

	public int add(int num1, int num2) {
		return (num1 + num2);
	}

	public int sub(int num1, int num2) {
		return (num1 - num2);
	}

	public int mul(int num1, int num2) {
		return (num1 * num2);
	}

	public int div(int num1, int num2) {
		return (num1 / num2);
	}
}
