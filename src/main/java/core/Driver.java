package core;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	WebDriver driver; 
	
	public WebDriver inicializa() {
		File arquivo = new File("src/main/resources/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",arquivo.getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("https://inm-test-app.herokuapp.com/accounts/login/");
		return driver;
	}
	
	
}
