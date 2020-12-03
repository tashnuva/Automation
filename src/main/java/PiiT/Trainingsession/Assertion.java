package PiiT.Trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Assertion {
static WebDriver driver;
	public static void main(String[] args) {
		//Driver("Chrome", "https://facebook.com");
		Driver("Firefox", "https://www.facebook.com");
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe" );
		
		 //driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\geckodriver.exe");
		//driver= new FirefoxDriver();
		//driver.get("http://www.facebook.com");
		//driver.manage().window().maximize();
		//WebElement CreateanAccount= driver.findElement(By.linkText("Create New Account"));
		//boolean button=CreateanAccount.isDisplayed();
		//System.out.println(button);
	}
public static void Driver (String browser, String URI) {
	if (browser.equalsIgnoreCase("Chrome")) {
		String dt= System.getProperty("user.dir");
System.out.println("this is dt"+dt);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get(URI);
		driver.manage().window().maximize();
	}else if (browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get(URI);
		driver.manage().window().maximize();
	}
}

}
