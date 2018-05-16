package tests;

import org.testng.annotations.Test;

import pages.FooterClass;
import pages.HeaderClass;
import pages.ListaDePresentes_Page;
import scripts.Footer_Script;
import scripts.Header_Script;
import utils.BaseTest;

import org.testng.Assert;

public class ListaPresente_Test extends BaseTest {
  
	@Test
	
	public static void listaPresenteTest() throws Exception {
	    	
	    System.out.println("\nTeste Home Lista de Presentes.");
	    	
	    Header_Script.clicaListaPresente();
	    	
	    Thread.sleep(1000);
	    
	    Header_Script.validaHeader();
	    	
	    Thread.sleep(1000);
	    	
	    
	    
	    Footer_Script.validaFooter();
	        
	}

}