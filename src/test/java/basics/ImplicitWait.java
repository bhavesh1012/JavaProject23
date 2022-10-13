package basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();   
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		//Implicit Wait or Implicitly wait
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); - Depreciated or old
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Username 
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
	
		//Password
		WebElement password = driver.findElement(By.className("pwdfield"));  //by using class name locator
		password.sendKeys("manager");
		
		//Login
		WebElement login = driver.findElement(By.id("loginButton"));  //by using id locator
		login.click();
		
		//Logout
		WebElement logout = driver.findElement(By.id("logoutLink"));
		logout.click();
		
		
	}

}
