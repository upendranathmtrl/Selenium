package week3.day1;

public class NewChrome extends NewBrowser {

	public static void main(String[] args) {
		 
		NewChrome nc = new NewChrome();
		nc.getTitle();
		nc.getVersion();
		nc.getName();
		String currentURL = nc.getCurrentURL();
		System.out.println("The GetURL prints :"+ currentURL);
	}

	public void getTitle() {
		System.out.println("The title is Google");
		
	}

	public void getVersion() {
		// TODO Auto-generated method stub
		System.out.println("The version is 1.17");
	}

	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("The name is Google");
	}

	@Override
	String getCurrentURL() {
		// TODO Auto-generated method stub
		return "amazon.in";
	}

}
