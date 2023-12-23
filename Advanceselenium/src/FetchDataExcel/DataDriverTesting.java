package FetchDataExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriverTesting {


	@DataProvider(name = "excel")
	public Object[][] data() throws EncryptedDocumentException, IOException
		{
		FileInputStream fle=new FileInputStream("C:\\Users\\User\\Desktop\\Neelambika WS\\Advanceselenium\\data\\exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(fle);
		Sheet s = wb.getSheet("sheet2");
		int rowsize = s.getPhysicalNumberOfRows();
		System.out.println(rowsize);
		int cloumnsize = s.getRow(0).getPhysicalNumberOfCells();
		System.out.println(cloumnsize);
	Object[][] d=new Object[rowsize-1][cloumnsize];
//		d[0][0]="java";
//		d[0][1]="sql";
//		d[1][0]="manual";
//		d[1][1]="api";
	for (int i = 0; i < rowsize-1; i++) {
		for (int j = 0; j < cloumnsize; j++) {
		d[i][j]=s.getRow(i+1).getCell(j).toString();
			
		}
		
		
	}
		return d;
//			
		}

		@Test(dataProvider = "excel")
		
			public void reciever(String s1,String s2)
			{
			
			System.out.println(s1);
			System.out.println(s2);
				
			
			}
		}
		
	
	

	


