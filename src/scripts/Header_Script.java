package scripts;

import org.testng.Assert;

import pages.HeaderClass;

public class Header_Script extends HeaderClass {
	
public static void clicaLogoEtna() {
    	
    	logoEtna().click();
    }
    
    public static void clicaListaPresente() {
    	
    	listaCasamento().click();
    	
    }
    
    public static void validaHeader() {
    	
    	Assert.assertTrue(headerHome().isDisplayed());
    	Assert.assertTrue(logoEtna().isDisplayed());
    	Assert.assertTrue(textfiledBusca().isDisplayed());
    	Assert.assertTrue(listaCasamento().isDisplayed());
    	Assert.assertTrue(nossasLojas().isDisplayed());
    	Assert.assertTrue(iconeCarrinho().isEnabled());
    	
    }

}