package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class ListaDePresentes_Page extends BaseTest {
	
	public static WebElement divBannerLista() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[1]/div"));
		
	}
	
	public static WebElement divEncontreListaPresentes() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"WeddingSearch\"]"));
		
	}
	
	public static WebElement txtfieldNomeLista() {
		
		return BaseTest.getDriver().findElement(By.id("clientName"));
		
	}
	
	public static WebElement txtDataEvento() {
		
		return BaseTest.getDriver().findElement(By.id("eventDate"));
		
	}
	
	public static WebElement txtNumeroLista() {
		
		return BaseTest.getDriver().findElement(By.id("giftlistId"));
		
	}
	
	public static WebElement btnPesquisar() {
		
		return BaseTest.getDriver().findElement(By.id("pesquisar-lista"));
		
	}
	
	public static WebElement divAcessaListaPresente() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"weddingLogin\"]"));
		
	}
	
	public static WebElement txtfieldEmail() {
		
		return BaseTest.getDriver().findElement(By.id("login"));
		
	}
	
	public static WebElement txtfieldSenha() {
		
		return BaseTest.getDriver().findElement(By.id("password"));
		
	}
	
	public static WebElement btnEntrar() {
		
		return BaseTest.getDriver().findElement(By.id("acessar-lista"));
		
	}
	
	public static WebElement divDuvidas() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div/div[1]"));
		
	}
	
	public static WebElement divNovaArea() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div/div[2]/div[1]"));
		
	}
	
	public static WebElement divAdicionadosRecentemente() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"weddingListProducts\"]"));
		
	}

}