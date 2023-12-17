package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPageScreenShot 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://microacademy.net/");
		TakesScreenshot tks=(TakesScreenshot)(driver);
		String src = tks.getScreenshotAs(OutputType.BASE64);
		String timeStamp = LocalDateTime.now().toString().replace(':','-');
		System.out.println(src);
		
		/*File dest = new File("./ScreenShots/microphoto"+timeStamp+".png");
		FileUtils.copyFile(src, dest);
		driver.manage().window().minimize();
		driver.quit();*/
		
	}

}
