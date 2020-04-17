package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeletePOM {
private WebDriver driver; 
	
	public DeletePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	public static final String clickCourse = null;

	

	@FindBy(xpath="//*[@id='navbar']/ul[1]/li[7]/a")
	private WebElement Administration;
	
	
	@FindBy(xpath="//*[@id='tabs-2']/div/div[2]/div[2]/ul/li[1]/a")
	private WebElement Course_list;
	
		
	@FindBy(xpath="//*[@id='course-list']/tbody/tr[2]/td[8]/a[6]/img")
	private WebElement Delete;

	public void clickAdministration() {
		// TODO Auto-generated method stub
		this.Administration.click();
		
	} 
	public void clickCourse_list() {
		// TODO Auto-generated method stub
		this.Course_list.click();
		
	} 
	public void clickDelete() {
		// TODO Auto-generated method stub
		this.Delete.click();
		
	} 
	public void clickok() {
		// TODO Auto-generated method stub
		Alert alt = driver.switchTo().alert(); 
		alt.accept();
		
	}
	
	
}
