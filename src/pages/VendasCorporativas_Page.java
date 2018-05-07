package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class VendasCorporativas_Page extends BaseTest {
	
	public static WebElement divLateral() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement divConteudo() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement divPainel1() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"accordion\"]/div[1]"));
		
	}
	
	public static WebElement divPainel2() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"accordion\"]/div[2]"));
		
	}
	
	public static WebElement divPainel3() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"accordion\"]/div[3]"));
		
	}
	
	public static WebElement divPainel4() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"accordion\"]/div[4]"));
		
	}
	
	public static WebElement btnFormularioVenda() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/p/a[1]"));
		
	}
	
	public static WebElement btnAutorizacaoCompra() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/p/a[2]"));
		
	}

}