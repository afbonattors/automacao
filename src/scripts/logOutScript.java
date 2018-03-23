package scripts;

import pages.homeLogOutPage;

public class logOutScript extends homeLogOutPage {
	
	public static void clicaMinhaConta() {
		
		minhaConta().click();
		
	}
	
	public static void clicaSair() {
		
		logOut().click();
		
	}

}
