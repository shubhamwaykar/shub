package mediatorClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetClass {
	static Workbook book;	
	static Sheet sheet;
	public static Object[][] getcelldata(String sheetname) throws EncryptedDocumentException, IOException {
String path = "F:\\eclipse\\eclipse\\workspace\\IbTrade\\Testdata\\Testdata.xlsx";
		
		FileInputStream file = new FileInputStream(path);
book = WorkbookFactory.create(file);
sheet = book.getSheet(sheetname);
Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i = 0;i<sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
               System.out.println(data[i][j]);
				
			}
		}
		return data;
	}
}
