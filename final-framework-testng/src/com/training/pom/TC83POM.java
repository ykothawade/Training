package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC83POM {
private WebDriver driver; 
	
	public TC83POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	public static final String clickCourse = null;

	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement Administration;
	
	@FindBy(xpath="//a[contains(text(),'Add a user')]")
	private WebElement Add_user;
			
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="username")
	private WebElement login;
	
	@FindBy(xpath="//label/input[@id='qf_382502']") 
	private WebElement enter_password;
		
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//a/span[contains(text(),'Trainer')]") 
	private WebElement profile;
		
	@FindBy(xpath="//button[@name='submit']") 
	private WebElement Add;

	
	public void clickAdministration() {
		// TODO Auto-generated method stub
		this.Administration.click();
	} 
	public void clickAdd_user() {
		// TODO Auto-generated method stub
		this.Add_user.click();
	} 
	public void sendfirstName(String firstName) {
		this.firstName.clear();
		this.firstName.sendKeys(firstName);
	}
	public void sendlastName(String lastName) {
		this.lastName.clear();
		this.lastName.sendKeys(lastName);
	}
	public void sendemail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	public void sendphone(String phone) {
		this.phone.clear();
		this.phone.sendKeys(phone);
	}
	public void sendusername(String username) {
		this.login.clear();
		this.login.sendKeys(username);
	}
	public void clickenter_password() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//label/input[@id='qf_382502']")).isSelected();
	} 
	public void sendpassword(String password) {
		this.password.clear();
		this.password.sendKeys(password);
	}
	public void profile(String profile) {
		this.profile.clear();
		((TC83POM) this.profile).profile("Trainer");
	}
	public void clickAdd() {
		// TODO Auto-generated method stub
		this.Add.click();
	}
}
