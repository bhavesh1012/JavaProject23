package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
		driver.manage().window().maximize();
		
		//Iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement slideForward = driver.findElement(By.xpath("//div[@id='green']//child::span"));
		
		Thread.sleep(10000);
		Actions green = new Actions(driver);
		green.dragAndDropBy(slideForward, 100, 0).perform();
		
		//Assignment
		//SlideBackward - Red 
		//Try with different locators
		

	}

}
