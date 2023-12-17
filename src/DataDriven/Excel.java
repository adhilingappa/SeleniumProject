package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/nlogin/login");
		FileInputStream fis = new FileInputStream("./data/myworkbook.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		 Sheet sheet = workbook.getSheet("adhi");
		String value = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
