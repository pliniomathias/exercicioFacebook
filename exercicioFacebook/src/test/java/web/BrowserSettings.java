package web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class BrowserSettings {

	static WebDriver driver;

	private BrowserSettings() {

	}

	public static void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

	}

}
