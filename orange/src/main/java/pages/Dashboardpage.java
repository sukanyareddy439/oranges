package pages;
import org.openqa.selenium.By;

import Base.base;


public class Dashboardpage extends base {
	public MyInfoPage getMyInfoPage() {
		driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
	return new MyInfoPage();
	}
}
