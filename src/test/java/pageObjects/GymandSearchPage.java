package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;
import utilityFiles.ScreenShots;

public class GymandSearchPage extends BasePage{

	public GymandSearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='what']") WebElement searchbox;
	@FindBy(xpath = "//button[@class='btn btn-default']") WebElement findButton;
	@FindBy(xpath = "//div[@class='btn-group']//a[@class='btn cardFooterButtonBlue']") WebElement freeListingButton;
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-6 col-md-3 col-lg-3 pad0'][34]") WebElement gymGrid;
	@FindBy(xpath = "//div[@id='pushengage-subscription-overlay-close-button']") WebElement popup;
	public void closePopup() throws InterruptedException {
//		if(popup.isDisplayed()) {
		Thread.sleep(2000);
		popup.click();
		Thread.sleep(1000);
	}
//	}
	
	public void searchText() throws InterruptedException, IOException {
//		BaseClass b = new BaseClass();
		ScreenShots ss = new ScreenShots(driver);
		closePopup();
		Thread.sleep(3000);
		ss.screenshot("SearchPage.png");
		Thread.sleep(1000);
		searchbox.sendKeys("Car Washing Services");
		findButton.click();
	}
	
	public void clickFreeListing() {
		freeListingButton.click();
	}
	
	public void selectGym() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)","");
		gymGrid.click();
	}
	
	
}
