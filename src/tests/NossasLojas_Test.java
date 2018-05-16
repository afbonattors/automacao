package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FooterClass;
import pages.HeaderClass;
import pages.NossasLojas_Page;
import scripts.Footer_Script;
import scripts.Header_Script;
import scripts.NossasLojas_Script;
import utils.BaseTest;

public class NossasLojas_Test extends BaseTest {
  
	@Test
    
    public static void nossasLojasTest() throws Exception {
    	
    	System.out.println("\nTeste nossas lojas.");
    	
    	NossasLojas_Script.acessaNossasLojas();
    	
    	Thread.sleep(1000);
    	
    	Header_Script.validaHeader();
    	
    	Assert.assertTrue(NossasLojas_Page.divNossasLojas().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaBerrini().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaMarginal().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaRiodeJaneiro().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaCampinas().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaSalvador().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaNatal().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaBrasilia().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaGranjaViana().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaBeloHorizonte().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaCampoGrande().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaFortaleza().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaRecife().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaRibeiraoPreto().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaSocoraba().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divLojaBerrini().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divLojaMarginalTiete().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divLojaRiodeJaneiro().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divCampinas().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divSalvador().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divNatal().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divBrasilia().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divGranjaViana().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divBeloHorizonte().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divCampoGrande().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divFortaleza().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divRecife().isDisplayed());

    	Assert.assertTrue(NossasLojas_Page.divRibeiraoPreto().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divSorocaba().isDisplayed());
    	
        Footer_Script.validaFooter();
    	
    }
}