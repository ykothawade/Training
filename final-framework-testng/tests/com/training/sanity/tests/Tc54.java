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
import com.training.pom.TC54POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Tc54 {

	private WebDriver driver;
	private TC54POM tc54POM;
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
		TC54POM = new Tc54(); 
		
	
	@Test
	public void validLoginTest() {
		
		loginPOM.LoginUser ("admin", "admin@123");
		
		System.out.println("Login test passed");
	}
		 
		TC54POM = new tc54POM(driver); 
		
	}
	@Test
	public void validDeletTest() {
		tc54POM.clickReporting();
		tc54POM.clickFollowed_teacher();
		tc54POM.sendkeyword("manzoor");
		tc54POM.clicksearch();
		tc54POM.clickTeacher_icon();
		tc54POM.clickdetails_icon();
		tc54POM.clickLogin();
		tc54POM.clickMy_courses();
		tc54POM.clickEdit_profile();
		tc54POM.skype("Manzoor123");
		tc54POM.clickSave_settings();
		
	}

}
