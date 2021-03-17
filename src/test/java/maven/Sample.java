package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\ALLEN AKASH A\\eclipse-workspace\\maven\\Excel\\Excel Data.xlsx");

		FileInputStream find = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(find);
		Sheet sheet = w.getSheet("Sheet1");
		 for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				 Row row = sheet.getRow(i);
				 for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				 Cell cell = row.getCell(j);
					String value = cell.getStringCellValue();
					if (value.equals("allen@gmail.com")) {

						cell.setCellValue("xyz");
					}
				 
				 }
		 }
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(2);
		String value = cell.getStringCellValue();
		if (value.equals("allen@gmail.com")) {

			cell.setCellValue("xyz");

		}
		FileOutputStream outputStream = new FileOutputStream(f);
		w.write(outputStream);
		
		System.out.println("fghj");

		// for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		// Row row = sheet.getRow(i);
		// for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		// Cell cell = row.getCell(j);
		// int cellType = cell.getCellType();
		// if (cellType == 1) {
		// String cellValue = cell.getStringCellValue();
		// System.out.println(cellValue);
		// } else if (cellType == 0) {
		// if (DateUtil.isCellDateFormatted(cell)) {
		// Date dateCellValue = cell.getDateCellValue();
		// SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		// String format = s.format(dateCellValue);
		// System.out.println(format);
		// } else {
		// double numericCellValue = cell.getNumericCellValue();
		// long l = (long) numericCellValue;
		// String valueOf = String.valueOf(l);
		// System.out.println(valueOf);
		// }
		// }
		//
		// }
		//
		// }

	}

}
