package com.AH.chegus.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AHIndividualSearchPage {
	public WebDriver driver;

	public AHIndividualSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "proposalId")
	private WebElement proposalId_TF;
	
	@FindBy(id = "quoteId")
	private WebElement quoteId_TF;
	
	@FindBy(id = "clientName")
	private WebElement clientName_TF;
	
	@FindBy(id = "propDate")
	private WebElement fromDate;
	
	@FindBy(id = "tempDate")
	private WebElement toDate;
	
	@FindBy(id = "srcOfBuss")
	private WebElement srcOfBuss;
	
	@FindBy(id = "agentBroker")
	private WebElement agentBroker_TF;
	
	//Select dropdown
	@FindBy(id = "stsId")
	private WebElement stsId_DD ;
	//private Select status_DD = new Select(stsId_DD);
	
	@FindBy(name = "table_id_length")
	private WebElement entries_DD;
	//private Select entries_DD = new Select(entries);
			
	//Button's 
	@FindBy(id = "dtSearchBtn")
	private WebElement searchButton;
	
	@FindBy(css = "input[title='Reset']")
	private WebElement resetButton;
	
	@FindBy(name = "create")
	private WebElement createButton;
	
	@FindBy(xpath = "//span[text()='Copy']")
	private WebElement copyButton;
	
	@FindBy(xpath = "//span[text()='Print']")
	private WebElement printButton;
	
	@FindBy(xpath = "//span[text()='Excel']")
	private WebElement excelButton;
	
	@FindBy(xpath = "//span[text()='PDF']")
	private WebElement pdfButton;
	
	@FindBy(id = "table_id_previous")
	private WebElement previousButton;
	
	@FindBy(id = "table_id_next")
	private WebElement nextButton;

	
	//Getter method's
	
	/**
	 * @return the proposalId_TF
	 */
	public WebElement ProposalId_TF() {
		return proposalId_TF;
	}

	/**
	 * @return the quoteId_TF
	 */
	public WebElement QuoteId_TF() {
		return quoteId_TF;
	}

	/**
	 * @return the clientName_TF
	 */
	public WebElement ClientName_TF() {
		return clientName_TF;
	}

	/**
	 * @return the fromDate
	 */
	public WebElement FromDate() {
		return fromDate;
	}

	/**
	 * @return the toDate
	 */
	public WebElement ToDate() {
		return toDate;
	}

	/**
	 * @return the srcOfBuss
	 */
	public WebElement SrcOfBuss() {
		return srcOfBuss;
	}

	/**
	 * @return the agentBroker_TF
	 */
	public WebElement AgentBroker_TF() {
		return agentBroker_TF;
	}

	/**
	 * @return the status_DD
	 */
//	public Select Status_DD() {
//		return status_DD;
//	}

	/**
	 * @return the entries_DD
	 */
//	public Select Entries_DD() {
//		return entries_DD;
//	}

	/**
	 * @return the stsId_DD
	 */
	public WebElement StsId_DD() {
		return stsId_DD;
	}

	/**
	 * @return the entries
	 */
	public WebElement Entries_DD() {
		return entries_DD;
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
	 * @return the createButton
	 */
	public WebElement CreateButton() {
		return createButton;
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

	/**
	 * @return the previousButton
	 */
	public WebElement PreviousButton() {
		return previousButton;
	}

	/**
	 * @return the nextButton
	 */
	public WebElement NextButton() {
		return nextButton;
	}

}
