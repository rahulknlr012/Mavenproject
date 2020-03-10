package Utility;

import java.text.SimpleDateFormat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class webdrivercode {
	public static WebDriver driver;
	public static String path=new SimpleDateFormat("ddMMyyyy_HHmmss").format(new java.util.Date());
    public static ExtentReports reportex=new ExtentReports("./report/"+path+"index.html");
    public static ExtentTest testex;
	public void setup(String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			System.setProperty("webdriver.firefox.marionette", "C:\\Users\\HP\\eclipse-workspace\\Mavenproject\\src\\main\\java\\webdriver\\geckodriver.exe");
			
			driver = new FirefoxDriver();
			  driver.manage().window().maximize();
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			//create chrome instance
			ChromeOptions ops = new ChromeOptions();
            ops.addArguments("--disable-notifications");
            System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Mavenproject\\src\\main\\java\\webdriver\\chromedriver.exe");
			 // System.setProperty("webdriver.chrome.driver", "./lib/chromedriver");
            driver = new ChromeDriver(ops);
            driver.manage().window().maximize();
			//driver = new ChromeDriver();
		}
		//Check if parameter passed as 'Edge'
				else if(browser.equalsIgnoreCase("Edge")){
					//set path to Edge.exe
					System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\eclipse-workspace\\Mavenproject\\src\\main\\java\\webdriver\\MicrosoftWebDriver.exe");
					//create Edge instance
					driver = new EdgeDriver();
					  driver.manage().window().maximize();
				}
	}

}
