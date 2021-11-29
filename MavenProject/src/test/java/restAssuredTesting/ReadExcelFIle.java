package restAssuredTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFIle {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\bhagy\\Desktop\\PracticeSheet.xlsx");

		FileInputStream fs = new FileInputStream(file);

		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheet("Sheet1");
		int rowNum = sheet.getLastRowNum();
		for (int i = 1; i <= rowNum; i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j <= row.getLastCellNum() - 1; j++) {

				System.out.print(row.getCell(j) + "  ");

			}
			System.out.println(" \n");
		}

	}
}