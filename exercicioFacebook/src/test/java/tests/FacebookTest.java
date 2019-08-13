package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import pages.PaginaInicial;
import web.BrowserSettings;

public class FacebookTest {

	static WebDriver driver;
	static PaginaInicial paginaInicial;
	static BrowserSettings browserSettings;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		browserSettings.openBrowser();
		

		/*System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();*/

		//paginaInicial = new PaginaInicial(driver);

	}

	/*
	 * @AfterClass public static void tearDownAfterClass() throws Exception {
	 * 
	 * driver.close();
	 * 
	 * }
	 */

	@Test
	public void test() {

	}

}
