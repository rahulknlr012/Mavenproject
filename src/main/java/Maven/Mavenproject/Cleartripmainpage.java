package Maven.Mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.webdrivercode;

public   class Cleartripmainpage extends webdrivercode{
	
	@FindBy(xpath="//*[@class='hasProductIcons']//*[contains(@title,'Top flight deals')]")
	private WebElement flightdealslink;
	@FindBy(xpath="//*[@class='hasProductIcons']//*[@title=\"Cleartrip Mobile\"]")
	private WebElement mobilelink;
	@FindBy(xpath="//*[@class='hasProductIcons']//*[@href=\"/account/trips?src=manageTrips\"]")
	private WebElement managetriplink;
	@FindBy(xpath="//*[@class='hasProductIcons']//*[@href=\"/hotels\"]")
	private WebElement hotelslink;
	@FindBy(xpath="//*[@class='hasProductIcons']//*[@href=\"/activities\"]")
	private WebElement activitieslink;
	//By flight=By.xpath("//*[@class='hasProductIcons']//*[contains(@title,'Top flight deals')]");
   // @FindBy(xpath=)
	
	public Cleartripmainpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	 
	public WebElement getflightdeals() {
		WebElement element= (flightdealslink);
		//WebElement element=driver.findElement(flight);
		return element;
	}
	public WebElement getmobile() {
		WebElement element= (mobilelink);
		//WebElement element=driver.findElement(flight);
		return element;
	}
	public WebElement getmanagetrip() {
		WebElement element= (managetriplink);
		//WebElement element=driver.findElement(flight);
		return element;
	}
	public WebElement gethotels() {
		WebElement element= (hotelslink);
		//WebElement element=driver.findElement(flight);
		return element;
	}
	public WebElement getactivities() {
		WebElement element= (activitieslink);
		//WebElement element=driver.findElement(flight);
		return element;
	}
	public void clickonflightdealslink()
	{
	getflightdeals().click();
	}
	public void clickonhotellink()
	{
	gethotels().click();
	}
	public void clickonmobilelink()
	{
	getmobile().click();
	}
	public void clickonmanagetriplink()
	{
	getmanagetrip().click();
	}
	public void clickonactivitieslink()
	{
	getactivities().click();
	}
}
