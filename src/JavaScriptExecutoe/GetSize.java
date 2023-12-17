package JavaScriptExecutoe;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://microacademy.net/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		long height = (long)jse.executeScript("return document.body.scrollHeight");
		System.out.println(height);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
