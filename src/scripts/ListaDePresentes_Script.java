package scripts;

import org.testng.Assert;

import pages.ListaDePresentes_Page;

public class ListaDePresentes_Script extends ListaDePresentes_Page {
	
	public static void validaListaPresentes() {
		
		Assert.assertTrue(divBannerLista().isDisplayed());
    	
	    Assert.assertTrue(divEncontreListaPresentes().isDisplayed());
	    	
	    Assert.assertTrue(txtfieldNomeLista().isDisplayed());
	    	
	    Assert.assertTrue(txtDataEvento().isDisplayed());
	    	
	    Assert.assertTrue(txtNumeroLista().isDisplayed());
	    	
	    Assert.assertTrue(btnPesquisar().isEnabled());
	    	
	    Assert.assertTrue(txtfieldEmail().isDisplayed());
	    	
	    Assert.assertTrue(txtfieldSenha().isDisplayed());
	    	
	    Assert.assertTrue(btnEntrar().isDisplayed());
	    	
	    Assert.assertTrue(divDuvidas().isDisplayed());
	    	
	    Assert.assertTrue(divNovaArea().isDisplayed());
	    	
	    Assert.assertTrue(divAdicionadosRecentemente().isDisplayed());
	    
	}

}