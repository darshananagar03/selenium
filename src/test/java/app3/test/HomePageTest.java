package app3.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import app3.base.TestBase;
import app3.pages.HomePage;
import app3.pages.LoginPage;
import app3.pages.OpportunityPage;
import app3.pages.PPCReportPage;

public class HomePageTest extends TestBase {
LoginPage loginPage;
HomePage homePage;
PPCReportPage ppcreportPage;
OpportunityPage opportunityPage;
public HomePageTest() {
	super();
	}

@BeforeMethod
public void setUp()throws Exception  {
	initialization();
	loginPage = new LoginPage();
	ppcreportPage = new PPCReportPage();
	opportunityPage = new OpportunityPage();
	homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	
}

@Test
public void verifyPPCReportPageTest() {
	ppcreportPage = homePage.clickOnViewPPCReport();
}

@Test 
public void verifyOpportunityPage() {
	opportunityPage = homePage.clickOnHomeToOpportunity();
}

@AfterMethod
public void tearDown() {
	driver.quit();
}

}
