package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderData {
	public WebDriver driver;
	@BeforeClass

	public void startexecution() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\chromedriver.exe");

	 driver=new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/");

	}


	@AfterClass
	private void EndExecution() {
	driver.quit();

	}

	
	@Test(dataProvider="SearchProvider")
	public void testmethod(String keysToSend) {
		

		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys(keysToSend);
		
		
		
	}
	
	
	
	@DataProvider(name="SearchProvider")
	public Object[][] data() {
		return new Object[][]
				{
			{"guru,kamali"}
			
			
				};
		

	}
}
