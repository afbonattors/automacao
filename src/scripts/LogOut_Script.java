package scripts;

import pages.HomeLogOut_Page;

public class LogOut_Script extends HomeLogOut_Page {
	
	public static void clicaMinhaConta() {
		
		minhaConta().click();
		
	}
	
	public static void clicaSair() {
		
		logOut().click();
		
	}

}