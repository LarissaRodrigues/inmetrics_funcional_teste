package teste;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.Driver;
import helper.HlpFuncionario;
import helper.HlpLogin;

public class TestFuncionario {

	WebDriver driver;
	HlpFuncionario fun;
	HlpLogin login;
	
	
	@BeforeClass
	public void setUp() {
		driver = new Driver().inicializa();
		fun = new HlpFuncionario(driver);
		login = new HlpLogin(driver);
		login.realizaLoguin();
	}
	
	@Test
	public void cadastraUsuario() {
		fun.selecionaCadastroFuncionario();
		fun.insereNome("Teste");
		fun.insereCPF("906.539.800-78");
		fun.selecionaSexo();
		fun.insereAdmissao("02-02-2018");
		fun.insereCargo("Analista");
		fun.insereSalario("100000");
		fun.selecionaContratacao();
		fun.enviaCadastro();
		fun.verificaCadastro();
	}
	
	@Test
	public void pesquisaFuncionario() {
		fun.pesquisaFuncionario("Cary Littel Ernser");
	}
	
	@Test
	public void editarFuncionario() {
		fun.pesquisaFuncionario("Candy");
	    fun.selecionaEditar();
	    fun.limpaCampoSalario();
	    fun.insereSalario("200000");
	    fun.enviaEdicao();
	    fun.verificaEdicao();
	}
	
	@Test
	public void excluiFuncionario() {
		fun.pesquisaFuncionario("Teste");
		fun.selecionaExcluir();
		fun.verificaExclusao();
	}
	
	
	
	
}
