import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mani
{
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://alsumri.demoehswatch.com/");
		driver.findElement(By.id("username-field")).sendKeys("viswa");
		driver.findElement(By.id("password-field")).sendKeys("Exceego@123");
		driver.findElement(By.xpath("//button[text()='Login']")).submit();
		WebElement userMenu = driver.findElement(By.id("dropdownMenuUser"));
		wait.until(ExpectedConditions.elementToBeClickable(userMenu)).click();
		Thread.sleep(2000);
		driver.findElement(By.id("MenuItem_Account.Logout")).click();
		driver.findElement(By.id("redirectButton")).click();
		
		
	}

}
