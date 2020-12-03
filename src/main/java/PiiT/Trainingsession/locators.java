package PiiT.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	/*WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	WebElement searchbutton=driver.findElement(By.id("nav-search-submit-text"));
	search.sendKeys("Computer");
	searchbutton.click();*/
	
		WebElement Name= driver.findElement(By.id("email"));
		WebElement password= driver.findElement( By.id("pass"));
		
		
		Name.sendKeys("tasnuvactg@yahoo.com");
	password.sendKeys("i dont know");
		
	}
}
        