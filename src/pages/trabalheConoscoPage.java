package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class trabalheConoscoPage extends baseTest {
	
	public static WebElement divMenuLateral() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement divTrabalheConosco() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement btnCadastroCVVagas() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/ul/li[1]/a[2]"));
	}
	
	public static WebElement btnBuscaVagasVagas() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/ul/li[1]/a[1]"));
		
	}
	
	public static WebElement btnCadastroCVLinkedin() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/ul/li[2]/a[2]"));
		
	}
	
	public static WebElement btnBuscaVagasLinkedin() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/ul/li[2]/a[1]"));
	}
	
	public static WebElement footerProdutos() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]"));
		
	}
	
}