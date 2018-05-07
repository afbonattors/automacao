package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class AtendimentoLojaVirtual_Page extends BaseTest {
	
	public static WebElement divTelefones() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[1]"));
		
	}
	
	public static WebElement divHorarioAtendimento() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[1]/p[1]"));
		
	}
	
	public static WebElement divTelefoneLocal() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[1]/p[2]"));
		
	}
	
	public static WebElement divTelefoneDemais() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[1]/p[3]"));
		
	}
	
	public static WebElement divChat() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[1]/a/img"));
		
	}
	
	public static WebElement divAcessoRapido() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[2]"));
		
	}
	
	public static WebElement divAcompanheSeuPedido() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[2]/div[2]/ul/li[1]"));
		
	}
	
	public static WebElement divPoliticas() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[2]/div[2]/ul/li[2]"));
		
	}
	
	public static WebElement divDuvidas() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[2]/div[2]/ul/li[3]"));
		
	}
	
	public static WebElement divAlterarCadastro() {
		
		return BaseTest.getDriver().findElement(By.xpath("/html/body/div[3]/div[3]/section/div[2]/div[2]/ul/li[4]"));
		
	}
	
	public static WebElement txtNome() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[1]/div[1]"));
		
	}
	
	public static WebElement txtSobreNome() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[1]/div[2]"));
		
	}
	
	public static WebElement txtCPFCNPJ() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[2]/div[1]"));
		
	}
	
	public static WebElement txtTelefone() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[2]/div[2]"));
		
	}
	
	public static WebElement txtEmail() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"fromMailAddress\"]"));
		
	}
	
	public static WebElement comboboxAssunto() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[4]/div"));
		
	}
	
	public static WebElement txtNumeroPedido() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"orderNumber\"]"));
		
	}
	
	public static WebElement txtMensagem() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[8]"));
		
	}
	
	public static WebElement recaptcha() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"formVirtualStoreSupport\"]/div[3]/div[11]"));
		
	}
	
	public static WebElement checkboxRecaptcha() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[5]"));
		
	}
	
	public static WebElement btnEnviar() {
		
		return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"btenviar\"]"));
		
	}

}