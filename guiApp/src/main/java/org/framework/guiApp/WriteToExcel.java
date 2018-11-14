package org.framework.guiApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel 
{
	public void writeExcel(String value) throws IOException
	{
		System.out.println("WorkBook creation");
		System.out.println(value);
		File file = new File("F://testExcel.xlsx");
		FileOutputStream fileWriter = new FileOutputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		Sheet sheet1 = workbook.createSheet("Output");
		Row row1 = sheet1.createRow(1);
		
		Cell cell1 = row1.createCell(0);
		cell1.setCellValue(value);
		
		Cell cell2 = row1.createCell(1);
		cell2.setCellValue("Stupid");
		
		workbook.write(fileWriter);
		
		fileWriter.close();
	}
	
}
