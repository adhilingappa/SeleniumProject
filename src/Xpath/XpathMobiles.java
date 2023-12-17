package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathMobiles {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='_331-kn _2tvxW']//a[contains(@href,'https://www.flipkart.com/mobile-phones-sto')]")).click();
		WebElement vehicals = driver.findElement(By.xpath("//div[@class='_331-kn _2tvxW']//div[@class='_1psGvi SLyWEo']//div[text()='Two Wheelers']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(vehicals).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2IjXr8']//a[text()='Petrol Vehicles']")).click();
		

	}
}
