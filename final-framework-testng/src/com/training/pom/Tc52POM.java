package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tc52POM {
@SuppressWarnings("unused")
private WebDriver driver; 
	
	public Tc52POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	public static final String clickCourse = null;

	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement Administration;
	
	@FindBy(xpath="//div[@id='tabs-4']")
	private WebElement Sessions_categories_list;
			
	@FindBy(xpath="//div[@class=actions]/a")
	private WebElement Add_category_icon;
	
	@FindBy(name="name")
	private WebElement categoryName;
	
	@FindBy(xpath="//button[@name='submit']") 
	private WebElement Add_category_button;
	
	@FindBy(xpath="//div/form/table/tbody/tr[2]/td[1]]") 
	private WebElement Session_List_link;

	@FindBy(xpath="//div[@class='actions']/a[1]/img") 
	private WebElement Add_training_session_icon;
	
	@FindBy(id="add_session")
	private WebElement sessionName;
	
	@FindBy(xpath="//span[@class='select2-selection__arrow']")
	private WebElement coachName;
		
	@FindBy(id="advanced_params")
	private WebElement Advance_settings;
	
	@FindBy(xpath="//div[@class='filter-option']") 
	private WebElement sessions_category;
	
	@FindBy(xpath="//button[@name='submit']") 
	private WebElement Next;

	@FindBy(xpath="driver.findElement(By.id('Origin'))") 
	private WebElement Select_value;
	/*Select courses = new Select(driver.findElement(By.id("Origin")));

	courses.selectByValue("73"); 
	courses.selectByValue("257"); */
	
	@FindBy(xpath="//button[@class='btn btn-primary']") 
	private WebElement Right_arrow;
	
	@FindBy(xpath="//button[@class='btn btn-success']") 
	private WebElement Next_step;
	
	@FindBy(id="user_to_add")
	private WebElement subscribe_user;
	
	@FindBy(xpath="//div[@id='ajax_list_users_single']/a")
	private WebElement Student_name;
	
	@FindBy(xpath="//button[@class='btn btn-success']") 
	private WebElement Finish;

	
	public void clickAdministration() {
		// TODO Auto-generated method stub
		this.Administration.click();
	} 
	public void clickSessions_categories_list() {
		// TODO Auto-generated method stub
		this.Sessions_categories_list.click();
	} 
	public void clickAdd() {
		// TODO Auto-generated method stub
		this.Add_category_icon.click();
	} 
	public void sendCategoryName(String categoryName) {
		this.categoryName.clear();
		this.categoryName.sendKeys(categoryName);
	}
	public void clickcategory() {
		// TODO Auto-generated method stub
		this.Add_category_button.click();	
	}
	public void clicksession() {
		// TODO Auto-generated method stub
		this.Session_List_link.click();
	}
	public void clicktraining() {
		// TODO Auto-generated method stub
		this.Add_training_session_icon.click();
	}
	public void sessionName(String categoryName) {
		this.sessionName.clear();
		this.sessionName.sendKeys(categoryName);
	}
	public void clickAdvance_settings() {
		// TODO Auto-generated method stub
		this.Advance_settings.click();
	}
	public void sessions_category(String categoryName) {
		this.sessions_category.clear();
		this.sessions_category.sendKeys(categoryName);
	}
	public void clickNext() {
		// TODO Auto-generated method stub
		this.Next.click();
	}
	public void selectvalue() {
		// TODO Auto-generated method stub
		this.Next.click();
	}	
	public void Select_value(String Selectvalue) {
		this.Select_value.clear();
		this.Select_value.selectByValue("73");
		this.Select_value.selectByValue("257");
	}
	public void clickRight_arrow() {
		// TODO Auto-generated method stub
		this.Right_arrow.click();
	}
	public void clickNext_step() {
		// TODO Auto-generated method stub
		this.Next_step.click();
	}
	public void subscribe_user(String subscribe_user) {
		this.subscribe_user.clear();
		this.subscribe_user.sendKeys(subscribe_user);
	}
	public void clickStudent_name() {
		// TODO Auto-generated method stub
		this.Student_name.click();
	}
	public void clickFinish() {
		// TODO Auto-generated method stub
		this.Finish.click();
	}
}
