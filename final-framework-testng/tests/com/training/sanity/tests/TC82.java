package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.TC82POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC82 {

	private WebDriver driver;
	private TC82POM CoursePOM;
	private LoginPOM loginPOM;
	private static Properties properties;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		CoursePOM = new TC82POM(driver); 
				
	}
	@Test
	public void validLoginTest() {
		
		loginPOM.LoginUser ("admin", "admin@123");
		
		System.out.println("Login test passed");
	
		 
		CoursePOM = new TC82POM(driver); 
	}	
	
	@Test
	public void validCourse() {
		CoursePOM.clickAdministration();
		CoursePOM.clickCousrse_list();
		CoursePOM.clicktitle();
		CoursePOM.clickTests();
		CoursePOM.clickCreate_test();
		CoursePOM.sendtest_Name("online quiz");
		CoursePOM.clickAdvanced_settings();
		CoursePOM.sendGive_context_test("quiz");
		CoursePOM.clickAt_end_of_test();
		CoursePOM.clickEnable_start_time();
		CoursePOM.sendpass_percentage("50");
		CoursePOM.clickProceed_to_questions();
		CoursePOM.clickMultiple_choice();
		CoursePOM.sendquestionName("which course your learning");
		CoursePOM.sendOption1("selenium");
		CoursePOM.sendOption2("java");
		CoursePOM.sendOption3("c");
		CoursePOM.sendOption4("c#");
		CoursePOM.clickOption1_button();
		CoursePOM.clickadd_This_Question();
		CoursePOM.clickback_icon();
		CoursePOM.clickMultiple_choice1();
		CoursePOM.sendquestionName1("which language are you using in selenium");
		CoursePOM.sendOption1_2("python");
		CoursePOM.sendOption2_2("java");
		CoursePOM.sendOption3_2("c");
		CoursePOM.sendOption4_2("c#");
		CoursePOM.clickOption2_button();
		CoursePOM.clickadd_This_Question1();
		CoursePOM.clickpreview();
		
	}
	@Test
	public void validLoginTest() {
		
		loginPOM.LoginUser ("admin", "admin@123");
		
		System.out.println("Login test passed");
	
		 
		CoursePOM = new TC82POM(driver); 
	}	

	@Test
	public void validCourse_catalog() {
		CoursePOM.clickMy_courses();
		CoursePOM.clickCourse_catalog();
		CoursePOM.sendsearch_term("selenium");
		CoursePOM.clicksearch();
		CoursePOM.clickSubscribe();
	}
	
	
	@Test
	public void validLoginTest() {
		
		loginPOM.LoginUser ("admin", "admin@123");
		
		System.out.println("Login test passed");
	
		 
		CoursePOM = new TC82POM(driver); 
	}

	@Test
	public void validReporting() {
		CoursePOM.clickReporting();
		CoursePOM.clickFollowed_students();
		CoursePOM.clickarrow();
		CoursePOM.clickCourse_Name();	
	}
}
