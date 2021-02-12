package teste;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.Driver;
import helper.HlpCadastroUsuario;
import helper.HlpLogin;

public class TestLogin {

	WebDriver driver;
	HlpLogin log;
	
	@BeforeClass
	public void setUp() {
		driver = new Driver().inicializa();
		log = new HlpLogin(driver);
	}
	
	@Test
	public void realizaLogin() {
		log.insereUsuario("Usuario123");
		log.insereSenha("1234");
		log.selecionaEntrar();
	}
	
	@Test
	public void LoginInvalido() {
		log.insereUsuario("Teste");
		log.insereSenha("1234");
		log.selecionaEntrar();
		log.verificaLogin();
	}
	
	
	
}
