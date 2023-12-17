import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
	  WebElement search=driver.findElement(By.id("email"));
	  search.sendKeys("adhi prince");
	  Thread.sleep(3000);
	  driver.manage().window().minimize();
	  driver.quit();
	  /*String mob_num=search.getAttribute("value1");
	  System.out.println(mob_num);
	  Thread.sleep(3000);
	  WebElement password=driver.findElement(By.name("btnK"));
	  password.click();
	  Thread.sleep(4000);
	  WebElement link=driver.findElement(By.cssSelector("h3[class='LC20lb MBeuO DKV0Md']"));
	 link.click();
	 driver.manage().window().fullscreen();
	 WebElement skip = driver.findElement(By.id("ad-text:7"));
	 wait.until(ExpectedConditions.elementToBeClickable(skip));
	 skip.click();*/
	
	}

}
