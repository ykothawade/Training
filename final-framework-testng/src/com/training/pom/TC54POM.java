package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC54POM {
@SuppressWarnings("unused")
private WebDriver driver; 
	
	public TC54POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	public static final String clickCourse = null;

	@FindBy(xpath="//a[contains(text(),'Reporting')]")
	private WebElement Reporting;
	
	@FindBy(xpath="//a[contains(text(),'Followed teachers')]")
	private WebElement Followed_teacher;
			
	@FindBy(name="keyword")
	private WebElement keyword;
	
	@FindBy(xpath="//button[@name='submit']") 
	private WebElement Search;
	
	@FindBy(xpath="//a[@id ='details_manzoor']/img") 
	private WebElement Teacher_icon;
	
	@FindBy(xpath="//img[@title='Details manzoor']") 
	private WebElement details_icon;
	
	@FindBy(xpath="//img[@title='Login as']") 
	private WebElement Login;
	
	@FindBy(xpath="//a[contains(text(),'My courses')]")
	private WebElement My_courses;
	
	@FindBy(xpath="//a[contains(text(),'Edit profile')]")
	private WebElement Edit_profile;
	
	@FindBy(id="extra_skype")
	private WebElement skype;
	
	@FindBy(xpath="//button[@name='apply_change']") 
	private WebElement Save_settings;

	public void clickReporting() {
		// TODO Auto-generated method stub
		this.Reporting.click();
	} 
	public void clickFollowed_teacher() {
		// TODO Auto-generated method stub
		this.Followed_teacher.click();
	} 
	public void sendkeyword(String keyword) {
		this.keyword.clear();
		this.keyword.sendKeys(keyword);
	}
	public void clicksearch() {
		// TODO Auto-generated method stub
		this.Search.click();	
	}
	public void clickTeacher_icon() {
		// TODO Auto-generated method stub
		this.Teacher_icon.click();
	}
	public void clickdetails_icon() {
		// TODO Auto-generated method stub
		this.details_icon.click();
	}
	public void clickLogin() {
		// TODO Auto-generated method stub
		this.Login.click();
	}
	public void clickMy_courses() {
		// TODO Auto-generated method stub
		this.My_courses.click();
	}
	public void clickEdit_profile() {
		// TODO Auto-generated method stub
		this.Edit_profile.click();
	}
	public void skype(String skype) {
		this.skype.clear();
		this.skype.sendKeys(skype);
	}
	public void clickSave_settings() {
		// TODO Auto-generated method stub
		this.Save_settings.click();
	}
}
