package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathOfFlipcart {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[text()='Grocery']")).click();
		//driver.findElement(By.xpath("//div[text()='Top Offers']")).click();
		//driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("hoodies for men");
	//	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	driver.findElement(By.xpath("//h2[text()='Best of Electronics']/..//a[text()='VIEW ALL']")).click()
driver.findElement(By.xpath("//div[text()='More']")).click();
		
	}

}
