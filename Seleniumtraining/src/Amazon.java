import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Assigning variable with Action function
		Actions movetosignin = new Actions(driver);
		movetosignin.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).perform();
		driver.findElement(By.className("nav-action-inner")).click();
		String grabedtitle = driver.getTitle();
		String displayedtitle = "Amazon Sign-In";
		if (grabedtitle.contentEquals(displayedtitle)){
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		driver.quit();
		
	}

}
