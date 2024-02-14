package utilityFiles;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import testBase.BaseClass;

public class ScreenShots extends BaseClass {
	
	WebDriver driver;
	
	public ScreenShots(WebDriver driver) {
		this.driver = driver;
	}
	
	public  void screenshot(String a) throws IOException {
		TakesScreenshot tshot = (TakesScreenshot)driver;

		File sourceFile = tshot.getScreenshotAs(OutputType.FILE);

		//File targetFile = new File("C:\\Users\\2303446\\eclipse-workspace\\CAS_Project\\Screenshots\\"+a);
		File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\"+a);
		
		FileUtils.copyFile(sourceFile, targetFile);

	}

}
