import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Emp {
	
		public static void main(String[]args) throws InterruptedException {


			System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://connect.maveric-systems.com");
		 driver.manage().window().maximize();



		 Thread.sleep(3000);

		 driver.findElement(By.name("LoginForm[username]")).sendKeys("hariharans");
		 driver.findElement(By.name("LoginForm[password]")).sendKeys("maveric6@");
		 driver.findElement(By.name("yt0")).click();
		 Thread.sleep(3000);

		 WebElement e1=driver.findElement(By.xpath("//a[contains(text(), 'Services')]"));
		 Actions a1 = new Actions (driver);
		 a1.moveToElement(e1).build().perform();
		 Thread.sleep(4000);

}}