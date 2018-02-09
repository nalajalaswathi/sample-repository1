package p1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int n = links.size();
		for(int i=0;i<links.size();i++)
		{
			String text = links.get(i).getText();
			System.out.println(text);
		}
		
		/*
		driver.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("iknow");
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("iknow");
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).sendKeys("9876543210");
		driver.findElement(By.xpath(".//*[@id='u_0_y']")).sendKeys("iknow");
		Select day_sel = new Select(driver.findElement(By.id("day")));
		day_sel.selectByVisibleText("1");
		Thread.sleep(10000);
		*/
	}

}
