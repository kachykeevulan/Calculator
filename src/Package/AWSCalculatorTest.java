package Package;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities.Browser;
import Utilities.config;

public class AWSCalculatorTest  {
	WebDriver driver;
@BeforeClass
  public void setup() {
	  driver=Browser.getDriver();
  
	  
  }
@Test(priority=1)
public void titleTest() {
	//String url="http://calculator.s3.amazonaws.com/index.html";
	driver.get(config.getProperyValue("url"));
	CalculatorPage a=new CalculatorPage(driver);
	a.isAt(driver);
	
}
@Test(priority=2)
public void MonthlyPymentTest() {
	driver.get(config.getProperyValue("url"));
	
}
  
}
