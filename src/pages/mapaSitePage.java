package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class mapaSitePage extends baseTest {
	
	public static WebElement divHeaderMapa() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div/div[1]"));
		
	}
	
	public static WebElement divCategoriaProduto() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div/div[2]"));
		
	}
	
	public static WebElement divInstitucional() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div/div[3]"));
		
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