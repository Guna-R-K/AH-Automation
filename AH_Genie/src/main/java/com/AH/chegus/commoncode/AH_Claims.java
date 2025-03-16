package com.AH.chegus.commoncode;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.AH.chegus.genericutility.BaseClass;
import com.AH.chegus.pomrepository.AHClaimsCreatePage;
import com.AH.chegus.pomrepository.AHClaimsSearchPage;
import com.AH.chegus.pomrepository.AHHomePage;


public class AH_Claims extends BaseClass {
	public WebDriver driver;

	public AH_Claims(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Common Method For Open Create Claims Page
	
	/**
	 * This common method is used to go to claim page and click on the create button.
	 * And select the Direct Claims radio button.
	 * @author Gunz
	 * @param driver
	 */
	public void DirectClaim(WebDriver driver) {
		AHHomePage homePage = new AHHomePage(driver);
		AHClaimsSearchPage claimsSearch = new AHClaimsSearchPage(driver);
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);

		homePage.module_Claims().click();
		homePage.feature_Claims().click();

		JavascriptExecutor jse = (JavascriptExecutor)driver;

		try {
			claimsSearch.CreateButton().click();
		} catch (Exception e) {
			jse.executeScript("window.scrollBy(100,0)");
			claimsSearch.CreateButton().click();
		}

		createClaim.Directclaim().click();
	}
	
	
	/**
	 * Checking the batch is there or not.
	 * If it's not created before it will create new batch
	 * @author Gunz
	 * @param driver
	 */
	public void CreateBatch(WebDriver driver) {
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);
		
		createClaim.MemberDownloadButton().click();

		//Checking Batch ID
		for (; ; ) {
			try {
				if (createClaim.Batch().isDisplayed()) {
					createClaim.AlertOkBtn().click(); 
					createClaim.NewBatch().click();
					createClaim.CreateBatch().click(); 
					createClaim.AlertOkBtn().click();
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}
	
	
	
	/**
	 * This method is is used for enter ICD and select the ICD from dynamic drop down.
	 * @author Gunz
	 * @param driver
	 * @param icd
	 * @throws Exception
	 */
	
	public void ICD(WebDriver driver, String icd) throws Exception {
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);
		for (int i = 0 ; i<3 ; i++ ) {
			try {
				//Selecting ICD
				createClaim.IcdCode().click();
				//String Icd = fileUtility.readAHDental(icd);
				createClaim.IcdCode().sendKeys(icd);
				String syn = "//span[text()='";
				String xpath = syn + icd + "']";
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				createClaim.IcdCode().clear();
			}
		}
	}


	/**
	 * 1st row of Procedural details block
	 * @param driver
	 * @param ahfoz
	 * @param treDate
	 * @param quantity
	 * @param servfee
	 * @param benGrp
	 * @throws IOException
	 */
	public void FstRowProcedural(WebDriver driver, String ahfoz, String treDate, String quantity, String servfee, String benGrp) throws IOException {
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);
		
		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ(ahfoz));
		createClaim.FstRowTreatmentDate().click();
		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.claimsdetails(treDate));

		createClaim.FstRowQuantity().click();
		createClaim.FstRowQuantity().clear();
		createClaim.FstRowQuantity().sendKeys(fileUtility.claimsdetails(quantity));

		createClaim.FstRowServiceFee().clear();
		String sf1 = fileUtility.claimsdetails(servfee);
		//int servfee1 = Integer.parseInt(sf1);
		createClaim.FstRowServiceFee().sendKeys(sf1);

		Select fstRowbenefitGroup = new Select(createClaim.FstRowBenefitGroup());
		fstRowbenefitGroup.selectByVisibleText(fileUtility.claimsdetails(benGrp));
	}
	
	
	/**
	 * Common Method for Submit and close the popup and printing the duplicate ID's
	 * @author Gunz
	 * @return
	 * @throws Exception
	 */
	public String Submit(WebDriver driver) throws Exception {
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);
		Select status = new Select(createClaim.Status());
		String sts = status.getFirstSelectedOption().getText();
		
		createClaim.SubmitButton().click();

		for ( ; ;) {
			try {
				createClaim.AlertPopup().click();
				System.out.println("Claims_ID : " + createClaim.AlertMessage().getText());
				createClaim.AlertOkBtn().click();
				break;
			} catch (Exception e) {
				if (createClaim.DuplicatePopUp().isDisplayed()) {
					System.out.print("Duplicate ClaimID's: ");

					//printing Duplicate ID's 
					for (WebElement claimID : createClaim.DuplicateIDs()) {
						String id = claimID.getAttribute("id");
						WebElement duplicateID = driver.findElement(By.id(id));
						System.out.print(duplicateID.getText() + ", ");
					}
					System.out.println();
					createClaim.DuplicatePopupCloseBtn().click();
				}
			}
		}
		
		System.out.println("Status : " + sts);
		if (sts.equalsIgnoreCase("Claim Validation Failed")) {
			System.out.println(createClaim.FstRowShortFallCode().getText());
		}
		return status.getFirstSelectedOption().getText();
	}
	
	/**
	 * OverRideing the claims.
	 * @author Gunz
	 * @throws Exception
	 */
	public void OverRideBtn(WebDriver driver) throws Exception {
		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);
		if (createClaim.OverRideBtn().isDisplayed()) {
			createClaim.OverRideBtn().click();
			createClaim.OverRideTextArea().sendKeys(fileUtility.readAHDental("override"));
			createClaim.OverRideSubmitBtn().click();
			
			String msg = createClaim.AlertMessage().getText();
			System.out.println("Claims_ID : " + msg);
			createClaim.AlertOkBtn().click();
		}
	}
}
