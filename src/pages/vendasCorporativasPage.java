package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class vendasCorporativasPage extends baseTest {
	
	public static WebElement divLateral() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement divConteudo() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement divPainel1() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"accordion\"]/div[1]"));
		
	}
	
	public static WebElement divPainel2() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"accordion\"]/div[2]"));
		
	}
	
	public static WebElement divPainel3() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"accordion\"]/div[3]"));
		
	}
	
	public static WebElement divPainel4() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"accordion\"]/div[4]"));
		
	}
	
	public static WebElement btnFormularioVenda() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/p/a[1]"));
		
	}
	
	public static WebElement btnAutorizacaoCompra() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/p/a[2]"));
		
	}

}
