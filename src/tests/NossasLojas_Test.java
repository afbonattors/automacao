package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FooterClass;
import pages.HeaderClass;
import pages.NossasLojas_Page;
import scripts.NossasLojas_Script;
import utils.BaseTest;

public class NossasLojas_Test extends BaseTest {
  
	@Test
    
    public static void nossasLojasTest() throws Exception {
    	
    	System.out.println("\nTeste nossas lojas.");
    	
    	NossasLojas_Script.acessaNossasLojas();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(HeaderClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.iconeCarrinho().isDisplayed());
    	
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
    	
        Assert.assertTrue(FooterClass.footerHome().isDisplayed());
        
        Assert.assertTrue(FooterClass.divSaibaMaisFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divCentralAtendimentoFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divServicosFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divSegurancaPrivacidadeFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTelefonesFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTelevendasFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divAcompanheEtnaFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTextoRodape().isDisplayed());
    	
    }
}