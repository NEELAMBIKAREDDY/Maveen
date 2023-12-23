package FetchDataExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fle=new FileInputStream("C:\\Users\\User\\Desktop\\Neelambika WS\\Advanceselenium\\data\\exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(fle);
		//String s = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		//System.out.println(s);
	/*for (int i=0;i<3;i++) {
		for (int j=0;j<3;j++) {
			String s1 = wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
			System.out.println(s1);
			
			
		}
	}*/
		
		
			/*for (int i=1;i<4;i++) {
				for (int j=0;j<2;j++) {
					String s2 = wb.getSheet("Sheet2").getRow(i).getCell(j).toString();
					System.out.print(s2+" ");
			
			
			
			
		}
				System.out.println(" ");
		
		
		
	}*/
			
			
			
			Sheet s = wb.getSheet("sheet2");
			int rowsize = s.getPhysicalNumberOfRows();
			System.out.println(rowsize);
			int cloumnsize = s.getRow(0).getPhysicalNumberOfCells();
			System.out.println(cloumnsize);

			for (int i=0;i<rowsize;i++) {
				for (int j=0;j<cloumnsize;j++) {
					String s2 = wb.getSheet("Sheet2").getRow(i).getCell(j).toString();
					System.out.print(s2+" ");
			
			
			
			
		}
				System.out.println(" ");
		
		
		
	}
			
			
				}
	
	

}
