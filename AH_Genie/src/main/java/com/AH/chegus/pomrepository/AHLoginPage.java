package com.AH.chegus.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AHLoginPage {
	public WebDriver driver;
	
	
	public AHLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locate the Element
	@FindBy(id = "usrnm")
	private WebElement userName;
	
	@FindBy(id = "pwd")
	private WebElement pwd;
	
	@FindBy(id = "loginBtn")
	private WebElement loginButton;
	
	@FindBy(id = "reset")
	private WebDriver resetButton;
	
	@FindBy(id = "//u[text()='Forgot Password']")
	private WebDriver forgotPassword;

	
	
	
	/**
	 * @return the userName
	 */
	public WebElement UserName() {
		return userName;
	}

	/**
	 * @return the pwd
	 */
	public WebElement Pwd() {
		return pwd;
	}

	/**
	 * @return the loginButton
	 */
	public WebElement LoginButton() {
		return loginButton;
	}

	/**
	 * @return the resetButton
	 */
	public WebDriver ResetButton() {
		return resetButton;
	}

	/**
	 * @return the forgotPassword
	 */
	public WebDriver ForgotPassword() {
		return forgotPassword;
	}
	
		
}
