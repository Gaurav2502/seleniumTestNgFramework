package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	
	public WebDriver driver;
	// changes by user
	
	private By username=By.xpath("//input[@name='email']");
	private By password=By.xpath("//input[@name='password']");
	private By loginbtn=By.xpath("//input[@value='Login']");
	private By WrongUserPassword=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	private By EmtypFild=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	private By Succesfullogin=By.xpath("//h2[text()='My Account']");
	
	//hekko
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
	}

	
	
	public WebElement EnterUsername() {
		return driver.findElement(username);
	}
	
	public WebElement EnterPassword() {
		return driver.findElement(password);
	}
	
	public WebElement ClickOnLogin() {
		return driver.findElement(loginbtn);
	}
	
	public WebElement AlertWrongUserPass() {
		return driver.findElement(WrongUserPassword);
	}
	
	public WebElement AlertEmptyFild() {
		return driver.findElement(EmtypFild);
	}
	
	public WebElement LoginSuccess() {
		return driver.findElement(Succesfullogin);
	}
}
