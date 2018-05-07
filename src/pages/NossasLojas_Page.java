package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class NossasLojas_Page extends baseTest {
	
	public static WebElement divNossasLojas() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[2]"));
		
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
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div"));
		
	}
	
	public static WebElement divLojaBerrini() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[1]"));
		
	}
	
	public static WebElement divLojaMarginalTiete() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[2]"));
		
	}
	
	public static WebElement divLojaRiodeJaneiro() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[3]"));
	}
	
	public static WebElement divCampinas() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[4]"));
	}
	
	public static WebElement divSalvador() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[5]"));
	}
	
	public static WebElement divNatal() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[6]"));
	}
	
	public static WebElement divBrasilia() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[7]"));
	}
	
	public static WebElement divGranjaViana() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[8]"));
	}
	
	public static WebElement divBeloHorizonte() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[9]"));
	}
	
	public static WebElement divCampoGrande() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[10]"));
	}
	
	public static WebElement divFortaleza() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[11]"));
	}
	
	public static WebElement divRecife() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[12]"));
	}
	
	public static WebElement divRibeiraoPreto() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[13]"));
	}
	
	public static WebElement divSorocaba() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[14]"));
	}
	
	public static WebElement divProdutosSelecionados() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"lojas\"]"));
		
	}
	
	public static WebElement divProdutosVisitados() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[5]"));
		
	}

}