package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class FooterClass extends BaseTest {
	
    public static WebElement footerHome() {
    	
    	return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer"));
    	
    }
    
    public static WebElement divSaibaMaisFooter() {
    	
    	return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[1]"));
    }
    
    public static WebElement divCentralAtendimentoFooter() {
    	
    	return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[2]"));
    	
    }
    
    public static WebElement divServicosFooter() {
    	
    	return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[3]"));
    	
    }
    
    public static WebElement divSegurancaPrivacidadeFooter() {
    	
    	return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[4]"));
    	
    }
    
    public static WebElement divTelefonesFooter() {
    	
    	return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[5]"));
    	
    }
    
    public static WebElement divTelevendasFooter() {
    	
    	return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[6]"));
    	
    }
    
    public static WebElement divAcompanheEtnaFooter() {
    	
    	return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[7]"));
    	
    }
    
    public static WebElement divTextoRodape() {
    	
    	return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[2]"));
    	
    }

}