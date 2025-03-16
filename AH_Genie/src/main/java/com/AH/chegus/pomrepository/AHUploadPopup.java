package com.AH.chegus.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AHUploadPopup {
	public WebDriver driver;
	
	public AHUploadPopup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "file")
	private WebElement chooseFileButton;
	
	@FindBy(name = "Upload")
	private WebElement UploadButton;
	
	@FindBy(css = "[value='Submit']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"divbtns\"]/a[2]/input")
	private WebElement cancelButton;

	
	//Getter method
	/**
	 * @return the chooseFileButton
	 */
	public WebElement ChooseFileButton() {
		return chooseFileButton;
	}

	/**
	 * @return the uploadButton
	 */
	public WebElement UploadButton() {
		return UploadButton;
	}

	/**
	 * @return the submitButton
	 */
	public WebElement SubmitButton() {
		return submitButton;
	}

	/**
	 * @return the cancelButton
	 */
	public WebElement CancelButton() {
		return cancelButton;
	}
	
}
