package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;


public class ReadExcelLoginData {
	
	@DataProvider(name = "loginDataProvider")
	public String[][] getData(Method reflector) {
		String excelSheetName = reflector.getName();
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\LoginData.xlsx");
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		Workbook workbook = null;
		
		try {
			workbook = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet(excelSheetName);
		
		int totalRows = sheet.getLastRowNum();
		int totalColumns = sheet.getRow(0).getLastCellNum();
		
//		System.out.println(totalRows);
//		System.out.println(totalColumns);
		
		DataFormatter format = new DataFormatter();
		
		String testData[][]  = new String[totalRows][totalColumns];
		for(int i = 1; i <= totalRows; i++) {
			for(int j = 0; j < totalColumns; j++) {
				testData[i-1][j] = format.formatCellValue(sheet.getRow(i).getCell(j));
//				System.out.println(testData[i-1][j]);
			}
		}
		
		return testData;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
