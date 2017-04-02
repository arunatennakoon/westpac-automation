package nz.co.westpac.automation.famework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {
	public static WebDriver getBrowser(Browsers browser) {
		if(browser==Browsers.CHROME)
			return getChromeInstance();
		if(browser==Browsers.IE)
			return getIEInstance();
		else
			return getFFInstance();
	}

    public static RemoteWebDriver getRemoteBrowser(Browsers browser) {
        DesiredCapabilities capabillities = null;
        RemoteWebDriver driver = null;
        
        switch (browser) {
        	case FIREFOX:
        		capabillities = DesiredCapabilities.firefox();
        		break;
        	case CHROME:
        		capabillities = DesiredCapabilities.chrome();
        		break;
        	case IE:
        		capabillities = DesiredCapabilities.internetExplorer();
        		break;
        	default:
        }        
        capabillities.setJavascriptEnabled(true);
        driver = new RemoteWebDriver(capabillities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    
	private static FirefoxDriver getFFInstance() {
		System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
		return new FirefoxDriver();
	}
	
	private static ChromeDriver getChromeInstance() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		return new ChromeDriver();
	}
	
	private static InternetExplorerDriver getIEInstance() {
		//TODO :set IE driver path
		return new InternetExplorerDriver();
	}

}
