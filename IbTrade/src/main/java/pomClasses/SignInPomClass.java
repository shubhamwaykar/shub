package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPomClass {
	
	@FindBy(xpath= "//input[@type='text']") private WebElement user;
	@FindBy(xpath= "//input[@type='password']") private WebElement pass;
	@FindBy(xpath= "//button[@type='submit']") private WebElement login;
	@FindBy(xpath= "//a[text()='Forgot password?']") private WebElement forgotpassword;
	
	public SignInPomClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username) {
		user.click();
		user.sendKeys(username);
		}
	
	public void enterPassword(String password) {
		pass.click();
		pass.sendKeys(password);
		}
	
	public void clickOnLogin() {
		if(login.isEnabled()) {
		login.click();
		}
		else {
			System.out.println("module1Pomclasses.SignIn.Login button not enable");
		}
		
	}	
	public void forgotpass() {
			forgotpassword.click();
	}

}
