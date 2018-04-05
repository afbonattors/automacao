package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class pesquisaProduto {
	
	public static WebElement clicaLupa() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#busca-mobile > span > button"));
		
	}
	
	public static WebElement clicaComprar() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#\\30 030838 > a.bt-c-ag"));
		
	}
	
	public static WebElement finalizaCompra() {
		
		return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.carrinho > div > div.total > a.lkfinalizar"));
		
	}	

}
