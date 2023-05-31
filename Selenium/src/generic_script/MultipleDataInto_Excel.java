package generic_script;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleDataInto_Excel
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
FileInputStream fis = new FileInputStream("./excel/multi.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sh = book.getSheet("Sheet1");
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in");
	List<WebElement> all_links = driver.findElements(By.xpath("//a"));
	int count = all_links.size();
	for (int i = 0; i <count; i++)
	{
		Row r = sh.createRow(i);
		Cell c = r.createCell(0);
		String value = all_links.get(i).getAttribute("href");
		c.setCellValue(value);
	}
		FileOutputStream fos = new FileOutputStream("./excel/multi.xlsx");
		book.write(fos);
	}

}
