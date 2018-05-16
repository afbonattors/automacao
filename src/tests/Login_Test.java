package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HeaderClass;
import pages.Home_Page;
import scripts.Home_Script;
import utils.BaseTest;

public class Login_Test extends BaseTest {
	
  @Test
  
  public void loginTest() throws Exception {
	  
	  System.out.println("\nTeste de login.");
  	
	  Assert.assertTrue(HeaderClass.headerHome().isDisplayed());
  	
	  Assert.assertTrue(HeaderClass.logoEtna().isDisplayed());
  	
	  Assert.assertTrue(HeaderClass.textfiledBusca().isDisplayed());
  	
	  Assert.assertTrue(HeaderClass.listaCasamento().isDisplayed());
  	
	  Assert.assertTrue(HeaderClass.nossasLojas().isDisplayed());
  	
	  Assert.assertTrue(HeaderClass.iconeCarrinho().isDisplayed());

      Home_Script.clicaFacaLogin();
      
      Thread.sleep(1000);

      Home_Script.digitaEmail();

      Home_Script.digitaSenha();

      Home_Script.clicaEntrar();

      String usuarioLogado = Home_Page.usuarioLogado().getText();

      String usuarioLogadoCorreto = "afbonatto";
      
      Assert.assertTrue(usuarioLogado.contains(usuarioLogadoCorreto));
      
  }  

}