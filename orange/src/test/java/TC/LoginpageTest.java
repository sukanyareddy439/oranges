package TC;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Dashboardpage;
import pages.Loginpage;

public class LoginpageTest {
	Loginpage lp;
	Dashboardpage dpj;

	@BeforeMethod
	public void browserSetup() {
		lp = new Loginpage();
		lp.initialization();
	}

	@Test
	public void validateTitleTest() {
		String expTitle = "OrangeHRM";
		String actTitle = lp.getTitle();
		Assert.assertEquals(actTitle, expTitle);
	}

	@Test
	public void validateUserNameFieldPresent() {
		Assert.assertTrue(lp.getUserNameFieldPresent());
	}

	@Test
	public void validatePasswordFieldPresent() {
		Assert.assertTrue(lp.getPasswordFieldPresent());
	}


	@AfterMethod
	public void closeBrowserSetup() {
		lp.tearDown();
	}

}



