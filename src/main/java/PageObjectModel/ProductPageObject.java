package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageObject {
	public WebDriver driver;
	private By selectComponet=By.xpath("//a[text()='Components']");
	
	
	public WebElement clickOnComponents() {
		return driver.findElement(selectComponet);
	}
}
