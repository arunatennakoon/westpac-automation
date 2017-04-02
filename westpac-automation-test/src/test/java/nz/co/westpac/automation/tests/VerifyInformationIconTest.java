package nz.co.westpac.automation.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import nz.co.westpac.automation.famework.BaseTest;
import nz.co.westpac.automation.famework.Result;
import nz.co.westpac.automation.pageobjects.WestpacHomePage;
import nz.co.westpac.automation.pageobjects.WestpacKiwisaverPage;

public class VerifyInformationIconTest extends BaseTest {
	
	@Test
	public void testInformationIconInKiwiSaverCalculator(){
		WestpacHomePage westpacHomePage = PageFactory.initElements(driver, WestpacHomePage.class);
		WestpacKiwisaverPage westpacKivisaverPage = westpacHomePage.navigateToKivisaverCalculator();
		Result result = westpacKivisaverPage.verifyAllInformationInconsDisplayed();
		Assert.assertTrue(result.getStatus(),result.getMessage());
	}
}