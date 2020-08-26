package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallelExecution {

	
	@Test
	
	public void executSessionOne() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/V4/");

		driver.findElement(By.name("uid")).sendKeys("Driver 1");

	}

	@Test
	public void executeSessionTwo() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/V4/");

		driver.findElement(By.name("uid")).sendKeys("Driver 2");

	}

	@Test
	public void executSessionThree() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");

		driver.findElement(By.name("uid")).sendKeys("Driver 3");

	}
}
