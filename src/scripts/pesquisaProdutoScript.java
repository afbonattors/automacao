package scripts;

import pages.pesquisaProdutoPage;

public class pesquisaProdutoScript extends pesquisaProdutoPage {
	
	public static void clicaLupa() {
		
		lupaPesquisa().click();
		
	}
	
	public static void prodCapaAlmofadaPixeledVerde() {
		
		produtoCapaAlmofadaPixeledVerde().click();
		
	}
	
	public static void cliqueComprar() {
		
		clicaComprar().click();
		
	}
	
	public static void finalizaCompra() {
		
		finalizarCompra().click();
		
	}
	
	public static void limpaCarrinhoCompras() {
		
		limpaCarrinho().click();
		
	}
	
	public static void clicabtnExcluir() {
		
		btnExcluirProdutoCarrinho().click();
		
	}
	
	
}