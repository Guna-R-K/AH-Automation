package AH_TestScript;

import java.util.Set;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.AH.chegus.genericutility.BaseClass;
import com.AH.chegus.pomrepository.AHHomePage;
import com.AH.chegus.pomrepository.AHIndividualCreatePage;
import com.AH.chegus.pomrepository.AHIndividualSearchPage;
import com.AH.chegus.pomrepository.AHUploadPopup;

public class CreateIndividualPolicy extends BaseClass {
	
	@Test	
	public void individualPolicy() throws Exception {
		AHHomePage homePage = new AHHomePage(driver);
		homePage.underwriting().click();
		homePage.individual_Proposal().click();
		
		AHIndividualSearchPage individualSearchPage = new AHIndividualSearchPage(driver);
		
		Select statusDD = new Select(individualSearchPage.StsId_DD());
		statusDD.selectByVisibleText("Accepted");
		individualSearchPage.SearchButton().click();
		Select entri_DD = new Select(individualSearchPage.Entries_DD());
		entri_DD.selectByVisibleText("50");
		individualSearchPage.CreateButton().click();
		
		AHIndividualCreatePage createIndividual = new AHIndividualCreatePage(driver);
		Select sob_DD = new Select(createIndividual.Sob());
		sob_DD.selectByVisibleText("Agent");
		
		createIndividual.AgentNameList().sendKeys(fileUtility.readDataFromProertyFiles("C:\\Users\\gunaseelan\\eclipse-workspace\\AH_Genie\\src\\test\\resoures\\AHcommondata.txt", "agent"));
		Select product = new Select(createIndividual.Product());
		product.selectByVisibleText("Alliance Options Select Individual USD");
		createIndividual.EffectiveDate().sendKeys("01-09-2023");
		Select scheme = new Select(createIndividual.Scheme());
		scheme.selectByVisibleText("Select 1");
		
		//parent window ID
		String createpageID = driver.getWindowHandle();
		createIndividual.UploadMemberButton().click();
		Set<String> windows = driver.getWindowHandles();
		
		//Switch to child window
		for (String id : windows) {
			if (id.equals(createpageID)) {
				
			}else {
				driver.switchTo().window(id);
				AHUploadPopup childWindow = new AHUploadPopup(driver);
				childWindow.ChooseFileButton().sendKeys("C:\\Users\\gunaseelan\\eclipse-workspace\\AH_Genie\\src\\test\\resoures\\Ind.xlsx");
				childWindow.UploadButton().click();
				childWindow.SubmitButton().click();;
			}
		}
		
		driver.switchTo().window(createpageID);
		createIndividual.CalculateButton().click();
		Select status = new Select(createIndividual.Status());
		status.selectByVisibleText("In Progress");
//		createIndividual.SubmitButton();
//		createIndividual.ProposalID().Attribute("value");
		
	}
}
