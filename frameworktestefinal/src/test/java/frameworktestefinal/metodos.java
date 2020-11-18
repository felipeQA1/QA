package frameworktestefinal;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class metodos {

	WebDriver driver;

	public void abrirSite(String site, String navegador) {

		if (navegador == "CHROME" || navegador == " FIREFOX") {
			switch (navegador) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();
				break;

			case "FIREFOX":
				System.setProperty("webdriver.firefox.driver", ".drivers/firefoxdriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();

				break;
			}

		} else {
			System.out.println("navegador n�o suportado escolha firefox ou chrome");
		}
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void fechar() {
		driver.quit();
	}

	public void screnShoot(String printName) throws IOException {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File DestFile = new File(printName);
		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

	}

	public void teclaenter(By elemento) {
		driver.findElement(elemento).submit();

	}

	public String obterText(By element, String descricaoPasso) {

		String text;

		text = driver.findElement(element).getText();
		System.out.println(text);

		return text;
	}

	public String validartexto(String textoesperado, String textoparametro, String descricaopasso) {

	assertEquals(textoesperado, textoparametro);
		
		return textoesperado;
	}
public void pausa(int tempo) throws InterruptedException {
	Thread.sleep (tempo);
	
}
}