package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathforReact {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://artastykitchen.ccbp.tech/login");
		driver.findElement(By.id("username")).sendKeys("rahul");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("rahul@2021");
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h1[text()='Come and Eat']")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//h1[text()='Kaju
		// biriyani']/following-sibling::div/child::button[text()='Add']")).click();
	driver.findElement(By.xpath("//h1[text()='//h1[text()='Prawns fry']/..//div/button[text()='Add']")).click();
	Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
	}

}
