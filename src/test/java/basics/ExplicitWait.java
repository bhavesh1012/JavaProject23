package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();   
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		//Username 
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		//Password
		WebElement password = driver.findElement(By.className("pwdfield"));  //by using class name locator
		password.sendKeys("manager");
		
		//Login
		WebElement login = driver.findElement(By.id("loginButton"));  //by using id locator
		login.click();
		
		
		//Explicit Wait or Explicitly wait  - For Logout
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink"))).click();
	
		//OR
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		
		//driver.findElement(By.id("logoutLink")).click();

	}

}
