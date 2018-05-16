package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HeaderClass;
import pages.PesquisaProduto_Page;
import scripts.Footer_Script;
import scripts.Header_Script;
import scripts.PesquisaProduto_Script;
import utils.BaseTest;

public class Carrinho_Test extends BaseTest {
	
	@Test
    
    public void carrinhoTest() throws Exception {
    	
    	System.out.println("\nTeste adiciona produto ao carrinho.");
    	
    	Thread.sleep(1000);
    	
    	Header_Script.validaHeader();
    	
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
    	
    	Footer_Script.validaFooter();
    	
    }
	
}