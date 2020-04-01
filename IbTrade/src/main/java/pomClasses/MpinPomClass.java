package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MpinPomClass {
	
	@FindBy(xpath= "//input[@type='password']") private WebElement mpin;
	@FindBy(xpath= "//button[@type= 'submit']") private WebElement cont;
	
	public MpinPomClass(WebDriver driver1) {
		PageFactory.initElements(driver1, this);
	}
	
	public void Enterpin(String pin) {
		if(mpin.isDisplayed()) {
		mpin.click();
		mpin.sendKeys(pin);
	}
		else {
			System.out.println("module1PomClasses.MpinPomClass.Mpin not displayed");
		}
	}
	
   public void Continue() {
	   if(cont.isEnabled()) {
	   cont.click();
	   }
	   else {
		   System.out.println("module1PomClasses.MpinPomClass.continue tab not enabled");
	   }
   }
}