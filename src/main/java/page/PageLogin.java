package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin  {

	public PageLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name =  "username")
	public WebElement usuario;
	
	@FindBy(name = "pass")
	public WebElement senha;
	
	@FindBy(xpath = "//button[contains(text(),'Entre')]")
	public WebElement btn_entrar;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]")
	public WebElement erroLogin;
	
}
