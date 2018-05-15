package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HeaderClass;
import pages.Home_Page;
import scripts.Header_Script;
import scripts.LogOut_Script;
import utils.BaseTest;

public class LogOutTest extends BaseTest {
	
	@Test
    
    public static void logOutTest() throws Exception {
    	
    	System.out.println("\nTeste logout.");
    	
    	Header_Script.clicaLogoEtna();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(HeaderClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.iconeCarrinho().isDisplayed());
    	
    	LogOut_Script.clicaMinhaConta();
    	
    	Thread.sleep(1000);
    	
    	LogOut_Script.clicaSair();
    	
    	Thread.sleep(1000);
    	
    	String facaLogin = Home_Page.facaSeuLogin().getText();
    	
    	String OlaFacaLogin = "faça seu login";
    	
    	Assert.assertTrue(facaLogin.contains(OlaFacaLogin));
    	
    	Thread.sleep(1000);
    	
    }
	
}