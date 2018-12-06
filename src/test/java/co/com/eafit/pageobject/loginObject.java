package co.com.eafit.pageobject;


import static org.junit.Assert.assertThat;

import org.apache.tools.ant.filters.TokenFilter.ContainsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.Matchers.*;



@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class loginObject extends PageObject{
	
	@FindBy(xpath= "//*[@id=\"login\"]/form/input[1]")
	public WebElementFacade txtUsuario;
	
	
	@FindBy(xpath= "//*[@id=\"login\"]/form/input[2]")
	public WebElementFacade txtPassword;
	
	@FindBy(xpath= "//*[@id=\"login\"]/form/button")
	public WebElementFacade btnIngresar;
	
	@FindBy(id= "bootstrap-admin-template")
	public WebElementFacade lblTitulo;
	
	
	
	public void realizarLogin(String user, String password) {
		
		txtUsuario.sendKeys(user);
		txtPassword.sendKeys(password);
		btnIngresar.click();
		
	}



	public void AccesoExitoso(String tituloPagina) {
		String strMensaje = lblTitulo.getText();
		assertThat(strMensaje, containsString(tituloPagina));
		
				
	}
	
	
	
	

}
