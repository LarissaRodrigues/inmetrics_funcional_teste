package teste;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import core.Driver;
import helper.HlpCadastroUsuario;


public class TestCadastroUsuario {

	WebDriver driver;
	HlpCadastroUsuario cad;
	
	@BeforeClass
	public void setUp() {
		driver = new Driver().inicializa();
		cad = new HlpCadastroUsuario(driver);
	}
	
	@Test
	public void realizaCadastro() {
		cad.acessaCadastro();
		cad.insereUsuario("Usuario9611");
		cad.insereSenha("1234");
		cad.confirmaSenha("1234");
	    cad.confirmaCadastro();
	}
	
	@Test
	public void senhasDiferentes() {
		cad.acessaCadastro();
		cad.insereUsuario("Usuario123");
		cad.insereSenha("1234");
		cad.confirmaSenha("12345");
	    cad.confirmaCadastro();
	    cad.verificaSenhasDiferentes();
	}
	
	@AfterClass
	public void quit() {
		driver.quit();
	}
	
}
