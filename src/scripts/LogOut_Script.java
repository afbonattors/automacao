package scripts;

import pages.HomeLogOut_Page;
import utils.Waits;

public class LogOut_Script extends HomeLogOut_Page {
	
	Waits _waits;
	
	public LogOut_Script(){
		//Não sei se tu consegue acessar o driver a partir da LogOut_Script.
		// Tenta assim: 
		//_waits = new Waits(LogOut_Script.getDriver());
		
		//ou assim direto da base: 
		//_waits = new Waits(BaseTest.getDriver());
	}
	
	
	public static void clicaMinhaConta() {
		// depois tu usaria o método assim:
		_waits.waitForElementToBeClickable(minhaConta(),10);
		// Esse método espera por até "10s" pelo elemento "minhaConta()". ficar "clicavel"
		// Se ele ficar "clicavel" antes disso, a execução continua. Se ele não ficar "clicavel" em "10s", o teste falha.
		minhaConta().click();
		
	}
	
	public static void clicaSair() {
		
		logOut().click();
		
	}

}
