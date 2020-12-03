package Pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot_Password {
	


public WebDriver driver;
	
@FindBy(id="identify_email")
WebElement search;

@FindBy(name="did_submit")
WebElement searchbutton;

@FindBy(xpath="(//*[text()='Find Your Account'])[2]" )
WebElement text;

public Forgot_Password (WebDriver driver) {

this.driver=driver;
PageFactory.initElements(driver, this);
}

public void serchfield(String string) {
	search.sendKeys("tasnuvactg@yahoo.com");
}

public void searchbutton() {
	search.click();
}
public WebElement ForgotYourAccountsText() {
	return text;
}


	
}


