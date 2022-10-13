package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();   
		
		ChromeDriver driver = new ChromeDriver();
		
		/* Example 1
		driver.get("https://www.globalsqa.com/samplepagetest/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//button[text()='Alert Box : Click Here']")).click();	
		
		driver.switchTo().alert().accept();     //To click on ok or allow
		
		//driver.switchTo().alert().dismiss();    //To click on cancel or block
		*/
		
		//Example 2 
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();	
		
		//driver.switchTo().alert().accept();    
		
		Thread.sleep(5000);	
		
		driver.switchTo().alert().dismiss();
		
	}

}
