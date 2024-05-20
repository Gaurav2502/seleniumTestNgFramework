package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	public WebDriver driver;
	private By myaccount=By.xpath("//i[@class='fa fa-user']");
	private By register=By.xpath("//a[text()='Register']");
	private By login=By.xpath("//a[text()='Login']");
	
	//constroutor
	public HomePageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement ClickMyaccount() {
		return driver.findElement(myaccount);
		
	}
	public WebElement ClickRegister() {
		return driver.findElement(register);
		
	}
	public WebElement ClickLogin() {
		return driver.findElement(login);
		
	}
	
}
