import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://services.ecourts.gov.in/");
		driver.findElement(By.xpath("//img[@class='court-orders-dp']")).click();
		WebElement states = driver.findElement(By.id("sess_state_code"));
		Select StateSelect=new Select(states);
		StateSelect.selectByValue("3");
		
		WebElement district = driver.findElement(By.id("sess_dist_code"));
		Select districtSelect=new Select(district);
		boolean multiple = districtSelect.isMultiple();
		System.out.println(multiple);
		WebElement first = districtSelect.getFirstSelectedOption();
		System.out.println(first.getText());
		
		
		List<WebElement> alloptions = districtSelect.getOptions();
		int count=0;
		for (WebElement option : alloptions)
		{
			String text = option.getText();
		districtSelect.selectByVisibleText(text);
			System.out.println(text);
			count++;
			
		}
		System.out.println("total district:"+count);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
