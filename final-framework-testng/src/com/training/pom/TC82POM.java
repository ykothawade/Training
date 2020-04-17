package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC82POM {
private WebDriver driver; 
	
	public TC82POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	public static final String clickCourse = null;

	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement Administration;
	
	@FindBy(xpath="//a[contains(text(),'Course list')]")
	private WebElement Cousrse_list;
			
	@FindBy(xpath="//td[@class='title']")
	private WebElement title;
	
	@FindBy(xpath="//a[contains(text(),'Tests')]")
	private WebElement Tests;
	
	@FindBy(xpath="//a[contains(text(),' Create a new test')]")
	private WebElement Create_test;
	
	@FindBy(name="exerciseTitle")
	private WebElement test_Name;
	
	@FindBy(xpath="//button[@id='advanced_params']")
	private WebElement  Advanced_settings;
		
	@FindBy(xpath="//div[@id='cke_1_contents']/iframe")
	private WebElement Give_context_test;
	
	@FindBy(xpath="//label/input[@id='exerciseType_0']")
	private WebElement At_end_of_test;
	
	@FindBy(xpath="//label/input[@name='activate_start_date_check']") 
	private WebElement Enable_start_time;
	
	@FindBy(name="pass_percentage")
	private WebElement pass_percentage;
		
	@FindBy(xpath="//button[@name='submitExercise']") 
	private WebElement Proceed_to_questions;
	
	@FindBy(xpath="//a/img[@title='Multiple choice']") 
	private WebElement Multiple_choice;
	
	@FindBy(name="questionName")
	private WebElement questionName;

	@FindBy(xpath="//div[@id='cke_2_contents']/iframe")
	private WebElement Option1;
	
	@FindBy(xpath="//div[@id='cke_4_contents']/iframe")
	private WebElement Option2;
	
	@FindBy(xpath="//div[@id='cke_6_contents']/iframe")
	private WebElement Option3;
	
	@FindBy(xpath="//div[@id='cke_8_contents']/iframe")
	private WebElement Option4;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[2]/input[@id='qf_3f1e48']")
	private WebElement Option1_button;
	
	@FindBy(xpath="//button[@name='submitQuestion']") 
	private WebElement add_This_Question;
	
	@FindBy(xpath="//a/img[@title='Go back to the questions list']")
	private WebElement back_icon;
	
	@FindBy(xpath="//a/img[@title='Multiple choice']") 
	private WebElement Multiple_choice1;
	
	@FindBy(name="questionName")
	private WebElement questionName1;
	
	@FindBy(xpath="//div[@id='cke_3_contents']/iframe")
	private WebElement Option1_2;
	
	@FindBy(xpath="//div[@id='cke_5_contents']/iframe")
	private WebElement Option2_2;
	
	@FindBy(xpath="//div[@id='cke_7_contents']/iframe")
	private WebElement Option3_2;
	
	@FindBy(xpath="//div[@id='cke_9_contents']/iframe")
	private WebElement Option4_2;
	
	@FindBy(xpath="//table/tbody/tr[2]/td[2]/input[@id='qf_b907a2']")
	private WebElement Option2_button;
	
	@FindBy(xpath="//button[@name='submitQuestion']") 
	private WebElement add_This_Question1;
	
	@FindBy(xpath="//a[2]/img[@title='Preview']") 
	private WebElement preview;
	
	@FindBy(xpath="//a[contains(text(),'My courses')]")
	private WebElement My_courses;
	
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
	
	public void clickAdministration() {
		// TODO Auto-generated method stub
		this.Administration.click();
	} 
	public void clickCousrse_list() {
		// TODO Auto-generated method stub
		this.Cousrse_list.click();
	} 
	public void clicktitle() {
		this.title.click();
	}
	public void clickTests() {
		// TODO Auto-generated method stub
		this.Tests.click();
	}
	public void clickCreate_test() {
		// TODO Auto-generated method stub
		this.Create_test.click();
	}
	public void sendtest_Name(String testName) {
		this.test_Name.clear();
		this.test_Name.sendKeys(testName);
	}
	public void clickAdvanced_settings() {
		// TODO Auto-generated method stub
		this.Advanced_settings.click();
	}
	public void sendGive_context_test(String Give_context_test) {
		this.Give_context_test.clear();
		this.Give_context_test.sendKeys("//body/p");
	}
		public void clickAt_end_of_test() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//label/input[@id='exerciseType_0']")).isSelected();
	} 
		public void clickEnable_start_time() {
			// TODO Auto-generated method stub
			driver.findElement(By.xpath("//label/input[@name='activate_start_date_check']")).isSelected();
	}
		public void sendpass_percentage(String pass_percentage) {
			this.pass_percentage.clear();
			this.pass_percentage.sendKeys(pass_percentage);
	}
	    public void clickProceed_to_questions() {
		// TODO Auto-generated method stub
		this.Proceed_to_questions.click();
	}
	    public void clickMultiple_choice() {
			// TODO Auto-generated method stub
			this.Multiple_choice.click();
	}
	    public void sendquestionName(String questionName) {
			this.questionName.clear();
			this.questionName.sendKeys(questionName);
	}
	    public void sendOption1(String Option1) {
			this.Option1.clear();
			this.Option1.sendKeys("//body/p");
	}
	    public void sendOption2(String Option2) {
				this.Option2.clear();
				this.Option2.sendKeys("//body/p");
	}
	    public void sendOption3(String Option3) {
			this.Option3.clear();
			this.Option3.sendKeys("//body/p");
	}
	    public void sendOption4(String Option4) {
				this.Option4.clear();
				this.Option4.sendKeys("//body/p");
	}
	    public void clickOption1_button() {
			// TODO Auto-generated method stub
			driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/input[@id='qf_3f1e48']")).isSelected();
	} 
	    public void clickadd_This_Question() {
			// TODO Auto-generated method stub
			this.add_This_Question.click();
	}
	    public void clickback_icon() {
			// TODO Auto-generated method stub
			this.back_icon.click();
	}
	    public void clickMultiple_choice1() {
				// TODO Auto-generated method stub
				this.Multiple_choice1.click();
		}
		    public void sendquestionName1(String questionName1) {
				this.questionName1.clear();
				this.questionName1.sendKeys(questionName1);
		}
		    public void sendOption1_2(String Option1_2) {
				this.Option1_2.clear();
				this.Option1_2.sendKeys("//body/p");
		}
		    public void sendOption2_2(String Option2_2) {
					this.Option2_2.clear();
					this.Option2_2.sendKeys("//body/p");
		}
		    public void sendOption3_2(String Option3_2) {
				this.Option3_2.clear();
				this.Option3_2.sendKeys("//body/p");
		}
		    public void sendOption4_2(String Option4_2) {
					this.Option4_2.clear();
					this.Option4_2.sendKeys("//body/p");
		}
		    public void clickOption2_button() {
				// TODO Auto-generated method stub
				driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/input[@id='qf_3f1e48']")).isSelected();
		} 
		    public void clickadd_This_Question1() {
				// TODO Auto-generated method stub
				this.add_This_Question1.click();
		}
	    public void clickpreview() {
			// TODO Auto-generated method stub
			this.preview.click();
	    }
	    public void clickMy_courses() {
			// TODO Auto-generated method stub
			this.My_courses.click();
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
