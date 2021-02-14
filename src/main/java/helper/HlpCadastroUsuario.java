package helper;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page.PageCadastraUsuario;

public class HlpCadastroUsuario {

  PageCadastraUsuario cad;
  
  public HlpCadastroUsuario(WebDriver driver) {
	  cad = new PageCadastraUsuario(driver);
  }
	
	public void acessaCadastro() {
		cad.acessarCadastro.click();
	}
	
	public void insereUsuario(String usuario) {
	   cad.insereUsuario.sendKeys(usuario);
	}
	
	public void insereSenha(String senha) {
		cad.insereSenha.sendKeys(senha);
	}
	
	public void confirmaSenha(String confirmaSenha) {
		cad.confirmaSenha.sendKeys(confirmaSenha);
	}
	
	public void confirmaCadastro() {
		cad.BTN_cadastro.click();	
	}
	
	public void verificaSenhasDiferentes() {
		String senha = cad.verificaSenha.getText();
		assertEquals(senha, "Senhas não combinam" );
	}
	
	@Test
	public void realizaCadastro() {
		acessaCadastro();
		insereUsuario("Usuario5");
		insereSenha("1234");
		confirmaSenha("1234");
	    confirmaCadastro();
	}
	
}
