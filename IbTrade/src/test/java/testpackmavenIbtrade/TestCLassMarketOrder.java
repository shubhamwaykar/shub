package testpackmavenIbtrade;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import browser.configuration.PojoClass;
import mediatorClasses.ExcelSheetClass;
import mediatorClasses.ScreenshotClass;
import pomClasses.MpinPomClass;
import pomClasses.SignInPomClass;

public class TestCLassMarketOrder extends PojoClass{

	WebDriver driver2;
	SignInPomClass signin;
	MpinPomClass mpin;
	
	@BeforeClass
	public void beforeClass() {
		driver2= openChromeBrowser();
		driver2= openMozillaFirefox();
		driver2= openChromeBrowser();
	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		ScreenshotClass screenshot= new ScreenshotClass();
		screenshot.ScreenshotMethod("IbtradeLoginPage", driver2);
	}
	
	@DataProvider 
	public static Object[][] getdata() throws EncryptedDocumentException, Exception {
		Object[][] data= ExcelSheetClass.getcelldata("Sheet1");
		System.out.println(data);
		return data;
	}
	
	@Test (dataProvider= "getdata")
	public void placeMarketOrder(String username, String password, String pin) {
		signin = new SignInPomClass(driver2);
		signin.enterUsername(username);
		System.out.println(username);
		signin.enterPassword(password);
		System.out.println(password);
		signin.clickOnLogin();
		System.out.println("clicked on login");
	
		mpin = new MpinPomClass(driver2);
		System.out.println("mpin page opened");
		mpin.Enterpin(pin);
		System.out.println(pin);
		mpin.Continue();
		System.out.println("continue tab clicked");
		}
	
	@AfterMethod
	public void afterMethod() throws IOException {
		ScreenshotClass screenshot= new ScreenshotClass();
		screenshot.ScreenshotMethod("IbtradePage", driver2);
     	}
	
	@AfterClass
	public void afterClass() {
		driver2.close();
		
	}
}
