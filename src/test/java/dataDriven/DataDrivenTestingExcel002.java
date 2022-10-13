package dataDriven;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExcelUtilities;

public class DataDrivenTestingExcel002 {
	
	@Test
	public void Login(String userValue, String pwdValue) {
		
		WebDriverManager.chromedriver().setup();   
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com");  //for reference
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys(userValue);
		
		driver.findElement(By.className("pwdfield")).sendKeys(pwdValue);
	
		driver.findElement(By.id("loginButton")).click();
		
	}
	
	
	@DataProvider(name="LoginData")
	public String[][] loginValues() throws FileNotFoundException, IOException {
		
		//Read data from excel and  store in an array
		
		ExcelUtilities ddt = new ExcelUtilities();  //Create Object of Utility class to call methods
		int totalrows = ddt.getRowCount("Sheet1");
		int totalcols = ddt.getCellCount("Sheet1", 1);
		
		String[][] loginData = new String[totalrows][totalcols];
		
		for(int i=1; i<totalrows; i++) {
					
			for(int j=0; j<totalcols; j++) {
							
						loginData[i-1][j] = ddt.getCellData("Sheet1", i, j);
			}
		}
		
		return loginData;
	}

}
