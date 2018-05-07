package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class TrabalheConosco_Page extends BaseTest {
	
	public static WebElement divMenuLateral() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement divTrabalheConosco() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement btnCadastroCVVagas() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/ul/li[1]/a[2]"));
	}
	
	public static WebElement btnBuscaVagasVagas() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/ul/li[1]/a[1]"));
		
	}
	
	public static WebElement btnCadastroCVLinkedin() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/ul/li[2]/a[2]"));
		
	}
	
	public static WebElement btnBuscaVagasLinkedin() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div/ul/li[2]/a[1]"));
	}
	
	public static WebElement footerProdutos() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]"));
		
	}
	
}