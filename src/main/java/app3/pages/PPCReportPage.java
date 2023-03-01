package app3.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app3.base.TestBase;

public class PPCReportPage extends TestBase {
	
	//Report Header
		@FindBy(css="button.sc-bdfBwQ.eFjsba.btn.btn-sm.sc-dOFTbv.sc-jMlkEa.cPUlJs.gVvkRt")
		WebElement runReport;
		
		@FindBy(css="button.sc-bdfBwQ.eFjsba.btn.btn-sm.sc-dOFTbv.sc-dYZCcZ.cPUlJs.bIBDos.ml-md-3.ml-lg-1.ml-xl-3.mt-lg-3.mt-xl-0")
		//button.sc-bdfBwQ.eFjsba.btn.btn-sm.sc-gkZcHc.sc-cBcsVZ.eMpoTP.gKCPzw.ml-lg-3
		WebElement download;
		
		@FindBy(css="button.sc-bdfBwQ.kNFtzX.btn.btn-sm.m-0.p-0.text-left")
		WebElement learnMore;
		
		@FindBy(css="div.info-container")
		//sc-jcUlvj gERdjQ
		WebElement score;
		
		@FindBy(css="span.last-run")
		WebElement reportLastRun;
		
		@FindBy(css="div.modal-content")
		WebElement learnMoreSummary;
		
		// Top 5 Recommendations
		@FindBy(css="ul.sc-iExECa.bYMkVf.d-flex.flex-column.flex-shrink-0.bg-sm-white.nav.nav-tabs>li:nth-of-type(1)")
		WebElement conversionTrackingStatus;
	
		@FindBy(css="ul.sc-iExECa.bYMkVf.d-flex.flex-column.flex-shrink-0.bg-sm-white.nav.nav-tabs>li:nth-of-type(2)")
		WebElement impressionWeightedQualityScore;
		
		@FindBy(css="ul.sc-iExECa.bYMkVf.d-flex.flex-column.flex-shrink-0.bg-sm-white.nav.nav-tabs>li:nth-of-type(4)")
		WebElement reMarketingStatus;
		
		@FindBy(css="ul.sc-iExECa.bYMkVf.d-flex.flex-column.flex-shrink-0.bg-sm-white.nav.nav-tabs>li:nth-of-type(3)")
		WebElement smartBiddingUsage;
		
		@FindBy(css="ul.sc-iExECa.bYMkVf.d-flex.flex-column.flex-shrink-0.bg-sm-white.nav.nav-tabs>li:nth-of-type(5)")
		WebElement analyticslinked;
		
		
		// 1. conversionTrackingStatus
		@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)")
		WebElement summaryCTS1;
		
		@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>div:nth-of-type(1)")
		WebElement summaryCTS2;
		
		@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(3)")
		WebElement summaryCTSbutton;
		
		//2.Impression Weighted Quality Score
		@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(2)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)")
		WebElement summaryIWQS1;
		
		@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(2)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>div:nth-of-type(1)")
		WebElement summaryIWQS2;
		
		@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(2)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(3)")
		WebElement summaryIWQSbutton;
		
		//3.Re-marketing Status
				@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(3)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)")
				WebElement summaryRMS1;
				
				@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(3)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>div:nth-of-type(1)")
				WebElement summaryRMS2;
				
				@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(3)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(3)")
				WebElement summaryRMSbutton;
				
				
				
				
				//4.Smart Bidding Usage
				@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(4)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)")
				WebElement summarySBU1;
				
				@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(4)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>div:nth-of-type(1)")
				WebElement summarySBU2;
				
				@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(4)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(3)")
				WebElement summarySBUbutton;
		
				//5.Analytics Linked
				@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(5)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(1)")
				WebElement summaryAL1;
				
				@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(5)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>div:nth-of-type(1)")
				WebElement summaryAL2;
				
				@FindBy(css="div.tab-content.d-flex.flex-column.flex-grow-1>div:nth-of-type(5)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(3)")
				WebElement summaryALbutton;
				
				//6. Select Categories
				@FindBy(css="button.sc-LwQvY.kiSqdk.btn.btn-secondary")
				WebElement selectCategories;
				
				@FindBy(css="div.dropdown.show>div:nth-of-type(1)>button:nth-of-type(1)")
				WebElement bestPractice;
				
				@FindBy(css="div.dropdown.show>div:nth-of-type(1)>button:nth-of-type(2)")
				WebElement creative;
				
				@FindBy(css="div.dropdown.show>div:nth-of-type(1)>button:nth-of-type(3)")
				WebElement disapproval;
				
				@FindBy(css="div.dropdown.show>div:nth-of-type(1)>button:nth-of-type(4)")
				WebElement performance;
				
				@FindBy(css="div.dropdown.show>div:nth-of-type(1)>button:nth-of-type(5)")
				WebElement reach;
				
				@FindBy(css="div.dropdown.show>div:nth-of-type(1)>button:nth-of-type(6)")
				WebElement trackingMeasurement;
				
				// Best Practice associated elements
				@FindBy(css="div.sc-hKEjSY.JPJSe")
				WebElement bestPracticeSummary;
				
				@FindBy(css="div.sc-hKEjSY.JPJSe>div:nth-of-type(1)>div:nth-of-type(2)>p.pr-5.text-break>span.sc-fMUOsP.fLxhXc")
				WebElement bestPracticeMoreInfo;
				
				@FindBy(css="div.sc-hKEjSY.JPJSe>div:nth-of-type(1)>div:nth-of-type(2)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>p.pr-lg-5>span.sc-fMUOsP.fLxhXc.open")
				WebElement bestPracticeHideInfo;
				
				@FindBy(css="span.sc-vewwy.bQcMSZ")
				WebElement bestPracticemanagement;
				
				// Creative associated elements
				
				
				@FindBy(css="div.div.sc-hKEjSY.MnKeL")
				WebElement creativeSummary;
				
				@FindBy(css="div.sc-hKEjSY.MnKeL>div:nth-of-type(1)>div:nth-of-type(2)>p.pr-5.text-break>span.sc-fMUOsP.fLxhXc")
				WebElement creativeMoreInfo;
				
				@FindBy(css="div.sc-hKEjSY.JPJSe>div:nth-of-type(1)>div:nth-of-type(2)>div:nth-of-type(1)>div:nth-of-type(1)>div:nth-of-type(2)>p.pr-lg-5>span.sc-fMUOsP.fLxhXc.open")
				WebElement creativeHideInfo;
				
				@FindBy(css="span.sc-vewwy.bQcMSZ")
				WebElement creativemanagement;
				
				
		public PPCReportPage() {
		PageFactory.initElements(driver, this);
		}
		
	/*	public PPCReportPage clickOnRunReport() { 
			runReport.click();
			return new PPCReportPage();
			}
		public void clickOnDownload() {
			ChromeOptions options = new ChromeOptions();
			HashMap<String, Object> chromeprefs = new HashMap<String, Object>();
			chromeprefs.put("profile.default_content_settings.popups", 0);
			
			String downloadFilepath = System.getProperty("user.dir");
			chromeprefs.put("download.default_directory", downloadFilepath);
			
			options.setExperimentalOption("prefs",chromeprefs);
			
			WebDriver driver = new ChromeDriver(options);
 
			download.click();
			
			//Thread.sleep(5000);
			
			File file = new File(downloadFilepath+"\\");
		} */
		
		public void clickOnLearnMore() {
			learnMore.click();
		}
		public boolean verifyLearnMoreSummary() {
			return learnMoreSummary.isDisplayed();
		}
		//1.CTS methods
		public void clickOnConversionTrackingStatus() {
		 conversionTrackingStatus.click(); 
	         //return new PPCReportPage();
		}
		public boolean verifySummaryCTS1() {
			return summaryCTS1.isDisplayed();
		}
		public boolean verifySummaryCTS2() {
			return summaryCTS2.isDisplayed();
		}
		public void verifySummaryCTSbutton() {
			summaryCTSbutton.click();
		}
		
		//2. IWQS
		
		public void clickOnImpressionWeightedQualityScore() {
			impressionWeightedQualityScore.click(); 
	         //return new PPCReportPage();
		}
		public boolean verifySummaryIWQS1() {
			return summaryIWQS1.isDisplayed();
		}
		public boolean verifySummaryIWQS2() {
			return summaryIWQS2.isDisplayed();
		}
		public void verifySummaryIWQSbutton() {
			summaryIWQSbutton.click();
		}
		
		//3. RMS
		
				public void clickOnReMarketingStatus() {
					impressionWeightedQualityScore.click(); 
			         //return new PPCReportPage();
				}
				public boolean verifySummaryRMS1() {
					return summaryRMS1.isDisplayed();
				}
				public boolean verifySummaryRMS2() {
					return summaryRMS2.isDisplayed();
				}
				public void verifySummaryRMSbutton() {
					summaryRMSbutton.click();
				}
			//4. SBU
				
				public void clickOnSmartBiddingUsage() {
					impressionWeightedQualityScore.click(); 	
				}
				public boolean verifySummarySBU1() {
					return summaryRMS1.isDisplayed();
				}
				public boolean verifySummarySBU2() {
					return summaryRMS2.isDisplayed();
				}
				public void verifySummarySBUbutton() {
					summarySBUbutton.click();
			     }
				
				//5. AL
				public void clickOnAnalyticslinked() {
					analyticslinked.click(); 
				}
				public boolean verifySummaryAL1() {
					return summaryAL1.isDisplayed();
				}
				public boolean verifySummaryAL2() {
					return summaryAL2.isDisplayed();
				}
				public void verifySummaryALbutton() {
		            summaryALbutton.click();
				}
		            
		            //6. Select Categories
		            public void clickOnSelectCategories() {
		            	selectCategories.click(); 
		            	}
					public void clickOnBestPractice() {
						bestPractice.click(); 
						}
					public void clickOnCreative() {
						creative.click();
						}
					public void clickOnDisapproval() {
						disapproval.click(); 
					}
					public void clickOnPerformance() {
						analyticslinked.click(); 
					}
					public void clickOnReach() {
						reach.click(); 
					}
				    public void clickOnTrackingMeasurement() {
				    	trackingMeasurement.click(); 
				    }
		            

}
//https://testing2.adzooma.com/management