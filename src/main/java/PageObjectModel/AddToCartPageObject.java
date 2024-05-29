package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPageObject {
	WebDriver driver;
	private By searchTextbox= By.xpath("//input[@class='form-control input-lg']");
	private By searchButton= By.xpath("//button[@class='btn btn-default btn-lg']");
	private By iphonePrice= By.xpath("//p[@class='price']");
	private By addToCart= By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	private By sprice=By.xpath("(//p[@class='price'])[2]");
	private By saddToCart=By.xpath("(//i[@class='fa fa-shopping-cart'])[5]");
	private By cartItem=By.xpath("//span[@id='cart-total']");
	private By itemsTotal=By.xpath("(//table[@class='table table-bordered']//td)[8]");
	
	
	public AddToCartPageObject(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement SearchBox() {
		return driver.findElement(searchTextbox);
	}
	
	public WebElement Searchbtn() {
		return driver.findElement(searchButton);
	}
	public WebElement iphoneCost() {
		return driver.findElement(iphonePrice);
	}
	
	public WebElement ClickOnAddToCart() {
		return driver.findElement(addToCart);
	}
	
	public WebElement sCost() {
		return driver.findElement(sprice);
	}
	
	public WebElement ClickOnSAddToCart() {
		return driver.findElement(saddToCart);
	}
	
	public WebElement ClickOnCartItems() {
		return driver.findElement(cartItem);
	}
	
	public WebElement ItemsTotal() {
		return driver.findElement(itemsTotal);
	}
}
