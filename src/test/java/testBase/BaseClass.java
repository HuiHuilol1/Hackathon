package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	public Properties p;
	public int choice;
	public Logger logger;
	Scanner sc;
	
	@BeforeClass
	public void setup() throws IOException {
		//loading properties file
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p = new Properties();
		p.load(file);
		
		
		logger = LogManager.getLogger(this.getClass());
		
		sc = new Scanner(System.in);

					    //choosing browser

						System.out.println("Press 1 : Chrome ");

						System.out.println("Press 2 : Edge ");

						System.out.println("Press 3 : Exit ");

						choice = sc.nextInt();

						//Switch Case to Choose the browser

						switch(choice) {

						case 1: 

							driver = new ChromeDriver();     //  Launch Chrome

							break;

						case 2:

							driver = new EdgeDriver();		 // Launch Edge 

							break;

						case 3:

							System.out.println("Program Closed");

							System.exit(0);

							break;

						default:

							System.out.println("Please Select the correct choice");

							System.exit(0);

						}
	
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
//	@FindBy(xpath = "//div[@id='pushengage-subscription-overlay-close-button']") WebElement popup;
//	public void closePopup() throws InterruptedException {
////		if(popup.isDisplayed()) {
//		Thread.sleep(2000);
//		popup.click();
//		Thread.sleep(1000);
//	}
////	}
	
	public void navigateBack() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(3000);
	}

}
