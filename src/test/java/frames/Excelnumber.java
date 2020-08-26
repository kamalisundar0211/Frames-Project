package frames;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelnumber {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Input\\dhakshak1.xlsx");
			
			Workbook w=new XSSFWorkbook();
	        Sheet s = w.createSheet("kamali");
	        Row r = s.createRow(0);
           	Cell c = r.createCell(0);
	        c.setCellValue("name");
	
          FileOutputStream val =new FileOutputStream(f);
	       w.write(val);
	    System.out.println("done");
	
	
	
	
	
	
	
	
	
	}}
	        