package core;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Driver {

	WebDriver driver; 
	
	public WebDriver inicializa() {
		File arquivo = new File("src/main/resources/driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",arquivo.getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("https://inm-test-app.herokuapp.com/accounts/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}
