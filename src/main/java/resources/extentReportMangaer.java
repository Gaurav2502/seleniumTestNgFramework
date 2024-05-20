package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportMangaer {
		public static ExtentSparkReporter htmlReport;
		public static ExtentReports extent;
		public static ExtentTest test;
		
		public static void setup() {
			htmlReport= new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
			htmlReport.config().setDocumentTitle("Automation Report");//set the title of htmlweb page
			htmlReport.config().setReportName("Function Report");// set the report name
			htmlReport.config().setTheme(Theme.DARK);
			
			extent = new ExtentReports();
			extent.attachReporter(htmlReport);
			extent.setSystemInfo("hostname", "localhost");
			extent.setSystemInfo("os", "windows10");
			extent.setSystemInfo("browserName", "Chrome");
			extent.setSystemInfo("testername", "gaurav");
		}
		
		public static void endreport() {// complcery line
			extent.flush();//flush output to the html file--
			//Basically converting data to htmlweb page format
		
		}
}
