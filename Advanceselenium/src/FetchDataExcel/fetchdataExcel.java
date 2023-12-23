package FetchDataExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fetchdataExcel {
	@DataProvider(name = "excel")
	public Object[][]data() throws EncryptedDocumentException, IOException{
		FileInputStream fle=new FileInputStream("C:\\Users\\User\\Desktop\\Neelambika WS\\Advanceselenium\\data\\exceldata1.xlsx");
		
		Workbook w=WorkbookFactory.create(fle);
		Sheet s = w.getSheet("sheet1");
		int rows = s.getPhysicalNumberOfRows();
		int colomns = s.getRow(0).getPhysicalNumberOfCells();
		Object[][]d=new Object[rows-1][colomns];
		for (int i = 0; i < rows-1; i++) {
			for (int j = 0; j < colomns; j++) {
				d[i][j]=s.getRow(i+1).getCell(j).toString();
			
				
			}
			
		}
		return d;
	}
	
	ChromeDriver driver;
		@Test (priority=1,dataProvider = "excel")

	public void register( String Gender,String FirstName,String LastName,String Email,String password,String Confirmpassword) throws IOException
		{driver=new ChromeDriver();
		FileInputStream f=new FileInputStream("C:\\Users\\User\\Desktop\\Neelambika WS\\Advanceselenium\\excel\\excel.properties");
		Properties p=new Properties();
		p.load(f);
		String url = p.getProperty("url");
		driver.get(url);
		
		driver.findElement(By.linkText("Register")).click();
		if(Gender.equalsIgnoreCase("female"))
		{
			driver.findElement(By.id("gender-female")).click();
		}
		else
		{
			driver.findElement(By.id("gender-male")).click();
		}
		
		driver.findElement(By.id("FirstName")).sendKeys(FirstName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
	WebElement ele = driver.findElement(By.id("Email"));
	ele.sendKeys(Email);
driver.findElement(By.id("Password")).sendKeys(password);
driver.findElement(By.id("ConfirmPassword")).sendKeys(Confirmpassword);
driver.findElement(By.id("register-button")).click();
//driver.findElement(By.linkText("nijroop123@gmail.com")).isDisplayed();
			
		}
		@Test(priority = 2)
		public void logout() {
			driver.findElement(By.linkText("Log out")).click();
			
		}
		@Test(priority = 3,dataProvider = "excel")
		public void login(String email,String password) {
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.className("button-1 login-button")).click();
			
		}
		
		
	}
	


		
		

	


