package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class MeusDados_Page extends BaseTest {
	
	public static WebElement divDadosDeCadastro() {
		
		return BaseTest.getDriver().findElement(By.id("#dados-cadastro"));
				
	}
	
	public static WebElement divDadosGerais() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("#dados-cadastro > div:nth-child(1)"));
		
	}
	
	public static WebElement btnPessoaFisica() {
		
		return BaseTest.getDriver().findElement(By.id("pessoafisica"));
		
	}
	
	public static WebElement btnPessoaJuridica() {
		
		return BaseTest.getDriver().findElement(By.id("pessoajuridica"));
		
	}
	
	public static WebElement txtfieldCampoNome() {
		
		
		return BaseTest.getDriver().findElement(By.id("firstName"));
		
	}
	
	public static WebElement txtfieldCampoSobreNome() {
		
		return BaseTest.getDriver().findElement(By.id("lastName"));
		
	}
	
	public static WebElement txtfieldCampoApelido() {
		
		return BaseTest.getDriver().findElement(By.id("nickname"));
		
	}
	
	public static WebElement txtfieldCampoCPF() {
		
		return BaseTest.getDriver().findElement(By.id("cpf"));
		
	}
	
	public static WebElement txtfieldCampoDataNascimento() {
		
		return BaseTest.getDriver().findElement(By.id("dateOfBirth"));
		
	}
	
	public static WebElement btnGeneroMasculino() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div.pessoafisica.act > div:nth-child(6) > div > div > label:nth-child(1)"));
		
	}
	
	public static WebElement btnGeneroFeminino() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div.pessoafisica.act > div:nth-child(6) > div > div > label.btn.active"));
		
	}
	
	public static WebElement divEnderecoContato() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div:nth-child(7)"));
		
	}
	
	public static WebElement txtfieldCep() {
		
		return BaseTest.getDriver().findElement(By.id("cep"));
		
	}
	
	public static WebElement txtfieldTipoEndereco() {
		
		return BaseTest.getDriver().findElement(By.id("Residencial"));
		
	}
	
	public static WebElement txtfieldTipoLocal() {
		
		return BaseTest.getDriver().findElement(By.id("prefix"));
		
	}
	
	public static WebElement txtfieldEndereco() {
		
		return BaseTest.getDriver().findElement(By.id("endereco"));
		
	}
	
	public static WebElement txtfieldNumero() {
		
		return BaseTest.getDriver().findElement(By.id("numero"));
		
	}
	
	public static WebElement txtfieldComplemento() {
		
		return BaseTest.getDriver().findElement(By.id("complemento"));
		
	}
	
	public static WebElement txtfieldBairro() {
		
		return BaseTest.getDriver().findElement(By.id("bairro"));
		
	}
	
	public static WebElement txtfieldCidade() {
		
		return BaseTest.getDriver().findElement(By.id("cidade"));
		
	}
	
	public static WebElement txtfieldEstado() {
		
		return BaseTest.getDriver().findElement(By.id("estado"));
		
	}
	
	public static WebElement txtfieldPontoReferencia() {
		
		return BaseTest.getDriver().findElement(By.id("referencia"));
	}
	
	public static WebElement txtfieldTelefone1() {
		
		return BaseTest.getDriver().findElement(By.id("TelephoneNumber1"));
	}
	
	public static WebElement txtfieldTelefone2() {
		
		return BaseTest.getDriver().findElement(By.id("TelephoneNumber2"));
		
	}
	
	public static WebElement txtfieldCelular1() {
		
		return BaseTest.getDriver().findElement(By.id("cellPhone1"));
	}
	
	public static WebElement txtfieldCelular2() {
		
		return BaseTest.getDriver().findElement(By.id("cellPhone2"));
		
	}
	
	public static WebElement txtfieldEnderecoEntrega() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div:nth-child(20)"));
		
	}
	
	public static WebElement checkboxMesmoEndereco() {
		
		return BaseTest.getDriver().findElement(By.id("mesmoendereco"));
	}
	
	public static WebElement divDadosDeAcesso() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div:nth-child(23)"));
		
	}
	
	public static WebElement txtfieldCampoLogin() {
		
		return BaseTest.getDriver().findElement(By.id("login"));
		
	}
	
	public static WebElement txtfieldcampoSenha() {
		
		return BaseTest.getDriver().findElement(By.id("password"));
		
	}
	
	public static WebElement txtfieldConfirmaSenha() {
		
		return BaseTest.getDriver().findElement(By.id("CONFIRMPASSWORD"));
		
	}
	
	public static WebElement checkboxNewsletter() {
		
		return BaseTest.getDriver().findElement(By.id("news"));
		
	}
	
	public static WebElement checkboxSMS() {
		
		return BaseTest.getDriver().findElement(By.id("sms"));
		
	}
	
	public static WebElement btnCadastrar() {
		
		return BaseTest.getDriver().findElement(By.id("btcadastro"));
		
	}

}