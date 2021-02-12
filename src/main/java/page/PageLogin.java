package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin  {

	public PageLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]")
	public WebElement usuario;
	
	@FindBy(xpath = "//body/div[1]/div[2]/div[1]/form[1]/div[5]/input[1]")
	public WebElement senha;
	
	@FindBy(xpath = "//button[contains(text(),'Entre')]")
	public WebElement BTN_entrar;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]")
	public WebElement erroLogin;
	
}
