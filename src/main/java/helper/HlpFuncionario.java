package helper;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import page.PageCadastraFuncionario;
import suporte.Suporte;

public class HlpFuncionario extends Suporte{

	PageCadastraFuncionario fun;
	
	public HlpFuncionario(WebDriver driver) {
		fun = new PageCadastraFuncionario(driver);
	}
	
   public void selecionaCadastroFuncionario() {
	   clicar(fun.selecionaCadastro);
   }
	
	public void insereNome(String nome) {
		preencherCampo(fun.insereNome, nome);
	}
	
	public void insereCPF(String cpf) {
		preencherCampo(fun.insereCPF, cpf);
	}
	
	public void selecionaSexo() {
		clicar(fun.selecionaSexo);
		clicar(fun.escolheSexo);
	}
	
	public void insereAdmissao(String data) {
		preencherCampo(fun.insereAdmissao, data);
	}
	
	public void insereCargo(String cargo) {
		preencherCampo(fun.insereCargo, cargo);
	}
	
	public void insereSalario(String salario) {
		preencherCampo(fun.insereSalario, salario);
	}
	
	public void selecionaContratacao() {
		clicar(fun.selecionaFormaContratacao);
	}
	
	public void enviaCadastro() {
		clicar(fun.enviaCadastro);
	}
	
	public void verificaCadastro() {
		pontoDeVerificacao(fun.verificaCadastroSucesso, "SUCESSO! Usuário cadastrado com sucesso\n" + "×");
	}
	
	public void pesquisaFuncionario(String funcionario) {
		preencherCampo(fun.pesquisaFuncionario, funcionario);
	}
	
	public void selecionaEditar() {
		clicar(fun.selecionaEditar);
	}
	
	public void limpaCampoSalario() {
		limparCampo(fun.insereSalario);
	}
	
	public void enviaEdicao() {
		clicar(fun.btn_enviaEdicao);
	}
	
	public void verificaEdicao() {
		pontoDeVerificacao(fun.verificaCampoEditado, "SUCESSO! Informações atualizadas com sucesso\n" + "×");
	}
	
	public void selecionaExcluir() {
		clicar(fun.btn_excluir);
	}
	
	public void verificaExclusao() {
		pontoDeVerificacao(fun.verificaExclusao, "SUCESSO! Funcionário removido com sucesso\n" + "×");
	}
	
	
}
