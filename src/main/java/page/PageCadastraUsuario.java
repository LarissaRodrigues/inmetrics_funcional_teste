package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCadastraUsuario {
	public PageCadastraUsuario(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/form[1]/div[7]/a[1]")
	public WebElement acessarCadastro;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")
	public WebElement insereUsuario;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]")
	public WebElement insereSenha;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/form[1]/div[6]/input[1]")
	public WebElement confirmaSenha;
	
	@FindBy(xpath = "//button[contains(text(),'Cadastrar')]")
	public WebElement BTN_cadastro;
	
	@FindBy(xpath = "//div[contains(text(),'Senhas não combinam')]")
	public WebElement verificaSenha;
	
}
