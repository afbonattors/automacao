package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.baseTest;

public class pesquisaProdutoPage {
	
	public static WebElement lupaPesquisa() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#busca-mobile > span > button"));
		
	}
	
	public static WebElement gridProdutos() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#colmd9-search-percent > div.produtos"));
		
	}
	
	public static WebElement produtoCapaAlmofadaPixeledVerde() {
		
		return baseTest.getDriver().findElement(By.id("0386327"));
		
	}
	
	public static WebElement clicaComprar() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#\\30 386327 > a.bt-c-ag"));
		
	}
	
	public static WebElement clicaCarrinho() {
		
		return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.carrinho > a"));
		
	}
	
	public static WebElement finalizaCompa() {
		
		return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.carrinho > div > div.total > a.lkfinalizar"));
		
	}

}