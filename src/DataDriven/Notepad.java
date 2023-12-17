package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Notepad {
	static WebDriver driver;

	public static void main(String[] args) throws Throwable 
	{
		FileInputStream fis = new FileInputStream("./data/noukri.properties");
		Properties pis = new Properties();
		pis.load(fis);
		String browser = pis.getProperty("browser");
	 	if(browser.equals("chrome"))
		   {
		       driver=new ChromeDriver();
		   }
		else if(browser.equals("edge"))
				{
			     driver=new EdgeDriver();
				}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(pis.getProperty("url"));
		
		driver.findElement(By.id("usernameField")).sendKeys(pis.getProperty("username"));
		driver.findElement(By.id("passwordField")).sendKeys(pis.getProperty("password"));
		System.out.println(pis.getProperty("username"));
		driver.manage().window().minimize();
		driver.quit();
	}

}
