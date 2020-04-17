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
import com.training.pom.TC83POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC83 {

	private WebDriver driver;
	private TC83POM AddPOM;
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
		AddPOM = new TC83POM(driver); 
		
	
	@Test
	public void validLoginTest() {
		
		loginPOM.LoginUser ("admin", "admin@123");
		
		System.out.println("Login test passed");
	}
		 
		AddPOM = new TC83POM(driver); 
		
	}
	@Test
	public void validDeletTest() {
		AddPOM.clickAdministration();
		AddPOM.clickAdd_user();
		AddPOM.sendfirstName("12334");
		AddPOM.sendlastName("mehadi");
		AddPOM.sendemail("manzoor@gmail.com");
		AddPOM.sendphone("9876543210");
		AddPOM.sendusername("manzoor");
		AddPOM.clickenter_password();
		AddPOM.sendpassword("manzoor");
		AddPOM.profile("Trainer");
		AddPOM.clickAdd();
	}

}
