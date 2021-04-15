package com.cybertek.bookIT.step_definitions;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excel {

    public static String getCellValue(String xl, String Sheet, int r, int c) {

        try {
            FileInputStream fileInputStream = new FileInputStream(xl);

            Workbook wb = WorkbookFactory.create(fileInputStream);

            Cell cell = wb.getSheet(Sheet).getRow(r).getCell(c);

            return cell.getStringCellValue();

        } catch (Exception e) {

            return "";
        }
    }

    public static int getRowCount(String xl, String Sheet) {


        try {
            FileInputStream fileInputStream = new FileInputStream(xl);
            Workbook wb = WorkbookFactory.create(fileInputStream);

            return wb.getSheet(Sheet).getLastRowNum();

        } catch (Exception e) {
            e.printStackTrace();
        }

return 0;
    }
}