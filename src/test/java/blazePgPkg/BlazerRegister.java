package blazePgPkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazerRegister {
	WebDriver driver;
	
	 @FindBy(xpath="//*[@id=\"app-navbar-collapse\"]/ul[2]/li[2]/a")
	 WebElement regiLink;
	 
	 @FindBy(xpath="//*[@id=\"name\"]")
	 WebElement name;
	 
	 @FindBy(xpath="//*[@id=\"company\"]")
	 WebElement company;
	 
	 @FindBy(xpath="//*[@id=\"email\"]")
	 WebElement email;
	 
	 
	 @FindBy(xpath="//*[@id=\"password\"]")
	 WebElement passwrd;
	 
	 @FindBy(xpath="//*[@id=\"password-confirm\"]")
	 WebElement confirmpasswrd;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")
	 WebElement regiButton;
	 
	 
	 public BlazerRegister(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
	 public void registerClickLink() {
			regiLink.click();	
		}
		
		public void regiDetails() {
			name.sendKeys("Julie");	
			company.sendKeys("sdas");	
			email.sendKeys("juliejose95@gmail.com");	
			passwrd.sendKeys("sfdsf12@");
			confirmpasswrd.sendKeys("sfdsf12@");
		}
		
		 public void registerClick() {
				regiButton.click();	
			}
}
