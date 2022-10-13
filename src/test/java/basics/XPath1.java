package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
		
		//Css Selector Syntax -----  HtmlTag[attribute='value']
		
		//Xpath Syntax  --------  //HtmlTag[@attribute='value']
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

	}

}
