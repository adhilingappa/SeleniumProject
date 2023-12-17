package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathForRedmiPrice {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new EdgeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement  text = driver.findElement(By.xpath("//div[@class='_1rH5Jn']//div[@class='_3OO5Xc']/input[@type='text']"));
	text.sendKeys("redmi 10");
  Actions action=new Actions(driver);
  Thread.sleep(2000);
  text.sendKeys(Keys.ENTER);
  Thread.sleep(2000);
  driver.findElement(By.xpath("//div[@class='_2kHMtA']/a[contains(@href,'/redmi-10-pacific-blue-64-gb/p/itm0f2a')]//div[@class='_36FSn5']")).click();
	
	
	
}
}
