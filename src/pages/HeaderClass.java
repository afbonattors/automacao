package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.baseTest;

public class HeaderClass extends baseTest {
	
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

}