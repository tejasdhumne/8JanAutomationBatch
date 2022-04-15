package script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excaelsheet 
{
public static void main(String[] args) throws IOException
{
	String excelPath = "C:\\Users\\ASUS\\OneDrive\\Documents\\Book1.xlsx";
	FileInputStream File = new FileInputStream (excelPath);
	XSSFWorkbook Workbook = new XSSFWorkbook(File);
	XSSFSheet Sheet = Workbook.getSheet("Batch");
	XSSFRow Row = Sheet.getRow(0);
	XSSFCell Cell = Row.getCell(1);
	String data = Cell.getStringCellValue();
	System.out.println(data);
}
}
