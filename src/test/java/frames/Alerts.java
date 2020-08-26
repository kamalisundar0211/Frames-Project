 package frames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Alerts.html");	
	    driver.manage().window().maximize();
	    WebElement btn1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	btn1.click();
	
	Alert a1 = driver.switchTo().alert();
	String text = a1.getText();
	System.out.println(text);
	a1.accept();
	}

	
}
