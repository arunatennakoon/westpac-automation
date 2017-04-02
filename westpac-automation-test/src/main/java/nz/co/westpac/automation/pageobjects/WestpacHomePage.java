package nz.co.westpac.automation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import nz.co.westpac.automation.famework.BasePageObjects;

public class WestpacHomePage extends BasePageObjects {
	
	@FindBy(id="ubermenu-section-link-kiwisaver-ps")
	private WebElement lnkKiviSaver;
	
	@FindBy(id="ubermenu-item-cta-kiwisaver-calculators-ps")
	private WebElement btnKivisaverCalculator;
	
	@FindBy(css=".typography.sw-content .btn[href='/kiwisaver/calculators/kiwisaver-calculator/']")
	private WebElement btnClickToGetStarted;	
	
		
	public WestpacKiwisaverPage navigateToKivisaverCalculator(){
		mouseHover(lnkKiviSaver);
		btnKivisaverCalculator.click();
		waitForElement(btnClickToGetStarted);
		btnClickToGetStarted.click();
		return PageFactory.initElements(driver, WestpacKiwisaverPage.class);
	}
}
