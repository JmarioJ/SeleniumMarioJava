package Excelsheet;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.IOException;


public class FileMio {
    public static void main(String[] args) throws IOException {

        HSSFWorkbook workbook=new HSSFWorkbook();
        HSSFSheet Excelsheet= workbook.createSheet();
        Excelsheet.createRow(0);
        Excelsheet.getRow(0).createCell(0).setCellValue("Hello");
        Excelsheet.getRow(0).createCell(1).setCellValue("World");
        File myfile= new File("C:/Users/mario/Desktop/ExcelSelenium/tests.xls");
        workbook.write(myfile);
    }


}