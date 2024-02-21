package com.qa.sportshoes.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.sportshoes.base.TestBase;
public class RegisterPage extends TestBase {
	
	@FindBy(xpath="//*[@id='name']")
	WebElement registerName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement registerEmail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement registerPassword;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement registerBtn;
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void register_user()
	{
		registerName.sendKeys("Arya");
		registerEmail.sendKeys("arya@gmail.com");
		registerPassword.sendKeys("arya@123");
		registerBtn.click();
	}
	
	public void validate_url()
	{
		String expectedURL = "http://localhost:9010/register-user";
		String RegisterPageURL = driver.getCurrentUrl();
		Assert.assertEquals(RegisterPageURL, expectedURL);
	}
	
	
}
