package Utilities;



import java.util.concurrent.TimeUnit;
/**
 * 
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


/**
 * This class for creating Driver
 * @author ulan_
 *
 */
public class Browser {

	/**
	 * 
	 */
private static WebDriver  driver;
	
	public static WebDriver getDriver() {
		
		if(driver == null || ((RemoteWebDriver)driver).getSessionId() == null) {
			
		
				if(config.getProperyValue("browser").equalsIgnoreCase("chrome")) {
					 System.setProperty(config.getProperyValue("chromeDriver"), config.getProperyValue("chromePath"));
					 driver = new ChromeDriver();
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
				else if(config.getProperyValue("browser").equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", config.getProperyValue("ffPath"));
					driver = new FirefoxDriver();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
				
				else {
					 System.setProperty("webdriver.chrome.driver", config.getProperyValue("chromePath"));
					 driver = new ChromeDriver();
					 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
		
	}
		return driver;
	}

	}
