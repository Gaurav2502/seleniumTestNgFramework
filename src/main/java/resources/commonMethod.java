package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonMethod {
	
	public static void handlingAssertion(String Actual, String Excepted) {
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(Actual, Excepted);
		sa.assertAll();
	}
	
	public static void handleExplictWait(WebDriver driver,int time, WebElement element ) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		  wait.until(ExpectedConditions.visibilityOf(element));

	}
}
