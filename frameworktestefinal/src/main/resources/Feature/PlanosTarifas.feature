#Author: felipeMoreno
@plano
Feature: Validando Tarifas


  Scenario: Validando Plano
    Given que eu acesse o site "https://www.smartmei.com.br/"
    When que acesse a aba Planos e Tarifas
    Then vou validar o Primeiro plano "Emissão de guias de pagamento de imposto"