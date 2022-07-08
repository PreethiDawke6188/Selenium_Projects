import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//grabbing text of the frame
		String Droppable = driver.findElement(By.className("entry-title")).getText();
		
		//printing the text
		System.console().writer().println(Droppable);
		
		//initializing variable as int and assigning the frame size to it
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		//switching to frame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//initializing Actions
		Actions mover = new Actions(driver);
		WebElement target = driver.findElement(By.id("droppable"));
		WebElement pickup = driver.findElement(By.id("draggable"));
		
		//dragging from pickup location and dropping at target
		mover.dragAndDrop(pickup,target).build().perform();
		
		//printing again
		System.console().writer().println(Droppable);
		Thread.sleep(3000);
		//driver.quit();
	}

}
