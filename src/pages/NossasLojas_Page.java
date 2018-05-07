package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class NossasLojas_Page extends BaseTest {
	
	public static WebElement divNossasLojas() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav/ul/li[2]"));
		
	}
	
	public static WebElement lojaBerrini() {
		
		return BaseTest.getDriver().findElement(By.id("store-200002"));
	}
	
	public static WebElement lojaMarginal() {
		
		return BaseTest.getDriver().findElement(By.id("store-500002"));
		
	}
	
	public static WebElement lojaRiodeJaneiro() {
		
		return BaseTest.getDriver().findElement(By.id("store-600002"));
		
	}
	
	public static WebElement lojaCampinas() {
		
		return BaseTest.getDriver().findElement(By.id("store-600005"));
		
	}
	
	public static WebElement lojaSalvador() {
		
		return BaseTest.getDriver().findElement(By.id("store-600006"));
		
	}
	
	public static WebElement lojaNatal() {
		
		return BaseTest.getDriver().findElement(By.id("store-600007"));
		
	}
	
	public static WebElement lojaBrasilia() {
		
		return BaseTest.getDriver().findElement(By.id("store-600011"));
		
	}
	
	public static WebElement lojaGranjaViana() {
		
		return BaseTest.getDriver().findElement(By.id("store-600012"));
		
	}
	
	public static WebElement lojaBeloHorizonte() {
		
		return BaseTest.getDriver().findElement(By.id("store-600014"));
		
	}
	
	public static WebElement lojaCampoGrande() {
		
		return BaseTest.getDriver().findElement(By.id("store-600015"));
		
	}
	
	public static WebElement lojaFortaleza() {
		
		return BaseTest.getDriver().findElement(By.id("store-600016"));
		
	}
	
	public static WebElement lojaRecife() {
		
		return BaseTest.getDriver().findElement(By.id("store-600018"));
		
	}
	
	public static WebElement lojaRibeiraoPreto() {
		
		return BaseTest.getDriver().findElement(By.id("store-600019"));
		
	}
	
	public static WebElement lojaSocoraba() {
		
		return BaseTest.getDriver().findElement(By.id("store-600020"));
		
	}
	
	public static WebElement divConfiraNossasLojas() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div"));
		
	}
	
	public static WebElement divLojaBerrini() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[1]"));
		
	}
	
	public static WebElement divLojaMarginalTiete() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[2]"));
		
	}
	
	public static WebElement divLojaRiodeJaneiro() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[3]"));
	}
	
	public static WebElement divCampinas() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[4]"));
	}
	
	public static WebElement divSalvador() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[5]"));
	}
	
	public static WebElement divNatal() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[6]"));
	}
	
	public static WebElement divBrasilia() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[7]"));
	}
	
	public static WebElement divGranjaViana() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[8]"));
	}
	
	public static WebElement divBeloHorizonte() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[9]"));
	}
	
	public static WebElement divCampoGrande() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[10]"));
	}
	
	public static WebElement divFortaleza() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[11]"));
	}
	
	public static WebElement divRecife() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[12]"));
	}
	
	public static WebElement divRibeiraoPreto() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[13]"));
	}
	
	public static WebElement divSorocaba() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"todas\"]/ul/li[14]"));
	}
	
	public static WebElement divProdutosSelecionados() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"lojas\"]"));
		
	}
	
	public static WebElement divProdutosVisitados() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[5]"));
		
	}

}