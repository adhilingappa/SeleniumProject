import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("search")).sendKeys("sanjith hegde new song kannada");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		
		

	}
}
