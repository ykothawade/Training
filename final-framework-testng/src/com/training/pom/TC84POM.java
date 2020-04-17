package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TC84POM {
private WebDriver driver; 
	
	public TC84POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	public static final String clickCourse = null;

	@FindBy(xpath="//a[contains(text(),'My courses')]")
	private WebElement My_courses;
	
	@FindBy(xpath="//a[contains(text(),'Create a course')]")
	private WebElement Create_course;
			
	@FindBy(name="title")
	private WebElement course_Name;
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement  Advanced_settings;
	
	@FindBy(xpath="//div[@class='dropdown-menu open']") 
	private WebElement Category;

	@FindBy(name="wanted_code")
	private WebElement Course_code;
	
	@FindBy(xpath="//div[@class='inner open']") 
	private WebElement Language;
	
	@FindBy(xpath="//button[@name='submit']") 
	private WebElement add_course_submit;
	
	@FindBy(xpath="//a[@title='Add an introduction text']")
	private WebElement add_introduction;
	
	@FindBy(xpath="//div[@id='cke_1_contents']/iframe")
	private WebElement introduction;
	
	@FindBy(xpath="//button[@name='intro_cmdUpdate']")
	private WebElement Save_intro_text;
	
	@FindBy(xpath="//a[contains(text(),'Course description')]")
	private WebElement Course_description;

	@FindBy(xpath="//a/img[@title='Description']")
	private WebElement Description ;
	
	@FindBy(name="title")
	private WebElement title;
	
	@FindBy(xpath="//div[@id='cke_1_contents']/iframe")
	private WebElement content;
	
	@FindBy(xpath="//button[@name='submit']") 
	private WebElement save;
	
	@FindBy(xpath="//a/img[@title='Objectives']")
	private WebElement Objectives ;
	
	@FindBy(name="title")
	private WebElement title1;
	
	@FindBy(xpath="//div[@id='cke_1_contents']/iframe")
	private WebElement content1;
	
	@FindBy(xpath="//button[@name='submit']") 
	private WebElement save1;
	
	@FindBy(xpath="//a/img[@title='Topics']")
	private WebElement Topics ;
	
	@FindBy(name="title")
	private WebElement title2;
	
	@FindBy(xpath="//div[@id='cke_1_contents']/iframe")
	private WebElement content2;
	
	@FindBy(xpath="//button[@name='submit']") 
	private WebElement save2;
	
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
	private WebElement Course_catalog;
	
	@FindBy(name="search_term")
	private WebElement search_term;
	
	@FindBy(xpath="//button[@type='submit']") 
	private WebElement search;
	
	@FindBy(xpath="//a[contains(text(),'Subscribe')]")
	private WebElement Subscribe;
	
	@FindBy(xpath="//a[contains(text(),'Reporting')]")
	private WebElement Reporting;
	
	@FindBy(xpath="//a[contains(text(),'Followed students')]")
	private WebElement Followed_students;
	
	@FindBy(xpath="//img[@title = 'Details mausam123']")
	private WebElement arrow;
	
	@FindBy(xpath="//a[contains(text(),'SELENIUM1')]")
	private WebElement Course_Name;
	
	
		public void clickMy_courses() {
			// TODO Auto-generated method stub
			this.My_courses.click();
	} 
		public void clickCreate_course() {
		// TODO Auto-generated method stub
			this.Create_course.click();
	} 
		public void sendcourse_Name(String course_Name) {
			this.course_Name.clear();
			this.course_Name.sendKeys(course_Name);
	}
		public void clickAdvanced_settings() {
		// TODO Auto-generated method stub
			this.Advanced_settings.click();
	}
		public void sendCategory(String Category) {
			this.Category.clear();
			this.Category.sendKeys(Category);
			@SuppressWarnings("unused")
			Select Category1 = new Select(driver.findElement(By.id("Project")));
	}
		public void sendCourse_code(String Course_code) {
			this.Course_code.clear();
			this.Course_code.sendKeys(Course_code);
	}
		public void sendLanguage(String Language) {
			this.Language.clear();
			this.Language.sendKeys(Language);
			@SuppressWarnings("unused")
			Select Language1 = new Select(driver.findElement(By.id("English")));
	}
		public void clickadd_course_submit() {
		// TODO Auto-generated method stub
			this.add_course_submit.click();
	}
		public void clickadd_introduction() {
			this.add_introduction.click();
	}
		public void sendintroduction(String introduction) {
			this.introduction.clear();
			this.introduction.sendKeys("//body/p");
	}
		public void clickSave_intro_text() {
		// TODO Auto-generated method stub
			this.Save_intro_text.click();
	}
		public void clickCourse_description() {
		// TODO Auto-generated method stub
			this.Course_description.click();
	}
		public void clickDescription() {
		// TODO Auto-generated method stub
			this.Description.click();
	}
	 	public void sendtitle(String title) {
			this.title.clear();
			this.title.sendKeys(title);
	}
	 	public void sendcontent(String content) {
			this.content.clear();
			this.content.sendKeys("//body/p");
	}
	    public void clicksave() {
			// TODO Auto-generated method stub
	    	this.save.click();
	} 
	    public void clickObjectives() {
			// TODO Auto-generated method stub
			this.Objectives.click();
	}
	    public void sendtitle1(String title1) {
			this.title1.clear();
			this.title1.sendKeys(title1);
	}
	    public void sendcontent1(String content1) {
			this.content1.clear();
			this.content1.sendKeys("//body/p");
	}
	    public void clicksave1() {
			// TODO Auto-generated method stub
	    	this.save1.click();
	} 
	    public void clickTopics() {
			// TODO Auto-generated method stub
			this.Topics.click();
	}
	    public void sendtitle2(String title1) {
			this.title2.clear();
			this.title2.sendKeys(title1);
	}
	    public void sendcontent2(String content1) {
			this.content2.clear();
			this.content2.sendKeys("//body/p");
	}
	    public void clicksave2() {
			// TODO Auto-generated method stub
	    	this.save2.click();
	} 
	    public void clickCourse_catalog() {
			// TODO Auto-generated method stub
			this.Course_catalog.click();	
	} 
	    public void sendsearch_term(String search_term) {
			this.search_term.clear();
			this.search_term.sendKeys(search_term);
	}
	    public void clicksearch() {
			// TODO Auto-generated method stub
			this.search.click();
	}
	    public void clickSubscribe() {
			// TODO Auto-generated method stub
			this.Subscribe.click();
	}
	    public void clickReporting() {
			// TODO Auto-generated method stub
			this.Reporting.click();
	} 
	    public void clickFollowed_students() {
			// TODO Auto-generated method stub
			this.Followed_students.click();
	} 
	    public void clickarrow() {
			// TODO Auto-generated method stub
			this.arrow.click();
	}
	    public void clickCourse_Name() {
			// TODO Auto-generated method stub
			this.Course_Name.click();
	}
}
