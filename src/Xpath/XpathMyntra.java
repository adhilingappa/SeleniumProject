package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathMyntra {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement beauty = driver.findElement(By.xpath("//nav[@class='desktop-navbar']//a[text()='Beauty']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(beauty).perform();
		driver.findElement(By.xpath("//ul[@class='desktop-navBlock']//a[text()='Lipstick']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='vertical-filters-filters brand-container']/ul/li/label[text()='ME-ON']")).click();
		
	}

}
