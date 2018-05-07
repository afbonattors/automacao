package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class HomeLogOut_Page extends baseTest{
	
	public static WebElement minhaConta() {
		
		return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.logar.logado.act.botoes-top > a.btdropdown.boxlogadoDesktop"));
		
	}
	
	public static WebElement logOut() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formHeaderNav1 > input.SairBtn"));
		
	}
	
	public static WebElement cadastreSe() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formHeaderNav2 > p.cadastreseDesktop > a.cadastreSe"));
		
	}
	
}