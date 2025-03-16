package com.AH.chegus.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {
	/**
	 * 
	 * @param filePath
	 * @param SheetName
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws IOException
	 */
	public String readStringDataFromExcel(String filePath, String SheetName,int rownum, int cellnum) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workBook = WorkbookFactory.create(fis);
		String cellValue = workBook.getSheet(SheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		workBook.close();
		return cellValue;
	}
	/**
	 * 
	 * @param filePath
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws IOException
	 */
	public double readNumericDataFromExcel(String filePath, String sheetName, int rownum, int cellnum) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workbook = WorkbookFactory.create(fis);
		double cellValue = workbook.getSheet(sheetName).getRow(rownum).getCell(cellnum).getNumericCellValue();
		workbook.close();
		return cellValue;
	}
}
