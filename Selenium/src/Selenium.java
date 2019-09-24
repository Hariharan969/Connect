import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {
	public static void main(String[]args) throws InterruptedException {
		

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Documents\\chromedriver.exe" );
		   WebDriver driver= new ChromeDriver();
	       driver.get("https://www.toolsqa.com/automation-practice-form");

	       Select ab = new Select(driver.findElement(By.id("continents"))); 
	       ab.selectByVisibleText("Africa"); 
	       Thread.sleep(2000);
	       ab.selectByIndex(0); 

	      // driver.findElement(By.tagName("input")).sendKeys("divyat");
	            
	      // List<WebElement> input= driver.findElements(By.tagName("input"));
	       //System.out.println(input.size());
	      
	       //WebElement in=driver.findElement(By.id("LoginForm_rememberMe"));
	       //in.click();
	       //System.out.println(in.isSelected());
	       //System.out.println(in.isEnabled());
	       //System.out.println(in.isDisplayed());
	       
	       
	       //WebElement username= driver.findElement(By.id("LoginForm_username"));
	       //username.sendKeys("hariharans");
	       //WebElement password= driver.findElement(By.id("LoginForm_password"));
	       //password.sendKeys("maveric6@");
	       //driver.findElement(By.name("yt0")).click();
	     
	       //Thread.sleep(4000);
	       // String test =driver.findElement(By.id("LoginForm_username")).getText();
	       //System.out.println(test);
	       driver.quit();
	       
	}

}
