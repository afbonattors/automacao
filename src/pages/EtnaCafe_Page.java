package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class EtnaCafe_Page extends BaseTest {
	
	public static WebElement divLateral() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/nav"));
		
	}
	
	public static WebElement divconteudoCafe() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div"));
		
	}
	
	public static WebElement btnDicas() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[1]/div/div/a[1]"));
		
	}
	
	public static WebElement btnReceitas() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[1]/div/div/a[2]"));
		
	}
	
	public static WebElement btnPaoExclusivo() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[1]/div/div/a[3]"));
		
	}
	
	public static WebElement btnCardapio() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[1]/div/div/a[4]"));
		
	}
	
	public static WebElement divLojaCafe1() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul/li[1]"));
		
	}
	
	public static WebElement btnLojaCafe1() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul/li[1]/a"));
		
	}
	
	public static WebElement divLojaCafe2() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul/li[2]"));
		
	}
	
	public static WebElement btnLojaCafe2() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul/li[2]/a"));
		
	}
	
	public static WebElement divLojaCafe3() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul/li[3]"));
		
	}
	
	public static WebElement btnLojaCafe3() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul/li[3]/a"));
		
	}
	
	public static WebElement divLojaCafe4() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul/li[4]"));
		
	}
	
	public static WebElement btnLojaCafe4() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[2]/section/div/div[2]/ul/li[4]/strong[2]/a"));
		
	}

}