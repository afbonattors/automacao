package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class DecoraEtna_Page extends BaseTest {
	
	public static WebElement divLateral() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement divConteudo() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement divLoja2014() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[3]/div[1]"));
		
	}
	
	public static WebElement btLoja2014() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[3]/div[1]/span/a"));
		
	}
	
	public static WebElement divLoja2015() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[3]/div[2]"));
	}
	
	public static WebElement btnLoja2015() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[3]/div[2]/span/a"));
		
	}

}