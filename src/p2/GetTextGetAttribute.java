package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextGetAttribute {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		WebElement search =  driver.findElement(By.name("q"));
		search.sendKeys("swathi");
	String text = search.getAttribute("value");
		 
		System.out.println(text);
	}

}
