package p2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseQuiteEx {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.talentzing.com/TrainingHome.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("FAQ")).click();
		Thread.sleep(50000);
		driver.findElement(By.linkText("FeedBack")).click();
		Thread.sleep(500000);
		
		String Homepage = driver.getWindowHandle();
		
		Set<String> allhandles = driver.getWindowHandles();
		
		for(String wndhandles :allhandles )
		{
			driver.switchTo().window(wndhandles);
			String Url = driver.getCurrentUrl();
			if (Url.contains("FrequentlyAskedQuestions"))
			{
				System.out.println("FAQ page");
				driver.close();
				break;
			}
		}
		driver.switchTo().window(Homepage);
		driver.quit();
	}

}
