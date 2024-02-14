package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;
import utilityFiles.ScreenShots;

public class LocationPage extends BasePage {

	public LocationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "(//div[@class='col-xs-12 col-sm-6 col-md-4 col-lg-4'])[2]") WebElement Bangalore;
	@FindBy(xpath = "//div[@id='pushengage-subscription-overlay-close-button']") WebElement popup;
	
	public void closePopup() throws InterruptedException {
//		if(popup.isDisplayed()) {
		Thread.sleep(2000);
		popup.click();
		Thread.sleep(1000);
	}
//	}
	
	public void clickBangalore() throws InterruptedException, IOException {
//		BaseClass b = new BaseClass();
		ScreenShots ss = new ScreenShots(driver);
		closePopup();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)","");
		Thread.sleep(3000);
		ss.screenshot("City.png");
		Bangalore.click();
		Thread.sleep(2000);
	}
	

}
