package TC;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Dashboardpage;
import pages.Loginpage;


public class DashboardpageTest {
	Loginpage lp;
	Dashboardpage dp;


	@BeforeMethod
	public void browserSetup() {
		lp = new Loginpage();
		lp.initialization();
	}
//
//	@Test
//	public void validateTimeWorkSectionPresent() {
//		dp = lp.login();
//		Assert.assertTrue(dp.getTimeWorkSectionPresent());
//	}

	public void validateMyInfoispresent() {
		dp = lp.login();
		
	}
	@AfterMethod
	public void closeSetup() {
		lp.tearDown();
	}
}
