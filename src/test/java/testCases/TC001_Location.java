package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LocationPage;
import testBase.BaseClass;
import utilityFiles.ScreenShots;

public class TC001_Location extends BaseClass{
	
	@Test(priority=1)
	public void locationCountry() throws InterruptedException, IOException {
		HomePage hp = new HomePage(driver);
		ScreenShots sc = new ScreenShots(driver);
		hp.roamingClick();
		hp.IndiaClick();
		Thread.sleep(3000);
//		sc.screenshot("Country.png");
		logger.info("--//Country chosen//--");
	}
	
	
	@Test(priority=2)
	public void locationCity() throws InterruptedException, IOException {
		LocationPage lp = new LocationPage(driver);
		ScreenShots sc = new ScreenShots(driver);
		lp.clickBangalore();
		logger.info("--//City chosen//--");
		Thread.sleep(3000);
//		sc.screenshot("City.png");
	}

}
