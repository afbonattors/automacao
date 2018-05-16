package scripts;

import org.testng.Assert;

import pages.FooterClass;

public class Footer_Script extends FooterClass {	
	
	 public static void validaFooter() {
		 
		 Assert.assertTrue(footerHome().isDisplayed());
		 
		 Assert.assertTrue(divSaibaMaisFooter().isDisplayed());
		 
		 Assert.assertTrue(divCentralAtendimentoFooter().isDisplayed());
		 
		 Assert.assertTrue(divServicosFooter().isDisplayed());
		 
		 Assert.assertTrue(divSegurancaPrivacidadeFooter().isDisplayed());
		 
		 Assert.assertTrue(divTelefonesFooter().isDisplayed());
		 
		 Assert.assertTrue(divTelevendasFooter().isDisplayed());
		 
		 Assert.assertTrue(divAcompanheEtnaFooter().isDisplayed());
		 
		 Assert.assertTrue(divTextoRodape().isDisplayed());		 
		 
	 }

}