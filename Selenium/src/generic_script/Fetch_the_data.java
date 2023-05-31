package generic_script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Fetch_the_data {

public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
FileInputStream fis = new FileInputStream("./excel/Excel.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
	String value = c.toString();
	System.out.println(value);
	
	Cell c1 = r.getCell(1);
	String value1 = c1.toString();
	System.out.println(value1);
	}

}
