package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class nossasLojasPage extends baseTest {
	
	public static WebElement divNossasLojas() {
		
		return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > div.containerwrap > section > nav > ul > li.act"));
		
	}
	
	public static WebElement lojaBerrini() {
		
		return baseTest.getDriver().findElement(By.id("store-200002"));
	}
	
	public static WebElement lojaMarginal() {
		
		return baseTest.getDriver().findElement(By.id("store-500002"));
		
	}
	
	public static WebElement lojaRiodeJaneiro() {
		
		return baseTest.getDriver().findElement(By.id("store-600002"));
		
	}
	
	public static WebElement lojaCampinas() {
		
		return baseTest.getDriver().findElement(By.id("store-600005"));
		
	}
	
	public static WebElement lojaSalvador() {
		
		return baseTest.getDriver().findElement(By.id("store-600006"));
		
	}
	
	public static WebElement lojaNatal() {
		
		return baseTest.getDriver().findElement(By.id("store-600007"));
		
	}
	
	public static WebElement lojaBrasilia() {
		
		return baseTest.getDriver().findElement(By.id("store-600011"));
		
	}
	
	public static WebElement lojaGranjaViana() {
		
		return baseTest.getDriver().findElement(By.id("store-600012"));
		
	}
	
	public static WebElement lojaBeloHorizonte() {
		
		return baseTest.getDriver().findElement(By.id("store-600014"));
		
	}
	
	public static WebElement lojaCampoGrande() {
		
		return baseTest.getDriver().findElement(By.id("store-600015"));
		
	}
	
	public static WebElement lojaFortaleza() {
		
		return baseTest.getDriver().findElement(By.id("store-600016"));
		
	}
	
	public static WebElement lojaRecife() {
		
		return baseTest.getDriver().findElement(By.id("store-600018"));
		
	}
	
	public static WebElement lojaRibeiraoPreto() {
		
		return baseTest.getDriver().findElement(By.id("store-600019"));
		
	}
	
	public static WebElement lojaSocoraba() {
		
		return baseTest.getDriver().findElement(By.id("store-600020"));
		
	}
	
	public static WebElement divConfiraNossasLojas() {
		
		return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > div.containerwrap > section > div > div"));
		
	}
	
	public static WebElement divLojaBerrini() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(1)"));
		
	}
	
	public static WebElement divLojaMarginalTiete() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(2)"));
		
	}
	
	public static WebElement divLojaRiodeJaneiro() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(3)"));
	}
	
	public static WebElement divCampinas() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(4)"));
	}
	
	public static WebElement divSalvador() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(5)"));
	}
	
	public static WebElement divNatal() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(6)"));
	}
	
	public static WebElement divBrasilia() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(7)"));
	}
	
	public static WebElement divGranjaViana() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(8)"));
	}
	
	public static WebElement divBeloHorizonte() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(9)"));
	}
	
	public static WebElement divCampoGrande() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(10)"));
	}
	
	public static WebElement divFortaleza() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(11)"));
	}
	
	public static WebElement divRecife() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(12)"));
	}
	
	public static WebElement divRibeiraoPreto() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(13)"));
	}
	
	public static WebElement divSorocaba() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#todas > ul > li:nth-child(14)"));
	}
	

}
