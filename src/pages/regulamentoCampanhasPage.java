package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class regulamentoCampanhasPage extends baseTest {
	
	public static WebElement divLateral() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul"));
		
	}
	
	public static WebElement divRegulamento() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}	

}
