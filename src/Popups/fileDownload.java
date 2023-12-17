 package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileDownload {
	public static void main(String[] args) throws AWTException, Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//a[text()='4.10.0']")).click();
		driver.get("chrome://downloads/");
		WebElement shadow1 = driver.findElement(By.tagName("downloads-manager"));
		shadow1.getShadowRoot().findElement(By.cssSelector("downloads-item[id='frb0']")).getShadowRoot()
				.findElement(By.cssSelector("cr-button[focus-type='save']")).click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
		
		

	}
}
