package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home_Page;
import scripts.Footer_Script;
import scripts.Header_Script;
import scripts.Home_Script;
import utils.BaseTest;

public class HomePage_Test extends BaseTest {

    @Test

    public static void homePageTest() throws Exception {
    	
    	System.out.println("\nTeste homepage.");
    	
    	String TituloPagina = getDriver().getTitle();
    	
    	Assert.assertTrue(TituloPagina.equals("Etna"), "HML Indisponível");
    	
    	Header_Script.validaHeader();
    	
    	Home_Script.clicaFacaLogin();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(Home_Page.divLogin().isDisplayed());
    	
    	Thread.sleep(3000);
    	
    	Assert.assertTrue(Home_Page.btnFaceBook().isDisplayed());
    	
    	Assert.assertTrue(Home_Page.txtfieldEmail().isDisplayed());
    	
    	Assert.assertTrue(Home_Page.txtfieldSenha().isDisplayed());

        String catMoveis = Home_Page.catMoveis().getText();

        String moveis = "móveis";

        Assert.assertTrue(catMoveis.contains(moveis));

        String catDecoracao = Home_Page.catDecoracao().getText();

        String decoracao = "decoração";

        Assert.assertTrue(catDecoracao.contains(decoracao));

        String catUtilDomesticas = Home_Page.catUtilDomesticas().getText();

        String utildomesticas = "utilidades domésticas";

        Assert.assertTrue(catUtilDomesticas.contains(utildomesticas));

        String catOrganizadores = Home_Page.catOrganizadores().getText();

        String organizadores = "organizadores";

        Assert.assertTrue(catOrganizadores.contains(organizadores));
        
        String catCamaBanho = Home_Page.catCamaBanho().getText();

        String camabanho = "cama e banho";

        Assert.assertTrue(catCamaBanho.contains(camabanho));

        String catServicos = Home_Page.catServicos().getText();

        String servicos = "serviços";

        Assert.assertTrue(catServicos.contains(servicos));

        String catIluminacao = Home_Page.catIluminacao().getText();

        String iluminacao = "iluminação";

        Assert.assertTrue(catIluminacao.contains(iluminacao));
        
        String catNatal = Home_Page.catNatal().getText();

        String natal = "natal";

        Assert.assertTrue(catNatal.contains(natal));

        String catMais = Home_Page.catMais().getText();

        String mais = "mais";

        Assert.assertTrue(catMais.contains(mais));
        
        Footer_Script.validaFooter();

    }

}