package testNG;

import org.testng.annotations.Test;

public class Demo_Test1 {
	
	//https://testng.org/
	
	@Test(priority=2)
	public void payment() {
		System.out.println("Payment while booking ticket");
	}
	
	
	@Test(priority=0)
	public void ticket() {
		System.out.println("Select Ticket for Booking");
	}
	
	
	@Test(priority=1)
	public void login() {
		System.out.println("Login to IRCTC");
	}
	
}

class Demo_Test {
	
	@Test(priority=1)
	public void redbusLogin() {
		System.out.println("Login to Redbus");
	}
	
}
