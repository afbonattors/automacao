package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class diferenciaisEtna extends baseTest {
	
	public static WebElement divMenuLateral() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement divSobreEtna() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement footerProdutosVistos() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]"));
		
	}
	
	public static WebElement footer() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer"));
		
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
	
	public static WebElement divFooterSeguranca() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[4]"));
		
	}
	
	public static WebElement divFooterTelefones() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[5]"));
		
	}
	
	public static WebElement divFooterTeleVendas() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[6]"));
		
	}
	
	public static WebElement divFooterRedesSociais() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[7]"));
		
	}
	
	public static WebElement divFooterTexto() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[2]"));
		
	}

}