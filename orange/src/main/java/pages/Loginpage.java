package pages;
import org.openqa.selenium.By;

import Base.base;


public class Loginpage extends base {
	public String getTitle() {
		return driver.getTitle();
	}

	public boolean getUserNameFieldPresent() {
		return driver.findElement(By.name("username")).isDisplayed();
	}

	public boolean getPasswordFieldPresent() {
		return driver.findElement(By.name("password")).isDisplayed();
	}

	public Dashboardpage login() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		return new Dashboardpage();
	}

}
