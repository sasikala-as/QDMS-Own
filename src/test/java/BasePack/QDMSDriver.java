/*
 * @Author - Sasikala Ambalavanar
 * Description - QDMS Driver Initialization 
 * Date - 20-02-2023
 * Module - Login
 */


package BasePack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QDMSDriver {
	
	
	public static String browser = "chrome";
	public static WebDriver driver;
	public static String URL = "http://qa-automation-release.s3-website-us-east-1.amazonaws.com/#/login";

	
// Report Generate Codes
	
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentTest testCase;


	@BeforeSuite
	public void main() throws IOException {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);

		ExtentReport();

	}

	@AfterSuite
	public void closeChrome() {
		
		extent.flush();
		 //driver.close();
	}

	public static void ExtentReport() throws IOException {
		extent = new ExtentReports();
		htmlreporter = new ExtentHtmlReporter("E:\\QDMS-AUTOMATION-WORKSPACE\\Quality_Data_Management_System\\Reports\\ExtentReports.html");
				

		extent.attachReporter(htmlreporter);
	}

	}
	
	
	

/*
 * 	// Report Generate Codes
	
			public static ExtentReports extent;
			public static ExtentHtmlReporter htmlreporter;
			public static ExtentTest testCase;

	// Web Driver initilize
			
			public static WebDriver driver;
			
	// Testing Site URL
			
			public static String URL = "http://qa-automation-release.s3-website-us-east-1.amazonaws.com/#/login";
					
	// Setup Driver , Maximize the window & Report generate 
			
			@BeforeSuite
				public  void main() throws IOException {     
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				    driver.manage().window().maximize();	        
				    driver.get(URL);
				    ExtentReport();
				    }
			
	// close the driver & Report close
			
				 @AfterSuite
				      public void closeChrome(){
				     //  driver.close();
				          extent.flush();
				    }

	// Report generation path & report generate
				 
				      public static void ExtentReport() throws IOException {
				    	  extent = new ExtentReports();
				          htmlreporter = new ExtentHtmlReporter("E:\\QDMS-AUTOMATION-WORKSPACE\\QDMS_AUTOMATION_PROJECT\\Reports\\ExtentReport.html");
				            
				            extent.attachReporter(htmlreporter);
				        }
				    
}
*/

