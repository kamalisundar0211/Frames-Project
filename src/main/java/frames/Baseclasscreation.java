package frames;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclasscreation {
	
	public static WebDriver driver;
	public static Actions a;
	
	public static WebDriver  browserlaunch() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yaazhini\\eclipse-workspace\\org.test\\Driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  return driver;}
	
	public  static void pagetitle() {
	String title = driver.getTitle();
	System.out.println(title);}
	
	public static void pageurl() {

    String url = driver.getCurrentUrl();
    System.out.println(url);}
	
	public static void openpage(String url) {
    driver.get(url); }
	
	public static void sendKeys(WebElement g,String text) {
    g.sendKeys(text);}
		
	public static void btnclick(WebElement c) {
	c.click();}
		
	public static void mouseDragAndDrp(WebElement source, WebElement target) {
    a = new Actions(driver);
	a.dragAndDrop(source, target).perform();}
	
	public static void mouseRightClick(WebElement e) {
	a.contextClick(e).perform();}
	
	public static void doubleclick(WebElement e) {
	a.doubleClick(e).perform();
	}
	
	public static void set(String text, Object e) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0], setAttribute('value', '"+text+"')",e);
	

	}
	
}
