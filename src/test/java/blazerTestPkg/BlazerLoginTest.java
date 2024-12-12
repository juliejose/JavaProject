package blazerTestPkg;

import org.testng.annotations.Test;

import blazeBaseClass.BlazerBase;
import blazePgPkg.BlazerLogin;

public class BlazerLoginTest extends BlazerBase {
	@Test
	public void testBlazerLogin() throws Exception {
		BlazerLogin bla=new BlazerLogin(driver);
		bla.loginLinkClick();
		bla.loginDetails();
		bla.loginButtonClick();
	}
}
