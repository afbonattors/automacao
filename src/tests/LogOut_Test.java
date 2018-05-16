package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home_Page;
import scripts.Header_Script;
import scripts.LogOut_Script;
import utils.BaseTest;

public class LogOut_Test extends BaseTest {
	
	@Test
    
    public static void logOutTest() throws Exception {
    	
    	System.out.println("\nTeste logout.");
    	
    	Header_Script.clicaLogoEtna();
    	
    	Thread.sleep(1000);
    	
    	Header_Script.validaHeader();
    	
    	LogOut_Script.clicaMinhaConta();
    	
    	Thread.sleep(1000);
    	
    	LogOut_Script.clicaSair();
    	
    	Thread.sleep(1000);
    	
    	String facaLogin = Home_Page.facaSeuLogin().getText();
    	
    	String OlaFacaLogin = "faça seu login";
    	
    	Assert.assertTrue(facaLogin.contains(OlaFacaLogin));
    	
    	Thread.sleep(1000);
    	
    	Header_Script.validaHeader();
    	
    }
	
}