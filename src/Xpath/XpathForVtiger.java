package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathForVtiger {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	driver.findElement(By.id("username")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("Adhi306");
	
	driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"c");
	
	Thread.sleep(2000);
	driver.findElement(By.id("password")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys(Keys.chord("hello"));
}
}
