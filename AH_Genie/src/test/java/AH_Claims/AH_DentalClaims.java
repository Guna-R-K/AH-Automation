package AH_Claims;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.AH.chegus.commoncode.AH_Claims;
import com.AH.chegus.genericutility.BaseClass;
import com.AH.chegus.pomrepository.AHClaimsCreatePage;

public class AH_DentalClaims extends BaseClass {

	@Test
	public void DentalClaim() throws Exception {
		//Using common method to open claims create page	
		AH_Claims claims = new AH_Claims(driver);
		claims.DirectClaim(driver);

		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);
		//JavascriptExecutor jse = (JavascriptExecutor)driver;

		//Fetching Member details
		createClaim.MemberId().sendKeys(fileUtility.readAHDental("memberid"));
		createClaim.ClaimReceivedDate().sendKeys(fileUtility.readAHDental("claimreceiveddate"));
		createClaim.ClaimCloseDate().sendKeys(fileUtility.readAHDental("claimclosedate"));
		
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

		//Selecting service provider.
		createClaim.ServiceProvider().sendKeys(fileUtility.readSP("spdental2"));
		Select type = new Select(createClaim.ClaimType());
		type.selectByVisibleText("Drug");
		Thread.sleep(2000);
		type.selectByVisibleText("Procedural");
		Thread.sleep(2000);

		//Selecting ICD
		String ICD = fileUtility.readICD("dentalicd3");
		claims.ICD(driver, ICD);

		//Charges Block
		createClaim.ProviderRadioButton().click();
		Thread.sleep(2500);
		createClaim.MemberRadioButton().click();
		createClaim.ForeignBatchInvoice().sendKeys("123"); 
		createClaim.ClaimInvoiceNo().sendKeys("INO123");
		createClaim.CurrencyOfClaimCheceBox().click();

		createClaim.GrossCharge().sendKeys(fileUtility.readAHDental("grosscharge"));
		Thread.sleep(2000);

		Select currency = new Select(createClaim.CurrencyOfClaim());
		currency.selectByVisibleText("Zimbabwean dollar");
		currency.selectByVisibleText("US Dollar");

		//procedural 
		//Check


		createClaim.SecondRowahfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozdental6"));
		Thread.sleep(2000);
		createClaim.SecondRowDeleteButton().click();
		Thread.sleep(2000);
		createClaim.ForthRowDeleteButton().click();
		Thread.sleep(2000);
		createClaim.AddButton().click();
		Thread.sleep(2000);

		createClaim.FstRowAhfozeCode().sendKeys(fileUtility.readAHFoZ("ahfozdental7"));
		createClaim.FstRowTreatmentDate().click();
		createClaim.FstRowTreatmentDate().sendKeys(fileUtility.readAHDental("treamentdate"));

		createClaim.FstRowQuantity().click();
		//createClaim.FstRowQuantity().clear();

		createClaim.FstRowServiceFee().clear();
		createClaim.FstRowServiceFee().click();
		createClaim.FstRowServiceFee().sendKeys(fileUtility.readAHDental("servfee1"));

		Select benefitGroup = new Select(createClaim.FstRowBenefitGroup());
		benefitGroup.selectByVisibleText(fileUtility.readAHDental("benefotgroup"));

		claims.Submit(driver);

		claims.OverRideBtn(driver);

	}
}
