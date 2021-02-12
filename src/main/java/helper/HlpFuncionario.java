package helper;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HlpFuncionario {

	WebDriver driver;
	
	public HlpFuncionario(WebDriver driver) {
		this.driver = driver;
	}
	
   public void selecionaCadastroFuncionario() {
	   driver.findElement(By.xpath("//a[contains(text(),'Novo Funcionário')]")).click();
   }
	
	public void insereNome(String nome) {
		driver.findElement(By.id("inputNome")).sendKeys(nome);
	}
	
	public void insereCPF(String cpf) {
		driver.findElement(By.id("cpf")).sendKeys(cpf);
	}
	
	public void selecionaSexo() {
		driver.findElement(By.id("slctSexo")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Feminino')]")).click();
	}
	
	public void insereAdmissao(String data) {
		driver.findElement(By.id("inputAdmissao")).sendKeys(data);
	}
	
	public void insereCargo(String cargo) {
		driver.findElement(By.id("inputCargo")).sendKeys(cargo);
	}
	
	public void insereSalario(String salario) {
		driver.findElement(By.id("dinheiro")).sendKeys(salario);
	}
	
	public void selecionaContratacao() {
		driver.findElement(By.id("clt")).click();
	}
	
	public void enviaCadastro() {
		driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]")).click();
	}//body/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]
	
	public void verificaCadastro() {
		String cadastro = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]")).getText();
		assertEquals(cadastro, "SUCESSO! Usuário cadastrado com sucesso\n"
				+ "×");
	}
	
	public void pesquisaFuncionario(String funcionario) {
		driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")).sendKeys(funcionario);
	}
	
	public void selecionaEditar() {
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[2]/button[1]/span[1]")).click();
	}
	
	public void limpaCampoSalario() {
		driver.findElement(By.id("dinheiro")).clear();
	}
	
	public void enviaEdicao() {
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).click();
	}
	
	public void verificaEdicao() {
		String edicao = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]")).getText();
		assertEquals(edicao, "SUCESSO! Informações atualizadas com sucesso\n"
				+ "×");
	}
	
	public void selecionaExcluir() {
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/a[1]/button[1]/span[1]")).click();
	}
	
	public void verificaExclusao() {
		String exclui = driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]")).getText();
		System.out.println(exclui);
		assertEquals(exclui, "SUCESSO! Funcionário removido com sucesso\n"
				+ "×");
	}
	
}
