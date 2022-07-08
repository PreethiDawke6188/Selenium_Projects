import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.linkedin.com/");
		cdriver.manage().window().maximize();
		
		//entering user name
		cdriver.findElement(By.className("sign-in-form__forgot-password-link")).click();
		
		//validating title of the landing screen.
		String pftitle = cdriver.getTitle();
		if(pftitle.equalsIgnoreCase("Reset Password | LinkedIn"))
		{
			System.out.println("Pass : ");
			System.out.println(pftitle);
			
		}
		else 
		{
			System.out.println("Failed to load the screen");
			
		}
		
		//click on Join Now
		cdriver.findElement(By.linkText("Join now")).click();
		
		//capture title of the screen
		String jointitle = cdriver.getTitle();
		
		//validate the title
		if(jointitle.equalsIgnoreCase("Sign Up | LinkedIn"))
		{
			System.out.println("Pass : ");
			System.out.println(jointitle);
			
		}
		else 
		{
			System.out.println("Failed to load the screen");
			
		}
		
		cdriver.findElement(By.linkText("Sign in")).click();
		
		//capture title of the screen
		String signtitle = cdriver.getTitle();
		
		//validate the title
		if(signtitle.equalsIgnoreCase("LinkedIn Login, Sign in | LinkedIn"))
		{
			System.out.println("Pass : ");
			System.out.println(signtitle);
			
		}
		else 
		{
			System.out.println("Failed to load the screen");
			
		}
		
		cdriver.findElement(By.name("session_key")).sendKeys("adminaccount");
		cdriver.findElement(By.id("password")).sendKeys("1234");
		cdriver.findElement(By.xpath("//button[contains(@class,'\btn__primary\')]")).click();
		
		String loginexpected = cdriver.getTitle();
		if(loginexpected.equalsIgnoreCase("Please enter a valid username"))
				{
			System.out.println("Login Failed");
				}
		else 
		{
			System.out.println("PASS");
			
		}
		cdriver.quit();	    
		
	}
	
}
