package PiiT.Trainingsession;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Drag {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://piit.us/");
		driver.manage().window().maximize();
		Actions it= new Actions(driver);
		
		driver.switchTo().frame(0);
	File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(shots,new File("C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Screenshots\\.png"));
				
			}
		
		
	}


