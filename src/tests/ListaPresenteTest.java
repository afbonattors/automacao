package tests;

import org.testng.annotations.Test;

import pages.FooterClass;
import pages.HeaderClass;
import pages.ListaDePresentes_Page;
import scripts.Header_Script;
import utils.BaseTest;

import org.testng.Assert;

public class ListaPresenteTest extends BaseTest {
  
	@Test
	
	public static void listaPresenteTest() throws Exception {
	    	
	    System.out.println("\nTeste Home Lista de Presentes.");
	    	
	    Header_Script.clicaListaPresente();
	    	
	    Thread.sleep(1000);
	    	
	    Assert.assertTrue(HeaderClass.headerHome().isDisplayed());
	    	
	    Assert.assertTrue(HeaderClass.logoEtna().isDisplayed());
	    	
	    Assert.assertTrue(HeaderClass.textfiledBusca().isDisplayed());
	    	
	    Assert.assertTrue(HeaderClass.listaCasamento().isDisplayed());
	    	
	    Assert.assertTrue(HeaderClass.nossasLojas().isDisplayed());
	    	
	    Assert.assertTrue(HeaderClass.iconeCarrinho().isDisplayed());
	    	
	    Thread.sleep(1000);
	    	
	    Assert.assertTrue(ListaDePresentes_Page.divBannerLista().isDisplayed());
	    	
	    Assert.assertTrue(ListaDePresentes_Page.divEncontreListaPresentes().isDisplayed());
	    	
	    Assert.assertTrue(ListaDePresentes_Page.txtfieldNomeLista().isDisplayed());
	    	
	    Assert.assertTrue(ListaDePresentes_Page.txtDataEvento().isDisplayed());
	    	
	    Assert.assertTrue(ListaDePresentes_Page.txtNumeroLista().isDisplayed());
	    	
	    Assert.assertTrue(ListaDePresentes_Page.btnPesquisar().isEnabled());
	    	
	    Assert.assertTrue(ListaDePresentes_Page.txtfieldEmail().isDisplayed());
	    	
	    Assert.assertTrue(ListaDePresentes_Page.txtfieldSenha().isDisplayed());
	    	
	    Assert.assertTrue(ListaDePresentes_Page.btnEntrar().isDisplayed());
	    	
	    Assert.assertTrue(ListaDePresentes_Page.divDuvidas().isDisplayed());
	    	
	    Assert.assertTrue(ListaDePresentes_Page.divNovaArea().isDisplayed());
	    	
	    Assert.assertTrue(ListaDePresentes_Page.divAdicionadosRecentemente().isDisplayed());
	    	
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