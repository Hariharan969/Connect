import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class CHROME {
	public static void main(String[]args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"page\"]/div[4]/div/div[2]/ol/li[1]/a"));
		String toolTipText=element.getAttribute("property");
		System.out.println(toolTipText);
				
		
		
		//driver.get("https://www.seleniumhq.org/download/");
		//driver.manage().window().maximize();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//WebElement Element=driver.findElement(By.xpath("//a[@href='https://sites.google.com/a/chromium.org/chromedriver/downloads']"));
		//js.executeScript("arguments[0].scrollIntoView();",Element);
		//driver.get("https://connect.maveric-systems.com/index.php/site/login");
		
	
		/*	WebElement Element=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/input"));
		String toolTipText=Element.getAttribute("value");
		System.out.println(toolTipText);*/
		
		
		////WebElement Alert2=driver.findElement(By.id("cookie_action_close_header"));
		//Alert2.click();
		

////Actions act=new Actions(driver);
//WebElement E1=driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a/span/span"));
//act.moveToElement(E1).build().perform();
//Thread.sleep(3000);

//Actions act1=new Actions(driver);
//WebElement E2=driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[11]/a/span/span"));
//act1.moveToElement(E2).build().perform();

		


		
		
		//Thread.sleep(1000);
		//String MainWindow=driver.getWindowHandle();
		//Set<String> s1=driver.getWindowHandles();

		//Iterator<String>i1=s1.iterator();
		//while(i1.hasNext())
		//{
		//	String ChildWindow=i1.next();
		//	if(!MainWindow.equalsIgnoreCase(ChildWindow))
		//	{
		//		driver.switchTo().window(ChildWindow);
		//String str="Clock Tower Hotel";	
		///WebElement ele=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//th[text()='"+str+"']//following-sibling::td[2]"));	

		//System.out.println(ele.getText());

		//TakesScreenshot scrShot=((TakesScreenshot)driver);
		//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//File DestFile=new File("C:\\Users\\training\\Desktop\\HARI.Png");

		//Files.copy(SrcFile,DestFile);
		//driver.close();
	
	
	
	}


	//	Frame//driver.switchTo().frame("iframe1");
	//Frame//driver.findElement(By.linkText("Software Testing Tutorial")).click();
	//Frame//driver.switchTo().defaultContent();
	//Frame//driver.findElement(By.xpath("//a[@href='https://www.toolsqa.com/']")).click();




	//Alerts-	WebElement Alert2=driver.findElement(By.id("cookie_action_close_header"));
	//Alerts-	Alert2.click();
	//Alerts-Thread.sleep(5000);
	//Alerts-WebElement Alert1=driver.findElement(By.xpath("//button[@onclick=\"if (!window.__cfRLUnblockHandlers) return false; pushAlert()\"]"));
	//Alerts-	Alert1.click();

	//Alerts-	Alert alert=driver.switchTo().alert();
	//Alerts-String inp=	alert.getText();
	//Alerts-System.out.println(inp);    



	//driver.get("https://www.toolsqa.com/automation-practice-form");
	//Select Sh=new Select(driver.findElement(By.id("continents")));
	//Sh.selectByVisibleText("Africa");
	//Thread.sleep(5000);
	//Sh.selectByIndex(5);
	//driver.quit();
	
	//driver.get("https://connect.maveric-systems.com");


	//WebElement username = driver.findElement(By.id("LoginForm_username"));--TYpes
	//username.sendKeys("hariharans");
	//driver.findElement(By.id("LoginForm_rememberMe"));
	//WebElement in = driver.findElement(By.id("LoginForm_rememberMe"));
	
	
	//in.click();
	//System.out.println(in.isSelected());

	//driver.findElement(By.id("LoginForm_username")).sendKeys("hariharans");
	//driver.findElement(By.id("LoginForm_password")).sendKeys("maveric6@");
	//driver.findElement(By.name("yt0")).click();
	
	
	//driver.findElement(By.name("LoginForm[rememberMe]")).click();
	//WebElement in = driver.findElement(By.id("LoginForm[rememberMe]"));
	//System.out.println(in.isSelected());

	//	driver.get("https://connect.maveric-systems.com");
	//driver.findElement(By.xpath("//input[@type='text']"));
	//String inp= driver.findElement(By.xpath("//*[contains(text(), 'credentials')]")).getText();
	//System.out.println(inp); 
}


