import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Documents\\chromedriver.exe" );

		WebDriver driver= new ChromeDriver();
		driver.get("https://connect.maveric-systems.com");	
WebDriverWait wait =new WebDriverWait(driver,20);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));


	}
}
