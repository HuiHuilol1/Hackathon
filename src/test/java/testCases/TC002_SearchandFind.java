package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.CarWashPage;
import pageObjects.GymandSearchPage;
import utilityFiles.ScreenShots;

public class TC002_SearchandFind extends TC001_Location{
	
	@Test(priority=3)
	public void searchCarWash() throws InterruptedException, IOException {
		GymandSearchPage gs = new GymandSearchPage(driver);
		ScreenShots sc = new ScreenShots(driver);
		Thread.sleep(3000);
		sc.screenshot("SearchPage.png");
		gs.searchText();
	}
	
	@Test(priority=4)
	public void carWashDetails() throws InterruptedException, IOException {
		CarWashPage cp = new CarWashPage(driver);
		ScreenShots sc = new ScreenShots(driver);
		Thread.sleep(3000);
//		sc.screenshot("CarWashPage.png");
		cp.displayDetails();
		logger.info("--//Top 5 car wash services displyed//--");
		//cp.writeReview();
		Thread.sleep(3000);
		//logger.info("--//Review given//--");
		//sc.screenshot("ReviewPage.png");
		navigateBack();
	}
	
	/*@Test(priority=5)
	public void shareDetails() throws InterruptedException, IOException {
		CarWashPage cp = new CarWashPage(driver);
		cp.shareFB();
		cp.shareTwitter();
		cp.reportButton();
		logger.info("--//Shared and Reported//--");
//		driver.navigate().back();
//		navigateBack();
		cp.clickBack();
	}*/

}
