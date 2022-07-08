import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationFF {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			WebDriver pfdriver = new FirefoxDriver();
			pfdriver.get("https://www.facebook.com");
			String pftitle = pfdriver.getTitle();
			if(pftitle.equalsIgnoreCase("Facebook – log in or sign up"))
			{
				System.out.println("PASS");
				
			}
			else 
			{
				System.out.println("FAIL");
				
			}
			System.out.println(pftitle);
			
		}

	}
