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
Feature: Acceder al Aplicativo Metis 
				 Como usuario 
				 Quiero autenticarme en Metis 
				 A través de la pagina de acceso a la aplicación.

  @Login
  Scenario: Realizar la Autenticación en Metis.
    Given que Yeison quiere acceder a Metis
    When en escribe el usuario harold y la clave har 
   Then el ve el mensaje de Bootstrap-Admin-Template


