package DriverSetup;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
 
public class Driver {
	public static WebDriver driver;
	public static Properties prop;

	//To call different browsers
	public void driverSetup()
	{
		prop=new Properties();
		try 
		{
			prop.load(new FileInputStream("src\\test\\java\\Configure\\config.properties"));
		}	
		 catch (Exception e) 
		{
			e.printStackTrace();
		}
		//To Open Chrome Browser
		if(prop.getProperty("browserName").matches("chrome"))
		{
			driver=new ChromeDriver();
		}
		//To Open FireFox Browser
		if(prop.getProperty("browserName").matches("firefox"))
		{
			driver=new FirefoxDriver();
		}
		//To Open Edge Browser
		if(prop.getProperty("browserName").matches("edge"))
		{
			driver=new EdgeDriver();
		}

		//To maximize the Browser Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void closeBrowser()
	{
		driver.quit();
	}

 
}