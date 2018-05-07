package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class Checkout_Page extends BaseTest{
	
	public static WebElement finalizaPedido() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.carrinho.act > div > div.total > a.lkfinalizar"));
		
	}
	
	public static WebElement produtoCarrinho() {
		
		return BaseTest.getDriver().findElement(By.partialLinkText("VELA REDONDO BRIGITE BRANCO 50UNIDADES"));
		
	}
	
	public static WebElement continuaCheckOut() {
		
		return BaseTest.getDriver().findElement(By.id("submit"));
		
	}
	
	public static WebElement escolheBoleto() {
		
		return BaseTest.getDriver().findElement(By.id("paymentTypeBoleto"));
		
	}
	
	public static WebElement finalizaCompra() {
		
		return BaseTest.getDriver().findElement(By.id("submit"));
	}	

}