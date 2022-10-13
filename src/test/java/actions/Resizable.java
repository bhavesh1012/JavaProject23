package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		//Iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement resize = driver.findElement(By.xpath("//div[@id='resizable']//child::div[3]"));
		
		Thread.sleep(10000);
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resize, 150, -70).perform();
		
		/* Assignment
		 1. Same example with different locators for resize - eg. css selector, xpath
		 2. X offset positive
		 3. X offset negative
		 4. Y offset positive
		 5. Y offset negative
		 6. Both offset positive
		 7. Both offset negative
		 */
		

	}

}
