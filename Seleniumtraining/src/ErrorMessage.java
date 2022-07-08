import java.util.logging.Level;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.facebook.com");
		cdriver.manage().window().maximize();
		
		
		
		//entering user name
		cdriver.findElement(By.name("email")).sendKeys("Preethi");
		
		//Entering password
		cdriver.findElement(By.id("pass")).sendKeys("1234");
		
		//clicking on login
		cdriver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		
		//Assigning error message to string
		String expected = "The password that you've entered is incorrect.";
		
		//Storing the tagname in web element "actual" and clicking it.
		WebElement actual = cdriver.findElement(By.className("_9ay7"));
	    //actual.click();
	    
	    //fetch the text message from the screen
	    String actualdata = actual.getText();
	    
	    //validate if displayed text matches the expected text.
	    if (actualdata.contains(expected))
	    {
	    	System.out.println("PASS");
	    	System.out.println("The error message is : "+actualdata);
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    }
	    
		
	    cdriver.quit();
		
	}
}