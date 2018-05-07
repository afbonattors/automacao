package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class AtendimentoLojaVirtual_Page extends baseTest {
	
	public static WebElement divTelefones() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[1]"));
		
	}
	
	public static WebElement divHorarioAtendimento() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[1]/p[1]"));
		
	}
	
	public static WebElement divTelefoneLocal() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[1]/p[2]"));
		
	}
	
	public static WebElement divTelefoneDemais() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[1]/p[3]"));
		
	}
	
	public static WebElement divChat() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[1]/a/img"));
		
	}
	
	public static WebElement divAcessoRapido() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[2]"));
		
	}
	
	public static WebElement divAcompanheSeuPedido() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[2]/div[2]/ul/li[1]"));
		
	}
	
	public static WebElement divPoliticas() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[2]/div[2]/ul/li[2]"));
		
	}
	
	public static WebElement divDuvidas() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[2]/div[2]/ul/li[3]"));
		
	}
	
	public static WebElement divAlterarCadastro() {
		
		return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[2]/div[2]/ul/li[4]"));
		
	}
	
	public static WebElement txtNome() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[1]/div[1]"));
		
	}
	
	public static WebElement txtSobreNome() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[1]/div[2]"));
		
	}
	
	public static WebElement txtCPFCNPJ() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[2]/div[1]"));
		
	}
	
	public static WebElement txtTelefone() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[2]/div[2]"));
		
	}
	
	public static WebElement txtEmail() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"fromMailAddress\"]"));
		
	}
	
	public static WebElement comboboxAssunto() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[4]/div"));
		
	}
	
	public static WebElement txtNumeroPedido() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"orderNumber\"]"));
		
	}
	
	public static WebElement txtMensagem() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[8]"));
		
	}
	
	public static WebElement recaptcha() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[11]"));
		
	}
	
	public static WebElement checkboxRecaptcha() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]"));
		
	}
	
	public static WebElement btnEnviar() {
		
		return baseTest.getDriver().findElement(By.xpath("//*[@id=\"btenviar\"]"));
		
	}

}