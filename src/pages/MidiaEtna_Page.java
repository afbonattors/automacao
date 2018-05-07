package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class MidiaEtna_Page extends BaseTest {
	
	public static WebElement divMenuLateral() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement divComunicacao() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement btnAcompanhe() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/p[2]/a"));
		
	}
	
	public static WebElement rodapeProdutos() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]"));
		
	}

}