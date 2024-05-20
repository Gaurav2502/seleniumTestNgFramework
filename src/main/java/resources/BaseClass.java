package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;
	public static String EmailId=GenreteEmailId();
	public Properties prop;
	
	public void initlizerDriver() throws IOException {
		FileInputStream fs=new FileInputStream("E:\\Technogekkos\\Testing_Prgram\\SelTestNgFramework\\src\\main\\java\\resources\\data.properties");
		
		 prop=new Properties();
		
		prop.load(fs);
		
		  String browserName = prop.getProperty("browser");
		
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}

		else {
			System.out.println("plz enter valid browser");
		}

	}
	
	public static  String GenreteEmailId() {
		return "test"+System.currentTimeMillis()+"@gmail.com";
	}
	
	@BeforeMethod
	public void FetchUrl() throws IOException {
		initlizerDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	
	public static String screenShot(WebDriver driver, String filename) {
		String DateAndTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + DateAndTime + ".png";
		try {
			FileUtils.copyFile(source, new File(destination));
		} 
		catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}

	@BeforeSuite
	  public void ExtentReport() {
		extentReportMangaer.setup();
	  }
	  
	  @AfterSuite
	  public void endReport() {
		  extentReportMangaer.endreport();
	  }

}
