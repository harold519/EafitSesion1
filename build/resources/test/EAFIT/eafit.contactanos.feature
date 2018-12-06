#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion

Feature: Contactenos Universidad EAFIT
				 Como estudiante
				 Quiero enviar un comentario a la Universidad EAFIT
				 A través de la pagina de Contáctenos

 

  @Comentario

  Scenario: Envio comentario Universidad EAFIT
		Given que Yeison quiere escribir un comentario a la Universidad EAFIT
		When el diligencia el comentario
		|nombre                      |correo                                        |telefono       |ciudad             |comentario                                    |
    |Yeison Arias       |yarias@correo.com|2222222      |Medellin    |Excelente universidad|
	   Then el visualiza el pantalla el mensaje Muchas gracias por su comentario.