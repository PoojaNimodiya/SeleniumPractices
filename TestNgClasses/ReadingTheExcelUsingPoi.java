package TestNgClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingTheExcelUsingPoi {
  
  public void ReadFromExcel(String filePath, String SheetName) throws IOException {
	  Workbook myWorkbook = null;
	  //filePath = "D://DemoTest.xlsx";
	  
	  File file = new File(filePath);
	  
	  
	  boolean val = file.exists();
	  System.out.println(val);
	  
	  FileInputStream input = new FileInputStream(file);
	  
	  String getFileExtention = filePath.substring(filePath.indexOf("."));
	  
	  if(getFileExtention.equals(".xlsx")){
		  
		   myWorkbook = new XSSFWorkbook(input); 
	  }
	  else if(getFileExtention.equals(".xls"))
	  {
		   myWorkbook = new HSSFWorkbook(input); 

	  }
	  
	  Sheet mySheet = myWorkbook.getSheet(SheetName);
	  int rowCount = mySheet.getLastRowNum() - mySheet.getFirstRowNum();
	  
	  System.out.println("Here is total rowcount " +rowCount);
	  
	  for(int i=0; i< rowCount+1;i++)
	  {
		  Row row = mySheet.getRow(i);
		  
		  for (int j=0; j< row.getLastCellNum(); j++){
			  System.out.println(row.getCell(j).getStringCellValue()+ "||");
		  }
		  
		  System.out.println();

	  }
  }
  
  
  public static void main(String []args) throws IOException{
	  
	  ReadingTheExcelUsingPoi obj = new ReadingTheExcelUsingPoi();
	  obj.ReadFromExcel("D://DemoTest.xlsx", "demo");
  }
  
  
}
