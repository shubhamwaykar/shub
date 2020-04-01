package browser.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class PojoClass {

	public static WebDriver openChromeBrowser() {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\eclipse\\workspace\\IbTrade\\Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		return driver;
	}
	
	public static WebDriver openMozillaFirefox() {
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\eclipse\\workspace\\IbTrade\\Browsers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");
		return driver;		
	}
	
	public static WebDriver openInternetExplorer() {
		System.setProperty("webdriver.ie.driver", "F:\\eclipse\\eclipse\\workspace\\IbTrade\\Browsers\\IEDriverServer.exe");       // make sure your display setting is zoom on 100%
		WebDriver driver= new InternetExplorerDriver();																// to run IE on selenium
		driver.get("https://kite.zerodha.com/");
		return driver;
	}
	
	public static WebDriver openOperaBrowser() {
		System.setProperty("webdriver.opera.driver", "F:\\eclipse\\eclipse\\workspace\\IbTrade\\Browsers\\operadriver.exe");
		WebDriver driver= new OperaDriver();
		driver.get("https://kite.zerodha.com/");
		return driver;
	}
	
	public static WebDriver openEdgeBrowser() {
		System.setProperty("webdriver.edge.driver", "F:\\eclipse\\eclipse\\workspace\\IbTrade\\Browsers\\MicrosoftWebDriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://kite.zerodha.com/");
		return driver;		
	}
}
