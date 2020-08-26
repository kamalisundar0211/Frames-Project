
package frames;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		
			File f = new File("C:\\Users\\Yaazhini\\eclipse-workspace\\frames\\Input\\kamali.xlsx");
			Workbook w= new XSSFWorkbook();
			Sheet s1 = w.createSheet("input");
			Row r = s1.createRow(0);
			Cell c = r.createCell(0);
			c.setCellValue("name");
			FileOutputStream fort =new FileOutputStream(f);
			w.write(fort);
			
			
			
			System.out.println("done");
			
	}
}
