package PiiT.Trainingsession;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {


static WebDriver driver;
 
public static void main(String[] args) throws InterruptedException, IOException {
  // TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Coding\\Trainingsession\\Drivers\\chromedriver.exe");
   driver=new ChromeDriver();
  driver.get("https://www.qatarairways.com/en-us/homepage.html");
  driver.manage().window().maximize();
  /*WebElement sb=driver.findElement(By.name("submit"));
  sb.click();
  //driver.switchTo().alert().accept();
  //driver.switchTo().alert().accept();
  driver.switchTo().alert().dismiss();*/
  driver.manage().timeouts().implicitlyWait(100L, TimeUnit.SECONDS);
  Thread.sleep(6000);
  driver.findElement(By.id("cookie-close")).click();
  Picture("Airlines");
 WebElement dts=driver.findElement(By.id("T7-departure_1"));
 dts.click();
 
 Picture("cokkies");
 //driver.findElement(By.xpath("(//*[text()='26'])[2]")).click();
 Thread.sleep(6000);
 Picture("Dates");
 
 
 
 
 
 
 }

private static void Picture(String string) {
	// TODO Auto-generated method stub
	
}
 

	}


