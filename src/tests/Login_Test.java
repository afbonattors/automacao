package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home_Page;
import scripts.Footer_Script;
import scripts.Header_Script;
import scripts.Home_Script;
import utils.BaseTest;

public class Login_Test extends BaseTest {
	
  @Test
  
  public void loginTest() throws Exception {
	  
	  System.out.println("\nTeste de login.");
  	
	  Header_Script.validaHeader();

      Home_Script.clicaFacaLogin();
      
      Thread.sleep(1000);

      Home_Script.digitaEmail();

      Home_Script.digitaSenha();

      Home_Script.clicaEntrar();

      String usuarioLogado = Home_Page.usuarioLogado().getText();

      String usuarioLogadoCorreto = "afbonatto";
      
      Assert.assertTrue(usuarioLogado.contains(usuarioLogadoCorreto));
      
      Footer_Script.validaFooter();
      
  }  

}