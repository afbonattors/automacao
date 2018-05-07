package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class MeusDados_Page extends baseTest {
	
	public static WebElement divDadosDeCadastro() {
		
		return baseTest.getDriver().findElement(By.id("#dados-cadastro"));
				
	}
	
	public static WebElement divDadosGerais() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#dados-cadastro > div:nth-child(1)"));
		
	}
	
	public static WebElement btnPessoaFisica() {
		
		return baseTest.getDriver().findElement(By.id("pessoafisica"));
		
	}
	
	public static WebElement btnPessoaJuridica() {
		
		return baseTest.getDriver().findElement(By.id("pessoajuridica"));
		
	}
	
	public static WebElement txtfieldCampoNome() {
		
		
		return baseTest.getDriver().findElement(By.id("firstName"));
		
	}
	
	public static WebElement txtfieldCampoSobreNome() {
		
		return baseTest.getDriver().findElement(By.id("lastName"));
		
	}
	
	public static WebElement txtfieldCampoApelido() {
		
		return baseTest.getDriver().findElement(By.id("nickname"));
		
	}
	
	public static WebElement txtfieldCampoCPF() {
		
		return baseTest.getDriver().findElement(By.id("cpf"));
		
	}
	
	public static WebElement txtfieldCampoDataNascimento() {
		
		return baseTest.getDriver().findElement(By.id("dateOfBirth"));
		
	}
	
	public static WebElement btnGeneroMasculino() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div.pessoafisica.act > div:nth-child(6) > div > div > label:nth-child(1)"));
		
	}
	
	public static WebElement btnGeneroFeminino() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div.pessoafisica.act > div:nth-child(6) > div > div > label.btn.active"));
		
	}
	
	public static WebElement divEnderecoContato() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div:nth-child(7)"));
		
	}
	
	public static WebElement txtfieldCep() {
		
		return baseTest.getDriver().findElement(By.id("cep"));
		
	}
	
	public static WebElement txtfieldTipoEndereco() {
		
		return baseTest.getDriver().findElement(By.id("Residencial"));
		
	}
	
	public static WebElement txtfieldTipoLocal() {
		
		return baseTest.getDriver().findElement(By.id("prefix"));
		
	}
	
	public static WebElement txtfieldEndereco() {
		
		return baseTest.getDriver().findElement(By.id("endereco"));
		
	}
	
	public static WebElement txtfieldNumero() {
		
		return baseTest.getDriver().findElement(By.id("numero"));
		
	}
	
	public static WebElement txtfieldComplemento() {
		
		return baseTest.getDriver().findElement(By.id("complemento"));
		
	}
	
	public static WebElement txtfieldBairro() {
		
		return baseTest.getDriver().findElement(By.id("bairro"));
		
	}
	
	public static WebElement txtfieldCidade() {
		
		return baseTest.getDriver().findElement(By.id("cidade"));
		
	}
	
	public static WebElement txtfieldEstado() {
		
		return baseTest.getDriver().findElement(By.id("estado"));
		
	}
	
	public static WebElement txtfieldPontoReferencia() {
		
		return baseTest.getDriver().findElement(By.id("referencia"));
	}
	
	public static WebElement txtfieldTelefone1() {
		
		return baseTest.getDriver().findElement(By.id("TelephoneNumber1"));
	}
	
	public static WebElement txtfieldTelefone2() {
		
		return baseTest.getDriver().findElement(By.id("TelephoneNumber2"));
		
	}
	
	public static WebElement txtfieldCelular1() {
		
		return baseTest.getDriver().findElement(By.id("cellPhone1"));
	}
	
	public static WebElement txtfieldCelular2() {
		
		return baseTest.getDriver().findElement(By.id("cellPhone2"));
		
	}
	
	public static WebElement txtfieldEnderecoEntrega() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div:nth-child(20)"));
		
	}
	
	public static WebElement checkboxMesmoEndereco() {
		
		return baseTest.getDriver().findElement(By.id("mesmoendereco"));
	}
	
	public static WebElement divDadosDeAcesso() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div:nth-child(23)"));
		
	}
	
	public static WebElement txtfieldCampoLogin() {
		
		return baseTest.getDriver().findElement(By.id("login"));
		
	}
	
	public static WebElement txtfieldcampoSenha() {
		
		return baseTest.getDriver().findElement(By.id("password"));
		
	}
	
	public static WebElement txtfieldConfirmaSenha() {
		
		return baseTest.getDriver().findElement(By.id("CONFIRMPASSWORD"));
		
	}
	
	public static WebElement checkboxNewsletter() {
		
		return baseTest.getDriver().findElement(By.id("news"));
		
	}
	
	public static WebElement checkboxSMS() {
		
		return baseTest.getDriver().findElement(By.id("sms"));
		
	}
	
	public static WebElement btnCadastrar() {
		
		return baseTest.getDriver().findElement(By.id("btcadastro"));
		
	}

}