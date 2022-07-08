import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleselfTrail {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
				
		//Storing the links in a list and traversing through the links
        
		String url = "";
		String linktext = "";

		//Get count of hyperlinks.
		int vcount = driver.findElements(By.tagName("a")).size();
		System.out.println("Count of total number of Links text :"+vcount);

		List<WebElement> vtext = driver.findElements(By.tagName("a"));
		Iterator<WebElement> iterator = vtext.iterator();
		int validUrlCount=0;
		while (iterator.hasNext()) {
		WebElement element = iterator.next();
		url = element.getAttribute("href");
		linktext=element.getText();
		if(url.isBlank() || url.isEmpty() || linktext.isEmpty() || linktext.isBlank()){
			continue;
		}

		else {
		char ch=linktext.toCharArray()[0];
		
           if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
            	System.out.println(linktext);
            	System.out.println(url);
        		validUrlCount = validUrlCount+1;
            }
            else
            {
            	continue;
            }
            }
		}	
		System.out.println("Number of valid Urls count is :"+validUrlCount);
		driver.quit();
	}
}




