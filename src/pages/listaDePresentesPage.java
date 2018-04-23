package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class listaDePresentesPage extends baseTest {
	
	public static WebElement divEncontreListaPresentes() {
		
		return baseTest.getDriver().findElement(By.id("WeddingSearch"));
		
	}
	
	public static WebElement txtfieldNomeLista() {
		
		return baseTest.getDriver().findElement(By.id("clientName"));
		
	}
	
	public static WebElement txtDataEvento() {
		
		return baseTest.getDriver().findElement(By.id("eventDate"));
		
	}
	
	public static WebElement txtNumeroLista() {
		
		return baseTest.getDriver().findElement(By.id("giftlistId"));
		
	}
	
	public static WebElement btnPesquisar() {
		
		return baseTest.getDriver().findElement(By.id("pesquisar-lista"));
	}
	
	public static WebElement divAcessaListaPresente() {
		
		return baseTest.getDriver().findElement(By.id("weddingLogin"));
		
	}
	
	public static WebElement txtfieldEmail() {
		
		return baseTest.getDriver().findElement(By.id("login"));
		
	}
	
	public static WebElement txtfieldSenha() {
		
		return baseTest.getDriver().findElement(By.id("password"));
	}
	
	public static WebElement btnEntrar() {
		
		return baseTest.getDriver().findElement(By.id("acessar-lista"));
		
	}

}
