package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelector2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		//Username
		
		//cssSelector using any attribute
		driver.findElement(By.cssSelector("input[id='user-name']"));  //id attribute
		driver.findElement(By.cssSelector("input[placeholder='Username']"));  //placeholder attribute
		driver.findElement(By.cssSelector("input[type='text']"));
		driver.findElement(By.cssSelector("input[name='user-name']"));
		driver.findElement(By.cssSelector("input[data-test='username']"));
		

	}

}
