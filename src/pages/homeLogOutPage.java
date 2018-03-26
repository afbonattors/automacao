package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class homeLogOutPage extends baseTest{
	
	public static WebElement minhaConta() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/header/div/div[2]/ul/li[3]/a[1]"));
		
	}
	
	public static WebElement logOut() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formHeaderNav1 > input.SairBtn"));
		
	}
	
	public static WebElement cadastreSe() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formHeaderNav2 > p.cadastreseDesktop > a.cadastreSe"));
		
	}
	
}