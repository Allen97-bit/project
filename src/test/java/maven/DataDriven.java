package maven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
File f = new File("C:\\Users\\ALLEN AKASH A\\eclipse-workspace\\maven\\Excel\\Excel Data1.xlsx");
Workbook w = new XSSFWorkbook();
Sheet sheet = w.createSheet("Sheet1");
Row row = sheet.createRow(0);
Cell cell = row.createCell(0);
cell.setCellValue("username");

FileOutputStream fin = new FileOutputStream(f);
w.write(fin);
System.out.println("1");
	}

}
