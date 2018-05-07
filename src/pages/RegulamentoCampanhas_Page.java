package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class RegulamentoCampanhas_Page extends BaseTest {
	
	public static WebElement divLateral() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul"));
		
	}
	
	public static WebElement promoLista1() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[2]"));
		
	}
	
	public static WebElement promoLista2() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[3]"));
		
	}
	
	public static WebElement promoLista3() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[4]"));
		
	}
	
	public static WebElement promoLista4() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[5]"));
		
	}
	
	public static WebElement promoLista5() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[6]"));
		
	}
	
	public static WebElement divRegulamento() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}	

}