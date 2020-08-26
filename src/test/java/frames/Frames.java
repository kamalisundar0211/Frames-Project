package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		int i = frame.size();
		System.out.println(i);
driver.switchTo().frame("a077aa5e");
WebElement link = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	
	link.click();
	}

}
