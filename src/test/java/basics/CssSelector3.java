package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();  //click on close icon
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);  //search box
		
		
		//Select first-child
		driver.findElement(By.cssSelector("div[class='_5THWM1']>*:first-child")).click();  //Sort by
		
		//Select last-child
		driver.findElement(By.cssSelector("div[class='_5THWM1']>*:last-child")).click();  //Newest first
		
		//Select nth-child
		driver.findElement(By.cssSelector("div[class='_5THWM1']>*:nth-child(5)")).click();  //Price high to low
	
	}

}
