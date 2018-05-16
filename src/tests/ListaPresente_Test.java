package tests;

import org.testng.annotations.Test;

import scripts.Footer_Script;
import scripts.Header_Script;
import scripts.ListaDePresentes_Script;
import utils.BaseTest;

public class ListaPresente_Test extends BaseTest {
  
	@Test
	
	public static void listaPresenteTest() throws Exception {
	    	
	    System.out.println("\nTeste Home Lista de Presentes.");
	    	
	    Header_Script.clicaListaPresente();
	    	
	    Thread.sleep(1000);
	    
	    Header_Script.validaHeader();
	    	
	    Thread.sleep(1000);
	    	
	    ListaDePresentes_Script.validaListaPresentes();
	    
	    Footer_Script.validaFooter();
	        
	}

}