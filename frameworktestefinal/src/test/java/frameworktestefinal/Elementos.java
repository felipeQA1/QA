package frameworktestefinal;

import org.openqa.selenium.By;

public class Elementos {

	private By comoFunciona = By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a");

	private By TituloFunciona = By.xpath("/html/body/section[1]/div/div/div/h2");
	private By planosTarifas = By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a");
	private By TituloTarifas = By.xpath("/html/body/section[5]/div/div/div/div/div[1]/div[3]/div[1]");
	private By BtnCentralajuda = By.xpath("/html/body/nav/div/div[2]/ul/li[5]/a");
	private By TituloAjuda = By.xpath("/html/body/header/div[1]/p/span/span");
	public By getComoFunciona() {
		return comoFunciona;
	}
	public By getTituloFunciona() {
		return TituloFunciona;
	}
	public By getPlanosTarifas() {
		return planosTarifas;
	}
	public By getTituloTarifas() {
		return TituloTarifas;
	}
	public By getBtnCentralajuda() {
		return BtnCentralajuda;
	}
	public By getTituloAjuda() {
		return TituloAjuda;
	}
	
	
	
	
	

}