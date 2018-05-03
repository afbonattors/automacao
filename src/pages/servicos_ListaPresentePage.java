package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class servicos_ListaPresentePage extends baseTest {
	
	public static WebElement divLateral() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul"));
		
	}
	
	public static WebElement listaPresentes() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[1]"));
		
	}
	
	public static WebElement etnaCafe() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[2]"));
		
	}
	
	public static WebElement programaParceiros() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[3]"));
		
	}
	
	public static WebElement vendasCorporativas() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[4]"));
		
	}
	
	public static WebElement decora2000() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[5]"));
		
	}

}