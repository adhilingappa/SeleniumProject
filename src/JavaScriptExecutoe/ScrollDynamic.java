package JavaScriptExecutoe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDynamic 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://www.google.com/doodles?q=games");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	for(;;)
	{
		try {
			driver.findElement(By.xpath("//a[text()='Doodle Snow Games - Day 5']")).click();
			break;
			
		} catch (org.openqa.selenium.NoSuchElementException e)
		{
			jse.executeScript("window.scrollBy(0,500)");
		}
	}
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}
