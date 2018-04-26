package scripts;

import pages.homePage;

public class homeScript extends homePage {

    public static void clicaFacaLogin() {

        facaSeuLogin().click();

    }

    public static void digitaEmail() {

    	txtfieldEmail().sendKeys("afbonatto@gmail.com");

    }

    public static void digitaSenha() {

    	txtfieldSenha().sendKeys("201089");

    }

    public static void clicaEntrar() {

        btnEntrar().click();

    }
    
}