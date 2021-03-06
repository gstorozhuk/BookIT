package com.cybertek.bookIT.utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadingExcel {

    public static void main(String[] args) throws IOException {
        String excelFilePath = "src/test/resources/testData/DDT.xlsx";


        FileInputStream inputStream = new FileInputStream(excelFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0); // getSheet("Sheet1");
        System.out.println(sheet);


        //using for loop
/**
 int rows = sheet.getLastRowNum();
 System.out.println(rows);
 int cols = sheet.getRow(1).getLastCellNum();

 for (int r = 0; r <= rows; r++) {
 XSSFRow row = sheet.getRow(r); // getting rows
 for (int c = 0; c < cols; c++) {
 XSSFCell cell = row.getCell(c);//getting cells

 switch (cell.getCellType()) {
 // check what is type of te data in the ce;;
 case STRING:
 System.out.print(cell.getStringCellValue());
 break;
 case NUMERIC:
 System.out.print(cell.getNumericCellValue());
 break;
 case BOOLEAN:
 System.out.print(cell.getBooleanCellValue());
 break;
 }
 }
 System.out.println();
 }
 **/

/**
        Iterator iterator = sheet.iterator();
        while (iterator.hasNext()) {
            XSSFRow row = (XSSFRow) iterator.next();
            Iterator cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                XSSFCell cell = (XSSFCell) cellIterator.next();

                switch (cell.getCellType()) {

                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                }
                System.out.println();
            }

        }
**/












    }
}
