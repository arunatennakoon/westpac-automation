package nz.co.westpac.automation.famework;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends BaseFramework {
	public BaseTest() {
		try {
			launchBrowser();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method will launch the browser according to the configuration
	 * @return WebDriver
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public WebDriver launchBrowser() throws FileNotFoundException, IOException{
		String baseUrl = Configuration.getInstance().get("url").toString();
		if(Configuration.getInstance().get("browser").equals("firefox")){
			driver = BrowserFactory.getBrowser(Browsers.FIREFOX);
		}
		else if(Configuration.getInstance().get("browser").equals("chrome")){
			driver = BrowserFactory.getBrowser(Browsers.CHROME);
		}
		else{
			//TODO
		}
		driver.get(baseUrl);
		driver.manage().window().maximize();
		return driver;
	}

	@BeforeClass
	public void setUp(){

	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
