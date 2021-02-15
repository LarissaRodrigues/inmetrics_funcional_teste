package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCadastraUsuario {
	public PageCadastraUsuario(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Cadastre-se')]")
	public WebElement acessarCadastro;
	
	@FindBy(name =  "username")
	public WebElement insereUsuario;
	
	@FindBy(name =  "pass")
	public WebElement insereSenha;
	
	@FindBy(name = "confirmpass")
	public WebElement confirmaSenha;
	
	@FindBy(xpath = "//button[contains(text(),'Cadastrar')]")
	public WebElement btn_cadastro;
	
	@FindBy(xpath = "//div[contains(text(),'Senhas não combinam')]")
	public WebElement verificaSenha;
	
}
