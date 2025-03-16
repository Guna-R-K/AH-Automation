package com.AH.chegus.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AHClaimsSearchPage {
	public WebDriver driver;
	
	public AHClaimsSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "create")
	private WebElement createButton;
	
	@FindBy(id =  "claimId")
	private WebElement claimNo;
	
	@FindBy(id = "policyId")
	private WebElement policyID;
	
	@FindBy(id = "memberId")
	private WebElement memberID;
	
	@FindBy(id = "suffix")
	private WebElement suffix;
	
	@FindBy(id = "memberName")
	private WebElement memberName;
	
	@FindBy(id = "clientId")
	private WebElement clientID;
	
	@FindBy(css = "input[list='listId4']")
	private WebElement serviecProvNo;
	
	@FindBy(css = "input[list='listIdName']")
	private WebElement serviecProvName;
	
	@FindBy(id = "productName")
	private WebElement product;
	
	@FindBy(id = "scheme")
	private WebElement scheme;
	
	@FindBy(id = "afozeCode")
	private WebElement afoze;
	
	@FindBy(id = "captureBy")
	private WebElement userName;
	
	@FindBy(id = "fund")
	private WebElement fund;
	
	
	//Button
	@FindBy(id = "dtSearchBtn")
	private WebElement searchButton;
	
	@FindBy(css = "input[title=Reset]")
	private WebElement resetButton;
	
	@FindBy(xpath = "//span[text()='Copy']")
	private WebElement copyButton;
	
	@FindBy(xpath = "//span[text()='Print']")
	private WebElement printButton;
	
	@FindBy(xpath = "//span[text()='Excel']")
	private WebElement excelButton;
	
	@FindBy(xpath = "//span[text()='PDF']")
	private WebElement pdfButton;

	
	//Getter Methods
	/**
	 * @return the createButton
	 */
	public WebElement CreateButton() {
		return createButton;
	}

	/**
	 * @return the claimNo
	 */
	public WebElement ClaimNo() {
		return claimNo;
	}

	/**
	 * @return the policyID
	 */
	public WebElement PolicyID() {
		return policyID;
	}

	/**
	 * @return the memberID
	 */
	public WebElement MemberID() {
		return memberID;
	}

	/**
	 * @return the suffix
	 */
	public WebElement Suffix() {
		return suffix;
	}

	/**
	 * @return the memberName
	 */
	public WebElement MemberName() {
		return memberName;
	}

	/**
	 * @return the clientID
	 */
	public WebElement ClientID() {
		return clientID;
	}

	/**
	 * @return the serviecProvNo
	 */
	public WebElement ServiecProvNo() {
		return serviecProvNo;
	}

	/**
	 * @return the serviecProvName
	 */
	public WebElement ServiecProvName() {
		return serviecProvName;
	}

	/**
	 * @return the product
	 */
	public WebElement Product() {
		return product;
	}

	/**
	 * @return the scheme
	 */
	public WebElement Scheme() {
		return scheme;
	}

	/**
	 * @return the afoze
	 */
	public WebElement Afoze() {
		return afoze;
	}

	/**
	 * @return the userName
	 */
	public WebElement UserName() {
		return userName;
	}

	/**
	 * @return the fund
	 */
	public WebElement Fund() {
		return fund;
	}

	/**
	 * @return the searchButton
	 */
	public WebElement SearchButton() {
		return searchButton;
	}

	/**
	 * @return the resetButton
	 */
	public WebElement ResetButton() {
		return resetButton;
	}

	/**
	 * @return the copyButton
	 */
	public WebElement CopyButton() {
		return copyButton;
	}

	/**
	 * @return the printButton
	 */
	public WebElement PrintButton() {
		return printButton;
	}

	/**
	 * @return the excelButton
	 */
	public WebElement ExcelButton() {
		return excelButton;
	}

	/**
	 * @return the pdfButton
	 */
	public WebElement PdfButton() {
		return pdfButton;
	}
	
	
	
}
