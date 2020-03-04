package week1.day1;

public class MyMobile {
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		
	
		
		String brand = m.brandName();
		boolean fastcharging = m.hasFastCharging();
	    int camera = m.numberOfCamera();
	    
	    System.out.println(m.company);
	    System.out.println(m.IRblaster);
	    System.out.println(m.headphonejack);
	    System.out.println("The brand name is "+ brand);
	    System.out.println("Whether it has fastcharging - "+ fastcharging);
	    System.out.println("Number of camera it has  - " + camera );
	}

}
