package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaInicial {

	static WebDriver driver;

	public PaginaInicial(WebDriver driver) {

		this.driver = driver;
	}
	
	public void preencherCampo() {
		
		WebElement objName = driver.findElement(By.id("firstName"));
		objName.sendKeys("Jarbas");
		
	}

}
