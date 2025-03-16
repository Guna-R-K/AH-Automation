package Testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testscript {
	@Test
	public void testScript() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("http://119.82.108.150:8766/AHTestLinkAug/login.html");
		
		driver.findElement(By.id("usrnm")).sendKeys("Guna");
		driver.findElement(By.id("pwd")).sendKeys("Chegus@1234");
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.xpath("//*[@id=\"body_ID\"]/div[5]/div[1]/button")).click();
		driver.findElement(By.xpath("//b[text()='Underwriting']")).click();
		driver.findElement(By.linkText("Individual Proposal")).click();
		WebElement stsId = driver.findElement(By.id("stsId"));
		Select stsId_DD = new Select(stsId);
		stsId_DD.selectByVisibleText("Accepted");

//		List<WebElement> dir = driver.findElements(By.xpath("//*[@id=\"body_ID\"]/div[5]/div[1]/button"));
//		WebElement sam = driver.findElement(By.xpath("//*[@id=\"body_ID\"]/div[5]/div[1]/button"));

	}
}
