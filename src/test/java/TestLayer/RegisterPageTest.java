package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

public class RegisterPageTest extends BaseClass{
	
	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}
	
	@Test
	public void validateRegisterFunctionality() {
		WebElement fname = driver.findElement(By.name("firstname"));
		Boolean fDisplayed = fname.isDisplayed();
		Assert.assertEquals(fDisplayed, true);
		
		Boolean fEnabled = fname.isEnabled();
		Assert.assertEquals(fEnabled, true);
		
		fname.sendKeys("Vaishali");
		
		WebElement llastname = driver.findElement(By.name("lastname"));
		Boolean lDisplayed = llastname.isDisplayed();
		Assert.assertEquals(lDisplayed, true);
		
		Boolean lEnabled = llastname.isEnabled();
		Assert.assertEquals(lEnabled,true);
		
		llastname.sendKeys("Deshmukh");
		
		WebElement username = driver.findElement(By.name("reg_email__"));
		Boolean uDisplayed = username.isDisplayed();
		Assert.assertEquals(uDisplayed, true);
		
		Boolean uEnabled = username.isEnabled();
		Assert.assertEquals(uEnabled, true);
		
		username.sendKeys("vaishu@gmail.com");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		Boolean pDisplayed = password.isDisplayed();
		Assert.assertEquals(true, pDisplayed);
		
		Boolean pEnabled = password.isEnabled();
		Assert.assertEquals(true, pEnabled);
		
		password.sendKeys("vaishu1234");
		
		WebElement dateDp = driver.findElement(By.name("birthday_day"));
		Boolean dateDisplayed = dateDp.isDisplayed();
		Assert.assertEquals(true, dateDisplayed);
		
		Boolean dateEnabled = dateDp.isEnabled();
		Assert.assertEquals(true, dateEnabled);
		
		Select selDate = new Select(dateDp);
		selDate.selectByVisibleText("10");
		
		WebElement monthDp = driver.findElement(By.name("birthday_month"));
		Boolean mDisplayed = monthDp.isDisplayed();
		Assert.assertEquals(true, mDisplayed);
		
		Boolean mEnabled = monthDp.isEnabled();
		Assert.assertEquals(true, mEnabled);
		
		Select selMonth = new Select(monthDp);
		selMonth.selectByVisibleText("May");
		
		WebElement yearDp = driver.findElement(By.name("birthday_year"));
		Boolean yDisplayed = yearDp.isDisplayed();
		Assert.assertEquals(true, yDisplayed);
		
		Boolean yEnabled = yearDp.isEnabled();
		Assert.assertEquals(true, yEnabled);
		
		Select selYear = new Select(yearDp);
		selYear.selectByVisibleText("2010");
						
	}
	@AfterTest
	public void tearDown()
	{
}

}
