package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.ProductPageObject;
import resources.BaseClass;

public class ProductSelectTestcase extends BaseClass{
	@Test
	public void SelectingProduct() {
		
		//userchanges
		//userchanges
		
		ProductPageObject ppo= new ProductPageObject();
		
		ppo.clickOnComponents().click();
		
	}
}
