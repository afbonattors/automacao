package pages;

import utils.baseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class homePage extends baseTest {

    public static WebElement facaSeuLogin() {

        return baseTest.getDriver().findElement(By.cssSelector("#formHeaderNav2 > p.cadastreseDesktop > a.facaLogin"));

    }

    public static WebElement campoEmail() {

        return baseTest.getDriver().findElement(By.cssSelector("#login-email"));

    }

    public static WebElement campoSenha() {

        return baseTest.getDriver().findElement(By.cssSelector("#login-senha"));

    }

    public static WebElement botaoEntrar() {

        return baseTest.getDriver().findElement(By.cssSelector("#formHeaderNav2 > div.row.lkbt > input.btn.btn-primary.btn-sm.right"));

    }

    public static WebElement usuarioLogado() {

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.logar.logado.act.botoes-top > p"));

    }

    public static WebElement logoEtna() {

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.brand.sprite-logo > a"));

    }

    public static WebElement textfiledBusca() {

        return baseTest.getDriver().findElement(By.id("search"));

    }

    public static WebElement listaCasamento() {

        return baseTest.getDriver().findElement(By.className("listaMobile"));

    }

    public static WebElement nossasLojas() {

        return baseTest.getDriver().findElement(By.className("nossasLojasMobile"));

    }

    public static WebElement iconeCarrinho() {

        return baseTest.getDriver().findElement(By.className("carrinho"));

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

    public static WebElement catCamaBanho(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(5) > h2 > a"));

    }

    public static WebElement catIluminacao(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(6) > h2 > a"));

    }

    public static WebElement catTapetesCortinas(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(7) > h2 > a"));

    }

    public static WebElement catSuperPreco(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(8) > h2 > a"));

    }

    public static WebElement catRenova(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(9) > h2 > a"));

    }

    public static WebElement catMais(){

        return baseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > nav > ul > li:nth-child(10) > h2 > a"));

    }

}