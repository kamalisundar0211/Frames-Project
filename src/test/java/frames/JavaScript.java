package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement down = driver.findElement(By.xpath("//a[text()='Instagram']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(5000);
		WebElement up = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
		js.executeScript("arguments[0].setAttribute('value','java')", up);
	}
}
