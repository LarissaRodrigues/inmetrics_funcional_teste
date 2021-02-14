package teste;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import core.Driver;
import helper.HlpCadastroUsuario;


public class TestCastroUsuario {

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
		cad.insereUsuario("Usuario5");
		cad.insereSenha("1234");
		cad.confirmaSenha("1234");
	    cad.confirmaCadastro();
	}
	
	@Test
	public void senhasDiferentes() {
		cad.acessaCadastro();
		cad.insereUsuario("Usuario1234");
		cad.insereSenha("1234");
		cad.confirmaSenha("12345");
	    cad.confirmaCadastro();
	    cad.verificaSenhasDiferentes();
	}
	
}
