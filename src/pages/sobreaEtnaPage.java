package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class sobreaEtnaPage extends baseTest {
	
	public static WebElement divSobreEtna() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement divConteudoSobre() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement divProdutosVisitados() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/div[2]"));
	}

}
