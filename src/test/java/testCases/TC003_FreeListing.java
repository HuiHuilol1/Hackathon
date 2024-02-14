package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.FreeListingPage;
import pageObjects.GymandSearchPage;
import utilityFiles.ScreenShots;

public class TC003_FreeListing extends TC002_SearchandFind{
	
	@Test(priority=6)
	public void clickfreelisting() {
		GymandSearchPage gp = new GymandSearchPage(driver);
		gp.clickFreeListing();
		
	}
	
	@Test(priority=7)
	public void freeListingLogin() throws InterruptedException, IOException {
		FreeListingPage fp = new FreeListingPage(driver);
		ScreenShots sc = new ScreenShots(driver);
		fp.clickFreeListingLogin();
		fp.enterEmail();
		fp.enterPassword();
		fp.clickLoginButton();
		logger.info("--//Free Listing Done//--");
		String error_msg = fp.freeListingErrorMsg();
		Thread.sleep(3000);
		sc.screenshot("Freelisting.png");
		System.out.println("FreeListing Error Message : " + error_msg);
		fp.cross();
		navigateBack();
	}
	
	

}
