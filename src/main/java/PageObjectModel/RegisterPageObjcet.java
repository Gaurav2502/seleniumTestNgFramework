package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//ObjectModel
public class RegisterPageObjcet {
	public WebDriver driver;
	//text box
	private By firstname=By.xpath("//input[@name='firstname']");
	private By lastname=By.xpath("//input[@name='lastname']");
	private By email=By.xpath("//input[@name='email']");
	private By telephone=By.xpath("//input[@name='telephone']");
	private By password=By.xpath("//input[@name='password']");
	private By confirm=By.xpath("//input[@name='confirm']");
	
	
	private By firstnameerror=By.xpath("(//div[@class='text-danger'])[1]");
	private By lastnameerror=By.xpath("(//div[@class='text-danger'])[2]");
	private By emailerror=By.xpath("(//div[@class='text-danger'])[3]");
	private By telephoneerror=By.xpath("(//div[@class='text-danger'])[4]");
	private By passworderror=By.xpath("(//div[@class='text-danger'])[5]");
	private By confirmerror=By.xpath("(//div[@class='text-danger'])[6]");
	
	private By allerror=By.xpath("//fieldset[@id='account']/div");
	
	//check box and submit btn
	private By check=By.xpath("//input[@name='agree']");
	private By submit=By.xpath("//input[@type='submit']");
	
	private By AcCreate=By.xpath("//h1[text()='Your Account Has Been Created!']");
	private By AlreadyExist=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	
	public RegisterPageObjcet(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	

	//getter method from encapsulation
	public WebElement TypeFirstName() {
		return driver.findElement(firstname);
	}
	
	public WebElement TypeLastName() {
		return driver.findElement(lastname);
	}
	
	public WebElement TypeEmail() {
		return driver.findElement(email);
	}
	
	public WebElement TypeTelephone() {
		return driver.findElement(telephone);
	}
	
	public WebElement TypePassword() {
		return driver.findElement(password);
	}
	
	public WebElement TypeConfirm() {
		return driver.findElement(confirm);
	}
	
	//checkbox
	public WebElement ClickCheck() {
		return driver.findElement(check);
	}
	
	public WebElement ClickSubmit() {
		return driver.findElement(submit);
	}
	
	//Error Message Data
	public WebElement FirstnameError() {
		return driver.findElement(firstnameerror);
	}
	public WebElement LastnameError() {
		return driver.findElement(lastnameerror);
	}
	public WebElement EmailError() {
		return driver.findElement(emailerror);
	}
	public WebElement TelephoneError() {
		return driver.findElement(telephoneerror);
	}
	public WebElement PasswordError() {
		return driver.findElement(passworderror);
	}
	public WebElement ConfirmPError() {
		return driver.findElement(confirmerror);
	}
	
	public List<WebElement> AllError() {
		return driver.findElements(allerror);
	}
	
	public WebElement AcountCreated() {
		return driver.findElement(AcCreate);
	}
	
	public WebElement EmailAlreadyExist() {
		return driver.findElement(AlreadyExist);
	}
}
