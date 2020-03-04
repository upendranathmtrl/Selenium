package week3.day1;

public class Chrome extends Browser {
	public static void main(String args[]) {
		
		//to call 
		Browser b = new Browser();
		b.refresh();
		Chrome c = new Chrome();
		c.refresh();
		c.search("Define ambiguity");
		c.search("3.14");
	}

	public void refresh() {
		System.out.println("Refreshed the chrome page");
	}
}

/*public String search(String getinput) {
		int size = getinput.length();
		if (size == 6)
			return "It is a pincode";
		else if (size == 10)
			return "It is a phone number";
		else
			return "It is not a pincode nor a phone number";
	}
 */