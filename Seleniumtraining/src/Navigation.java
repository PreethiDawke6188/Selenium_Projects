import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Navigation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mynewObj = new Scanner(System.in);
		String browser = mynewObj.nextLine();
		System.out.println("Enter Broswer Type");
		browser = mynewObj.nextLine();
		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			WebDriver pdriver = new ChromeDriver();
			pdriver.get("https://www.facebook.com");
			String ptitle = pdriver.getTitle();
			if(ptitle.equalsIgnoreCase("Facebook – log in or sign up"))
			{
				System.out.println("PASS");
				System.out.println(ptitle);
				
			}
			else 
			{
				System.out.println("FAIL");
				
			}
		}
		else if(browser.equalsIgnoreCase("firefox"))
				{
				System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
				WebDriver pfdriver = new FirefoxDriver();
				pfdriver.get("https://www.facebook.com");
				String pftitle = pfdriver.getTitle();
				if(pftitle.equalsIgnoreCase("Facebook – log in or sign up"))
				{
					System.out.println("PASS");
					System.out.println(pftitle);
					
				}
				else 
				{
					System.out.println("FAIL");
					
				}
				}
		else
		{
			System.out.println("Browser NOT Supported");
		}
			
	}

}
