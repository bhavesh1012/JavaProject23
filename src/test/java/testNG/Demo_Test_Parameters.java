package testNG;

import org.testng.annotations.Test;

public class Demo_Test_Parameters {

	@Test(enabled=false, priority=1, description = "Temp disabled")
	public void method1() {
		System.out.println("Method 1");
	}

	@Test(priority=2, description = "Method is enabled")
	public void method2() {
		System.out.println("Method 2");
	}
	
	
	@Test(dependsOnMethods = "method2", priority=2)
	public void method3() {
		System.out.println("Method 3");
	}
	
	
}
