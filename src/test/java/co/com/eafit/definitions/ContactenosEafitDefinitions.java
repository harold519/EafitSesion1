package co.com.eafit.definitions;

import co.com.eafit.steps.ContactenosEafitSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class ContactenosEafitDefinitions{
	@Steps
	ContactenosEafitSteps contactenoseafitsteps;
	
	@Given("^que Yeison quiere escribir un comentario a la Universidad EAFIT$")
	public void queYeisonQuiereEscribirUnComentarioALaUniversidadEAFIT() throws Exception {
		contactenoseafitsteps.abrirPaginaEafit();
	}


	@When("^el diligencia el comentario$")
	public void elDiligenciaElComentario(DataTable dtDatos) throws Exception {
		contactenoseafitsteps.diligenciarComentario(dtDatos);
	    
	}

	@Then("^el visualiza el pantalla el mensaje (.*)$")
	public void elVisualizaElPantallaElMensajeMuchasGraciasPorSuComentario(String msg) throws Exception {
		contactenoseafitsteps.mostrarMensjae(msg);
	}
	
}
