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
import com.training.pom.DeletePOM;
import com.training.pom.LoginPOM;
import com.training.pom.Tc53POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Tc53 {

	private WebDriver driver;
	private Tc53POM tc53POM;
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
		tc53POM = new Tc53(driver); 
		
	
	@Test
	public void validLoginTest() {
		
		loginPOM.LoginUser ("admin", "admin@123");
		
		System.out.println("Login test passed");
	}
		 
		tc53POM = new Tc53POM(driver); 
		
	}
	@Test
	public void validDeletTest() {
		tc53POM.clickReporting();
		tc53POM.clickFollowed_students();
		tc53POM.sendkeyword("jay");
		tc53POM.clicksearch();
		tc53POM.clickStudent_icon();
		tc53POM.clickCourse_icon();
		tc53POM.clickLogin();
		tc53POM.clickMy_courses();
		tc53POM.clickEdit_profile();
		tc53POM.skype("sunil123");
		tc53POM.clickSave_settings();
			
	}

}
