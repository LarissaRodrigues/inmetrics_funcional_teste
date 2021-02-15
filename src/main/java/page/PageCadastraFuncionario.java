package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCadastraFuncionario {

	public PageCadastraFuncionario(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Novo Funcionário')]")
	public WebElement selecionaCadastro;
	
	@FindBy(id = "inputNome")
	public WebElement insereNome;
	
	@FindBy(id = "cpf")
	public WebElement insereCPF;
	
	@FindBy(id = "slctSexo")
	public WebElement selecionaSexo;
	
	@FindBy(xpath = "//option[contains(text(),'Feminino')]")
	public WebElement escolheSexo;
	
	@FindBy(id = "inputAdmissao")
	public WebElement insereAdmissao;
	
	@FindBy(id = "inputCargo")
	public WebElement insereCargo;
	
	@FindBy(id = "dinheiro")
	public WebElement insereSalario;
	
	@FindBy(id = "clt")
	public WebElement selecionaFormaContratacao;
	
	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]")
	public WebElement enviaCadastro;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]")
	public WebElement verificaCadastroSucesso;
	
	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[2]/label[1]/input[1]")
	public WebElement pesquisaFuncionario;
	
	@FindBy(xpath = "//tbody/tr[1]/td[6]/a[2]/button[1]/span[1]")
	public WebElement selecionaEditar;

	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	public WebElement btn_enviaEdicao;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]")
	public WebElement verificaCampoEditado;
	
	@FindBy(xpath = "//tbody/tr[1]/td[6]/a[1]/button[1]/span[1]")
	public WebElement btn_excluir;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]")
	public WebElement verificaExclusao;
	
	
	
	
}
