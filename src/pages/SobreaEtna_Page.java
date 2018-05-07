package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class SobreaEtna_Page extends BaseTest {
	
	public static WebElement divSobreEtna() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement divConteudoSobre() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement divProdutosVisitados() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/div[2]"));
	}

}