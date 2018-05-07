package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class HeaderClass extends BaseTest {
	
public static WebElement headerHome() {
		
		return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header"));
		
	}

    public static WebElement logoEtna() {

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.brand.sprite-logo > a"));

    }
    
    public static WebElement textfiledBusca() {

        return BaseTest.getDriver().findElement(By.id("search"));

    }

    public static WebElement listaCasamento() {

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.listaMobile > a"));

    }

    public static WebElement nossasLojas() {

        return BaseTest.getDriver().findElement(By.cssSelector("body > div.wrapper > header > div > div.buscaecarrinho.ng-scope > ul > li.nossasLojasMobile.nossasLojasnotMobile > a"));

    }

    public static WebElement iconeCarrinho() {

        return BaseTest.getDriver().findElement(By.className("carrinho"));

    }

}