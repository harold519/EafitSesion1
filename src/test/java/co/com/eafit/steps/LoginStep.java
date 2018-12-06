package co.com.eafit.steps;

import co.com.eafit.pageobject.loginObject;
import net.thucydides.core.annotations.Step;

public class LoginStep {
	loginObject loginObjectM;
	
	@Step
	public void abrirPagina() {
		
		loginObjectM.open();
		
		
	}

	@Step
	public void IngresarCredenciales(String user, String password) {
		
		loginObjectM.realizarLogin(user,password); 
		
	}
	
	
	@Step
	public void verificarTitulo(String tituloPagina) {
		
		loginObjectM.AccesoExitoso(tituloPagina);
		
	}
	
	
	

}
