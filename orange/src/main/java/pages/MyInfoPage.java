package pages;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.base;

public class MyInfoPage extends base {
	public void Immigrationispresent() {
		driver.findElement(By.xpath("//a[normalize-space()='Immigration']")).click();

		}
	
public void addbutton() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions act = new Actions(driver);
	WebElement ab=driver.findElement(By.xpath("//button[@fdprocessedid='gznnn']"));
	ab.click();
	act.moveToElement(ab).doubleClick(ab).sendKeys(ab, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();	
	ab.sendKeys(prop.getProperty("addbutton"));
	
	//WebElement ab= driver.findElement(By.xpath("//button[@fdprocessedid='gznnn']")).click();
}
//document 
public void document() {
	driver.findElement(By.xpath("//label[normalize-space()='Document']"));
		//driver.findElement(By.xpath(i_loc.getProperty("document")));
	Actions act = new Actions(driver);
	WebElement radio1 =driver.findElement(By.xpath("//label[normalize-space()='Passport']"));
		//WebElement radio1 = driver.findElement(By.xpath(i_loc.getProperty("passport")));
	WebElement radio2 = driver.findElement(By.xpath("//label[normalize-space()='Visa']"));
		//WebElement radio2 = driver.findElement(By.xpath(i_loc.getProperty("visa")));
	radio1.click();
	act.moveToElement(radio1).doubleClick(radio1).sendKeys(radio1, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();	
	radio1.sendKeys(prop.getProperty("document"));
		
}
		//number
public void number() {
	Actions act = new Actions(driver);
	WebElement no = driver.findElement(By.xpath("//input[@fdprocessedid='ewjeca']"));
	no.click();
	act.moveToElement(no).doubleClick(no).sendKeys(no, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();	
	no.sendKeys(prop.getProperty("number"));
		//driver.findElement(By.xpath(i_loc.getProperty("number"))).sendKeys(i_loc.getProperty("i_number"));
		
}
		//ISSUE DATE
public void issuedate() {
	Actions act = new Actions(driver);
	WebElement id = driver.findElement(By.xpath("//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
	id.click();
	act.moveToElement(id).doubleClick(id).sendKeys(id, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();	
	id.sendKeys(prop.getProperty("issuedate"));
	
		//WebElement issuedDate = driver.findElement(By.xpath(i_loc.getProperty("issued_date")));
		//issuedDate.sendKeys(i_loc.getProperty("i_date"));
}
		//EXPIRY DATE
public void expirydate() {
	Actions act = new Actions(driver);
	WebElement ed =driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[3]//div[1]//div[2]//div[1]//div[1]//input[1]"));
	ed.click();	
	act.moveToElement(ed).doubleClick(ed).sendKeys(ed, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();	
	ed.sendKeys(prop.getProperty("expiryDate"));
	
	//	expiryDate.sendKeys(i_loc.getProperty("e_date"));
}
		//Eligibility Status
public void Eligibilitystatus() {
	Actions act = new Actions(driver);
	WebElement es=driver.findElement(By.xpath("//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//div[4]//div[1]//div[2]//input[1]"));
	es.click();	
	act.moveToElement(es).doubleClick(es).sendKeys(es, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();	
	es.sendKeys(prop.getProperty("Eligibilitystatus"));
			}
		//IssuedBy
public void issuedby() {
	Actions act = new Actions(driver);
	WebElement ib=driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
	ib.click();	
	act.moveToElement(ib).doubleClick(ib).sendKeys(ib, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();	
	ib.sendKeys(prop.getProperty("Eligibilitystatus"));

}
		//Eligiblity Review Date
		public void eligibleReviewDate() {
			Actions act = new Actions(driver);
		WebElement ed = driver.findElement(By.xpath("//input[@fdprocessedid='vdsuud']"));
		ed.click();
		act.moveToElement( ed).doubleClick( ed).sendKeys( ed, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();	
		 ed.sendKeys(prop.getProperty("eligibleReviewDate"));
		
		}
		//eligibleReviewDate.sendKeys(i_loc.getProperty("r_date"));
		//Comments
		public void comment() {	
			Actions act = new Actions(driver);
		WebElement co= driver.findElement(By.xpath("//textarea[@placeholder='Type Comments here']"));
		co.click();
		act.moveToElement(co).doubleClick(co).sendKeys(co, Keys.CONTROL,"a",Keys.BACK_SPACE).build().perform();	
		co.sendKeys(prop.getProperty("comment"));
		
		}
		//Save Button
	
		public void save() {		
		WebElement s=driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		s.click();
		
		}
		public  void addattachment() {
		    WebElement add =driver.findElement(By.xpath("//button[text()=' Add ']"));
			Actions act = new Actions(driver);
			act.moveToElement(add).click().build().perform();		
			
		}
		public void attacmentsubmit() {
			Actions act = new Actions(driver);
			WebElement savesub = driver.findElement(By.xpath("//div[@class='orangehrm-attachment']//descendant::button[@type='submit']"));

			act.moveToElement(savesub).click().build().perform();
			
			
		}
		
}

