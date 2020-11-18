package MySteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import frameworktestefinal.Elementos;
import frameworktestefinal.metodos;

public class Steps {
	
	metodos Metodos = new metodos();
	Elementos el = new Elementos();

	@Given("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String site) throws Throwable {
		Metodos.abrirSite(site, "CHROME");
	}
	@When("^eu acessar a aba central de ajuda$")
	public void eu_acessar_a_aba_central_de_ajuda() throws Throwable {
	   Metodos.clicar(el.getBtnCentralajuda());
	}

	@Then("^valido o titulo da pagina \"([^\"]*)\"$")
	public void valido_o_titulo_da_pagina(String texto) throws Throwable {
	    
		String text;
		text = Metodos.obterText(el.getTituloAjuda(), " pegando titulo");
		System.out.println(text);
		Metodos.validartexto(texto, text, "validando titulo");
		Metodos.screnShoot("./Evidencias/" + text + ".png");
		Metodos.fechar();
	}
	@When("^Acessar a aba como funciona$")
	public void acessar_a_aba_como_funciona() throws Throwable {
	   Metodos.clicar(el.getComoFunciona());
	}

	@Then("^validar texto \"([^\"]*)\"$")
	public void validar_texto(String texto) throws Throwable {
		String text;
		text = Metodos.obterText(el.getTituloFunciona(), " pegando titulo");
		System.out.println(text);
		Metodos.validartexto(texto, text, "validando titulo");
		Metodos.screnShoot("./Evidencias/" + text + ".png");
		Metodos.fechar();
	}

	@When("^que acesse a aba Planos e Tarifas$")
	public void que_acesse_a_aba_Planos_e_Tarifas() throws Throwable {
	   Metodos.clicar(el.getPlanosTarifas());
	}

	@Then("^vou validar o Primeiro plano \"([^\"]*)\"$")
	public void vou_validar_o_Primeiro_plano(String texto) throws Throwable {
		String text;
		text = Metodos.obterText(el.getTituloTarifas(), " pegando titulo");
		System.out.println(text);
		Metodos.validartexto(texto, text, "validando titulo");
		Metodos.screnShoot("./Evidencias/" + text + ".png");
		Metodos.fechar();
	}
}