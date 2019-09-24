

package LoginConnTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class ConnTest2 {
	
	
	
	//huiughi
	///hjvgvgvgj
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		//System.out.println("before Test");

	}
	@Test
	@Parameters({"sUsername", "sPassword"})
	public void testDrive(String sUsername,String sPassword) throws InterruptedException
	{


		driver.findElement(By.id("LoginForm_username")).sendKeys(sUsername);
		driver.findElement(By.id("LoginForm_password")).sendKeys(sPassword);
		Thread.sleep(2000);
		driver.findElement(By.name("yt0")).click();
	}
	/*
	 * @Test
	 * 
	 * @Parameters({"sUsername", "sPassword"}) public void testDrive(String
	 * sUsername,String sPassword) throws InterruptedException {
	 * 
	 * 
	 *  }
	 */

	@AfterTest
	public void terminateBrowser() {
		//System.out.println("After Test ");
		driver.quit();


	}
}












