package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Actitime {
	
	public static WebDriver driver;
	
	@Given("open browser and navigate to url actitime")
	public void browser() {
		
		WebDriverManager.chromedriver().setup();   
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().window().maximize();
	}
	
	@When("enter valid username and password actitime")
	public void credentials() {
		
		driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[3]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//a[@id='loginButton']//preceding::input[2]")).sendKeys("manager");
		
	}
	
	@And("click on login button actitime")
	public void validateLogin() {
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
	}
	
	@Then("click on logout actitime")
	public void validateLogout() throws InterruptedException {
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("logoutLink")).click();
	}

}
