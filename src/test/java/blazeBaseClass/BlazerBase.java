package blazeBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BlazerBase {
	public static WebDriver driver;//static makes common to all class

	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}
}
