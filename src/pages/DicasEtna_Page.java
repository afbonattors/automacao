package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class DicasEtna_Page extends BaseTest {
	
	public static WebElement divBannerHome() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[1]"));
		
	}
	
	public static WebElement divLista1() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[1]"));
		
	}
	
	public static WebElement divLista2() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[2]"));
		
	}
	
	public static WebElement divLista3() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[3]"));
		
	}
	
	

}
