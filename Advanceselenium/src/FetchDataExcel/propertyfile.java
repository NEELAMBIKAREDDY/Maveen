package FetchDataExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\User\\Desktop\\Neelambika WS\\Advanceselenium\\excel\\excel.properties");
		Properties p=new Properties();
		p.load(f);
		String url = p.getProperty("url");
		System.out.println(url);
		
		

	}

}
