package frames;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kamali");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("java");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\target\\output.jpeg");
		FileUtils.copyFile(src, des);

	}
}