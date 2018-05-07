package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseTest;

public class PesquisaProduto_Page {
	
	public static WebElement lupaPesquisa() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("#busca-mobile > span > button"));
		
	}
	
	public static WebElement gridProdutos() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("#colmd9-search-percent > div.produtos"));
		
	}
	
	public static WebElement produtoCapaAlmofadaPixeledVerde() {
		
		return BaseTest.getDriver().findElement(By.id("0386327"));
		
	}
	
	public static WebElement clicaComprar() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("#\\30 386327 > a.bt-c-ag"));
		
	}
	
	public static WebElement clicaCarrinho() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.carrinho"));
		
	}
	
	public static WebElement finalizarCompra() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.carrinho > div > div.total > a.lkfinalizar"));
		
	}
	
	public static WebElement nomeProdutoCarrinho() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper.topocarrinho > div.containerwrap > section > ul.list-unstyled.itens-no-carrinho.cart-itens > li > div.colunas.col02 > h3 > a"));
		
	}
	
	public static WebElement limpaCarrinho() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"removeAllItems\"]/input["));
		
	}
	
	public static WebElement btnExcluirProdutoCarrinho() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"removeci\"]"));
		
	}
	
	public static WebElement labelNaoHaProduto() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.carrinho > div > p"));
		
	}

}