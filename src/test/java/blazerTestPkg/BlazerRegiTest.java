package blazerTestPkg;

import org.testng.annotations.Test;

import blazeBaseClass.BlazerBase;
import blazePgPkg.BlazerRegister;

public class BlazerRegiTest extends BlazerBase {
	@Test
	public void testBlazerLogin() throws Exception {
		BlazerRegister bla=new BlazerRegister(driver);
		bla.registerClickLink();
		bla.regiDetails();
		bla.registerClick();
	}
}
