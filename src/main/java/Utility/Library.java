package Utility;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.regex.Pattern;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.mongodb.MapReduceCommand.OutputType;

public class Library extends webdrivercode {
	public static String getscreenshot() throws IOException
	{
	          TakesScreenshot scrShot =((TakesScreenshot)driver);
	          String date=new SimpleDateFormat("ddMMyyyy_HHmmss").format(new java.util.Date());
	          System.out.println("date is"+date);
	          String path=System.getProperty("user.dir")+"\\Screenshot\\"+date+".png";
              File file=scrShot.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
              File DestFile=new File(path);
             org.apache.commons.io.FileUtils.copyFile(file, DestFile);
           return path;
            
	}
	public void scrolltoelement(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView(true);",element);
	}
}
