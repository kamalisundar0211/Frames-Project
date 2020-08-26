package frames;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Configuration;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserScript {
	WebDriver driver;

	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else {

		throw new Exception("Browser is not correct");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kamali");}
	@AfterTest
	public void sysout() {
		System.out.println("DOne");

	}

}
