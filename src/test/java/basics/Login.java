package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();   //Setup chrome driver
		
		//ChromeDriver driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();  //Setup firefox driver
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();  //Setup edge driver
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		

	}

}

