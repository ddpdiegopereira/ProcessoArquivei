package Teste;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginCadastro;

public class login {

	static WebDriver driver;
	static LoginCadastro loginCadastro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://psel-app.arquivei.com.br");
		loginCadastro = new LoginCadastro (driver);

	}

	@Test
	public void test() {
		loginCadastro.preencherCampos();
		
	}
	
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	//	driver.close();
		
	
		
	}

}
