import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFact {
public static void main(String[]args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\chromedriver_win32\\chromedriver.exe");

WebDriver driver=new ChromeDriver();


driver.get("https://connect.maveric-systems.com/index.php/site/login");

PageFactElements pp = new PageFactElements(driver);
pp.username.sendKeys("cristiano");
pp.password.sendKeys("cr7");
Thread.sleep(3000);
   driver.quit();  
}
}