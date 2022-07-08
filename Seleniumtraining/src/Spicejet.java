import java.util.logging.Level;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Spicejet {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		ChromeOptions options = new ChromeOptions();
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		options.addArguments("--disable-notifications");
		
		WebElement fromCountry = driver.findElement(By.xpath("//div[contains(text(), 'From')]"));
		fromCountry.sendKeys("Hydera");
		Thread.sleep(2000);
		
		
		WebElement toCountry = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz']/div[3]/div/div[2]/input"));
		toCountry.sendKeys("GOA");
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19h5ruw r-136ojw6']/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[5]/div[1]/div")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']/div[contains(text(), 'Senior Citizen')]")).click();
		driver.findElement(By.xpath("//div[@id='react-root']/div/div/div[1]/div[3]/div[2]/div[7]/div[2]/div[1]")).click();
		Thread.sleep(3000);
		String displayed = driver.findElement(By.xpath("//*[@class='css-1dbjc4n r-13awgt0 r-18u37iz r-1wtj0ep r-tv6buo']/div")).getText();
		String expected = "Senior Citizen";
		
		System.out.println(displayed);
		
            if (displayed.contains(expected))
			{
				System.out.println("PASS");
				
			}
			else
			{
				System.out.println("Fail");
				
			}
            driver.findElement(By.xpath("((//div[@class='css-1dbjc4n r-zso239'])[4]/*/*/*)[1]")).click();
            driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-13awgt0 r-18u37iz'])[2]/div[3]/div")).click();
        	driver.quit();
	}

}
