package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath5 {

	public static void main(String[] args) {

		/*
		//Example 1
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/samplepagetest/");
		
		driver.manage().window().maximize();	
		
		//following-sibling
		
		//In Education, select post graduate.  Education is the first child of their parent
	//	driver.findElement(By.xpath("//label[text()='Education']//following-sibling::label[2]")).click(); - not working
		
		driver.findElement(By.xpath("//label[@class='grunion-field-label name']//following-sibling::input")).sendKeys("Test Name");
		*/
		
		
		//Example 1
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//span[@class='_2i7N3j']//following-sibling::div[2]")).click();
		

	}

}
