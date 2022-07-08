import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Assigning variable with Action function
		Actions Mhover = new Actions(driver);
		//hovering the mouse
		Mhover.moveToElement(driver.findElement(By.linkText("BORROWERS"))).perform();
		//performing the click activities
		driver.findElement(By.linkText("Calculators & Resources")).click();
		driver.findElement(By.linkText("Calculators")).click();
		driver.findElement(By.linkText("Budget Calculator")).click();
		// Entering data in the text boxes.
		driver.findElement(By.xpath("//div[@class=\"calcWrapper\"]/div[2]/div[1]/input")).sendKeys("300");
		driver.findElement(By.xpath("//div[@class=\"calcWrapper\"]/div[2]/div[2]/input")).sendKeys("100");
		driver.findElement(By.xpath("//div[@class=\"calcWrapper\"]/div[2]/div[3]/input")).sendKeys("200");
		driver.findElement(By.xpath("//div[@class=\"calcWrapper\"]/div[4]/div[1]/input")).sendKeys("2000");
		driver.findElement(By.xpath("//div[@class=\"calcWrapper\"]/div[4]/div[2]/input")).sendKeys("200");
		//Capturing values and printing
		WebElement tmonthly = driver.findElement(By.xpath("//div[@class='calcWrapper']/div[5]/div[4]/input"));
		String TotalMonthly = tmonthly.getAttribute("value");
		System.out.println("Total Monthly Income is :"+TotalMonthly);
		
		//Capturing values and printing
		WebElement MoExpence = driver.findElement(By.xpath("//div[@class='calcWrapper']/div[5]/div[2]/input"));
		String MonthlyExpence = MoExpence.getAttribute("value");
		System.out.println("Total Monthly Expence is :"+MonthlyExpence);
		
		//Capturing values and printing
		WebElement UO = driver.findElement(By.xpath("//div[@class='calcWrapper']/div[5]/div[5]/input"));
		String UOBudget = UO.getAttribute("value");
		System.out.println("Total Monthly Income is :"+UOBudget);
		
		float TM= Float.parseFloat(TotalMonthly);
		System.out.println(TM);
		
		float ME=Float.parseFloat(MonthlyExpence);
		System.out.println(ME);
		
		if(TM>ME){
			System.out.println("your savings are amazing");
			
		}
		else
		{
			System.out.println("You need to improve in savings");
		}
		driver.quit();
	}
		
}
