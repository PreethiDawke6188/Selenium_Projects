import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Retry {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement fromCountry = driver.findElement(By.xpath("//div[contains(text(), 'From')]"));
		fromCountry.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'HYD')]")).click();
	}

}
