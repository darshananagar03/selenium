package app3.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app3.base.TestBase;

public class HomePage extends TestBase{
	
	//PageFactory - OR
	@FindBy(css="button.sc-bdfBwQ.dYJLN.btn.btn-sm.w-auto.m-0")
	WebElement viewPPCReport;
	
	//homeToOpportunity
	
	@FindBy(xpath="//*[@id=\"accounts\"]/div/div[2]/div[1]/table/tbody/tr[3]/td[1]/div/div[3]/button/i")
	WebElement benAGoogleAdsAPI;
	
	//Initializing the Page Objects:
	public HomePage() { 
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	public PPCReportPage clickOnViewPPCReport() { 
			viewPPCReport.click();
			return new PPCReportPage();
		}
		public OpportunityPage clickOnHomeToOpportunity() {
			benAGoogleAdsAPI.click();
			return new OpportunityPage();
		}
}
