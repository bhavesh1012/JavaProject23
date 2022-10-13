package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		//Username    ----     <input id="user-name"> 
		//cssSelector using id attribute
		driver.findElement(By.cssSelector("#user-name"));  
		driver.findElement(By.cssSelector("input#user-name"));
		
		
		//Password    ---       <input id="password">
		//cssSelector using id attribute
		driver.findElement(By.cssSelector("#password"));  
		driver.findElement(By.cssSelector("input#password"));
		
		
		//Login button     ---     <input class="submit-button btn_action">
		//cssSelector using class attribute
		driver.findElement(By.cssSelector(".submit-button.btn_action"));
		driver.findElement(By.cssSelector("input.submit-button.btn_action"));
		driver.findElement(By.cssSelector(".submit-button"));  //partial value from class value
		driver.findElement(By.cssSelector(".btn_action"));  //partial value from class value
		driver.findElement(By.cssSelector("input.submit-button"));  //partial value from class value
		driver.findElement(By.cssSelector("input.btn_action"));  //partial value from class value
		
		
		

	}

}
