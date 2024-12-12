package blazePgPkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazerLogin {
	WebDriver driver;
	 
	 @FindBy(xpath="//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a")
	 WebElement loginLink;
	 
	 @FindBy(xpath="//*[@id=\"email\"]")
	 WebElement emailAdd;
	 
	 @FindBy(xpath="//*[@id=\"password\"]")
	 WebElement passwrdd;
	 
	 @FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button")
	 WebElement loginButton;
	

	 String parent;

	public BlazerLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	public void loginLinkClick() {
		
		loginLink.click();
	}

  public void loginDetails() {
	  emailAdd.sendKeys("juliejose95@gmail.com");	
	  passwrdd.sendKeys("sfdsf12@");	
		
  }

	public void loginButtonClick() {
	loginButton.click();	
			
	}
		
	
	
}
