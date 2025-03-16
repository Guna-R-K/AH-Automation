package AH_Claims;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.AH.chegus.commoncode.AH_Claims;
import com.AH.chegus.genericutility.BaseClass;
import com.AH.chegus.pomrepository.AHClaimsCreatePage;

public class AH_Claims_ShortFall extends BaseClass {

	
	// c - Benefit Exhausted & D - Excess of Tariff 
	@Test(priority = 1)
	public void ShortFall_C$D() throws Exception {
		AH_Claims claims = new AH_Claims(driver);
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);

		//Open Claims Create Page
		//claims.DirectClaim(driver);

		//Fetching Member details
		createClaim.MemberId().sendKeys(fileUtility.claimsdetails("memberid"));;
		createClaim.ClaimReceivedDate().sendKeys(fileUtility.claimsdetails("claimreceiveddatecd"));
		createClaim.ClaimCloseDate().sendKeys(fileUtility.claimsdetails("claimclosedatecd"));
		Thread.sleep(500);
		
		claims.CreateBatch(driver);
		
//		createClaim.MemberDownloadButton().click();
//
//		//Checking Batch ID
//		for (; ; ) {
//			try {
//				if (createClaim.Batch().isDisplayed()) {
//					createClaim.AlertOkBtn().click(); 
//					createClaim.NewBatch().click();
//					createClaim.CreateBatch().click(); 
//					createClaim.AlertOkBtn().click();
//					break;
//				}
//			} catch (Exception e) {
//				break;
//			}
//		}

		//Selecting Service Provider
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		createClaim.ServiceProvider().sendKeys(fileUtility.readSP("spdental1"));

		//Selecting ICD
		String ICD = fileUtility.readICD("dentalicd1");
		claims.ICD(driver, ICD);

		//Charges Block
		createClaim.MemberRadioButton().click();
		createClaim.GrossCharge().sendKeys(fileUtility.claimsdetails("grosschargecd"));
		jse.executeScript("window.scrollBy(0,300)");

		//Procedural Block 1st Row 
		
		claims.FstRowProcedural(driver, "ahfozdental1", "treamentdate1cd", "quantity1cd", "servfee1cd", "op");
		
//		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozdental1"));
//		createClaim.FstRowTreatmentDate().click();
//		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate1cd"));
//
//		createClaim.FstRowQuantity().click();
//		createClaim.FstRowQuantity().clear();
//		createClaim.FstRowQuantity().sendKeys(fileUtility.claimsdetails("quantity1cd"));
//
//		createClaim.FstRowServiceFee().clear();
//		String sf1 = fileUtility.claimsdetails("servfee1cd");
//		//int servfee1 = Integer.parseInt(sf1);
//		createClaim.FstRowServiceFee().sendKeys(sf1);
//
//		Select fstRowbenefitGroup = new Select(createClaim.FstRowBenefitGroup());
//		fstRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		//Procedural Block 2st Row 
		createClaim.SecondRowahfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozdental2"));
		createClaim.SecondRowTreatmentDate().click();
		createClaim.SecondRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate2cd"));

		createClaim.SecondRowQuantity().click();
		createClaim.SecondRowQuantity().clear();
		createClaim.SecondRowQuantity().sendKeys(fileUtility.claimsdetails("quantity2cd"));

		createClaim.SecondRowServiceFee().clear();
		String sf2 = fileUtility.claimsdetails("servfee2cd");
		//int servfee2 = Integer.parseInt(sf2);
		createClaim.SecondRowServiceFee().sendKeys(sf2);

		Select SecondRowbenefitGroup = new Select(createClaim.SecondRowBenefitGroup());
		SecondRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		//Procedural Block 3st Row 
		createClaim.ThrdRowahfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozdental3"));
		createClaim.ThrdRowTreatmentDate().click();
		createClaim.ThrdRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate3cd"));

		createClaim.ThrdRowQuantity().click();
		createClaim.ThrdRowQuantity().clear();
		createClaim.ThrdRowQuantity().sendKeys(fileUtility.claimsdetails("quantity3cd"));

		createClaim.ThrdRowServiceFee().clear();
		String sf3 = fileUtility.claimsdetails("servfee3cd");
		//int servfee3 = Integer.parseInt(sf3);
		createClaim.ThrdRowServiceFee().sendKeys(sf3);

		Select ThrdRowbenefitGroup = new Select(createClaim.ThrdRowBenefitGroup());
		ThrdRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		claims.Submit(driver);
		
		//1st Row short fall code checking
//		String claimawd1 = createClaim.FstRowClmAwd().getText();
//		int clmawd1 = Integer.parseInt(claimawd1);
//		if (sf1.equals(createClaim.FstRowClmAwd().getText())) {
//			
//		} else  {
//			int bal = servfee1 - clmawd1;
//			int shortFallAmt = Integer.parseInt(createClaim.FstRowShortFallAmt().getText());
//			if (bal == shortFallAmt) {
//				System.out.println("Short Fall Code: " + createClaim.FstRowShortFallCode().getText());
//			}
//		}

	}

	
	//E - Grouped Benefit Exhausted
	@Test(priority = 2)
	public void ShortFall_E() throws Exception {
		AH_Claims claims = new AH_Claims(driver);
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);


		//Open Claims Create Page
		claims.DirectClaim(driver);

		//Fetching Member details
		createClaim.MemberId().sendKeys(fileUtility.claimsdetails("memberid"));;
		createClaim.ClaimReceivedDate().sendKeys(fileUtility.claimsdetails("claimreceiveddateshortE"));
		createClaim.ClaimCloseDate().sendKeys(fileUtility.claimsdetails("claimclosedateshortE"));
		Thread.sleep(500);
		
		claims.CreateBatch(driver);
		
//		createClaim.MemberDownloadButton().click();
//
//		//Checking Batch ID
//		for (; ; ) {
//			try {
//				if (createClaim.Batch().isDisplayed()) {
//					createClaim.AlertOkBtn().click(); 
//					createClaim.NewBatch().click();
//					createClaim.CreateBatch().click(); 
//					createClaim.AlertOkBtn().click();
//					break;
//				}
//			} catch (Exception e) {
//				break;
//			}
//		}

		//Selecting Service Provider
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		createClaim.ServiceProvider().sendKeys(fileUtility.readSP("sppathology1"));

		//Selecting ICD
		String ICD = fileUtility.readICD("pathologyicd1");
		claims.ICD(driver, ICD);

		//Charges Block
		createClaim.MemberRadioButton().click();
		createClaim.GrossCharge().sendKeys(fileUtility.claimsdetails("grosschargeshortE"));
		jse.executeScript("window.scrollBy(0,300)");

		//Procedural Block 1st Row 
		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozpathology1"));
		createClaim.FstRowTreatmentDate().click();
		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate1shortE"));

		createClaim.FstRowQuantity().click();
		//createClaim.FstRowQuantity().clear();
		//createClaim.FstRowQuantity().sendKeys(fileUtility.claimsdetails("quantity1shortE"));

		createClaim.FstRowServiceFee().clear();
		String sf1 = fileUtility.claimsdetails("servfee1shortE");
		//int servfee1 = Integer.parseInt(sf1);
		createClaim.FstRowServiceFee().sendKeys(sf1);

		Select fstRowbenefitGroup = new Select(createClaim.FstRowBenefitGroup());
		fstRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		claims.Submit(driver);

	}

	
	
	//F - Claim Control Totals Mismatch
	@Test(priority = 3)
	public void ShortFall_F() throws Exception {
		AH_Claims claims = new AH_Claims(driver);
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);


		//Open Claims Create Page
		claims.DirectClaim(driver);

		//Fetching Member details
		createClaim.MemberId().sendKeys(fileUtility.claimsdetails("memberid"));;
		createClaim.ClaimReceivedDate().sendKeys(fileUtility.claimsdetails("claimreceiveddateshortF"));
		createClaim.ClaimCloseDate().sendKeys(fileUtility.claimsdetails("claimclosedateshortF"));
		Thread.sleep(500);
		
		claims.CreateBatch(driver);
		
//		createClaim.MemberDownloadButton().click();
//
//		//Checking Batch ID
//		for (; ; ) {
//			try {
//				if (createClaim.Batch().isDisplayed()) {
//					createClaim.AlertOkBtn().click(); 
//					createClaim.NewBatch().click();
//					createClaim.CreateBatch().click(); 
//					createClaim.AlertOkBtn().click();
//					break;
//				}
//			} catch (Exception e) {
//				break;
//			}
//		}

		//Selecting Service Provider
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		createClaim.ServiceProvider().sendKeys(fileUtility.readSP("spoptical2"));

		//Selecting ICD
		String ICD = fileUtility.readICD("opticalicd1");
		claims.ICD(driver, ICD);

		//Charges Block
		createClaim.MemberRadioButton().click();
		createClaim.GrossCharge().sendKeys(fileUtility.claimsdetails("grosschargeshortF"));
		jse.executeScript("window.scrollBy(0,300)");

		//Procedural Block 1st Row 
		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozoptical2"));
		createClaim.FstRowTreatmentDate().click();
		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate1shortF"));

		createClaim.FstRowQuantity().click();
		//createClaim.FstRowQuantity().clear();
		//createClaim.FstRowQuantity().sendKeys(fileUtility.claimsdetails("quantity1shortF"));

		createClaim.FstRowServiceFee().clear();
		String sf1 = fileUtility.claimsdetails("servfee1shortF");
		//int servfee1 = Integer.parseInt(sf1);
		createClaim.FstRowServiceFee().sendKeys(sf1);
		
		Select fstRowbenefitGroup = new Select(createClaim.FstRowBenefitGroup());
		fstRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		claims.Submit(driver);
	}

	
	//G - Claim Dates Mismatch
	@Test(priority = 4)
	public void ShortFall_G() throws Exception {
		AH_Claims claims = new AH_Claims(driver);
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);


		//Open Claims Create Page
		claims.DirectClaim(driver);

		//Fetching Member details
		createClaim.MemberId().sendKeys(fileUtility.claimsdetails("memberid"));;
		createClaim.ClaimReceivedDate().sendKeys(fileUtility.claimsdetails("claimreceiveddateshortG"));
		createClaim.ClaimCloseDate().sendKeys(fileUtility.claimsdetails("claimclosedateshortG"));
		Thread.sleep(500);
		
		claims.CreateBatch(driver);
		
//		createClaim.MemberDownloadButton().click();
//
//		//Checking Batch ID
//		for (; ; ) {
//			try {
//				if (createClaim.Batch().isDisplayed()) {
//					createClaim.AlertOkBtn().click(); 
//					createClaim.NewBatch().click();
//					createClaim.CreateBatch().click(); 
//					createClaim.AlertOkBtn().click();
//					break;
//				}
//			} catch (Exception e) {
//				break;
//			}
//		}

		//Selecting Service Provider
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		createClaim.ServiceProvider().sendKeys(fileUtility.readSP("spconsultation1"));

		//Selecting ICD
		String ICD = fileUtility.readICD("consultationicd1");
		claims.ICD(driver, ICD);

		//Charges Block
		createClaim.MemberRadioButton().click();
		createClaim.GrossCharge().sendKeys(fileUtility.claimsdetails("grosschargeshortG"));
		jse.executeScript("window.scrollBy(0,300)");


		//Procedural Block 1st Row 
		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozconsultation1"));
		createClaim.FstRowTreatmentDate().click();
		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate1shortG"));

		createClaim.FstRowQuantity().click();
		//createClaim.FstRowQuantity().clear();
		//createClaim.FstRowQuantity().sendKeys(fileUtility.claimsdetails("quantity1shortG"));

		createClaim.FstRowServiceFee().clear();
		String sf1 = fileUtility.claimsdetails("servfee1shortG");
		//int servfee1 = Integer.parseInt(sf1);
		createClaim.FstRowServiceFee().sendKeys(sf1);
		
		Select fstRowbenefitGroup = new Select(createClaim.FstRowBenefitGroup());
		fstRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		//Procedural Block 2st Row 
		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozconsultation2"));
		createClaim.FstRowTreatmentDate().click();
		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate2shortG"));

		createClaim.FstRowQuantity().click();
		//createClaim.FstRowQuantity().clear();
		//createClaim.FstRowQuantity().sendKeys(fileUtility.claimsdetails("quantity2shortG"));

		createClaim.FstRowServiceFee().clear();
		String sf2 = fileUtility.claimsdetails("servfee2shortG");
		//int servfee1 = Integer.parseInt(sf2);
		createClaim.FstRowServiceFee().sendKeys(sf2);
		
		Select secondRowBenefitGroup = new Select(createClaim.SecondRowBenefitGroup());
		secondRowBenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		claims.Submit(driver);
	}
	
	

	//M - Out of Date Claim 
	@Test(priority = 5)
	public void ShortFall_M() throws Exception {
		AH_Claims claims = new AH_Claims(driver);
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);


		//Open Claims Create Page
		claims.DirectClaim(driver);

		//Fetching Member details
		createClaim.MemberId().sendKeys(fileUtility.claimsdetails("memberid"));;
		createClaim.ClaimReceivedDate().sendKeys(fileUtility.claimsdetails("claimreceiveddateshortM"));
		createClaim.ClaimCloseDate().sendKeys(fileUtility.claimsdetails("claimclosedateshortM"));
		Thread.sleep(500);
		
		claims.CreateBatch(driver);
		
//		createClaim.MemberDownloadButton().click();
//
//		//Checking Batch ID
//		for (; ; ) {
//			try {
//				if (createClaim.Batch().isDisplayed()) {
//					createClaim.AlertOkBtn().click(); 
//					createClaim.NewBatch().click();
//					createClaim.CreateBatch().click(); 
//					createClaim.AlertOkBtn().click();
//					break;
//				}
//			} catch (Exception e) {
//				break;
//			}
//		}

		//Selecting Service Provider
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		createClaim.ServiceProvider().sendKeys(fileUtility.readSP("spoptical2"));

		//Selecting ICD
		String ICD = fileUtility.readICD("opticalicd1");
		claims.ICD(driver, ICD);

		//Charges Block
		createClaim.MemberRadioButton().click();
		createClaim.GrossCharge().sendKeys(fileUtility.claimsdetails("grosschargeshortM"));
		jse.executeScript("window.scrollBy(0,300)");

		//Procedural Block 1st Row 
		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozoptical2"));
		createClaim.FstRowTreatmentDate().click();
		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate1shortM"));

		createClaim.FstRowQuantity().click();
		//createClaim.FstRowQuantity().clear();
		//createClaim.FstRowQuantity().sendKeys(fileUtility.claimsdetails("quantity1shortM"));

		createClaim.FstRowServiceFee().clear();
		String sf1 = fileUtility.claimsdetails("servfee1shortM");
		//int servfee1 = Integer.parseInt(sf1);
		createClaim.FstRowServiceFee().sendKeys(sf1);

		Select fstRowbenefitGroup = new Select(createClaim.FstRowBenefitGroup());
		fstRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		claims.Submit(driver);
	}
	
	

	// X - Sex Related Tariff 
	@Test(priority = 6)
	public void ShortFall_X() throws Exception {
		AH_Claims claims = new AH_Claims(driver);
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);


		//Open Claims Create Page
		claims.DirectClaim(driver);

		//Fetching Member details
		createClaim.MemberId().sendKeys(fileUtility.claimsdetails("memberid"));;
		createClaim.ClaimReceivedDate().sendKeys(fileUtility.claimsdetails("claimreceiveddateshortX"));
		createClaim.ClaimCloseDate().sendKeys(fileUtility.claimsdetails("claimclosedateshortX"));
		Thread.sleep(500);
		
		claims.CreateBatch(driver);
		
//		createClaim.MemberDownloadButton().click();
//
//		//Checking Batch ID
//		for (; ; ) {
//			try {
//				if (createClaim.Batch().isDisplayed()) {
//					createClaim.AlertOkBtn().click(); 
//					createClaim.NewBatch().click();
//					createClaim.CreateBatch().click(); 
//					createClaim.AlertOkBtn().click();
//					break;
//				}
//			} catch (Exception e) {
//				break;
//			}
//		}

		//Selecting Service Provider
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		createClaim.ServiceProvider().sendKeys(fileUtility.readSP("spmaternity1"));

		//Selecting ICD
		String ICD = fileUtility.readICD("maternityicd1");
		claims.ICD(driver, ICD);

		//Charges Block
		createClaim.MemberRadioButton().click();
		createClaim.GrossCharge().sendKeys(fileUtility.claimsdetails("grosschargeshortX"));
		jse.executeScript("window.scrollBy(0,300)");

		//Procedural Block 1st Row 
		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozmaternity1"));
		createClaim.FstRowTreatmentDate().click();
		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate1shortX"));

		createClaim.FstRowQuantity().click();
		//createClaim.FstRowQuantity().clear();
		//createClaim.FstRowQuantity().sendKeys(fileUtility.claimsdetails("quantity1shortX"));

		createClaim.FstRowServiceFee().clear();
		String sf1 = fileUtility.claimsdetails("servfee1shortX");
		//int servfee1 = Integer.parseInt(sf1);
		createClaim.FstRowServiceFee().sendKeys(sf1);

		Select fstRowbenefitGroup = new Select(createClaim.FstRowBenefitGroup());
		fstRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		claims.Submit(driver);
	}
	
	
	// A5 - Provider Cannot Carry Out Treatment 
	@Test(priority = 7)
	public void ShortFall_A5() throws Exception {
		AH_Claims claims = new AH_Claims(driver);
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);


		//Open Claims Create Page
		claims.DirectClaim(driver);

		//Fetching Member details
		createClaim.MemberId().sendKeys(fileUtility.claimsdetails("memberid"));;
		createClaim.ClaimReceivedDate().sendKeys(fileUtility.claimsdetails("claimreceiveddateshortA5"));
		createClaim.ClaimCloseDate().sendKeys(fileUtility.claimsdetails("claimclosedateshortA5"));
		Thread.sleep(500);
		
		claims.CreateBatch(driver);
		
//		createClaim.MemberDownloadButton().click();
//
//		//Checking Batch ID
//		for (; ; ) {
//			try {
//				if (createClaim.Batch().isDisplayed()) {
//					createClaim.AlertOkBtn().click(); 
//					createClaim.NewBatch().click();
//					createClaim.CreateBatch().click(); 
//					createClaim.AlertOkBtn().click();
//					break;
//				}
//			} catch (Exception e) {
//				break;
//			}
//		}

		//Selecting Service Provider
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		createClaim.ServiceProvider().sendKeys(fileUtility.readSP("spoptical1"));

		//Selecting ICD
		String ICD = fileUtility.readICD("dentalicd2");
		claims.ICD(driver, ICD);

		//Charges Block
		createClaim.MemberRadioButton().click();
		createClaim.GrossCharge().sendKeys(fileUtility.claimsdetails("grosschargeshortA5"));
		jse.executeScript("window.scrollBy(0,300)");

		//Procedural Block 1st Row 
		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozdental5"));
		createClaim.FstRowTreatmentDate().click();
		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate1shortA5"));

		createClaim.FstRowQuantity().click();
		//createClaim.FstRowQuantity().clear();
		//createClaim.FstRowQuantity().sendKeys(fileUtility.claimsdetails("quantity1shortA5"));

		createClaim.FstRowServiceFee().clear();
		String sf1 = fileUtility.claimsdetails("servfee1shortA5");
		//int servfee1 = Integer.parseInt(sf1);
		createClaim.FstRowServiceFee().sendKeys(sf1);

		Select fstRowbenefitGroup = new Select(createClaim.FstRowBenefitGroup());
		fstRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		claims.Submit(driver);
	}
	
	
	// A9 - Treatment Award Not Found 
	@Test(priority = 8)
	public void ShortFall_A9() throws Exception {
		AH_Claims claims = new AH_Claims(driver);
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);


		//Open Claims Create Page
		claims.DirectClaim(driver);

		//Fetching Member details
		createClaim.MemberId().sendKeys(fileUtility.claimsdetails("memberid"));;
		createClaim.ClaimReceivedDate().sendKeys(fileUtility.claimsdetails("claimreceiveddateshortA5"));
		createClaim.ClaimCloseDate().sendKeys(fileUtility.claimsdetails("claimclosedateshortA5"));
		Thread.sleep(500);
		
		claims.CreateBatch(driver);
		
//		createClaim.MemberDownloadButton().click();
//
//		//Checking Batch ID
//		for (; ; ) {
//			try {
//				if (createClaim.Batch().isDisplayed()) {
//					createClaim.AlertOkBtn().click(); 
//					createClaim.NewBatch().click();
//					createClaim.CreateBatch().click(); 
//					createClaim.AlertOkBtn().click();
//					break;
//				}
//			} catch (Exception e) {
//				break;
//			}
//		}

		//Selecting Service Provider
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		createClaim.ServiceProvider().sendKeys(fileUtility.readSP("spoptical1"));

		//Selecting ICD
		String ICD = fileUtility.readICD("dentalicd2");
		claims.ICD(driver, ICD);

		//Charges Block
		createClaim.MemberRadioButton().click();
		createClaim.GrossCharge().sendKeys(fileUtility.claimsdetails("grosschargeshortA5"));
		jse.executeScript("window.scrollBy(0,300)");

		//Procedural Block 1st Row 
		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ("ahfoz0dental"));
		createClaim.FstRowTreatmentDate().click();
		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate1shortA5"));

		createClaim.FstRowQuantity().click();
		//createClaim.FstRowQuantity().clear();
		//createClaim.FstRowQuantity().sendKeys(fileUtility.claimsdetails("quantity1shortA5"));

		createClaim.FstRowServiceFee().clear();
		String sf1 = fileUtility.claimsdetails("servfee1shortA5");
		//int servfee1 = Integer.parseInt(sf1);
		createClaim.FstRowServiceFee().sendKeys(sf1);
		
		Select fstRowbenefitGroup = new Select(createClaim.FstRowBenefitGroup());
		fstRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		claims.Submit(driver);
	}
	
	
	// A10 - Treatment Requires Referring Provider
	@Test(priority = 9)
	public void ShortFall_A10() throws Exception {
		AH_Claims claims = new AH_Claims(driver);
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);


		//Open Claims Create Page
		claims.DirectClaim(driver);

		//Fetching Member details - details taken from common block
		createClaim.MemberId().sendKeys(fileUtility.claimsdetails("memberid"));;
		createClaim.ClaimReceivedDate().sendKeys(fileUtility.claimsdetails("claimreceiveddate"));
		createClaim.ClaimCloseDate().sendKeys(fileUtility.claimsdetails("claimclosedate"));
		Thread.sleep(500);
		
		claims.CreateBatch(driver);
		
//		createClaim.MemberDownloadButton().click();
//
//		//Checking Batch ID
//		for (; ; ) {
//			try {
//				if (createClaim.Batch().isDisplayed()) {
//					createClaim.AlertOkBtn().click(); 
//					createClaim.NewBatch().click();
//					createClaim.CreateBatch().click(); 
//					createClaim.AlertOkBtn().click();
//					break;
//				}
//				
//			} catch (Exception e) {
//				break;
//			}
//		}

		//Selecting Service Provider
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		createClaim.ServiceProvider().sendKeys(fileUtility.readSP("refspoptical"));

		//Selecting ICD
		String ICD = fileUtility.readICD("opticalicd2");
		claims.ICD(driver, ICD);

		//Charges Block
		createClaim.MemberRadioButton().click();
		createClaim.GrossCharge().sendKeys(fileUtility.claimsdetails("grosscharge"));
		jse.executeScript("window.scrollBy(0,300)");

		//Procedural Block 1st Row 
		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozoptical2"));
		createClaim.FstRowTreatmentDate().click();
		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.claimsdetails("treamentdate1"));

		createClaim.FstRowQuantity().click();
		//createClaim.FstRowQuantity().clear();
		//createClaim.FstRowQuantity().sendKeys(fileUtility.claimsdetails("quantity1"));

		createClaim.FstRowServiceFee().clear();
		String sf1 = fileUtility.claimsdetails("servfee1");
		//int servfee1 = Integer.parseInt(sf1);
		createClaim.FstRowServiceFee().sendKeys(sf1);

		Select fstRowbenefitGroup = new Select(createClaim.FstRowBenefitGroup());
		fstRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails("op"));

		claims.Submit(driver);
	}
	
	
//	//
//	@Test
//	public void ShortFall_A() {
//		
//	}
	
}
