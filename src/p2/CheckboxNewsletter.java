package p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CheckboxNewsletter {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		
		System.setProperty("WebDriver.Chrome.driver1", "");
		ChromeDriver driver1 = new ChromeDriver();
		
		System.setProperty("WebDriver.ie.driver1", "");
		InternetExplorerDriver driver2 = new InternetExplorerDriver();
		
		WebDriver driver3 = new ChromeDriver();
		

	}

}
