package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathOfFbSignUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("adhi");
		
		driver.findElement(By.name("lastname")).sendKeys("prince");
		
		driver.findElement(By.name("reg_email__")).sendKeys("8073021502");
		
		driver.findElement(By.id("password_step_input")).sendKeys("123456789");
	
		driver.findElement(By.xpath("//select[@id='day']/..//option[text()='6']")).click();
	
		driver.findElement(By.xpath("//select[@id='month']/..//option[text()='Oct']")).click();
		
		driver.findElement(By.xpath("//select[@id='year']/..//option[text()='2000']")).click();
	
		driver.findElement(By.xpath("//label[text()='Male']/..//input[@type='radio']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		
	}

}
