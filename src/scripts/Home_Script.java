package scripts;

import pages.Home_Page;

public class Home_Script extends Home_Page {

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