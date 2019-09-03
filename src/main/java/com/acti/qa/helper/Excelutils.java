package com.acti.qa.helper;

import java.io.File;                     //copy pasted the Excel utils class into this package , so that it can be re-used
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public Excelutils(String excelPath) {                        //Create an constructor called Excelutils and pass parameter excelPath
		
		try
		{
			File src = new File(excelPath);              //define source directory
			FileInputStream fis = new FileInputStream(src);    //create an object for fileinputsteam
			//XSSFWorkbook wb = new XSSFWorkbook(fis);          //create a new Workbook , declare this global variable
			//XSSFSheet sheet = wb.getSheetAt(0);            //get the sheet from this workbook ,declare this global variable
		}
		catch(Exception e)
		{
			System.out.println("File not found :Excel sheet not found"+e.getMessage());
		}
		
	}
	
	public int getRowcount(int sheetnum)         //to print the row count
	 {
		 int count=wb.getSheetAt(sheetnum).getLastRowNum()+1;
		 return count;
	 }
	 public String getCellData(int sheetnum,int row,int col)  //to read cell values , we passed 3 parameters
	 {
		 String data = wb.getSheetAt(sheetnum).getRow(row).getCell(col).getStringCellValue();
		 return data;
	 }
	 
}
