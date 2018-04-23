package scripts;

import pages.homePage;

public class homeScript extends homePage {

    public static void clicaFacaLogin() {

        facaSeuLogin().click();

    }

    public static void digitaEmail() {

        campoEmail().sendKeys("afbonatto@gmail.com");

    }

    public static void digitaSenha() {

        campoSenha().sendKeys("201089");

    }

    public static void clicaEntrar() {

        botaoEntrar().click();

    }
    
    public static void clicaLogoEtna() {
    	
    	logoEtna().click();
    }
    
    public static void clicaListaPresente() {
    	
    	listaCasamento().click();
    	
    }
    
}