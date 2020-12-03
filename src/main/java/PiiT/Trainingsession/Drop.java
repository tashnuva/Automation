package PiiT.Trainingsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tasnu\\eclipse-workspace\\Trainingsession\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
WebElement Createanaccount=driver.findElement(By.linkText("Create New Account"));
Createanaccount.click();
Thread.sleep(6000);

WebElement birth=driver.findElement(By.name("birthday_month"));
Select ob=new Select(birth);
ob.selectByValue("7");

WebElement date=driver.findElement(By.name("birthday_day"));
Select da=new Select(date);
da.selectByValue("6");

WebElement year=driver.findElement(By.name("birthday_year"));
Select mo= new Select(year);
mo.selectByValue("1985");


	}

}
