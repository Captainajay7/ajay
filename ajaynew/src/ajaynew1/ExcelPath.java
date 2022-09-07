package ajaynew1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPath {

	public static void main(String[] args) throws IOException {
		File path = new File("D:\\Java Files\\Book1.xlsx");//select path
		FileInputStream load = new FileInputStream(path);//load file
		XSSFWorkbook workbook= new XSSFWorkbook(load);//select workbook
		XSSFSheet sheet1 = workbook.getSheetAt(0);//select sheet
		FileOutputStream output= new FileOutputStream(path);
		sheet1.createRow(1).createCell(0).setCellValue("DHALGADE");
		workbook.write(output);

	}

}
