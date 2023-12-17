package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert {
	public static void main(String[] args)
	{
		ChromeOptions option=new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(option.addArguments("--disable-notifications"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://pib.gov.in/indexd.aspx");
		driver.switchTo().alert().accept();
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
