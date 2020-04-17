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
import com.training.pom.Tc52POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Tc52 {

	private WebDriver driver;
	private Tc52POM tc52POM;
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
		tc52POM = new Tc52POM(driver); 
		
	
	@Test
	public void validLoginTest() {
		
		loginPOM.LoginUser ("admin", "admin@123");
		
		System.out.println("Login test passed");
	}
		 
		tc52POM = new Tc52POM(driver); 
		
	}
	@Test
	public void validDeletTest() {
		tc52POM.clickAdministration();
		tc52POM.clickSessions_categories_list();
		tc52POM.clickAdd();
		tc52POM.sendCategoryName("Testing");
		tc52POM.clickcategory();
		tc52POM.clicksession();
		tc52POM.clicktraining();
		tc52POM.sessionName("selenium training session");
		
		tc52POM.clickAdvance_settings();
		tc52POM.sessions_category("Testing");
		//tc52POM.act).sendKeys(Keys.ENTER);
		tc52POM.clickNext();
		
		tc52POM.clickRight_arrow();
		tc52POM.clickNext_step();
		tc52POM.subscribe_user("Sunil");
		tc52POM.clickStudent_name();
		tc52POM.clickFinish();
	}

}
