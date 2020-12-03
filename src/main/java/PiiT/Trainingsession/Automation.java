package PiiT.Trainingsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to open browser
System.setProperty("webdriver.chrome.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe" );
WebDriver driver = new ChromeDriver();
driver.get("http://www.amazon.com");
driver.manage().window().maximize();
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.quit();

	}

}
