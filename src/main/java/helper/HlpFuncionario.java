package helper;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import page.PageCadastraFuncionario;

public class HlpFuncionario {

	PageCadastraFuncionario fun;
	
	public HlpFuncionario(WebDriver driver) {
		fun = new PageCadastraFuncionario(driver);
	}
	
   public void selecionaCadastroFuncionario() {
	   fun.selecionaCadastro.click();
   }
	
	public void insereNome(String nome) {
		fun.insereNome.sendKeys(nome);
	}
	
	public void insereCPF(String cpf) {
		fun.insereCPF.sendKeys(cpf);
	}
	
	public void selecionaSexo() {
		fun.selecionaSexo.click();
		fun.escolheSexo.click();
	}
	
	public void insereAdmissao(String data) {
		fun.insereAdmissao.sendKeys(data);
	}
	
	public void insereCargo(String cargo) {
		fun.insereCargo.sendKeys(cargo);
	}
	
	public void insereSalario(String salario) {
		fun.insereSalario.sendKeys(salario);
	}
	
	public void selecionaContratacao() {
		fun.selecionaFormaContratacao.click();
	}
	
	public void enviaCadastro() {
		fun.enviaCadatro.click();
	}
	
	public void verificaCadastro() {
		String cadastro = fun.verificaCadastroSucesso.getText();
		assertEquals(cadastro, "SUCESSO! Usuário cadastrado com sucesso\n"
				+ "×");
	}
	
	public void pesquisaFuncionario(String funcionario) {
		fun.pesquisaFuncionario.sendKeys(funcionario);
	}
	
	public void selecionaEditar() {
		fun.selecionaEditar.click();
	}
	
	public void limpaCampoSalario() {
		fun.insereSalario.clear();
	}
	
	public void enviaEdicao() {
		fun.BTN_enviaEdicao.click();
	}
	
	public void verificaEdicao() {
		String edicao = fun.verificaCampoEditado.getText();
		assertEquals(edicao, "SUCESSO! Informações atualizadas com sucesso\n"
				+ "×");
	}
	
	public void selecionaExcluir() {
		fun.BTN_excluir.click();
	}
	
	public void verificaExclusao() {
		String exclui = fun.verificaExclusao.getText();
		System.out.println(exclui);
		assertEquals(exclui, "SUCESSO! Funcionário removido com sucesso\n"
				+ "×");
	}
	
	
}
