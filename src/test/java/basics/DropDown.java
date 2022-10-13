package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();	
		
		//driver.findElement(By.cssSelector(""));  //#idvalue, HTMLTag#idvalue, HTMLTag[id='value']
		
		//driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Thread.sleep(5000);
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		//classname ref_variable = new classname();
		
		Select select = new Select(dropdown);
		
		//select.selectByVisibleText("Books"); 
		
		//select.selectByIndex(4);    //Amazon Fresh    //index value start from 0
		
		select.selectByValue("search-alias=electronics");   //Electronics
		
		//Assignment for Drop Down
		//https://www.globalsqa.com/samplepagetest/
		
		
	}

}
