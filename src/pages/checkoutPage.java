package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class checkoutPage extends baseTest{
	
	public static WebElement finalizaPedido() {
		
		return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.carrinho.act > div > div.total > a.lkfinalizar"));
		
	}
	
	public static WebElement produtoCarrinho() {
		
		return baseTest.getDriver().findElement(By.partialLinkText("VELA REDONDO BRIGITE BRANCO 50UNIDADES"));
		
	}
	
	public static WebElement continuaCheckOut() {
		
		return baseTest.getDriver().findElement(By.id("submit"));
		
	}
	
	public static WebElement escolheBoleto() {
		
		return baseTest.getDriver().findElement(By.id("paymentTypeBoleto"));
		
	}
	
	public static WebElement finalizaCompra() {
		
		return baseTest.getDriver().findElement(By.id("submit"));
	}
	
	

}
