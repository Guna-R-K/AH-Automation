package com.AH.chegus.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AHIndividualCreatePage {
	public WebDriver driver;
	
	
	public AHIndividualCreatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "propType")
	private WebElement propType;
	
	//Proposal Details Block
	@FindBy(id = "dirPropId")
	private WebElement proposalID;
	
	@FindBy(id = "srcOfBussDirect")
	private WebElement sob;
	
	@FindBy(id = "AgentNameList")
	private WebElement agentNameList;
	
	@FindBy(id = "Location")
	private WebElement location;
	
	@FindBy(id = "directProposal.productDO.id")
	private WebElement product;
	
	@FindBy(id = "effectiveDate")
	private WebElement effectiveDate;
	
	//Product Scheme Details
	@FindBy(id = "proposalDO.memberDOs0.propparamDO.Id")
	private WebElement scheme;
	
	@FindBy(xpath = "//button[text()='Upload Members']")
	private WebElement uploadMemberButton;
	
	@FindBy(xpath = "//button[text()='Add/View Members']")
	private WebElement addView_MembersButton;
	
	@FindBy(xpath = "//button[text()='Premium Details']")
	private WebElement premiumDetailsButton;
	
	@FindBy(xpath = "//*[@id=\"prodId0\"]/td[7]/a/button")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//button[text()='Calculate']")
	private WebElement calculateButton;
	
	//Premium Brkup block
	@FindBy(xpath = "//*[@id=\"premValueTr0\"]/td[7]/button")
	private WebElement loadingsDiscountButton;
	
	//Underwriting Details
	@FindBy(id = "DROP000003")
	private WebElement status;
	
	@FindBy(id = "$(this).validfunc('propform','error')")
	private WebElement submitButton;

	
	//ter Method
	/**
	 * @return the propType
	 */
	public WebElement PropType() {
		return propType;
	}

	/**
	 * @return the proposalID
	 */
	public WebElement ProposalID() {
		return proposalID;
	}

	/**
	 * @return the sob
	 */
	public WebElement Sob() {
		return sob;
	}

	/**
	 * @return the agentNameList
	 */
	public WebElement AgentNameList() {
		return agentNameList;
	}

	/**
	 * @return the location
	 */
	public WebElement Location() {
		return location;
	}

	/**
	 * @return the product
	 */
	public WebElement Product() {
		return product;
	}

	/**
	 * @return the effectiveDate
	 */
	public WebElement EffectiveDate() {
		return effectiveDate;
	}

	/**
	 * @return the scheme
	 */
	public WebElement Scheme() {
		return scheme;
	}

	/**
	 * @return the uploadMemberButton
	 */
	public WebElement UploadMemberButton() {
		return uploadMemberButton;
	}

	/**
	 * @return the addView_MembersButton
	 */
	public WebElement AddView_MembersButton() {
		return addView_MembersButton;
	}

	/**
	 * @return the premiumDetailsButton
	 */
	public WebElement PremiumDetailsButton() {
		return premiumDetailsButton;
	}

	/**
	 * @return the deleteButton
	 */
	public WebElement DeleteButton() {
		return deleteButton;
	}

	/**
	 * @return the calculateButton
	 */
	public WebElement CalculateButton() {
		return calculateButton;
	}

	/**
	 * @return the loadingsDiscountButton
	 */
	public WebElement LoadingsDiscountButton() {
		return loadingsDiscountButton;
	}

	/**
	 * @return the status
	 */
	public WebElement Status() {
		return status;
	}

	/**
	 * @return the submitButton
	 */
	public WebElement SubmitButton() {
		return submitButton;
	}
	
	
	
}
