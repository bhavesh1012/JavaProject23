package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath4 {


	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();	
		
		//Preceding
		
		//Username
		driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[3]")).sendKeys("admin");
		
		//Password
		driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[2]")).sendKeys("manager");
		
		//Login
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		
		/*
		//Self example
		 
		//Username
		driver.findElement(By.xpath("//input[@id='username']//self::input")).sendKeys("admin");
		 
		 */

	}

}
