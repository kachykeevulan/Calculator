package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
	 WebDriver driver;
	
	public CalculatorPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
			
		}
	@FindBy(className="billLabel" )
	public WebElement billLabel;
	
	public boolean isAt(WebDriver Driver) {
		return driver.getTitle().equals("Amazon Web Services Simple Monthly Calculator");
		
		
		
	}
	public double getMontlyBill() {
		return Double.parseDouble(billLabel.getText().split("$ ")[1].replace(")", ""));
		
		
	}
	

}
