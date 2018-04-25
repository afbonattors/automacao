package pages;

import utils.baseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class homePage extends baseTest {
	
	public static WebElement headerHome() {
		
		return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header"));
		
	}

    public static WebElement logoEtna() {

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.brand.sprite-logo > a"));

    }
    
    public static WebElement textfiledBusca() {

        return baseTest.getDriver().findElement(By.id("search"));

    }

    public static WebElement listaCasamento() {

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.listaMobile > a"));

    }

    public static WebElement nossasLojas() {

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.nossasLojasMobile.nossasLojasnotMobile > a"));

    }

    public static WebElement iconeCarrinho() {

        return baseTest.getDriver().findElement(By.className("carrinho"));

    }
    
    public static WebElement divLogin() {
    	
    	return baseTest.getDriver().findElement(By.xpath("//*[@id=\"boxlogin\"]"));
    }
    
    public static WebElement facaSeuLogin() {

        return baseTest.getDriver().findElement(By.cssSelector("#formHeaderNav2 > p.cadastreseDesktop > a.facaLogin"));

    }
    
    public static WebElement btnFaceBook() {
    	
    	return baseTest.getDriver().findElement(By.id("facebook-login-button"));
    	
    }

    public static WebElement txtfieldEmail() {

        return baseTest.getDriver().findElement(By.id("login-email"));

    }

    public static WebElement txtfieldSenha() {

        return baseTest.getDriver().findElement(By.id("login-senha"));

    }

    public static WebElement btnEntrar() {

        return baseTest.getDriver().findElement(By.cssSelector("#formHeaderNav2 > div.row.lkbt > input.btn.btn-primary.btn-sm.right"));

    }

    public static WebElement usuarioLogado() {

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.logar.logado.act.botoes-top > p"));

    }

    public static WebElement catMoveis(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(2) > h2 > a"));

    }

    public static WebElement catDecoracao(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(3) > h2 > a"));

    }

    public static WebElement catUtilDomesticas(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(4) > h2 > a"));

    }

    public static WebElement catOrganizadores(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(5) > h2 > a"));

    }

    public static WebElement catCamaBanho(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(6) > h2 > a"));

    }

    public static WebElement catServicos(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(7) > h2 > a"));

    }

    public static WebElement catIluminacao(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(8) > h2 > a"));

    }

    public static WebElement catNatal(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(9) > h2 > a"));

    }

    public static WebElement catMais(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(10) > h2 > a"));

    }
    
    public static WebElement footerHome() {
    	
    	return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer"));
    	
    }
    
    public static WebElement divSaibaMaisFooter() {
    	
    	return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[1]"));
    }
    
    public static WebElement divCentralAtendimentoFooter() {
    	
    	return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[2]"));
    	
    }
    
    public static WebElement divServicosFooter() {
    	
    	return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[3]"));
    	
    }
    
    public static WebElement divSegurancaPrivacidadeFooter() {
    	
    	return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[4]"));
    	
    }
    
    public static WebElement divTelefonesFooter() {
    	
    	return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[5]"));
    	
    }
    
    public static WebElement divTelevendasFooter() {
    	
    	return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[6]"));
    	
    }
    
    public static WebElement divAcompanheEtnaFooter() {
    	
    	return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[1]/div[7]"));
    	
    }
    
    public static WebElement divTextoRodape() {
    	
    	return baseTest.getDriver().findElement(By.xpath("/html/body/div[3]/footer/div[2]"));
    	
    }

}