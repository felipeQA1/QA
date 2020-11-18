#Author: FelipeMoreno
@ajuda
Feature: validando central de Ajuda

  
  Scenario: Validar Titulo
    Given que eu acesse o site "https://www.smartmei.com.br/"
    When eu acessar a aba central de ajuda
    Then valido o titulo da pagina "CENTRAL DE AJUDA"