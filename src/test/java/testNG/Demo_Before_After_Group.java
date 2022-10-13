package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_Before_After_Group {
	
	
	@Test(groups = {"Regression"}, priority=1)
	public void method1() {
		System.out.println("Method 1");
	}
	
	@Test(groups = {"Sanity"}, priority=2)
	public void method2() {
		System.out.println("Method 2");
	}
	
	@Test(groups = {"Regression", "Sanity"}, priority=3)
	public void method3() {
		System.out.println("Method 3");
	}

	
	

}
