package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class MapaSite_Page extends BaseTest {
	
	public static WebElement divHeaderMapa() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div/div[1]"));
		
	}
	
	public static WebElement divCategoriaProduto() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div/div[2]"));
		
	}
	
	public static WebElement divInstitucional() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div/div[3]"));
		
	}
	
}