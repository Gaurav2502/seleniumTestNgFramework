package TestCases;


import org.testng.annotations.Test;

import PageObjectModel.AddToCartPageObject;
import resources.BaseClass;

public class AddToCart extends BaseClass {
	@Test
	public void CartDataCostComper() throws InterruptedException {
		AddToCartPageObject apo = new AddToCartPageObject(driver);

		apo.SearchBox().sendKeys("iphone");
		apo.Searchbtn().click();
		Thread.sleep(2000);
		String IphoneFullCost = apo.iphoneCost().getText();
		String iArray[] = IphoneFullCost.split(" ");
		
		String iFinalValue = iArray[0].replaceAll("[^\\d.]", "");
		System.out.println(iFinalValue);
		double cost1 = Double.parseDouble(iFinalValue);
		
		apo.ClickOnAddToCart().click();

		apo.SearchBox().clear();
		apo.SearchBox().sendKeys("samsung");
		apo.Searchbtn().click();

		String SamsungFullCost = apo.sCost().getText();
		String sArray[] = SamsungFullCost.split(" ");
		String SfinalValue = sArray[0].replaceAll("[^\\d.]", "");
		System.out.println(SfinalValue);

		double cost2 = Double.parseDouble(SfinalValue);
		apo.ClickOnSAddToCart().click();

	// ---------------------addition--------------------------
		double CalculateCost = cost1 + cost2;
		System.out.println("my total:- " + CalculateCost);
	// -------------------------------------------------------
		
		Thread.sleep(2000);
		apo.ClickOnCartItems().click();

		String CartTotal = apo.ItemsTotal().getText();
		String GenratedTotal = CartTotal.replaceAll("[^\\d.]", "");
		System.out.println("Genrated total:- " + GenratedTotal);
		double FinalTotal = Double.parseDouble(GenratedTotal);

		if (FinalTotal == CalculateCost) {
			System.out.println("Totol was same");
		} else {
			System.out.println("Total was not same");
		}

	}
}
