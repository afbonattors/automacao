package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class meusdadosPage extends baseTest {
	
	public static WebElement divDadosDeCadastro() {
		
		return baseTest.getDriver().findElement(By.id("#dados-cadastro"));
				
	}
	
	public static WebElement divDadosGerais() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#dados-cadastro > div:nth-child(1)"));
		
	}
	
	public static WebElement campoNome() {
		
		
		return baseTest.getDriver().findElement(By.id("firstName"));
	}
	
	

}
