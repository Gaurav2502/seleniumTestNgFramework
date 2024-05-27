package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import PageObjectModel.HomePageObject;
import PageObjectModel.RegisterPageObjcet;
import resources.BaseClass;
import resources.commonMethod;
import resources.testData;

public class RegisterTest extends BaseClass{

	@Test(priority=0)
	public void VerifyRegsiterValidData() throws IOException{
		
		HomePageObject hpo= new HomePageObject(driver);
		hpo.ClickMyaccount().click();
		hpo.ClickRegister().click();
	

		RegisterPageObjcet rpo=new RegisterPageObjcet(driver);
		
		//text box information
		rpo.TypeFirstName().sendKeys(testData.firstname);
		rpo.TypeLastName().sendKeys(testData.lastname);
		rpo.TypeEmail().sendKeys(EmailId);
		rpo.TypeTelephone().sendKeys(testData.telephone);
		rpo.TypePassword().sendKeys(testData.password);
		rpo.TypeConfirm().sendKeys(testData.password);
		
		
		rpo.ClickCheck().click();
		rpo.ClickSubmit().click();

		String Excepted=testData.MsgAccountCreated;
		String Actual=rpo.AcountCreated().getText();

		commonMethod.handlingAssertion(Actual, Excepted);
		
	}
	@Test(enabled=false)
	public void VerifyRegsiterInvalidData() throws IOException{
	
		HomePageObject hpo= new HomePageObject(driver);
		hpo.ClickMyaccount().click();
		hpo.ClickRegister().click();
	

		RegisterPageObjcet rpo=new RegisterPageObjcet(driver);
		
		//text box information
		rpo.TypeFirstName().sendKeys(testData.firstname);
		rpo.TypeLastName().sendKeys(testData.lastname);
		rpo.TypeEmail().sendKeys("testcasees2@gmail.com");
		rpo.TypeTelephone().sendKeys(testData.telephone);
		rpo.TypePassword().sendKeys(testData.password);
		rpo.TypeConfirm().sendKeys(testData.password);
		
		rpo.ClickCheck().click();
		rpo.ClickSubmit().click();
		
		
		String Expected=testData.ExistExpected;
		String Actual=rpo.EmailAlreadyExist().getText();
		
		commonMethod.handlingAssertion(Actual, Expected);
	}
	
	
	@Test(enabled=false)
	public void VerifyRegsiterEmptyData() throws IOException{

		HomePageObject hpo= new HomePageObject(driver);
		hpo.ClickMyaccount().click();
		hpo.ClickRegister().click();
	

		RegisterPageObjcet rpo=new RegisterPageObjcet(driver);
		
		rpo.ClickSubmit().click();
		
		String FnExpected=testData.ExpectedFn;
		String Fnactual=rpo.FirstnameError().getText();
		
		String LnExpected=testData.ExpectedLn;
		String Lnactual=rpo.LastnameError().getText();
		
		String EmailExpected=testData.ExpectedEmail;
		String Emailactual=rpo.EmailError().getText();
		
		String TelExpected=testData.ExpectedTel;
		String Telactual=rpo.TelephoneError().getText();
		
		String PassExpected=testData.ExpectedPassword;
		String Passactual=rpo.PasswordError().getText();
		

		commonMethod.handlingAssertion(Fnactual, FnExpected);
		commonMethod.handlingAssertion(Lnactual, LnExpected);
		commonMethod.handlingAssertion(Emailactual, EmailExpected);
		commonMethod.handlingAssertion(Telactual, TelExpected);
		commonMethod.handlingAssertion(Passactual, PassExpected);
	
	}
}