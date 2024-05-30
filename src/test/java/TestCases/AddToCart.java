package TestCases;

import org.testng.annotations.Test;

import PageObjectModel.AddToCartPageObject;
import resources.BaseClass;
import resources.commonMethod;

public class AddToCart extends BaseClass {
	@Test
	public void CartDataCostComper() throws InterruptedException {
		AddToCartPageObject apo = new AddToCartPageObject(driver);

		apo.SearchBox().sendKeys("iphone");
		apo.Searchbtn().click();
		Thread.sleep(2000);

		String IphoneFullCost = apo.iphoneCost().getText();
		commonMethod.findingValue(IphoneFullCost);

		apo.ClickOnAddToCart().click();

		apo.SearchBox().clear();
		apo.SearchBox().sendKeys("samsung");
		apo.Searchbtn().click();

		String SamsungFullCost = apo.sCost().getText();
		commonMethod.findingValue(SamsungFullCost);

		apo.ClickOnSAddToCart().click();

	// ---------------------------------------addition----------------------------------------------------------------
		double CalculateCost = commonMethod.findingValue(IphoneFullCost) + commonMethod.findingValue(SamsungFullCost);
		System.out.println("my total:- " + CalculateCost);
	// ---------------------------------------------------------------------------------------------------------------

		Thread.sleep(2000);
		apo.ClickOnCartItems().click();

		String CartTotal = apo.ItemsTotal().getText();
		commonMethod.findingValue(CartTotal);

		if (commonMethod.findingValue(CartTotal) == CalculateCost) {
			System.out.println("Totol was same");
		} else {
			System.out.println("Total was not same");
		}
	}
}
