import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exception {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions actions = new Actions(driver);
		
		actions.moveToElement(fashion).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Men's Top Wear\"]")).click();
	
		
	}

}
