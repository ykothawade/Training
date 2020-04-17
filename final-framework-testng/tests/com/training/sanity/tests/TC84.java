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
import com.training.pom.TC84POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC84 {

	private WebDriver driver;
	private TC84POM CoursePOM;
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
		CoursePOM = new TC84POM(driver); 
				
	}
	@Test
	public void validLoginTest() {
		
		loginPOM.LoginUser ("admin", "admin@123");
		
		System.out.println("Login test passed");
	
		 
		CoursePOM = new TC84POM(driver); 
	}	
	
	@Test
	public void validCourse() {
		CoursePOM.clickMy_courses();
		CoursePOM.clickCreate_course();
		CoursePOM.sendcourse_Name("selenium");
		CoursePOM.clickAdvanced_settings();
		CoursePOM.sendCategory("Projects");
		CoursePOM.sendCourse_code("sel");
		CoursePOM.sendLanguage("English");
		CoursePOM.clickadd_course_submit();
		CoursePOM.clickadd_introduction();
		CoursePOM.sendintroduction("this is an selenium course");
		CoursePOM.clickSave_intro_text();
		CoursePOM.clickCourse_description();
		CoursePOM.clickDescription();
		CoursePOM.sendtitle("selenium course for beginners");
		CoursePOM.sendcontent("selenium course for beginners");
		CoursePOM.clicksave();
		CoursePOM.clickObjectives();
		CoursePOM.sendtitle1("selenium course for beginners");
		CoursePOM.sendcontent1("selenium course for beginners");
		CoursePOM.clicksave1();
		CoursePOM.clickTopics();
		CoursePOM.sendtitle2("selenium course for beginners");
		CoursePOM.sendcontent2("selenium course for beginners");
		CoursePOM.clicksave2();		
	}
		
	@Test
	public void validLoginTest() {
		
		loginPOM.LoginUser ("admin", "admin@123");
		
		System.out.println("Login test passed");
	
		 
		CoursePOM = new TC84POM(driver); 
	}
	
	@Test
	public void validCoursecatalog() {
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
	
		 
		CoursePOM = new TC84POM(driver); 
	}

	@Test
	public void validReporting() {
		CoursePOM.clickReporting();
		CoursePOM.clickFollowed_students();
		CoursePOM.clickarrow();
		CoursePOM.clickCourse_Name();	
	}
}
