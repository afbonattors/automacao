package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FooterClass;
import pages.HeaderClass;
import pages.Home_Page;
import pages.ListaDePresentes_Page;
import pages.NossasLojas_Page;
import pages.PesquisaProduto_Page;
import scripts.Header_Script;
import scripts.Home_Script;
import scripts.LogOut_Script;
import scripts.NossasLojas_Script;
import scripts.PesquisaProduto_Script;
import utils.BaseTest;

public class TestEtna extends BaseTest {

    @Test (priority = 1)

    public static void testHomePage() throws Exception {
    	
    	System.out.println("\nTeste homepage.");
    	
    	Assert.assertTrue(HeaderClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.iconeCarrinho().isDisplayed());  	
    	
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
        
        Assert.assertTrue(FooterClass.footerHome().isDisplayed());
        
        Assert.assertTrue(FooterClass.divSaibaMaisFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divCentralAtendimentoFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divServicosFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divSegurancaPrivacidadeFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTelefonesFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTelevendasFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divAcompanheEtnaFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTextoRodape().isDisplayed());

    }
    
    @Test (priority = 2)
    
    public static void testListaPresente() throws Exception {
    	
    	System.out.println("\nTeste Home Lista de Presentes.");
    	
    	Header_Script.clicaListaPresente();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(HeaderClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.iconeCarrinho().isDisplayed());
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(ListaDePresentes_Page.divBannerLista().isDisplayed());
    	
    	Assert.assertTrue(ListaDePresentes_Page.divEncontreListaPresentes().isDisplayed());
    	
    	Assert.assertTrue(ListaDePresentes_Page.txtfieldNomeLista().isDisplayed());
    	
    	Assert.assertTrue(ListaDePresentes_Page.txtDataEvento().isDisplayed());
    	
    	Assert.assertTrue(ListaDePresentes_Page.txtNumeroLista().isDisplayed());
    	
    	Assert.assertTrue(ListaDePresentes_Page.btnPesquisar().isEnabled());
    	
    	Assert.assertTrue(ListaDePresentes_Page.txtfieldEmail().isDisplayed());
    	
    	Assert.assertTrue(ListaDePresentes_Page.txtfieldSenha().isDisplayed());
    	
    	Assert.assertTrue(ListaDePresentes_Page.btnEntrar().isDisplayed());
    	
    	Assert.assertTrue(ListaDePresentes_Page.divDuvidas().isDisplayed());
    	
    	Assert.assertTrue(ListaDePresentes_Page.divNovaArea().isDisplayed());
    	
    	Assert.assertTrue(ListaDePresentes_Page.divAdicionadosRecentemente().isDisplayed());
    	
    	Assert.assertTrue(FooterClass.footerHome().isDisplayed());
        
        Assert.assertTrue(FooterClass.divSaibaMaisFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divCentralAtendimentoFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divServicosFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divSegurancaPrivacidadeFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTelefonesFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTelevendasFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divAcompanheEtnaFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTextoRodape().isDisplayed());
    	
    }
    
    @Test (priority = 3)
    
    public static void testNossasLojas() throws Exception {
    	
    	System.out.println("\nTeste nossas lojas.");
    	
    	NossasLojas_Script.acessaNossasLojas();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(HeaderClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.iconeCarrinho().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divNossasLojas().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaBerrini().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaMarginal().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaRiodeJaneiro().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaCampinas().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaSalvador().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaNatal().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaBrasilia().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaGranjaViana().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaBeloHorizonte().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaCampoGrande().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaFortaleza().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaRecife().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaRibeiraoPreto().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.lojaSocoraba().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divLojaBerrini().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divLojaMarginalTiete().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divLojaRiodeJaneiro().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divCampinas().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divSalvador().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divNatal().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divBrasilia().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divGranjaViana().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divBeloHorizonte().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divCampoGrande().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divFortaleza().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divRecife().isDisplayed());

    	Assert.assertTrue(NossasLojas_Page.divRibeiraoPreto().isDisplayed());
    	
    	Assert.assertTrue(NossasLojas_Page.divSorocaba().isDisplayed());
    	
        Assert.assertTrue(FooterClass.footerHome().isDisplayed());
        
        Assert.assertTrue(FooterClass.divSaibaMaisFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divCentralAtendimentoFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divServicosFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divSegurancaPrivacidadeFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTelefonesFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTelevendasFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divAcompanheEtnaFooter().isDisplayed());
        
        Assert.assertTrue(FooterClass.divTextoRodape().isDisplayed());
    	
    }
    
    @Test (priority= 4)

    public void testLogin() throws Exception {
    	
    	System.out.println("\nTeste de login.");
    	
    	Header_Script.clicaLogoEtna();
    	
    	Assert.assertTrue(HeaderClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.iconeCarrinho().isDisplayed());

        Home_Script.clicaFacaLogin();
        
        Thread.sleep(1000);

        Home_Script.digitaEmail();

        Home_Script.digitaSenha();

        Home_Script.clicaEntrar();

        String usuarioLogado = Home_Page.usuarioLogado().getText();

        String usuarioLogadoCorreto = "afbonatto";
        
        Assert.assertTrue(usuarioLogado.contains(usuarioLogadoCorreto));
        
    }
    
    @Test (priority = 5)
    
    public void testCarrinho() throws Exception {
    	
    	System.out.println("\nTeste adiciona produto ao carrinho.");
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(HeaderClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.iconeCarrinho().isDisplayed());
    	
    	PesquisaProduto_Script.clicaLupa();
    	
    	Thread.sleep(1000);
    	
    	Actions action = new Actions(getDriver());
    	
    	action.moveToElement(PesquisaProduto_Page.produtoCapaAlmofadaPixeledVerde()).build().perform();
    	
    	Thread.sleep(1000);
    	
    	PesquisaProduto_Script.prodCapaAlmofadaPixeledVerde();
    	
    	Thread.sleep(1000);
    	
    	PesquisaProduto_Script.cliqueComprar();
    	
    	Thread.sleep(1000);
    	
    	action.moveToElement(PesquisaProduto_Page.clicaCarrinho()).build().perform();
    	
    	Thread.sleep(1000);
    	
    	PesquisaProduto_Script.finalizaCompra();
    	
    	Thread.sleep(1000);
    	
    	String capaAlmofada = PesquisaProduto_Page.nomeProdutoCarrinho().getText();
    	
    	String Almofada = "CAPA ALMOFADA PIXELIZED VERDE 45X45CM";
    	
    	Assert.assertTrue(capaAlmofada.contains(Almofada));
    	
    	Thread.sleep(1000);
    	
    	PesquisaProduto_Script.limpaCarrinhoCompras();
    	
    	Thread.sleep(3000);
    	
    	action.moveToElement(HeaderClass.iconeCarrinho()).build().perform();
    	
    	Thread.sleep(3000);
    	
    	Assert.assertTrue(PesquisaProduto_Page.labelNaoHaProduto().isEnabled());    	
    	
    }
    
    /*@Test (priority = 6)
    
    public static void testCarrinho() throws Exception {
    	
    	
    	
    }*/
    
    @Test (priority = 7)
    
    public static void testLogOut() throws Exception {
    	
    	System.out.println("\nTeste logout.");
    	
    	Header_Script.clicaLogoEtna();
    	
    	Thread.sleep(1000);
    	
    	Assert.assertTrue(HeaderClass.headerHome().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.logoEtna().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.textfiledBusca().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.listaCasamento().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.nossasLojas().isDisplayed());
    	
    	Assert.assertTrue(HeaderClass.iconeCarrinho().isDisplayed());
    	
    	LogOut_Script.clicaMinhaConta();
    	
    	Thread.sleep(1000);
    	
    	LogOut_Script.clicaSair();
    	
    	Thread.sleep(1000);
    	
    	String facaLogin = Home_Page.facaSeuLogin().getText();
    	
    	String OlaFacaLogin = "faça seu login";
    	
    	Assert.assertTrue(facaLogin.contains(OlaFacaLogin));
    	
    	Thread.sleep(1000);
    	
    }

}