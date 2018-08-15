package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginCadastro {

	static WebDriver driver;

	public LoginCadastro(WebDriver driver) {
		this.driver = driver;

	}

	public void preencherCampos() {

		WebElement email = driver.findElement(By.name("login[email]"));
		email.sendKeys("ddpdiego2005@yahoo.com.br");

		WebElement senha = driver.findElement(By.name("login[password]"));
		senha.sendKeys("mudar123");

		WebElement botaoEntrar = driver.findElement(By.id("login-submit"));
		botaoEntrar.click();

	}

}