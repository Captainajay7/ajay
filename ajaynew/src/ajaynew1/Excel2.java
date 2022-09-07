package ajaynew1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {
	public String excel1(int sheetno,int rowvalue,int cellvalue) throws IOException {
		File path = new File("D:\\Java Files\\Book1.xlsx");
		FileInputStream load= new FileInputStream (path);
		XSSFWorkbook workbook = new XSSFWorkbook (load);
		XSSFSheet sheet1 = workbook.getSheetAt(sheetno);
		return sheet1.getRow(rowvalue).getCell(cellvalue).getStringCellValue();	
	}
	public void excel (int sheetno,int rowvalue,int cellvalue,String value) throws IOException {
		File path = new File ("D:\\Java Files\\Book1.xlsx");
		FileInputStream load = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet1 = workbook.getSheetAt(sheetno);
		FileOutputStream ajay = new FileOutputStream(path);
		sheet1.createRow(rowvalue).createCell(cellvalue).setCellValue(value);
		workbook.write(ajay);
	}
	public static void main(String[] args) throws IOException {
		Excel2 ajd = new Excel2();
		System.out.println(ajd.excel1(0, 0, 0));
		System.out.println(ajd.excel1(0,1,0));
		System.out.println(ajd.excel1(0, 0, 1));
	    ajd.excel(0, 2, 0, "opollo13");
	}
}
