package project;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.mongodb.MapReduceCommand.OutputType;
import com.relevantcodes.extentreports.LogStatus;

import Maven.Mavenproject.BaseClass;
import Maven.Mavenproject.Cleartripmainpage;
import Utility.Library;
import Utility.webdrivercode;

public class guruchrome extends BaseClass {
	webdrivercode web=new webdrivercode();
	Library lib=new Library();
	public static Logger log=Logger.getLogger("ClearTrip");
	  
  @Test(priority =1)
  public void f() throws Exception {
	  testex=reportex.startTest("org");
	  try
	  {
		  log.info("Login clear trip");
	  web.setup("chrome");
	  driver.get("https://www.cleartrip.com/");
	 
	  testex.log(LogStatus.PASS,"Go to ClearTrip App");
	  
	  
	  }
	  catch(Exception e)
	  {
		  log.error("clear trip login error"+e);
		  testex.log(LogStatus.FAIL,"Go to ClearTrip App"+e);
		  
	  }
  }
  @Test(priority =2)
  public void f1() throws Exception {
	  Cleartripmainpage main=new Cleartripmainpage(driver);
	  try
	  {
		  log.info("Hotel link click clear trip");
	  main.clickonhotellink();
	 // main.clickonactivitieslink();
	  //main.clickonflightdealslink();
	  //main.clickonmanagetriplink();
	  //main.clickonmobilelink();
	  testex.log(LogStatus.PASS," ClearTrip App >> click on hotel link");
	  
	  
	  }
	  catch(Exception e)
	  {
		  log.error("Hotel link click clear trip error"+e);
		  testex.log(LogStatus.FAIL,"ClearTrip App >> click on hotel link because "+e);
		  
	  }
  }

}
