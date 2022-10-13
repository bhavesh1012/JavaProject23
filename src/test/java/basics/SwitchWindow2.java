package basics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.cssSelector("button._2KpZ6l._2doB4z")).click();  //click on close icon
		
		driver.findElement(By.cssSelector("input[class='_3704LK']")).sendKeys("mobiles" + Keys.ENTER);  //search box
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9' and @alt='SAMSUNG Galaxy F22 (Denim Blue, 64 GB)']")).click();
		
		Set<String> windowsID = driver.getWindowHandles();
		
		ArrayList<String> windowList = new ArrayList<String>(windowsID);
		
		//Option 3 - For each loop
		
		for(String window:windowList) {
			driver.switchTo().window(window);
		}
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();  //Add to cart

	}

}
