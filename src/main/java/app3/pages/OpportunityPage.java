package app3.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app3.base.TestBase;

public class OpportunityPage extends TestBase {
	@FindBy(xpath="//*[@id=\"App\"]/div/div[7]/div/div[1]/aside/div/div[1]/h6[1]")
	WebElement categories;
	
	@FindBy(css="p.mt-3.mb-3]")
	WebElement categoriesHeading;
	
	@FindBy(xpath="//*[@id=\"App\"]/div/div[7]/div/div[1]/aside/div/div[1]/div[1]/div[1]/span[1]")
	WebElement offer;
	
	@FindBy(xpath="//*[@id=\"App\"]/div/div[7]/div/div[1]/aside/div/div[1]/div[1]/div[2]/span[1]")
	WebElement improvePerformance;
	
	@FindBy(xpath="//*[@id=\"App\"]/div/div[7]/div/div[1]/aside/div/div[1]/div[1]/div[3]/span[1]")
	WebElement reduceWastedSpend;
	
	@FindBy(xpath="//*[@id=\"App\"]/div/div[7]/div/div[1]/aside/div/div[1]/div[1]/div[4]/span[1]")
	WebElement bestPractice;
	
	@FindBy(xpath="//*[@id=\"App\"]/div/div[7]/div/div[1]/aside/div/div[1]/div[1]/div[5]/span[1]")
	WebElement accountStructure;
	
	@FindBy(xpath="//*[@id=\"App\"]/div/div[7]/div/div[1]/aside/div/div[1]/div[1]/div[6]")
	WebElement clearFilter;
	
	//BestPracticeHeading
	@FindBy(xpath="//*[@id=\"App\"]/div/div[7]/div/div[2]/div[2]/div[1]/div[2]/h3")
	WebElement bestPracticeHeading;
	
	//AddNegativeKeywords
	@FindBy(xpath="//*[@id=\"group-0\"]/td[1]/span")
	WebElement addNegativeKeywords;
	
	//AddNegativeKeywordsDetailsButton
	@FindBy(xpath="//*[@id=\"App\"]/div/div[7]/div/div[2]/div[2]/div[2]/div/div/div/table/tbody/tr/td[6]/div/button[1]/span")
	WebElement adnKeywordsDetailButton;
	
	//AddNegativeKeywordsTitle
		@FindBy(xpath="/html/body/div[8]/div/div/div/div/div[2]/div[2]/div[1]/div[1]")
		WebElement adnKeywordsTitle;
	
	//AddNegativeKeywordsSummary
		@FindBy(xpath="/html/body/div[8]/div/div/div/div/div[2]/div[2]/div[3]/div/div/div[1]")
		WebElement adnKeywordsSummary;
		
		//NKtoggle
		@FindBy(css="div.sc-kEjbxe.cDzsqY")
		WebElement nKtoggle;
		//NKtoggleOn
		@FindBy(css="tr.on")
		WebElement nKtoggleOn;
		//NKtoggleOff
		@FindBy(css="tr.off")
		WebElement nKtoggleOff;
	
	public OpportunityPage() {
		
			PageFactory.initElements(driver, this);
			}
	public void click_Offer() {
		offer.click();
	}
	public void click_ImprovePerformance() {
		improvePerformance.click();
	}
	public void click_ReduceWastedSpend() {
		reduceWastedSpend.click();
	}
	public void click_BestPractice() {
		bestPractice.click();
	}
	public void click_AccountStructure() {
		accountStructure.click();
	}
	public boolean verify_ClearFilter() {
		return clearFilter.isDisplayed();
	}
	public boolean verify_AddNegativeKeywordsTitle() {
		return adnKeywordsTitle.isDisplayed();
	}
	public boolean verify_AddNegativeKeywordsSummary() {
		return adnKeywordsSummary.isDisplayed();}
	}

/*
@FindBy(css="div.sc-cKZHah.ljDVOm.sc-fSnZzA.ftlach")
WebElement offerSummary;

@FindBy(css="div.sc-cKZHah.ljDVOm")
WebElement improvePerformanceSummary;

@FindBy(css="div.sc-cKZHah.ljDVOm")
WebElement improvePerformanceSummary; */
