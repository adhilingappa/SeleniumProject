package epiance;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class epiance
{
	public static void main(String[] args)
	{
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		 driver.get("https://www.google.com/");
		 List<WebElement> allElements = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		 for (WebElement Element : allElements)
		 {
			String text = Element.getText();
			System.out.println(text);
			
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
