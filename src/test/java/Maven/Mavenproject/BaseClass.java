package Maven.Mavenproject;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Library;
import Utility.webdrivercode;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class BaseClass extends webdrivercode {
	Library lib=new Library();
 
  @AfterMethod
  public void afterMethod(ITestResult result) throws IOException {
	 if(result.getStatus()==ITestResult.SUCCESS)
	 {
	  testex.log(LogStatus.PASS,testex.addScreenCapture(lib.getscreenshot()));
	 }
	 if(result.getStatus()==ITestResult.FAILURE)
	 {
	  testex.log(LogStatus.FAIL,testex.addScreenCapture(lib.getscreenshot()));
	 }
	  reportex.endTest(testex);
		

  }

  @AfterSuite
  public void afterSuite() {
	  reportex.flush();
	  reportex.close();
	  driver.quit();
  }

}
