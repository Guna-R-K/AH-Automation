package com.AH.chegus.pomrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AHClaimsCreatePage {
	public WebDriver driver;

	public AHClaimsCreatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	
	//Claims Details Block
	@FindBy(id = "claimsDO.claimsType1")
	private WebElement directclaim;
	
	@FindBy(id = "claimsDO.claimsType2")
	private WebElement pre_AuthClaim;
	
	@FindBy(id = "claimsDO.preAuthorizationDO.automatedCode")
	private WebElement pre_AuthID_TF;
	
	@FindBy(xpath = "//input[@id='claimsDO.preAuthorizationDO.automatedCode']/following-sibling::a[@id='b0-link']/img")
	private WebElement pre_AuthDownLoadButton;
	
	@FindBy(id = "claimsDO.claimId")
	private WebElement ClaimID;
	
	@FindBy(id = "claimsDO.batchType1")
	private WebElement newBatch;
	
	@FindBy(id = "claimsDO.batchType2")
	private WebElement existingBatch;
	
	@FindBy(id = "createBatch")
	private WebElement createBatch;
	
	@FindBy(id = "selectBatchId")
	private WebElement batch;
	
	
	//Member Details Block
	@FindBy(id = "policyMemberId")
	private WebElement MemberId;
	
	@FindBy(id = "claimCloseDtId")
	private WebElement claimCloseDate;
	
	@FindBy(xpath = "//input[@id='policyMemberId']/../..//a[@id='b0-link']/img")
	private WebElement memberDownloadButton;
	
	@FindBy(id = "claimReceivedDate")
	private WebElement claimReceivedDate;
	
	
	//Additional Info Block
	@FindBy(css = "input[value='Exclusions']")
	private WebElement exclusionBtn;
	
	@FindBy(css = "input[value='Loadings']")
	private WebElement loadingBtn;
	
	@FindBy(css = "input[value='Pre-Authorization History']")
	private WebElement preAuthHistoryBtn;
	
	@FindBy(css = "input[value='Claim History']")
	private WebElement claimHistoryBtn;
	
	@FindBy(css = "input[value='Member DashBoard']")
	private WebElement memberDashBoardBtn;
	
	@FindBy(css = "input[value='Print Statements Of Acc']")
	private WebElement printSOABtn;
	

	//Provider Details
	@FindBy(id = "serviceProvId")
	private WebElement serviceProvider;
	
	@FindBy(id = "claimsDO.referredBy.intId")
	private WebElement referredBy;
	
	@FindBy(id = "claimTypeId")
	private WebElement claimType;
	
	
	//Treatment Details
	@FindBy(id = "primaryDiagId")
	private WebElement icdCode;
	
	@FindBy(id = "claimsDO.treatmentDO.treatmentNotes")
	private WebElement treatmentNotes;
	
	
	//Charge Block
	@FindBy(css = "input[value='PROVDR']")
	private WebElement providerRadioButton;
	
	@FindBy(css = "input[value='MEMBER']")
	private WebElement memberRadioButton;
	
	@FindBy(id = "claimsDO.claimsChargeDO.foreignBatchIn")
	private WebElement foreignBatchInvoice;
	
	@FindBy(id = "claimsDO.claimsChargeDO.invoiceNumber")
	private WebElement claimInvoiceNo;
	
	@FindBy(id = "currencyPaymentId")
	private WebElement currencyOfPayment;
	
	@FindBy(id = "claimCurrencyId")
	private WebElement currencyOfClaim;
	
	@FindBy(id = "1")
	private WebElement currencyOfClaimCheceBox;
	
	@FindBy(id = "claimsDO.claimsChargeDO.exchangeRate")
	private WebElement exchangeRate;
	
	@FindBy(id = "grossChargeId") 
	private WebElement grossCharge;
	
	@FindBy(id = "claimsDO.claimsChargeDO.tAward")
	private WebElement totalAward;

	
	//Procedural/Drug Details 1st Row
	
	@FindBy(id = "addBtnHis")
	private WebElement addButton;
	
	//Use delete findElement.findElement - using one element try to delete the particular row 
	@FindBy(xpath = "//input[@id='claimsDO.proceduralDOs0.id']/../..//button[@id='deleteBtn']")
	private WebElement fstRowDeleteButton;
	
	@FindBy(id = "claimsDO.proceduralDOs0.modeOfEntry")
	private WebElement fstRowModeOfEntry;
	
	@FindBy(name = "claimsDO.proceduralDOs[0].ahfozcodedo.code")
	private WebElement fstRowAhfozeCode;
	
	@FindBy(name = "claimsDO.authDrugDOs[0].drugCodeDO.code")
	private WebElement fstRowDrugCode;
	
	@FindBy(id = "claimsDO.authDrugDOs0.drugGroup")
	private WebElement fstRowDrugClass;
	
	@FindBy(id = "claimsDO.proceduralDOs0.modifierCodeOne.code")
	private WebElement fstRowModifier1;
	
	@FindBy(id = "claimsDO.proceduralDOs0.modifierCodeTwo.code")
	private WebElement fstRowModifier2;
	
	@FindBy(id = "claimsDO.proceduralDOs0.quantity")
	private WebElement fstRowQuantity;
	
	@FindBy(id = "dateOfTrtmtnt0")
	private WebElement fstRowTreatmentDate;
	
	@FindBy(name = "claimsDO.proceduralDOs[0].estimateCharge")
	private WebElement fstRowServiceFee;
	
	@FindBy(id = "claimsDO.proceduralDOs0.manualAward")
	private WebElement fstRowMnlAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs0.awrdauthcurr")
	private WebElement fstRowClmAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs0.awrdPlcycurr")
	private WebElement fstRowPlcyAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs0.shortfallAmt")
	private WebElement fstRowShortFallAmt;
	
	@FindBy(id = "claimsDO.proceduralDOs0.shortFallCodes")
	private WebElement fstRowShortFallCode;
	
	@FindBy(name = "claimsDO.proceduralDOs[0].benefitGroup.id")
	private WebElement fstRowBenefitGroup;
	
	@FindBy(name = "claimsDO.proceduralDOs[0].benefitsDO.id")
	private WebElement fstRowBenefit;
	
	@FindBy(id = "claimsDO.proceduralDOs0.ahfozcodedo.description")
	private WebElement fstRowDescription;
	
	@FindBy(id = "claimsDO.proceduralDOs0.ahfozcodedo.award")
	private WebElement fstRowAward;
	
	@FindBy(id = "preAuthorizationDO.proceduralDOs0.ahfozcodedo.awardType")
	private WebElement fstRowAwardType;
	
	@FindBy(id = "claimsDO.proceduralDOs0.manualAwrdReason")
	private WebElement fstRowMnlAwdReason;
	
	
	//Procedural/Drug Details 2st Row
	
	@FindBy(xpath = "//input[@id='claimsDO.proceduralDOs1.id']/../..//button[@id='deleteBtn']")
	private WebElement secondRowDeleteButton;
	
	@FindBy(id = "claimsDO.proceduralDOs1.modeOfEntry")
	private WebElement secondRowModeOfEntry;
	
	@FindBy(name = "claimsDO.proceduralDOs[1].ahfozcodedo.code")
	private WebElement secondRowahfozeCode;
	
	@FindBy(name = "claimsDO.authDrugDOs[1].drugCodeDO.code")
	private WebElement secondRowDrugCode;
	
	@FindBy(id = "claimsDO.authDrugDOs1.drugGroup")
	private WebElement secondRowDrugClass;
	
	@FindBy(id = "claimsDO.proceduralDOs1.modifierCodeOne.code")
	private WebElement secondRowModifier1;
	
	@FindBy(id = "claimsDO.proceduralDOs1.modifierCodeTwo.code")
	private WebElement secondRowModifier2;
	
	@FindBy(id = "claimsDO.proceduralDOs1.quantity")
	private WebElement secondRowQuantity;
	
	@FindBy(id = "dateOfTrtmtnt1")
	private WebElement secondRowTreatmentDate;
	
	@FindBy(name = "claimsDO.proceduralDOs[1].estimateCharge")
	private WebElement secondRowServiceFee;
	
	@FindBy(id = "claimsDO.proceduralDOs1.manualAward")
	private WebElement secondRowMnlAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs1.awrdauthcurr")
	private WebElement secondRowClmAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs1.awrdPlcycurr")
	private WebElement secondRowPlcyAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs1.shortfallAmt")
	private WebElement secondRowShortFallAmt;
	
	@FindBy(id = "claimsDO.proceduralDOs1.shortFallCodes")
	private WebElement secondRowShortFallCode;
	
	@FindBy(name = "claimsDO.proceduralDOs[1].benefitGroup.id")
	private WebElement secondRowBenefitGroup;
	
	@FindBy(name = "claimsDO.proceduralDOs[1].benefitsDO.id")
	private WebElement secondRowBenefit;
	
	@FindBy(id = "claimsDO.proceduralDOs1.ahfozcodedo.description")
	private WebElement secondRowDescription;
	
	@FindBy(id = "claimsDO.proceduralDOs1.ahfozcodedo.award")
	private WebElement secondRowAward;
	
	@FindBy(id = "preAuthorizationDO.proceduralDOs1.ahfozcodedo.awardType")
	private WebElement secondRowAwardType;
	
	@FindBy(id = "claimsDO.proceduralDOs1.manualAwrdReason")
	private WebElement secondRowMnlAwdReason;
	
	
	//Procedural/Drug Details 3rd Row

	@FindBy(xpath = "//input[@id='claimsDO.proceduralDOs2.id']/../..//button[@id='deleteBtn']")
	private WebElement thrdRowDeleteButton;
	
	@FindBy(id = "claimsDO.proceduralDOs2.modeOfEntry")
	private WebElement thrdRowModeOfEntry;
	
	@FindBy(name = "claimsDO.proceduralDOs[2].ahfozcodedo.code")
	private WebElement thrdRowahfozeCode;
	
	@FindBy(name = "claimsDO.authDrugDOs[2].drugCodeDO.code")
	private WebElement thrdRowDrugCode;
	
	@FindBy(id = "claimsDO.authDrugDOs2.drugGroup")
	private WebElement thrdRowDrugClass;
	
	@FindBy(id = "claimsDO.proceduralDOs2.modifierCodeOne.code")
	private WebElement thrdRowModifier1;
	
	@FindBy(id = "claimsDO.proceduralDOs2.modifierCodeTwo.code")
	private WebElement thrdRowModifier2;
	
	@FindBy(id = "claimsDO.proceduralDOs2.quantity")
	private WebElement thrdRowQuantity;
	
	@FindBy(id = "dateOfTrtmtnt2")
	private WebElement thrdRowTreatmentDate;
	
	@FindBy(name = "claimsDO.proceduralDOs[2].estimateCharge")
	private WebElement thrdRowServiceFee;
	
	@FindBy(id = "claimsDO.proceduralDOs2.manualAward")
	private WebElement thrdRowMnlAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs2.awrdauthcurr")
	private WebElement thrdRowClmAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs2.awrdPlcycurr")
	private WebElement thrdRowPlcyAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs2.shortfallAmt")
	private WebElement thrdRowShortFallAmt;
	
	@FindBy(id = "claimsDO.proceduralDOs2.shortFallCodes")
	private WebElement thrdRowShortFallCode;
	
	@FindBy(name = "claimsDO.proceduralDOs[2].benefitGroup.id")
	private WebElement thrdRowBenefitGroup;
	
	@FindBy(name = "claimsDO.proceduralDOs[2].benefitsDO.id")
	private WebElement thrdRowBenefit;
	
	@FindBy(id = "claimsDO.proceduralDOs2.ahfozcodedo.description")
	private WebElement thrdRowDescription;
	
	@FindBy(id = "claimsDO.proceduralDOs2.ahfozcodedo.award")
	private WebElement thrdRowAward;
	
	@FindBy(id = "preAuthorizationDO.proceduralDOs2.ahfozcodedo.awardType")
	private WebElement thrdRowAwardType;
	
	@FindBy(id = "claimsDO.proceduralDOs2.manualAwrdReason")
	private WebElement thrdRowMnlAwdReason;

	
	//Procedural/Drug Details 4th Row
	
	@FindBy(xpath = "//input[@id='claimsDO.proceduralDOs3.id']/../..//button[@id='deleteBtn']")
	private WebElement forthRowDeleteButton;
	
	@FindBy(id = "claimsDO.proceduralDOs3.modeOfEntry")
	private WebElement forthRowModeOfEntry;
	
	@FindBy(name = "claimsDO.proceduralDOs[3].ahfozcodedo.code")
	private WebElement forthRowAhfozeCode;
	
	@FindBy(name = "claimsDO.authDrugDOs[3].drugCodeDO.code")
	private WebElement forthRowDrugCode;
	
	@FindBy(id = "claimsDO.authDrugDOs3.drugGroup")
	private WebElement forthRowDrugClass;
	
	@FindBy(id = "claimsDO.proceduralDOs3.modifierCodeOne.code")
	private WebElement forthRowModifier1;
	
	@FindBy(id = "claimsDO.proceduralDOs3.modifierCodeTwo.code")
	private WebElement forthRowModifier2;
	
	@FindBy(id = "claimsDO.proceduralDOs3.quantity")
	private WebElement forthRowQuantity;
	
	@FindBy(id = "dateOfTrtmtnt3")
	private WebElement forthRowTreatmentDate;
	
	@FindBy(name = "claimsDO.proceduralDOs[3].estimateCharge")
	private WebElement forthRowServiceFee;
	
	@FindBy(id = "claimsDO.proceduralDOs3.manualAward")
	private WebElement forthRowMnlAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs3.awrdauthcurr")
	private WebElement forthRowClmAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs3.awrdPlcycurr")
	private WebElement forthRowPlcyAwd;
	
	@FindBy(id = "claimsDO.proceduralDOs3.shortfallAmt")
	private WebElement forthRowShortFallAmt;
	
	@FindBy(id = "claimsDO.proceduralDOs3.shortFallCodes")
	private WebElement forthRowShortFallCode;
	
	@FindBy(name = "claimsDO.proceduralDOs[3].benefitGroup.id")
	private WebElement forthRowBenefitGroup;
	
	@FindBy(name = "claimsDO.proceduralDOs[3].benefitsDO.id")
	private WebElement forthRowBenefit;
	
	@FindBy(id = "claimsDO.proceduralDOs3.ahfozcodedo.description")
	private WebElement forthRowDescription;
	
	@FindBy(id = "claimsDO.proceduralDOs3.ahfozcodedo.award")
	private WebElement forthRowAward;
	
	@FindBy(id = "preAuthorizationDO.proceduralDOs3.ahfozcodedo.awardType")
	private WebElement forthRowAwardType;
	
	@FindBy(id = "claimsDO.proceduralDOs3.manualAwrdReason")
	private WebElement forthRowMnlAwdReason;

	
	//Total
	@FindBy(xpath = "//*[@id=\"proceduralTableId\"]/tbody/tr[7]/td[3]/input")
	private WebElement total;

	//Status Block
	@FindBy(id = "clmStsId")
	private WebElement status;
	
	@FindBy(xpath = "//input[contains(@class,'submitbtn')]")
	private WebElement submitButton;
	
	@FindBy(className = "cancelBtn")
	private WebElement cancelButton;
	
	@FindBy(className = "editable")
	private WebElement shortFallButton;
	
	@FindBy(className = "saveAsDraftButton")
	private WebElement saveAsDraftButton;
	
	@FindBy(name = "create")
	private WebElement createAnotherButton;
	
	//create getter method for override and duplicate cancel button
	@FindBy(css = "input[value='Override']")
	private WebElement overRideBtn;
	
	@FindBy(className = "overrideReasonCls")
	private WebElement overRideTextArea;
	
	@FindBy(css = "input[onclick='$(this).SubmitOverride();']")
	private WebElement overRideSubmitBtn;

	@FindBy(xpath = "//input[@onclick='$(this).SubmitOverride();']/../..//input[@onclick='$(this).closePopup();']")
	private WebElement overRideCancelBtn;
	

	//Alert PopUp
	@FindBy(xpath = "//div[@aria-describedby='alertDialog']")
	private WebElement alertPopup;
	
	@FindBy(id = "okBtn")
	private WebElement alertOkBtn;
	
	@FindBy(id = "textMessage")
	private WebElement alertMessage;

	//Duplicate PopUp
	@FindBy(xpath = "//div[@aria-describedby=\"dialog-1\"]")
	private WebElement duplicatePopUp;
	
	@FindBy(className = "AddBtn")
	private WebElement duplicatePopUpCancelBtn;
	
	@FindBy(id = "clmDupId0")
	private WebElement duplicateClaimIdRef;
	
	@FindBy(id = "ui-id-2")
	private WebElement duplicatePopUpName;
	
	@FindBy(xpath = "//*[@id=\"body_ID\"]/div[4]/div[1]/button")
	private WebElement duplicatePopupCloseBtn;
	
	@FindBys({
		@FindBy(css = "[onclick='$(this).getClaimDetails()']")
	})
	private List<WebElement> duplicateIDs;
	
	

	//Getter Method
	/**
	 * @author Gunz
	 * @return the directclaim
	 */
	public WebElement Directclaim() {
		return directclaim;
	}

	/**
	 * @author Gunz
	 * @return the pre_AuthClaim
	 */
	public WebElement Pre_AuthClaim() {
		return pre_AuthClaim;
	}

	/**
	 * @author Gunz
	 * @return the pre_AuthID_TF
	 */
	public WebElement Pre_AuthID_TF() {
		return pre_AuthID_TF;
	}

	/**
	 * @author Gunz
	 * @return the pre_AuthDownoadButton
	 */
	public WebElement Pre_AuthDownLoadButton() {
		return pre_AuthDownLoadButton;
	}

	/**
	 *  @author Gunz
	 * @return the claimID
	 */
	public WebElement ClaimID() {
		return ClaimID;
	}

	/**
	 *  @author Gunz
	 * @return the autoGenerated
	 */
	public WebElement NewBatch() {
		return newBatch;
	}

	/**
	 *  @author Gunz
	 * @return the existingBatch
	 */
	public WebElement ExistingBatch() {
		return existingBatch;
	}

	/**
	 * @author Gunz
	 * @return the createBatch
	 */
	public WebElement CreateBatch() {
		return createBatch;
	}

	/**
	 * @author Gunz
	 * @return the batch
	 */
	public WebElement Batch() {
		return batch;
	}
	
	/**
	 * @author Gunz
	 * @return the memberId
	 */
	public WebElement MemberId() {
		return MemberId;
	}

	/**
	 * @author Gunz
	 * @return the claimCloseDate
	 */
	public WebElement ClaimCloseDate() {
		return claimCloseDate;
	}

	/**
	 * @author Gunz
	 * @return the memberDownloadButton
	 */
	public WebElement MemberDownloadButton() {
		return memberDownloadButton;
	}

	/**
	 * @author Gunz
	 * @return the claimReceivedDate
	 */
	public WebElement ClaimReceivedDate() {
		return claimReceivedDate;
	}

	//Additional Info
	
	/**
	 * @author Gunz
	 * @return the exclusionBtn
	 */
	public WebElement ExclusionBtn() {
		return exclusionBtn;
	}

	/**
	 * @author Gunz
	 * @return the loadingBtn
	 */
	public WebElement LoadingBtn() {
		return loadingBtn;
	}

	/**
	 * @author Gunz
	 * @return the preAuthHistoryBtn
	 */
	public WebElement PreAuthHistoryBtn() {
		return preAuthHistoryBtn;
	}

	/**
	 * @author Gunz
	 * @return the claimHistoryBtn
	 */
	public WebElement ClaimHistoryBtn() {
		return claimHistoryBtn;
	}

	/**
	 * @author Gunz
	 * @return the memberDashBoardBtn
	 */
	public WebElement MemberDashBoardBtn() {
		return memberDashBoardBtn;
	}

	/**
	 * @author Gunz
	 * @return the printSOABtn
	 */
	public WebElement PrintSOABtn() {
		return printSOABtn;
	}

	//Service provider block
	
	/**
	 * @author Gunz
	 * @return the serviceProvider
	 */
	public WebElement ServiceProvider() {
		return serviceProvider;
	}

	/**
	 * @author Gunz
	 * @return the referredBy
	 */
	public WebElement ReferredBy() {
		return referredBy;
	}

	/**
	 * @author Gunz
	 * @return the claimType
	 */
	public WebElement ClaimType() {
		return claimType;
	}


	//Treatment Details Block
	/**
	 * @author Gunz
	 * @return the icdCode
	 */
	public WebElement IcdCode() {
		return icdCode;
	}
	
	/**
	 * @author Gunz
	 * @return the treatmentNotes
	 */
	public WebElement TreatmentNotes() {
		return treatmentNotes;
	}

	//Charges Block

	/**
	 * @author Gunz
	 * @return the providerRadioButton
	 */
	public WebElement ProviderRadioButton() {
		return providerRadioButton;
	}

	/**
	 * @author Gunz
	 * @return the memberRadioButton
	 */
	public WebElement MemberRadioButton() {
		return memberRadioButton;
	}
	
	/**
	 * @author Gunz
	 * @return the foreignBatchInvoice
	 */
	public WebElement ForeignBatchInvoice() {
		return foreignBatchInvoice;
	}

	/**
	 * @author Gunz
	 * @return the claimInvoiceNo
	 */
	public WebElement ClaimInvoiceNo() {
		return claimInvoiceNo;
	}

	/**
	 * @author Gunz
	 * @return the addButton
	 */
	public WebElement getAddButton() {
		return addButton;
	}

	/**
	 * @author Gunz
	 * @return the currencyOfPayment
	 */
	public WebElement CurrencyOfPayment() {
		return currencyOfPayment;
	}

	/**
	 * @author Gunz
	 * @return the claimCurrencyType
	 */
	public WebElement CurrencyOfClaim() {
		return currencyOfClaim;
	}

	/**
	 * @author Gunz
	 * @return the currencyCheceBox
	 */
	public WebElement CurrencyOfClaimCheceBox() {
		return currencyOfClaimCheceBox;
	}

	/**
	 * @author Gunz
	 * @return the grossCharge_TF
	 */
	public WebElement GrossCharge() {
		return grossCharge;
	}

	/**
	 * @author Gunz
	 * @return the exchangeRate
	 */
	public WebElement ExchangeRate() {
		return exchangeRate;
	}

	/**
	 * @author Gunz
	 * @return the totalAward
	 */
	public WebElement TotalAward() {
		return totalAward;
	}

	
	//1st row procedural details
	/**
	 * @author Gunz
	 * @return the addButton
	 */
	public WebElement AddButton() {
		return addButton;
	}

	/**
	 * @author Gunz
	 * @return the fstRowDeleteButton
	 */
	public WebElement FstRowDeleteButton() {
		return fstRowDeleteButton;
	}

	/**
	 * @return the fstRowModeOfEntry
	 */
	public WebElement FstRowModeOfEntry() {
		return fstRowModeOfEntry;
	}

	/**
	 * @author Gunz
	 * @return the fstRowahfozeCode
	 */
	public WebElement FstRowAhfozeCode() {
		return fstRowAhfozeCode;
	}

	/**
	 * @author Gunz
	 * @return the fstRowDrugCode
	 */
	public WebElement FstRowDrugCode() {
		return fstRowDrugCode;
	}

	/**
	 * @author Gunz
	 * @return the fstRowDrugClass
	 */
	public WebElement FstRowDrugClass() {
		return fstRowDrugClass;
	}

	/**
	 * @author Gunz
	 * @return the fstRowModifier1
	 */
	public WebElement FstRowModifier1() {
		return fstRowModifier1;
	}

	/**
	 * @author Gunz
	 * @return the fstRowModifier2
	 */
	public WebElement FstRowModifier2() {
		return fstRowModifier2;
	}

	/**
	 * @author Gunz
	 * @return the fstRowQuantity
	 */
	public WebElement FstRowQuantity() {
		return fstRowQuantity;
	}

	/**
	 * @author Gunz
	 * @return the fstRowTreatmentDate
	 */
	public WebElement FstRowTreatmentDate() {
		return fstRowTreatmentDate;
	}

	/**
	 * @author Gunz
	 * @return the fstRowServiceFee
	 */
	public WebElement FstRowServiceFee() {
		return fstRowServiceFee;
	}

	/**
	 * @author Gunz
	 * @return the fstRowMnlAwd
	 */
	public WebElement FstRowMnlAwd() {
		return fstRowMnlAwd;
	}

	/**
	 * @author Gunz
	 * @return the fstRowClmAwd
	 */
	public WebElement FstRowClmAwd() {
		return fstRowClmAwd;
	}

	/**
	 * @author Gunz
	 * @return the fstRowPlcyAwd
	 */
	public WebElement FstRowPlcyAwd() {
		return fstRowPlcyAwd;
	}

	/**
	 * @author Gunz
	 * @return the fstRowShortFallAmt
	 */
	public WebElement FstRowShortFallAmt() {
		return fstRowShortFallAmt;
	}

	/**
	 * @author Gunz
	 * @return the fstRowShortFallCode
	 */
	public WebElement FstRowShortFallCode() {
		return fstRowShortFallCode;
	}

	/**
	 * @author Gunz
	 * @return the fstRowBenefitGroup
	 */
	public WebElement FstRowBenefitGroup() {
		return fstRowBenefitGroup;
	}

	/**
	 * @author Gunz
	 * @return the fstRowBenefit
	 */
	public WebElement FstRowBenefit() {
		return fstRowBenefit;
	}

	/**
	 * @author Gunz
	 * @return the fstRowDescription
	 */
	public WebElement FstRowDescription() {
		return fstRowDescription;
	}

	/**
	 * @author Gunz
	 * @return the fstRowAward
	 */
	public WebElement FstRowAward() {
		return fstRowAward;
	}

	/**
	 * @author Gunz
	 * @return the fstRowAwardType
	 */
	public WebElement FstRowAwardType() {
		return fstRowAwardType;
	}

	/**
	 * @author Gunz
	 * @return the fstRowMnlAwdReason
	 */
	public WebElement FstRowMnlAwdReason() {
		return fstRowMnlAwdReason;
	}
	
	//2nd Row procedural details
	
	/**
	 * @author Gunz
	 * @return the secondRowDeleteButton
	 */
	public WebElement SecondRowDeleteButton() {
		return secondRowDeleteButton;
	}

	/**
	 * @author Gunz
	 * @return the secondRowModeOfEntry
	 */
	public WebElement SecondRowModeOfEntry() {
		return secondRowModeOfEntry;
	}

	/**
	 * @author Gunz
	 * @return the secondRowahfozeCode
	 */
	public WebElement SecondRowahfozeCode() {
		return secondRowahfozeCode;
	}

	/**
	 * @author Gunz
	 * @return the secondRowDrugCode
	 */
	public WebElement SecondRowDrugCode() {
		return secondRowDrugCode;
	}

	/**
	 * @author Gunz
	 * @return the secondRowDrugClass
	 */
	public WebElement SecondRowDrugClass() {
		return secondRowDrugClass;
	}

	/**
	 * @author Gunz
	 * @return the secondRowModifier1
	 */
	public WebElement SecondRowModifier1() {
		return secondRowModifier1;
	}

	/**
	 * @author Gunz
	 * @return the secondRowModifier2
	 */
	public WebElement SecondRowModifier2() {
		return secondRowModifier2;
	}

	/**
	 * @author Gunz
	 * @return the secondRowQuantity
	 */
	public WebElement SecondRowQuantity() {
		return secondRowQuantity;
	}

	/**
	 * @author Gunz
	 * @return the secondRowTreatmentDate
	 */
	public WebElement SecondRowTreatmentDate() {
		return secondRowTreatmentDate;
	}

	/**
	 * @author Gunz
	 * @return the secondRowServiceFee
	 */
	public WebElement SecondRowServiceFee() {
		return secondRowServiceFee;
	}

	/**
	 * @author Gunz
	 * @return the secondRowMnlAwd
	 */
	public WebElement SecondRowMnlAwd() {
		return secondRowMnlAwd;
	}

	/**
	 * @author Gunz
	 * @return the secondRowClmAwd
	 */
	public WebElement SecondRowClmAwd() {
		return secondRowClmAwd;
	}

	/**
	 * @author Gunz
	 * @return the secondRowPlcyAwd
	 */
	public WebElement SecondRowPlcyAwd() {
		return secondRowPlcyAwd;
	}

	/**
	 * @author Gunz
	 * @return the secondRowShortFallAmt
	 */
	public WebElement SecondRowShortFallAmt() {
		return secondRowShortFallAmt;
	}

	/**
	 * @author Gunz
	 * @return the secondRowShortFallCode
	 */
	public WebElement SecondRowShortFallCode() {
		return secondRowShortFallCode;
	}

	/**
	 * @author Gunz
	 * @return the secondRowBenefitGroup
	 */
	public WebElement SecondRowBenefitGroup() {
		return secondRowBenefitGroup;
	}

	/**
	 * @author Gunz
	 * @return the secondRowBenefit
	 */
	public WebElement SecondRowBenefit() {
		return secondRowBenefit;
	}

	/**
	 * @author Gunz
	 * @return the secondRowDescription
	 */
	public WebElement SecondRowDescription() {
		return secondRowDescription;
	}

	/**
	 * @author Gunz
	 * @return the secondRowAward
	 */
	public WebElement SecondRowAward() {
		return secondRowAward;
	}

	/**
	 * @author Gunz
	 * @return the secondRowAwardType
	 */
	public WebElement SecondRowAwardType() {
		return secondRowAwardType;
	}

	/**
	 * @author Gunz
	 * @return the secondRowMnlAwdReason
	 */
	public WebElement SecondRowMnlAwdReason() {
		return secondRowMnlAwdReason;
	}


	//3rd Row procedural details
	
	/**
	 * @author Gunz
	 * @return the thrdRowDeleteButton
	 */
	public WebElement ThrdRowDeleteButton() {
		return thrdRowDeleteButton;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowModeOfEntry
	 */
	public WebElement ThrdRowModeOfEntry() {
		return thrdRowModeOfEntry;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowahfozeCode
	 */
	public WebElement ThrdRowahfozeCode() {
		return thrdRowahfozeCode;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowDrugCode
	 */
	public WebElement ThrdRowDrugCode() {
		return thrdRowDrugCode;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowDrugClass
	 */
	public WebElement getThrdRowDrugClass() {
		return thrdRowDrugClass;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowModifier1
	 */
	public WebElement ThrdRowModifier1() {
		return thrdRowModifier1;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowModifier2
	 */
	public WebElement ThrdRowModifier2() {
		return thrdRowModifier2;
	}

	/**
	 * @return the thrdRowQuantity
	 */
	public WebElement ThrdRowQuantity() {
		return thrdRowQuantity;
	}

	/**
	 * @return the thrdRowTreatmentDate
	 */
	public WebElement ThrdRowTreatmentDate() {
		return thrdRowTreatmentDate;
	}

	/**
	 * @return the thrdRowServiceFee
	 */
	public WebElement ThrdRowServiceFee() {
		return thrdRowServiceFee;
	}

	/**
	 * @return the thrdRowMnlAwd
	 */
	public WebElement ThrdRowMnlAwd() {
		return thrdRowMnlAwd;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowClmAwd
	 */
	public WebElement ThrdRowClmAwd() {
		return thrdRowClmAwd;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowPlcyAwd
	 */
	public WebElement ThrdRowPlcyAwd() {
		return thrdRowPlcyAwd;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowShortFallAmt
	 */
	public WebElement ThrdRowShortFallAmt() {
		return thrdRowShortFallAmt;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowShortFallCode
	 */
	public WebElement ThrdRowShortFallCode() {
		return thrdRowShortFallCode;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowBenefitGroup
	 */
	public WebElement ThrdRowBenefitGroup() {
		return thrdRowBenefitGroup;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowBenefit
	 */
	public WebElement ThrdRowBenefit() {
		return thrdRowBenefit;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowDescription
	 */
	public WebElement ThrdRowDescription() {
		return thrdRowDescription;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowAward
	 */
	public WebElement ThrdRowAward() {
		return thrdRowAward;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowAwardType
	 */
	public WebElement ThrdRowAwardType() {
		return thrdRowAwardType;
	}

	/**
	 * @author Gunz
	 * @return the thrdRowMnlAwdReason
	 */
	public WebElement ThrdRowMnlAwdReason() {
		return thrdRowMnlAwdReason;
	}
	
	//4th Row Procedural Details
	
	/**
	 * @author Gunz
	 * @return the forthRowDeleteButton
	 */
	public WebElement ForthRowDeleteButton() {
		return forthRowDeleteButton;
	}

	/**
	 * @author Gunz
	 * @return the forthRowModeOfEntry
	 */
	public WebElement ForthRowModeOfEntry() {
		return forthRowModeOfEntry;
	}

	/**
	 * @author Gunz
	 * @return the forthRowAhfozeCode
	 */
	public WebElement ForthRowAhfozeCode() {
		return forthRowAhfozeCode;
	}

	/**
	 * @author Gunz
	 * @return the forthRowDrugCode
	 */
	public WebElement ForthRowDrugCode() {
		return forthRowDrugCode;
	}

	/**
	 * @author Gunz
	 * @return the forthRowDrugClass
	 */
	public WebElement ForthRowDrugClass() {
		return forthRowDrugClass;
	}

	/**
	 * @return the forthRowModifier1
	 */
	public WebElement ForthRowModifier1() {
		return forthRowModifier1;
	}

	/**
	 * @author Gunz
	 * @return the forthRowModifier2
	 */
	public WebElement ForthRowModifier2() {
		return forthRowModifier2;
	}

	/**
	 * @author Gunz
	 * @return the forthRowQuantity
	 */
	public WebElement ForthRowQuantity() {
		return forthRowQuantity;
	}

	/**
	 * @author Gunz
	 * @return the forthRowTreatmentDate
	 */
	public WebElement ForthRowTreatmentDate() {
		return forthRowTreatmentDate;
	}

	/**
	 * @return the forthRowServiceFee
	 */
	public WebElement ForthRowServiceFee() {
		return forthRowServiceFee;
	}

	/**
	 * @return the forthRowMnlAwd
	 */
	public WebElement ForthRowMnlAwd() {
		return forthRowMnlAwd;
	}

	/**
	 * @return the forthRowClmAwd
	 */
	public WebElement ForthRowClmAwd() {
		return forthRowClmAwd;
	}

	/**
	 * @return the forthRowPlcyAwd
	 */
	public WebElement ForthRowPlcyAwd() {
		return forthRowPlcyAwd;
	}

	/**
	 * @author Gunz
	 * @return the forthRowShortFallAmt
	 */
	public WebElement ForthRowShortFallAmt() {
		return forthRowShortFallAmt;
	}

	/**
	 * @author Gunz
	 * @return the forthRowShortFallCode
	 */
	public WebElement ForthRowShortFallCode() {
		return forthRowShortFallCode;
	}

	/**
	 * @author Gunz
	 * @return the forthRowBenefitGroup
	 */
	public WebElement ForthRowBenefitGroup() {
		return forthRowBenefitGroup;
	}

	/**
	 * @author Gunz
	 * @return the forthRowBenefit
	 */
	public WebElement ForthRowBenefit() {
		return forthRowBenefit;
	}

	/**
	 * @author Gunz
	 * @return the forthRowDescription
	 */
	public WebElement ForthRowDescription() {
		return forthRowDescription;
	}

	/**
	 * @author Gunz
	 * @return the forthRowAward
	 */
	public WebElement ForthRowAward() {
		return forthRowAward;
	}

	/**
	 * @author Gunz
	 * @return the forthRowAwardType
	 */
	public WebElement ForthRowAwardType() {
		return forthRowAwardType;
	}

	/**
	 * @author Gunz
	 * @return the forthRowMnlAwdReason
	 */
	public WebElement ForthRowMnlAwdReason() {
		return forthRowMnlAwdReason;
	}
	
	//Total
	
	/**
	 * @author Gunz
	 * @return the total
	 */
	public WebElement Total() {
		return total;
	}

	
	//Status Block
	/**
	 * @author Gunz
	 * @return the status
	 */
	public WebElement Status() {
		return status;
	}

	/**
	 * @author Gunz
	 * @return the submitButton
	 */
	public WebElement SubmitButton() {
		return submitButton;
	}

	/**
	 * @author Gunz
	 * @return the cancelButton
	 */
	public WebElement CancelButton() {
		return cancelButton;
	}

	/**
	 * @author Gunz
	 * @return the shortFallButton
	 */
	public WebElement ShortFallButton() {
		return shortFallButton;
	}

	/**
	 * @author Gunz
	 * @return the saveAsDraftButton
	 */
	public WebElement SaveAsDraftButton() {
		return saveAsDraftButton;
	}

	/**
	 * @author Gunz
	 * @return the createAnotherButton
	 */
	public WebElement CreateAnotherButton() {
		return createAnotherButton;
	}
	
	
	//Override
	/**
	 * @author Gunz
	 * @return the overRideBtn
	 */
	public WebElement OverRideBtn() {
		return overRideBtn;
	}

	/**
	 * @author Gunz
	 * @return the overRideTextArea
	 */
	public WebElement OverRideTextArea() {
		return overRideTextArea;
	}

	/**
	 * @author Gunz
	 * @return the overRideSubmitBtn
	 */
	public WebElement OverRideSubmitBtn() {
		return overRideSubmitBtn;
	}

	/**
	 * @author Gunz
	 * @return the overRideCancelBtn
	 */
	public WebElement OverRideCancelBtn() {
		return overRideCancelBtn;
	}

	
	//PopUp Button
	/**
	 * @author Gunz
	 * @return the batchAlert
	 */
	public WebElement AlertPopup() {
		return alertPopup;
	}
	
	/**
	 * @author Gunz
	 * @return the alertOkBtn
	 */
	public WebElement AlertOkBtn() {
		return alertOkBtn;
	}
	
	/**
	 * @author Gunz
	 * @author Gunz
	 * @return the alertMessage
	 */
	public WebElement AlertMessage() {
		return alertMessage;
	}

	//Duplicate PopUp
	/**
	 * @author Gunz
	 * @return the duplicatePopUp
	 */
	public WebElement DuplicatePopUp() {
		return duplicatePopUp;
	}

	/**
	 * @author Gunz
	 * @return the duplicatePopUpcancelBtn
	 */
	public WebElement DuplicatePopUpCancelBtn() {
		return duplicatePopUpCancelBtn;
	}

	/**
	 * @author Gunz
	 * @return the duplicateClaimIdRef
	 */
	public WebElement DuplicateClaimIdRef() {
		return duplicateClaimIdRef;
	}

	/**
	 * @author Gunz
	 * @return the duplicatePopUpName
	 */
	public WebElement DuplicatePopUpName() {
		return duplicatePopUpName;
	}
	
	/**
	 *  @author Gunz
	 * @return the duplicatePopupCloseBtn
	 */
	
	public WebElement DuplicatePopupCloseBtn() {
		return duplicatePopupCloseBtn;
	}
	

	/**
	 *  @author Gunz
	 * @return the duplicateIDs
	 */
	public List<WebElement> DuplicateIDs() {
		return duplicateIDs;
	}

}
