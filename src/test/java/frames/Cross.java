package frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross {

	
	@Test
@Parameters("Browser")


public  void kamali(String browser) {

if(browser.equalsIgnoreCase("FF")){
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\geckodriver.exe");

WebDriver driver=new FirefoxDriver();

driver.manage().window().maximize();

driver.get("http://www.facebook.com");

driver.quit();

}
else if(browser.equalsIgnoreCase("IE")){

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://www.facebook.com");

driver.quit();
}
}

}


