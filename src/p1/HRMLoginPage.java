package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMLoginPage {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm/");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		if(driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed())
		{
			System.out.println("Home page is displayed");
		}
	}

}
