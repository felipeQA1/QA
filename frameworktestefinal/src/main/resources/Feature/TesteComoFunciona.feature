#Author: FelipeMoreno
 @funciona
Feature: Validando Como funciona

  Scenario: Validando  texto da pagina
    Given que eu acesse o site "https://www.smartmei.com.br/"
    When Acessar a aba como funciona 
    Then validar texto "Fique livre da burocracia"
    