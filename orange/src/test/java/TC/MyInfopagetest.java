package TC;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Dashboardpage;
import pages.Loginpage;
import pages.MyInfoPage;


public class MyInfopagetest {
	Loginpage lp;
	Dashboardpage dp;
	MyInfoPage mip;


		@BeforeMethod
		public void browserSetup() {
			lp = new Loginpage();
			lp.initialization();	
	}
		@Test
		public void MyInfoPage () {
			dp = lp.login();
			mip = dp.getMyInfoPage();
			
		}
		@Test
		public void ImmigrationisPresent() {
			dp= lp.login();
			mip=dp.getMyInfoPage();
	
		}
@Test

public void validate_fill_Immigration() {
	
	dp = lp.login();
	mip = dp.getMyInfoPage();
	mip.addbutton();
	mip.document();
	mip.number();
	mip.issuedate();
	mip.expirydate();
	mip.Eligibilitystatus();
	mip.issuedby();
	mip.eligibleReviewDate();
	mip.comment();
	mip.save();
	mip.addattachment();
	mip.attacmentsubmit();
}
@AfterMethod
public void closeSetup() {
	//lp.tearDown();
}

}
