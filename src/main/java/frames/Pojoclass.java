package frames;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends Baseclasscreation{
	
	public void loginpojo() {
PageFactory.initElements(driver, this);
		
	}
@FindBy(id="email")
public WebElement text;

@FindBy(id="pass")
public WebElement text1;


@FindBy(xpath="//input[@value='Log In']")
	public WebElement Btnlogin;
	
public WebElement gettext() {
		return text;}
		
public WebElement gettext1() {
			return text1;}

public WebElement getBtnlogin() {
			return Btnlogin;}
	
		
		
		
		
}
