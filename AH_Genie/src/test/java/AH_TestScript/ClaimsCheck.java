package AH_TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.AH.chegus.genericutility.BaseClass;
import com.AH.chegus.pomrepository.AHClaimsCreatePage;
import com.AH.chegus.pomrepository.AHClaimsSearchPage;
import com.AH.chegus.pomrepository.AHHomePage;

public class ClaimsCheck extends BaseClass{
	@Test
	public void name() throws Throwable {
		AHHomePage homePage = new AHHomePage(driver);
		homePage.module_Claims().click(); homePage.feature_Claims().click();

		AHClaimsSearchPage claimsSearch = new AHClaimsSearchPage(driver);
		claimsSearch.CreateButton().click();

		AHClaimsCreatePage createClaim = new AHClaimsCreatePage(driver);
		createClaim.Directclaim().click();

		createClaim.MemberId().sendKeys(fileUtility.readDataFromProertyFiles("C:\\Users\\gunaseelan\\eclipse-workspace\\AH_Genie\\src\\test\\resoures\\ahdentalclaim.txt", "memberid"));
		createClaim.ClaimCloseDate().sendKeys(fileUtility.readDataFromProertyFiles("C:\\\\Users\\\\gunaseelan\\\\eclipse-workspace\\\\AH_Genie\\\\src\\\\test\\\\resoures\\\\ahdentalclaim.txt", "claimclosedate"));
		createClaim.ClaimReceivedDate().sendKeys(fileUtility.readDataFromProertyFiles("C:\\\\Users\\\\gunaseelan\\\\eclipse-workspace\\\\AH_Genie\\\\src\\\\test\\\\resoures\\\\ahdentalclaim.txt", "claimreceiveddate"));
		createClaim.MemberDownloadButton().click();
		
		if (createClaim.AlertPopup().isDisplayed()) {
			/*
			 * Alert alert = driver.switchTo().alert(); alert.accept();
			 */
			createClaim.AlertOkBtn().click();
			createClaim.NewBatch().click();
			createClaim.CreateBatch().click();
			createClaim.AlertOkBtn().click();
		}
		 
		//selecting service provider.
		createClaim.ServiceProvider().sendKeys(fileUtility.readDataFromProertyFiles("C:\\\\\\\\Users\\\\\\\\gunaseelan\\\\\\\\eclipse-workspace\\\\\\\\AH_Genie\\\\\\\\src\\\\\\\\test\\\\\\\\resoures\\\\\\\\ahdentalclaim.txt", "sp"));
		//sending ICD
		createClaim.IcdCode().sendKeys(fileUtility.readDataFromProertyFiles("C:\\\\Users\\\\gunaseelan\\\\eclipse-workspace\\\\AH_Genie\\\\src\\\\test\\\\resoures\\\\ahdentalclaim.txt", "icd"));
		//selecting ICD
		String icd = fileUtility.readDataFromProertyFiles("C:\\\\Users\\\\gunaseelan\\\\eclipse-workspace\\\\AH_Genie\\\\src\\\\test\\\\resoures\\\\ahdentalclaim.txt", "icd");
		String syn = "//span[text()='";
		String xpath = syn + icd + "']";
		driver.findElement(By.xpath(xpath)).click();
		
			}
	 
}
