package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class Duvidas_Page extends baseTest {
	
	public static WebElement divLateral() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement btnLojaFisica() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[1]"));
		
	}
	
	public static WebElement btnLojaVirtual() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[2]"));
		
	}
	
	public static WebElement divAcessoRapido() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement iconChatOnline() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul[1]"));
		
	}
	
	public static WebElement formasPagamento() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul[2]/li[1]"));
		
	}
	
	public static WebElement statusPedido() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul[2]/li[2]"));
		
	}
	
	public static WebElement prazoEntrega() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul[2]/li[3]"));
		
	}
	
	public static WebElement valorFrete() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul[2]/li[4]"));
		
	}

}