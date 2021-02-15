package suporte;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Suporte {

	public void clicar(WebElement elemento) {
		aguardaElemento(elemento);
		elemento.click();
	}
	
	public void preencherCampo(WebElement elemento, String texto) {
		aguardaElemento(elemento);
		elemento.sendKeys(texto);
	}
	
	public void pontoDeVerificacao(WebElement elemento, String texto) {
		aguardaElemento(elemento);
		assertEquals(elemento.getText(), texto);
	}
	
	public void limparCampo(WebElement elemento) {
		elemento.clear();
	}
	
	public ExpectedCondition<WebElement> aguardaElemento(WebElement elemento) {
		return  ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(elemento));
	}
}
