package restAssuredTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcelFile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\bhagy\\Desktop\\PracticeSheet.xlsx");
		
		FileInputStream fs = new FileInputStream(file);

		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheet("Sheet1");
	/*	Row row = sheet.getRow(0);
		int rowNum = sheet.getLastRowNum();
		row.getCell(2).setCellValue("Pass");
		Row row1 = sheet.getRow(1);
		row1.getCell(2).setCellValue("Pass");
		Row row2 = sheet.getRow(2);
		row2.getCell(2).setCellValue("Pass");
		FileOutputStream fo = new FileOutputStream(file);
		wb.write(fo);
		
	wb.close();*/
					
	
	//looping
		int rowNum = sheet.getLastRowNum();
	
	for(int i =1; i<=rowNum ; i++ )
	{		
		Row row = sheet.getRow(i);
		row.getCell(2).setCellValue("Pass");
	}
	
	FileOutputStream fo = new FileOutputStream(file);
	wb.write(fo);
	wb.close();
	}

			
		
	}

