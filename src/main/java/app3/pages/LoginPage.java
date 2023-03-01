package app3.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app3.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory - OR:
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//a[contains(@class,'login__footer__item__link')]")
	WebElement ForgotPassword;

	@FindBy(xpath="//h1[contains(@class,'login__header__logo')]")
	WebElement AdzoomaLogo;
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateAdzoomaLogo() {
		return AdzoomaLogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
