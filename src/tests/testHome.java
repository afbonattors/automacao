package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.footerClass;
import pages.headerClass;
import pages.homePage;
import pages.listaDePresentesPage;
import pages.nossasLojasPage;
import pages.pesquisaProdutoPage;
import scripts.headerScript;
import scripts.homeScript;
import scripts.logOutScript;
import scripts.nossasLojasScript;
import scripts.pesquisaProdutoScript;
import utils.baseTest;

public class testHome extends baseTest {

    @Test (priority = 1)

    public static void testHomePage() throws Exception {
    	
    	System.out.println("\nTeste homepage.");
    	
    	Assert.assertTrue(headerClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(headerClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(headerClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(headerClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(headerClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(headerClass.iconeCarrinho().isDisplayed());  	
    	
    	homeScript.clicaFacaLogin();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(homePage.divLogin().isDisplayed());
    	
    	Thread.sleep(3000);
    	
    	Assert.assertTrue(homePage.btnFaceBook().isDisplayed());
    	
    	Assert.assertTrue(homePage.txtfieldEmail().isDisplayed());
    	
    	Assert.assertTrue(homePage.txtfieldSenha().isDisplayed());

        String catMoveis = homePage.catMoveis().getText();

        String moveis = "m�veis";

        Assert.assertTrue(catMoveis.contains(moveis));

        String catDecoracao = homePage.catDecoracao().getText();

        String decoracao = "decora��o";

        Assert.assertTrue(catDecoracao.contains(decoracao));

        String catUtilDomesticas = homePage.catUtilDomesticas().getText();

        String utildomesticas = "utilidades dom�sticas";

        Assert.assertTrue(catUtilDomesticas.contains(utildomesticas));

        String catOrganizadores = homePage.catOrganizadores().getText();

        String organizadores = "organizadores";

        Assert.assertTrue(catOrganizadores.contains(organizadores));
        
        String catCamaBanho = homePage.catCamaBanho().getText();

        String camabanho = "cama e banho";

        Assert.assertTrue(catCamaBanho.contains(camabanho));

        String catServicos = homePage.catServicos().getText();

        String servicos = "servi�os";

        Assert.assertTrue(catServicos.contains(servicos));

        String catIluminacao = homePage.catIluminacao().getText();

        String iluminacao = "ilumina��o";

        Assert.assertTrue(catIluminacao.contains(iluminacao));
        
        String catNatal = homePage.catNatal().getText();

        String natal = "natal";

        Assert.assertTrue(catNatal.contains(natal));

        String catMais = homePage.catMais().getText();

        String mais = "mais";

        Assert.assertTrue(catMais.contains(mais));
        
        Assert.assertTrue(footerClass.footerHome().isDisplayed());
        
        Assert.assertTrue(footerClass.divSaibaMaisFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divCentralAtendimentoFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divServicosFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divSegurancaPrivacidadeFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divTelefonesFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divTelevendasFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divAcompanheEtnaFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divTextoRodape().isDisplayed());

    }
    
    @Test (priority = 2)
    
    public static void testListaPresente() throws Exception {
    	
    	System.out.println("\nTeste Home Lista de Presentes.");
    	
    	headerScript.clicaListaPresente();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(headerClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(headerClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(headerClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(headerClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(headerClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(headerClass.iconeCarrinho().isDisplayed());  	
    	
    	Assert.assertTrue(listaDePresentesPage.divEncontreListaPresentes().isDisplayed());
    	
    	Assert.assertTrue(listaDePresentesPage.txtfieldNomeLista().isDisplayed());
    	
    	Assert.assertTrue(listaDePresentesPage.txtDataEvento().isDisplayed());
    	
    	Assert.assertTrue(listaDePresentesPage.txtNumeroLista().isDisplayed());
    	
    	Assert.assertTrue(listaDePresentesPage.btnPesquisar().isEnabled());
    	
    	Assert.assertTrue(listaDePresentesPage.txtfieldEmail().isDisplayed());
    	
    	Assert.assertTrue(listaDePresentesPage.txtfieldSenha().isDisplayed());
    	
    	Assert.assertTrue(listaDePresentesPage.btnEntrar().isDisplayed());
    	
    	Assert.assertTrue(listaDePresentesPage.divDuvidas().isDisplayed());
    	
    	Assert.assertTrue(listaDePresentesPage.divNovaArea().isDisplayed());
    	
    	Assert.assertTrue(listaDePresentesPage.divAdicionadosRecentemente().isDisplayed());
    	
    	Assert.assertTrue(footerClass.footerHome().isDisplayed());
        
        Assert.assertTrue(footerClass.divSaibaMaisFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divCentralAtendimentoFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divServicosFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divSegurancaPrivacidadeFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divTelefonesFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divTelevendasFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divAcompanheEtnaFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divTextoRodape().isDisplayed());
    	
    }
    
    @Test (priority = 3)
    
    public static void testNossasLojas() throws Exception {
    	
    	System.out.println("\nTeste nossas lojas.");
    	
    	nossasLojasScript.acessaNossasLojas();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(headerClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(headerClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(headerClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(headerClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(headerClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(headerClass.iconeCarrinho().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divNossasLojas().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaBerrini().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaMarginal().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaRiodeJaneiro().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaCampinas().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaSalvador().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaNatal().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaBrasilia().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaGranjaViana().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaBeloHorizonte().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaCampoGrande().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaFortaleza().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaRecife().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaRibeiraoPreto().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.lojaSocoraba().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divLojaBerrini().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divLojaMarginalTiete().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divLojaRiodeJaneiro().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divCampinas().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divSalvador().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divNatal().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divBrasilia().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divGranjaViana().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divBeloHorizonte().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divCampoGrande().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divFortaleza().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divRecife().isDisplayed());

    	Assert.assertTrue(nossasLojasPage.divRibeiraoPreto().isDisplayed());
    	
    	Assert.assertTrue(nossasLojasPage.divSorocaba().isDisplayed());
    	
        Assert.assertTrue(footerClass.footerHome().isDisplayed());
        
        Assert.assertTrue(footerClass.divSaibaMaisFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divCentralAtendimentoFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divServicosFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divSegurancaPrivacidadeFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divTelefonesFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divTelevendasFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divAcompanheEtnaFooter().isDisplayed());
        
        Assert.assertTrue(footerClass.divTextoRodape().isDisplayed());
    	
    }
    
    @Test (priority= 4)

    public void testLogin() throws Exception {
    	
    	System.out.println("\nTeste de login.");
    	
    	headerScript.clicaLogoEtna();
    	
    	Assert.assertTrue(headerClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(headerClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(headerClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(headerClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(headerClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(headerClass.iconeCarrinho().isDisplayed());

        homeScript.clicaFacaLogin();
        
        Thread.sleep(1000);

        homeScript.digitaEmail();

        homeScript.digitaSenha();

        homeScript.clicaEntrar();

        String usuarioLogado = homePage.usuarioLogado().getText();

        String usuarioLogadoCorreto = "afbonatto";
        
        Assert.assertTrue(usuarioLogado.contains(usuarioLogadoCorreto));
        
    }
    
    @Test (priority = 5)
    
    public void testCarrinho() throws Exception {
    	
    	System.out.println("\nTeste adiciona produto ao carrinho.");
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(headerClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(headerClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(headerClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(headerClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(headerClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(headerClass.iconeCarrinho().isDisplayed());
    	
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
    	
    	pesquisaProdutoScript.limpaCarrinhoCompras();
    	
    	Thread.sleep(1000);
    	
    	action.moveToElement(headerClass.iconeCarrinho()).build().perform();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(pesquisaProdutoPage.labelNaoHaProduto().isEnabled());    	
    	
    }
    
    /*@Test (priority = 6)
    
    public static void testCarrinho() throws Exception {
    	
    	
    	
    }*/
    
    @Test (priority = 20)
    
    public static void testLogOut() throws Exception {
    	
    	System.out.println("\nTeste logout.");
    	
    	headerScript.clicaLogoEtna();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(headerClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(headerClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(headerClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(headerClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(headerClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(headerClass.iconeCarrinho().isDisplayed());
    	
    	logOutScript.clicaMinhaConta();
    	
    	Thread.sleep(1000);
    	
    	logOutScript.clicaSair();
    	
    	Thread.sleep(1000);
    	
    	String facaLogin = homePage.facaSeuLogin().getText();
    	
    	String OlaFacaLogin = "fa�a seu login";
    	
    	Assert.assertTrue(facaLogin.contains(OlaFacaLogin));
    	
    	Thread.sleep(1000);
    	
    }

}