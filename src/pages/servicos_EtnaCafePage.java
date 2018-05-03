package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class servicos_EtnaCafePage extends baseTest {
	
	public static WebElement divLateral() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement listaPresente() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[1]"));
		
	}
	
	public static WebElement etnaCafe() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[2]/a"));
		
	}
	
	public static WebElement dicasNutricionais() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[2]/ul/li[1]"));
		
	}
	
	public static WebElement receitas() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[2]/ul/li[2]"));
		
	}
	
	public static WebElement paoExclusivo() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[2]/ul/li[3]"));
	}
	
	public static WebElement cardapio() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[2]/ul/li[4]"));
		
	}
	
	public static WebElement programaParceiros() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[3]"));
		
	}
	
	public static WebElement vendasCorporativas() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[4]"));
		
	}
	
	public static WebElement decoraEtna() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[5]"));
		
	}
	
	public static WebElement dicasEtna() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[6]"));
		
	}

}