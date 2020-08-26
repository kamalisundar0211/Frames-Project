package frames;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersData {
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

@Parameters({"email"})
@Test
public void Findlocator(String keysToSend) {

	WebElement email = driver.findElement(By.id("email"));

	email.sendKeys(keysToSend);
	
}






}