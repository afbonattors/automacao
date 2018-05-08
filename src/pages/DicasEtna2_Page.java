package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class DicasEtna2_Page extends BaseTest {
	
	public static WebElement divBanner() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[1]"));
		
	}
	
	public static WebElement divLista1() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[1]"));
		
	}
	
	public static WebElement divLista2() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[2]"));
		
	}
	
	public static WebElement divLista3() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[3]"));
		
	}
	
	public static WebElement divLista4() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[4]"));
		
	}
	
	public static WebElement divLista5() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[5]"));
		
	}
	
	public static WebElement divLista6() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[6]"));		
		
	}
	
	public static WebElement divLista7() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[7]"));
	}
	
	public static WebElement divLista8() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[8]"));
	}
	
	public static WebElement divLista9() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[4]/section/ul[2]/li[9]"));
		
	}
	
	public static WebElement divContainer() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[5]"));
		
	}

}