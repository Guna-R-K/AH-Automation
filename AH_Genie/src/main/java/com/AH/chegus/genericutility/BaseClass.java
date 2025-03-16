package com.AH.chegus.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.AH.chegus.pomrepository.AHHomePage;
import com.AH.chegus.pomrepository.AHLoginPage;

public class BaseClass {
	public WebDriver driver;
	
	public ExcelUtility excelUtility = new ExcelUtility();
	public FileUtility fileUtility = new FileUtility();
	public JavaUtility javaUtility = new JavaUtility();
	public WebDriverUtility webDriverUtility = new WebDriverUtility();
	
	//public Robot robot = new Robot();
	
	//@BeforeTest
	public void configBeforeTest() {

	}
	
	//@BeforeSuite
	public void configBeforeSuite() throws IOException  {
		String browserName = fileUtility.readAHCommon("browser");
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browserName.equals("")) {
			
		}
		driver.manage().window().maximize();
		webDriverUtility.implicitlyWait(driver);
		driver.get(fileUtility.readAHCommon("url"));
		
		
	}
	
	//@BeforeGroups
	public void configBeforeGroup() {

	}
	
	@BeforeClass
	public void configBeforeClass() throws IOException  {
		AHLoginPage loginPage = new AHLoginPage(driver);
		loginPage.UserName().sendKeys(fileUtility.readAHCommon("username"));
		loginPage.Pwd().sendKeys(fileUtility.readAHCommon("pwd"));
		loginPage.LoginButton().click();
		AHHomePage homePage = new AHHomePage(driver);
		homePage.notifCancelButton().click();
	}
	
	@BeforeMethod
	public void configBeforeMethod()  {
		
	}
	
	//@AfterMethod
	public void configAfterMethod() {
		
	}
	
	//@AfterClass
	public void configAfterClass() {
		AHHomePage homePage = new AHHomePage(driver);
		homePage.profile().click();
		homePage.logoutButton().click();
		driver.manage().window().minimize();
		driver.quit();
	}
	
	//@AfterGroups
	public void configAfterGroups() {
		
	}
	
	//@AfterSuite
	
	/**
	 * @author Gunz
	 */
	public void configAfterSuite() {
		
	}

	//@AfterTest
	public void configAfterTest() {
		
	}
}
