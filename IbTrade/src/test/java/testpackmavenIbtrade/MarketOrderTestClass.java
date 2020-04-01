//package testpackmavenIbtrade;
//
//import java.io.IOException;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import browser.configuration.PojoClass;
//import mediatorPackage.ExcelSheetClass;
//import mediatorPackage.ScreenshotClass;
//import module1Pomclasses.MpinPomClass;
//import module1Pomclasses.SignInPomClass;
//
//public class MarketOrderTestClass extends PojoClass {
//	
//	WebDriver driver2;
//	SignInPomClass signin;
//	MpinPomClass mpin;
//	ScreenshotClass ss;
//	
//	
//	@BeforeClass
//	public void openBrowser() {
//		driver2= openChromeBrowser();
//	}
//	
//	
//	@BeforeMethod 
//	public void beforeMethod() throws IOException {
//		
//		ss.ScreenshotAs("ZerodhaLoginPageOpen", driver2);
//		System.out.println("login page screenshot taken");
//	}
//	
////	@DataProvider
////	public static Object [] [] getdata() throws EncryptedDocumentException, Exception {
////		Object [][] data= ExcelSheet.getcelldata("Sheet1");
////		System.out.println(data);
////		return data;
////	}
//	
//	
//	@Test  
//	public void SignIn() {
//		signin.enterUsername();
//		System.out.println("username entered");
//		signin.enterPassword();
//		System.out.println("pass entered");
//		signin.clickOnLogin();
//	}
//		//System.out.println(pin);
////		mpin.Enterpin(pin);
////		mpin.Continue();
////	}catch(Exception e) {
////		e.printStackTrace();
////	}
////	}
//	
//	@AfterMethod
//	public void afterMethod() throws IOException
//	{
//		ss.ScreenshotAs("ZerodhaLoginPageOpen", driver2);
//		System.out.println(" screenshot taken");
//	}
//	
//	@AfterClass
//	public void afterClass() {
//     	driver2.close();
//	}
//	
//	
//}
