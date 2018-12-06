package co.com.eafit.pageobject;


import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import java.util.List;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://www.eafit.edu.co/institucional/contacto/Paginas/contacto-eafit.aspx")
public class ContactenosEafitPage extends PageObject{
	
	@FindBy(id= "Field1")
	public WebElementFacade txtNombre;
	
	
	@FindBy(id= "Field3")
	public WebElementFacade txtCorreo;
	
	@FindBy(id= "Field4")
	public WebElementFacade numeTelefono;
	
	@FindBy(id= "Field5")
	public WebElementFacade ciudad;
	
	
	@FindBy(id= "Field6")
	public WebElementFacade comentario;
	
	@FindBy(id= "saveForm")
	public WebElementFacade btnGuardar;
	
	@FindBy(xpath="//*[@id=\"container\"]/form/h2")
	public WebElementFacade lblMensaje;
	
	
	
	
	
	public void nuevoComentario(DataTable dtDatos) {
		
		List<List<String>> datas = dtDatos.raw();
		getDriver().switchTo().frame(0);
		txtNombre.sendKeys(datas.get(1).get(0));
		txtCorreo.sendKeys(datas.get(1).get(1));
		numeTelefono.sendKeys(datas.get(1).get(2));
		ciudad.sendKeys(datas.get(1).get(3));
		comentario.sendKeys(datas.get(1).get(4));
		btnGuardar.click();
		
	}



	public void mostrarMensajeConfirm(String msg) {
		String strMensaje = lblMensaje.getText();
		assertThat(strMensaje, containsString(msg));
		
	}
	
	

}
