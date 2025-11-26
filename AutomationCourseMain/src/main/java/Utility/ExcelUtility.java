package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	static FileInputStream f; //to access Excel file
	static XSSFWorkbook w; //to access whole workbook
	static XSSFSheet s;// to access one sheet of workbook 
	
	
	public static String getStringData(int a,int b,String sheet) throws IOException {// Returns the content of the specified cell as a String.
	    f=new FileInputStream("C:\\Users\\User\\git\\Automation_Course\\AutomationCourseMain\\src\\test\\resources\\loginPage.xlsx");
		w=new XSSFWorkbook(f);//
		s=w.getSheet(sheet);
		XSSFRow r=s.getRow(a); //pic the required row
		XSSFCell c=r.getCell(b);// pic the required column.
		return c.getStringCellValue(); //inbuilt method for excelsheet connection
	}
	
	
	public static String getIntegerData(int a,int b,String sheet) throws IOException { //Returns the content of the specified cell as a Integer.
		f=new FileInputStream("C:\\Users\\User\\git\\Automation_Course\\AutomationCourseMain\\src\\test\\resources\\loginPage.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet(sheet);
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int y=(int) c.getNumericCellValue();// boolean --> integer  = typecasting
		return String.valueOf(y);
	}

}
