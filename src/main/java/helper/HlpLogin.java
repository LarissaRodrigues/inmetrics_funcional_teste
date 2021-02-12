package helper;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import page.PageLogin;

public class HlpLogin {

	 PageLogin page;

	 public HlpLogin(WebDriver driver) {		 
		 page = new PageLogin(driver);
	}
	 
	 public void insereUsuario(String usuario) {
		 page.usuario.sendKeys(usuario);
	 }
	 
	 public void insereSenha(String senha) {
		page.senha.sendKeys(senha);
	 }
	 
	 public void selecionaEntrar() {
		 page.BTN_entrar.click();
	 }
	 
	 public void verificaLogin() {
		 String login = page.erroLogin.getText();
		 System.out.println(login);
		 assertEquals(login, "ERRO! Usuário ou Senha inválidos\n"
		 		+ "×");
	 }
	 
	public void realizaLoguin() {
			insereUsuario("Usuario123");
			insereSenha("1234");
			selecionaEntrar();
	}
}
