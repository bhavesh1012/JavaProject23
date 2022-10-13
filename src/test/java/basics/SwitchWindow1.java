package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();  //click on close icon
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);  //search box
		
		String windowID = driver.getWindowHandle();
		
		System.out.println(windowID);
		
		System.out.println(driver.getTitle());

	}

}
