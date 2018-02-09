package p1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePage {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		if(title.contentEquals("Google"))
		{
			System.out.println("Google page is opened,pass");
		}
		else
		{
			System.out.println("Google page is not opened,failed");
		}
	}

}
