package com.AH.chegus.commoncode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Alert_Message {
	public WebDriver driver;

	public Alert_Message(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	private String claimBatch = "No batches Found please create new batch";
	
	/**
	 * @return the claimBatch
	 */
	public String ClaimBatch() {
		return claimBatch;
	}

	
	
}
