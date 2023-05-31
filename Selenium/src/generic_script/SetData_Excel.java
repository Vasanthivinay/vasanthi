package generic_script;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SetData_Excel
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream fis = new FileInputStream("./excel/Excel.xlsx");
	Workbook book = WorkbookFactory.create(fis);
Sheet sh = book.getSheet("Sheet1");
Row r = sh.createRow(4);
Cell c = r.createCell(3);
c.setCellValue("vishma k");
FileOutputStream fos = new FileOutputStream("./excel/Excel.xlsx");
book.write(fos);
}
}
