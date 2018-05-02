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

}