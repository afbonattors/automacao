package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import tests.testHome;
import pages.homeLogOutPage;
import pages.homePage;
import pages.pesquisaProdutoPage;
import scripts.logOutScript;
import scripts.pesquisaProdutoScript;
import utils.baseTest;
import scripts.homeScript;

public class testHome extends baseTest {

    @Test (priority= 0)

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

    @Test (priority = 1)

    public void testCategorias() {
    	
    	System.out.println("Teste de valida��o das categorias.");

        String catMoveis = homePage.catMoveis().getText();

        String moveis = "m�veis";

        Assert.assertTrue(catMoveis.contains(moveis));

        String catDecoracao = homePage.catDecoracao().getText();

        String decoracao = "decora��o";

        Assert.assertTrue(catDecoracao.contains(decoracao));

        String catUtilDomesticas = homePage.catUtilDomesticas().getText();

        String utildomesticas = "utilidades dom�sticas";

        Assert.assertTrue(catUtilDomesticas.contains(utildomesticas));

        String catCamaBanho = homePage.catCamaBanho().getText();

        String camabanho = "cama e banho";

        Assert.assertTrue(catCamaBanho.contains(camabanho));

        String catIluminacao = homePage.catIluminacao().getText();

        String iluminacao = "ilumina��o";

        Assert.assertTrue(catIluminacao.contains(iluminacao));

        String catTapetesCortinas = homePage.catTapetesCortinas().getText();

        String tapetescortinas = "tapetes e cortinas";

        Assert.assertTrue(catTapetesCortinas.contains(tapetescortinas));

        String catSuperPreco = homePage.catSuperPreco().getText();

        String superpreco = "super pre�o";

        Assert.assertTrue(catSuperPreco.contains(superpreco));

        String catRenova = homePage.catRenova().getText();

        String renova = "renova";

        Assert.assertTrue(catRenova.contains(renova));

        String catMais = homePage.catMais().getText();

        String mais = "mais";

        Assert.assertTrue(catMais.contains(mais));

    }
    
    
    
    @Test (priority = 3)
    
    public void testLogOut() throws Exception {
    	
    	System.out.println("Teste de Logout.");
    	
    	logOutScript.clicaMinhaConta();
    	
    	Thread.sleep(1000);
    	
    	logOutScript.clicaSair();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(homeLogOutPage.cadastreSe().isDisplayed());
    	
    }
    
    @Test (priority = 2)
    
    public void testAddCart() throws Exception {
    	
    	System.out.println("Teste adiciona produto ao carrinho.");
    	
    	pesquisaProdutoScript.clicaLupa();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(pesquisaProdutoPage.gridProdutos().isEnabled());
    	
    	pesquisaProdutoScript.compraVelaRedondo();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(pesquisaProdutoPage.nomeProduto().isDisplayed());
    	
    	
    }

}