package helper;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page.PageCadastraUsuario;
import suporte.Suporte;

public class HlpCadastroUsuario extends Suporte{

  PageCadastraUsuario cad;
  
  public HlpCadastroUsuario(WebDriver driver) {
	  cad = new PageCadastraUsuario(driver);
  }
	
	public void acessaCadastro() {
		 clicar(cad.acessarCadastro);
	}
	
	public void insereUsuario(String usuario) {
		preencherCampo(cad.insereUsuario, usuario);
		
	}
	
	public void insereSenha(String senha) {
		preencherCampo(cad.insereSenha, senha);
	}
	
	public void confirmaSenha(String confirmaSenha) {
		preencherCampo(cad.confirmaSenha, confirmaSenha);
	}
	
	public void confirmaCadastro() {
		clicar(cad.btn_cadastro);
	}
	
	public void verificaSenhasDiferentes() {
		pontoDeVerificacao(cad.verificaSenha,"Senhas não combinam" );
	}
	
	@Test
	public void realizaCadastro() {
		acessaCadastro();
		insereUsuario("Usuario15022021");
		insereSenha("1234");
		confirmaSenha("1234");
	    confirmaCadastro();
	}
	
}
