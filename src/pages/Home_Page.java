package pages;

import utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home_Page extends BaseTest {
	
	public static WebElement divLogin() {
    	
    	return BaseTest.getDriver().findElement(By.xpath("//*[@id=\"boxlogin\"]"));
    }
    
    public static WebElement facaSeuLogin() {

        return BaseTest.getDriver().findElement(By.cssSelector("#formHeaderNav2 > p.cadastreseDesktop > a.facaLogin"));

    }
    
    public static WebElement btnFaceBook() {
    	
    	return BaseTest.getDriver().findElement(By.id("facebook-login-button"));
    	
    }

    public static WebElement txtfieldEmail() {

        return BaseTest.getDriver().findElement(By.id("login-email"));

    }

    public static WebElement txtfieldSenha() {

        return BaseTest.getDriver().findElement(By.id("login-senha"));

    }

    public static WebElement btnEntrar() {

        return BaseTest.getDriver().findElement(By.cssSelector("#formHeaderNav2 > div.row.lkbt > input.btn.btn-primary.btn-sm.right"));

    }

    public static WebElement usuarioLogado() {

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.logar.logado.act.botoes-top > p"));

    }

    public static WebElement catMoveis(){

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(2) > h2 > a"));

    }

    public static WebElement catDecoracao(){

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(3) > h2 > a"));

    }

    public static WebElement catUtilDomesticas(){

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(4) > h2 > a"));

    }

    public static WebElement catOrganizadores(){

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(5) > h2 > a"));

    }

    public static WebElement catCamaBanho(){

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(6) > h2 > a"));

    }

    public static WebElement catServicos(){

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(7) > h2 > a"));

    }

    public static WebElement catIluminacao(){

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(8) > h2 > a"));

    }

    public static WebElement catNatal(){

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(9) > h2 > a"));

    }

    public static WebElement catMais(){

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(10) > h2 > a"));

    }

}