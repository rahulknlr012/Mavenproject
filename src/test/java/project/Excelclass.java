package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelclass {
	static DataFormatter formatter = new DataFormatter();

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"\\src\\main\\java\\Utility\\"+"rahul.xlsx";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook;
		System.out.println("start");
		if(path.contains(".xlsx"))
		{
			System.out.println("xssf");
			workbook=new XSSFWorkbook(fis);
			
		}
		else
		{
			System.out.println("hssf");
			workbook=new HSSFWorkbook(fis);
		}
	   Sheet sheet=workbook.getSheet("sheet1");
	   int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	   for(int i=0;i<rowcount+1;i++)
	   {
		   Row row=sheet.getRow(i);
		   //int colcount=row.getLastCellNum()-row.getFirstCellNum();
		   for(int j=0;j<row.getLastCellNum();j++)
		   {
			   Cell cell=row.getCell(j);
			   String empno = formatter.formatCellValue(cell);
			   System.out.println("cell value"+empno);
		   }
	   }
		

	}

}
