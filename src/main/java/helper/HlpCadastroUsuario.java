package helper;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HlpCadastroUsuario {

  WebDriver driver;
  
  public HlpCadastroUsuario(WebDriver driver) {
	  this.driver = driver;
  }
	
	public void acessaCadastro() {
		driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/form[1]/div[7]/a[1]")).click();
	}
	
	public void insereUsuario(String usuario) {
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys(usuario);
	}
	
	public void insereSenha(String senha) {
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]")).sendKeys(senha);
	}
	
	public void confirmaSenha(String confirmaSenha) {
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[6]/input[1]")).sendKeys(confirmaSenha);
	}
	
	public void confirmaCadastro() {
		driver.findElement(By.xpath("//button[contains(text(),'Cadastrar')]")).click();	
	}
	
	public void verificaSenhasDiferentes() {
		String senha = driver.findElement(By.xpath("//div[contains(text(),'Senhas não combinam')]")).getText();
		assertEquals(senha, "Senhas não combinam" );
	}
	
}
