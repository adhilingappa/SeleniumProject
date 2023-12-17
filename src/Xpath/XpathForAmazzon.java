package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathForAmazzon {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	//driver.findElement(By.id("nav-search-dropdown-card")).click();
	driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']//a[text()='Best Sellers']")).click();
}
}
