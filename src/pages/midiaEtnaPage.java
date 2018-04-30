package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class midiaEtnaPage extends baseTest {
	
	public static WebElement divMenuLateral() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement divComunicacao() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement btnAcompanhe() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/p[2]/a"));
		
	}
	
	public static WebElement rodapeProdutos() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]"));
		
	}
	
	public static WebElement divFooterSaibaMais() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[1]"));
		
	}
	
	public static WebElement divFooterCentralAtendimento() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[2]"));
		
	}
	
	public static WebElement divFooterServicos() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[3]"));
		
	}
	
	public static WebElement divSegurancaPrivacidade() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[4]"));
		
	}

}
