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
	
	

}
