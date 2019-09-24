import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[]args) throws InterruptedException, IOException {

		
		FileInputStream inputStream=new FileInputStream(file);
		File file=new File("C:\\Users\\training\\Desktop\\HARI\\Book1.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		
		
		

		}
		
	
	}
