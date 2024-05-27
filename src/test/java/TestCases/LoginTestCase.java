package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.HomePageObject;
import PageObjectModel.LoginPageObject;
import resources.BaseClass;
import resources.commonMethod;
import resources.testData;

public class LoginTestCase extends BaseClass {
	

	// LoginTestCases
	@Test
	public void VerifyLoginValidData() throws IOException {
		
		
		
		HomePageObject hpo = new HomePageObject(driver);
		commonMethod.handleExplictWait(driver, 3, hpo.ClickMyaccount());
		
		hpo.ClickMyaccount().click();
		hpo.ClickLogin().click();

		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.EnterUsername().sendKeys(EmailId);
		lpo.EnterPassword().sendKeys(testData.password);
		lpo.ClickOnLogin().click();
		
		String Excepted =testData.LoginSuccesfulExpected;
		String Actual = lpo.LoginSuccess().getText();

		commonMethod.handlingAssertion(Actual, Excepted);
		
	}

	@Test(enabled=false)
	public void VerifyLoginInValidData() throws IOException, InterruptedException {

		HomePageObject hpo = new HomePageObject(driver);
		hpo.ClickMyaccount().click();
		hpo.ClickLogin().click();

		LoginPageObject lpo = new LoginPageObject(driver);
		lpo.EnterUsername().sendKeys(testData.trash);
		lpo.EnterPassword().sendKeys(testData.trash);

		Thread.sleep(2000);

		lpo.ClickOnLogin().click();

		String Excepted = testData.ExpectedNoFound;
		String Actual = lpo.AlertWrongUserPass().getText();
		
		commonMethod.handlingAssertion(Actual, Excepted);
		
	}

	@Test(enabled=false)
	public void VerifyLoginEmptyData() throws IOException, InterruptedException {

		HomePageObject hpo = new HomePageObject(driver);
		hpo.ClickMyaccount().click();
		hpo.ClickLogin().click();

		LoginPageObject lpo = new LoginPageObject(driver);

		lpo.ClickOnLogin().click();

		String Excepted = testData.EmptyFildExpected;
		String Actual = lpo.AlertEmptyFild().getText();

		commonMethod.handlingAssertion(Actual, Excepted);
		Thread.sleep(2000);
		driver.quit();
	
	}
}
