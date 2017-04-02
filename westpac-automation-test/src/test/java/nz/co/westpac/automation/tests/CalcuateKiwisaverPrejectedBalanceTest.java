package nz.co.westpac.automation.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import nz.co.westpac.automation.famework.BaseTest;
import nz.co.westpac.automation.famework.Result;
import nz.co.westpac.automation.pageobjects.WestpacHomePage;
import nz.co.westpac.automation.pageobjects.WestpacKiwisaverPage;

public class CalcuateKiwisaverPrejectedBalanceTest extends BaseTest{

	@Test()
	public void testCalculatingProjectedBalance(){
		SoftAssert sAssert = new SoftAssert();
		WestpacHomePage westpacHomePage = PageFactory.initElements(driver, WestpacHomePage.class);
		WestpacKiwisaverPage westpacKivisaverPage = westpacHomePage.navigateToKivisaverCalculator();
		//Scenario 1
		Result result = westpacKivisaverPage.calculateKiwiSaverBalance(KivisaverRetirementInfoDAO.scenario1DAO());
		sAssert.assertTrue(result.getStatus(),result.getMessage());
		//Scenario 2
		result = westpacKivisaverPage.calculateKiwiSaverBalance(KivisaverRetirementInfoDAO.scenario2DAO());
		sAssert.assertTrue(result.getStatus(),result.getMessage());
		//Scenario 3
		result = westpacKivisaverPage.calculateKiwiSaverBalance(KivisaverRetirementInfoDAO.scenario3DAO());
		sAssert.assertTrue(result.getStatus(),result.getMessage());
		sAssert.assertAll();
	}
}
