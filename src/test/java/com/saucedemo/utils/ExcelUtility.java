package com.saucedemo.utils;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 public class ExcelUtility {

	
	    public static Object[][] getTestData(String sheetName,String fileLocation) {

	        Object[][] data = null;

	        try {
	            FileInputStream fis = new FileInputStream(fileLocation);

	            Workbook wb = WorkbookFactory.create(fis);

	            Sheet sheet = wb.getSheet(sheetName);

	            int rows = sheet.getLastRowNum();
	            int cols = sheet.getRow(0).getLastCellNum();

	            data = new Object[rows][cols];

	            for (int i = 1; i <= rows; i++) {
	                for (int j = 0; j < cols; j++) {
	                    data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
	                }
	            }

	            wb.close();
	            fis.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return data;
	    }
	}

