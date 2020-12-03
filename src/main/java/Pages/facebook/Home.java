package Pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	@FindBy(name="email")
	WebElement emailfieldkeys;
	
	@FindBy(name="pass")
	WebElement passwordfieldkeys;
	
	@FindBy(name="login")
	WebElement signin;
	
	public Home(WebDriver driver){
this.driver=driver;
PageFactory.initElements(driver, this);
}
	
	public void emailinput(String name) {
		emailfieldkeys.clear();
		//
		emailfieldkeys.sendKeys(name);
	}
	
	public void passwordinput(String field) {
		passwordfieldkeys.sendKeys();
	}
	
	public void signIn() {
		signin.click();
	}
	public void Forgotlink() {
		
		
}

	
		
	}
