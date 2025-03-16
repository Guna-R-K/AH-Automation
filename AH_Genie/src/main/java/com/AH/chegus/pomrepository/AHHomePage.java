package com.AH.chegus.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AHHomePage {
	public WebDriver driver;

	
	public AHHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locator for Notification
	@FindBy(css = "input[value='Ok']")
	private WebElement notifOkButton;
	
	@FindBy(xpath = "//*[@id=\"body_ID\"]/div[5]/div[1]/button")
	private WebElement notifCancelButton;
	

	//Locator for Business_Master Module and Feature
	@FindBy(xpath = "//b[text()='Business Master']")
	private WebElement Business_Master;
	
	//Business_Master Features
	@FindBy(linkText = "Organization")
	private WebElement Organization;
	
	@FindBy(linkText = "Medical Codes")
	private WebElement Medical_Codes;
	
	//Locator for Underwriting Module Module and Feature
	@FindBy(xpath = "//b[text()='Underwriting']")
	private WebElement Underwriting;
	
	//Underwriting Features
	@FindBy(id = "HLTQUOTATION")
	private WebElement Quotation;
	
	@FindBy(id = "PROPOSAL")
	private WebElement Individual_Proposal;
	
	@FindBy(id = "GROUPPROPOSAL")
	private WebElement Group_Proposal;
	
	@FindBy(id = "BULKPLCYAPPR")
	private WebElement BulkPolicy_Approval;
	
	@FindBy(id = "VIEWPOLICY")
	private WebElement View_Policy;
	
	@FindBy(id = "VIEWMEMBER")
	private WebElement View_Members;
	
	@FindBy(id = "UPDATEHMSID")
	private WebElement UpdateHMS_MemberID;
	
	@FindBy(id = "VIEWHMSID")
	private WebElement ViewHMS_MemberID;
	
	@FindBy(id = "POLICYHISTORY")
	private WebElement Policy_History;
	
	@FindBy(id = "MEMBERHISTORY")
	private WebElement Member_History;
	
	//Locator for Claims Module Module and Feature
	@FindBy(xpath = "//b[text()='Claims']")
	private WebElement module_Claims;
	
	//claims Features
	@FindBy(id = "PREAUTHORIZATION")
	private WebElement preAuthorization;
	
	@FindBy(id = "CLAIMS")
	private WebElement feature_Claims;
	
	@FindBy(id = "APPRVBLKCLMS")
	private WebElement approveBulkClaims;
	
	@FindBy(id = "AUTHORIZEBLKCLMS")
	private WebElement authorizeBulkClaims;
	
	//Profile
	@FindBy(id = "linkg")
	private WebElement profile;

	@FindBy(linkText = "Logout")
	private WebElement logoutButton;
	
	//getter Method
	
	/**
	 * @return the notifokButton
	 */
	public WebElement notifOkButton() {
		return notifOkButton;
	}

	/**
	 * @return the notifcancelButton
	 */
	public WebElement notifCancelButton() {
		return notifCancelButton;
	}

	/**
	 * @return the business_Master
	 */
	public WebElement business_Master() {
		return Business_Master;
	}

	/**
	 * @return the organization
	 */
	public WebElement organization() {
		return Organization;
	}

	/**
	 * @return the medical_Codes
	 */
	public WebElement medical_Codes() {
		return Medical_Codes;
	}

	/**
	 * @return the underwriting
	 */
	public WebElement underwriting() {
		return Underwriting;
	}

	/**
	 * @return the quotation
	 */
	public WebElement quotation() {
		return Quotation;
	}

	/**
	 * @return the individual_Proposal
	 */
	public WebElement individual_Proposal() {
		return Individual_Proposal;
	}

	/**
	 * @return the group_Proposal
	 */
	public WebElement group_Proposal() {
		return Group_Proposal;
	}

	/**
	 * @return the bulkPolicy_Approval
	 */
	public WebElement bulkPolicy_Approval() {
		return BulkPolicy_Approval;
	}

	/**
	 * @return the view_Policy
	 */
	public WebElement view_Policy() {
		return View_Policy;
	}

	/**
	 * @return the view_Members
	 */
	public WebElement view_Members() {
		return View_Members;
	}

	/**
	 * @return the updateHMS_MemberID
	 */
	public WebElement updateHMS_MemberID() {
		return UpdateHMS_MemberID;
	}

	/**
	 * @return the viewHMS_MemberID
	 */
	public WebElement viewHMS_MemberID() {
		return ViewHMS_MemberID;
	}

	/**
	 * @return the policy_History
	 */
	public WebElement policy_History() {
		return Policy_History;
	}

	/**
	 * @return the member_History
	 */
	public WebElement member_History() {
		return Member_History;
	}


	/**
	 * @return the module_Claims
	 */
	public WebElement module_Claims() {
		return module_Claims;
	}

	/**
	 * @return the preAuthorization
	 */
	public WebElement preAuthorization() {
		return preAuthorization;
	}

	/**
	 * @return the feature_Claims
	 */
	public WebElement feature_Claims() {
		return feature_Claims;
	}

	/**
	 * @return the approveBulkClaims
	 */
	public WebElement approveBulkClaims() {
		return approveBulkClaims;
	}

	/**
	 * @return the authorizeBulkClaims
	 */
	public WebElement authorizeBulkClaims() {
		return authorizeBulkClaims;
	}
	
	
	/**
	 * @return the profile
	 */
	public WebElement profile() {
		return profile;
	}

	/**
	 * @return the logoutButton
	 */
	public WebElement logoutButton() {
		return logoutButton;
	}
}
