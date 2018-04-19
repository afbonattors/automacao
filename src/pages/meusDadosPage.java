package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class meusDadosPage extends baseTest {
	
	public static WebElement divDadosDeCadastro() {
		
		return baseTest.getDriver().findElement(By.id("#dados-cadastro"));
				
	}
	
	public static WebElement divDadosGerais() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#dados-cadastro > div:nth-child(1)"));
		
	}
	
	public static WebElement PessoaFisica() {
		
		return baseTest.getDriver().findElement(By.id("pessoafisica"));
		
	}
	
	public static WebElement PessoaJuridica() {
		
		return baseTest.getDriver().findElement(By.id("pessoajuridica"));
		
	}
	
	public static WebElement campoNome() {
		
		
		return baseTest.getDriver().findElement(By.id("firstName"));
		
	}
	
	public static WebElement campoSobreNome() {
		
		return baseTest.getDriver().findElement(By.id("lastName"));
		
	}
	
	public static WebElement campoApelido() {
		
		return baseTest.getDriver().findElement(By.id("nickname"));
		
	}
	
	public static WebElement campoCPF() {
		
		return baseTest.getDriver().findElement(By.id("cpf"));
		
	}
	
	public static WebElement campoDataNascimento() {
		
		return baseTest.getDriver().findElement(By.id("dateOfBirth"));
		
	}
	
	public static WebElement generoMasculino() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div.pessoafisica.act > div:nth-child(6) > div > div > label:nth-child(1)"));
		
	}
	
	public static WebElement generoFeminino() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div.pessoafisica.act > div:nth-child(6) > div > div > label.btn.active"));
		
	}
	
	public static WebElement divEnderecoContato() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div:nth-child(7)"));
		
	}
	
	public static WebElement cep() {
		
		return baseTest.getDriver().findElement(By.id("cep"));
		
	}
	
	public static WebElement tipoEndereco() {
		
		return baseTest.getDriver().findElement(By.id("Residencial"));
		
	}
	
	public static WebElement tipoLocal() {
		
		return baseTest.getDriver().findElement(By.id("prefix"));
		
	}
	
	public static WebElement endereco() {
		
		return baseTest.getDriver().findElement(By.id("endereco"));
		
	}
	
	public static WebElement numero() {
		
		return baseTest.getDriver().findElement(By.id("numero"));
		
	}
	
	public static WebElement complemento() {
		
		return baseTest.getDriver().findElement(By.id("complemento"));
		
	}
	
	public static WebElement bairro() {
		
		return baseTest.getDriver().findElement(By.id("bairro"));
		
	}
	
	public static WebElement cidade() {
		
		return baseTest.getDriver().findElement(By.id("cidade"));
		
	}
	
	public static WebElement estado() {
		
		return baseTest.getDriver().findElement(By.id("estado"));
		
	}
	
	public static WebElement pontoReferencia() {
		
		return baseTest.getDriver().findElement(By.id("referencia"));
	}
	
	public static WebElement telefone1() {
		
		return baseTest.getDriver().findElement(By.id("TelephoneNumber1"));
	}
	
	public static WebElement telefone2() {
		
		return baseTest.getDriver().findElement(By.id("TelephoneNumber2"));
		
	}
	
	public static WebElement celular1() {
		
		return baseTest.getDriver().findElement(By.id("cellPhone1"));
	}
	
	public static WebElement celular2() {
		
		return baseTest.getDriver().findElement(By.id("cellPhone2"));
		
	}
	
	public static WebElement enderecoEntrega() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div:nth-child(20)"));
		
	}
	
	public static WebElement checkboxMesmoEndereco() {
		
		return baseTest.getDriver().findElement(By.id("mesmoendereco"));
	}
	
	public static WebElement dadosDeAcesso() {
		
		return baseTest.getDriver().findElement(By.cssSelector("#formRegister > div.conteudo.right.col-md-9 > div.texto.dados-form > div.form.right > div:nth-child(23)"));
		
	}

}
