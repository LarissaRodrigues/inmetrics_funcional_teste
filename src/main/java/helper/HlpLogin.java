package helper;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import page.PageLogin;
import suporte.Suporte;

public class HlpLogin extends Suporte{

	 PageLogin page;

	 public HlpLogin(WebDriver driver) {		 
		 page = new PageLogin(driver);
	}
	 
	 public void insereUsuario(String usuario) {
		 preencherCampo(page.usuario, usuario);
	 }
	 
	 public void insereSenha(String senha) {
		 preencherCampo(page.senha,senha );
	 }
	 
	 public void selecionaEntrar() {
		 clicar(page.btn_entrar);
	 }
	 
	 public void verificaLogin() { 
		 pontoDeVerificacao(page.erroLogin, "ERRO! Usuário ou Senha inválidos\n"
			 		+ "×");
	 }
	 
	public void realizaLoguin() {
			insereUsuario("Usuario123");
			insereSenha("1234");
			selecionaEntrar();
	}
}
