package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.homePage;
import pages.pesquisaProdutoPage;
import scripts.homeScript;
import scripts.logOutScript;
import scripts.pesquisaProdutoScript;
import utils.baseTest;

public class testHome extends baseTest {

    @Test (priority= 1)

    public void testLogin() {
    	
    	System.out.println("Teste de login.");

        homeScript.clicaFacaLogin();

        homeScript.digitaEmail();

        homeScript.digitaSenha();

        homeScript.clicaEntrar();

        String usuarioLogado = homePage.usuarioLogado().getText();

        String usuarioLogadoCorreto = "afbonatto";
        
        Assert.assertTrue(usuarioLogado.contains(usuarioLogadoCorreto));
        
        } 

    @Test (priority = 2)

    public void testCategorias() {
    	
    	System.out.println("Teste de validação das categorias.");

        String catMoveis = homePage.catMoveis().getText();

        String moveis = "móveis";

        Assert.assertTrue(catMoveis.contains(moveis));

        String catDecoracao = homePage.catDecoracao().getText();

        String decoracao = "decoração";

        Assert.assertTrue(catDecoracao.contains(decoracao));

        String catUtilDomesticas = homePage.catUtilDomesticas().getText();

        String utildomesticas = "utilidades domésticas";

        Assert.assertTrue(catUtilDomesticas.contains(utildomesticas));

        String catOrganizadores = homePage.catOrganizadores().getText();

        String organizadores = "organizadores";

        Assert.assertTrue(catOrganizadores.contains(organizadores));
        
        String catCamaBanho = homePage.catCamaBanho().getText();

        String camabanho = "cama e banho";

        Assert.assertTrue(catCamaBanho.contains(camabanho));

        String catServicos = homePage.catServicos().getText();

        String servicos = "serviços";

        Assert.assertTrue(catServicos.contains(servicos));

        String catIluminacao = homePage.catIluminacao().getText();

        String iluminacao = "iluminação";

        Assert.assertTrue(catIluminacao.contains(iluminacao));
        
        String catNatal = homePage.catNatal().getText();

        String natal = "natal";

        Assert.assertTrue(catNatal.contains(natal));

        String catMais = homePage.catMais().getText();

        String mais = "mais";

        Assert.assertTrue(catMais.contains(mais));

    }
    
    @Test (priority = 3)
    
    public void testAddCart() throws Exception {
    	
    	System.out.println("Teste adiciona produto ao carrinho.");
    	
    	Thread.sleep(1000);
    	
    	pesquisaProdutoScript.clicaLupa();
    	
    	Thread.sleep(1000);
    	
    	Actions action = new Actions(getDriver());
    	
    	action.moveToElement(pesquisaProdutoPage.produtoCapaAlmofadaPixeledVerde()).build().perform();
    	
    	Thread.sleep(1000);
    	
    	pesquisaProdutoScript.prodCapaAlmofadaPixeledVerde();
    	
    	Thread.sleep(1000);
    	
    	pesquisaProdutoScript.cliqueComprar();
    	
    	Thread.sleep(1000);
    	
    	action.moveToElement(pesquisaProdutoPage.clicaCarrinho()).build().perform();
    	
    	Thread.sleep(1000);
    	
    	pesquisaProdutoScript.finalizaCompra();
    	
    	Thread.sleep(1000);
    	
    	String capaAlmofada = pesquisaProdutoPage.nomeProdutoCarrinho().getText();
    	
    	String Almofada = "CAPA ALMOFADA PIXELIZED VERDE 45X45CM";
    	
    	Assert.assertTrue(capaAlmofada.contains(Almofada));
    	
    }
    
    @Test (priority = 4)
    
    public static void testLogOut() throws Exception {
    	
    	System.out.println("Teste logout.");
    	
    	Thread.sleep(1000);
    	
    	homeScript.clicaLogoEtna();
    	
    	Thread.sleep(1000);
    	
    	logOutScript.clicaMinhaConta();
    	
    	Thread.sleep(1000);
    	
    	logOutScript.clicaSair();
    	
    	Thread.sleep(1000);
    	
    	String facaLogin = homePage.facaSeuLogin().getText();
    	
    	String OlaFacaLogin = "faça seu login";
    	
    	Assert.assertTrue(facaLogin.contains(OlaFacaLogin));
    	
    	Thread.sleep(1000);
    	
    }

}