package nz.co.westpac.automation.pageobjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import nz.co.westpac.automation.famework.BasePageObjects;
import nz.co.westpac.automation.famework.Result;
import nz.co.westpac.util.CalculatorFieldConstants;
import nz.co.westpac.util.MessageConstants;

public class WestpacKiwisaverPage extends BasePageObjects {

	/* Value of MODE change the behavior of the flow depend on "Employed" or not*/
	static final String EMPLOYED_MODE = "Employed";
	static final String UN_EMPLOYED_MODE = "unEmployed";
	static String MODE = EMPLOYED_MODE;

	/* Info Icons */
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(1) .field-cell.field-controls>div:nth-child(2) button")
	WebElement currentAgeInfoIcon;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(1) .field-cell.field-controls .field-message.message-info.ng-binding>p")
	WebElement currentAgeMessageInfo;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls>div:nth-child(2) button")
	WebElement employmentStatusInfoIcon;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(3) .field-cell.field-controls>div:nth-child(2) button")
	WebElement salaryAndWagesInfoIcon;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(4) .field-info.ng-scope button")
	WebElement memberContributionInfoIcon;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(5) .field-cell.field-controls>div:nth-child(2) button")
	WebElement prescribedInvestorRateInfoIcon;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(7) .field-cell.field-controls>div:nth-child(2) button")
	WebElement currentKiwisaverBalanceInfoIcon;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(8) .field-cell.field-controls>div:nth-child(2) button")
	WebElement voluntoryContributionsInfoIcon;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(9) .field-cell.field-controls>div:nth-child(2) button")
	WebElement riskProfileInfoIcon;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(10) .field-cell.field-controls>div:nth-child(2) button")
	WebElement savingGoalAtRetiermentInfoIcon;

	/* Input Fields */
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(1) .field-cell.field-controls input")
	WebElement fieldCurrentAge;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls .control-well")
	WebElement optEmploymentStatus;
	String employmentStatusItems_EmployedCss = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls .control-well +div li:nth-child(2) span";
	String employmentStatusItems_Self_EmployedCss = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls .control-well +div li:nth-child(3) span";
	String employmentStatusItems_Not_EmployedCss = ".field-group-set-frame>div:nth-of-type(2) .field-cell.field-controls .control-well +div li:nth-child(4) span";

	@FindBy(css = ".field-group-set-frame>div:nth-of-type(3) .field-cell.field-controls input")
	WebElement fieldSalaryAndWages;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(4)")
	WebElement rowMemberContribution;
	String rowMemberContributionLOWcss = ".field-group-set-frame>div:nth-of-type(4) .control-group>div:nth-child(1) label .input-holder";
	String rowMemberContributionMEDIUMcss = ".field-group-set-frame>div:nth-of-type(4) .control-group>div:nth-child(2) label .input-holder";
	String rowMemberContributionHIGHcss = ".field-group-set-frame>div:nth-of-type(4) .control-group>div:nth-child(3) label .input-holder";

	@FindBy(css = ".field-group-set-frame>div:nth-of-type(5) .control-well")
	WebElement optPrescribedInvestorRate;
	String prescribedInvestorRateItems_28css = ".field-group-set-frame>div:nth-of-type(5) .control-well+div  div:nth-child(1)>li";
	String prescribedInvestorRateItems_17D5css = ".field-group-set-frame>div:nth-of-type(5) .control-well+div  div:nth-child(2)>li";
	String prescribedInvestorRateItems_10D5css = ".field-group-set-frame>div:nth-of-type(5) .control-well+div  div:nth-child(3)>li";

	@FindBy(css = ".field-group-set-frame>div:nth-of-type(3) .control-well")
	WebElement optPrescribedInvestorRateMODE2;
	String prescribedInvestorRateItems_28cssUNEMP_MODE = ".field-group-set-frame>div:nth-of-type(3) .control-well+div  div:nth-child(1)>li";
	String prescribedInvestorRateItems_17D5cssUNEMP_MODE = ".field-group-set-frame>div:nth-of-type(3) .control-well+div  div:nth-child(2)>li";
	String prescribedInvestorRateItems_10D5cssUNEMP_MODE = ".field-group-set-frame>div:nth-of-type(3) .control-well+div  div:nth-child(3)>li";

	@FindBy(css = ".field-group-set-frame>div:nth-of-type(7) .field-cell.field-controls input")
	WebElement fieldCurrentKiwisaverBalance;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(5) .field-cell.field-controls input")
	WebElement fieldCurrentKiwisaverBalanceUNEMP_MODE;

	@FindBy(css = ".field-group-set-frame>div:nth-of-type(8) .field-cell.field-controls input")
	WebElement fieldVoluntaryContributions;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(6) .field-cell.field-controls input")
	WebElement fieldVoluntaryContributionsUNEMP_MODE;
	@FindBy(css=".field-group-set-frame>div:nth-of-type(6) .control-group .select-control .control-well")
	WebElement optVoluntaryFrequency;
	String voluntoryFreQuencyONEOFFcss_UNEMP_MODE = ".field-group-set-frame>div:nth-of-type(6) .control-group "
			+ ".select-control .control-well+div li:nth-child(2)";
	String voluntoryFreQuencyWEEKLYcss_UNEMP_MODE = ".field-group-set-frame>div:nth-of-type(6) .control-group "
			+ ".select-control .control-well+div li:nth-child(3)";
	String voluntoryFreQuencyFORTNIGHTLY_UNEMP_MODE = ".field-group-set-frame>div:nth-of-type(6) .control-group "
			+ ".select-control .control-well+div li:nth-child(4)";
	String voluntoryFreQuencyMONTHLYcssUNEMP_MODE = ".field-group-set-frame>div:nth-of-type(6) .control-group "
			+ ".select-control .control-well+div li:nth-child(5)";
	String voluntoryFreQuencyANNUALLYFcssUNEMP_MODE = ".field-group-set-frame>div:nth-of-type(6) .control-group "
			+ ".select-control .control-well+div li:nth-child(6)";

	@FindBy(css = ".field-group-set-frame>div:nth-of-type(9) .field-cell.field-controls")
	WebElement rowRadioRiskProfile;
	String riskProfileLOWcss = ".control-group>div:nth-child(1)";
	String riskProfileMEDIUMcss = ".control-group>div:nth-child(2)";
	String riskProfileHIGHcss = ".control-group>div:nth-child(3)";
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(7) .field-cell.field-controls")
	WebElement rowRadioRiskProfileUNEMP_MODE;

	@FindBy(css = ".field-group-set-frame>div:nth-of-type(10) .field-cell.field-controls input")
	WebElement fieldsavingGoalAtRetierment;
	@FindBy(css = ".field-group-set-frame>div:nth-of-type(8) .field-cell.field-controls input")
	WebElement fieldsavingGoalAtRetiermentUNEMP_MODE;

	@FindBy(css = ".btn-results-reveal")
	WebElement btnViewRetirmentProjection;

	@FindBy(css = ".result-value.result-currency.ng-binding")
	WebElement txtRetirmentProjectionResult;

	/**
	 * This method will return true if all information icons of the calculator
	 * is available
	 * 
	 * @return boolean
	 */
	public Result verifyAllInformationInconsDisplayed() {
		Result result = Result.result();
		navigateToIframe();
		selectEmploymentStatus(EMPLOYED_MODE);
		waitForElement(currentAgeInfoIcon);
		result = verifyPresence(currentAgeInfoIcon, result);
		result = verifyPresence(employmentStatusInfoIcon, result);
		result = verifyPresence(salaryAndWagesInfoIcon, result);
		result = verifyPresence(memberContributionInfoIcon, result);
		result = verifyPresence(prescribedInvestorRateInfoIcon, result);
		result = verifyPresence(currentKiwisaverBalanceInfoIcon, result);
		result = verifyPresence(voluntoryContributionsInfoIcon, result);
		result = verifyPresence(riskProfileInfoIcon,result);
		result = verifyPresence(savingGoalAtRetiermentInfoIcon,result);

		result = verifyMessgaeInfo(result);

		return result;
	}

	/**
	 * This method verify the message content of info Icons
	 * @return
	 */
	public Result verifyMessgaeInfo(Result result) {
		click(currentAgeInfoIcon);
		if(currentAgeMessageInfo.getText().equals(MessageConstants.CURRENT_AGE_MESSAGE_INFO)){
			result.setStatus(true);
		}
		else{
			result.setStatus(false);
			result.appendMessage("VERIFY INFO ICONS: MESSAGE VERIFICATION FAILS");
		}
		return result;
	}

	/**
	 * This method verify the KiwiSaver Projected Balance using KiwiSaver Calculator
	 * @param retirementInfo
	 * @return
	 */
	public Result calculateKiwiSaverBalance(HashMap<String, String> retirementInfo) {
		Result result = Result.result();
		navigateToIframe();
		setEmployementMode(retirementInfo.get(CalculatorFieldConstants.EMPLOYMENT_STATUS));
		sendKeys(fieldCurrentAge,retirementInfo.get(CalculatorFieldConstants.CURRENT_AGE));
		selectEmploymentStatus(retirementInfo.get(CalculatorFieldConstants.EMPLOYMENT_STATUS));
		setSalaryAndWages(retirementInfo.get(CalculatorFieldConstants.SALARY_AND_WAGES));
		selectMemeberContribution(retirementInfo.get(CalculatorFieldConstants.MEMBER_CONTRIBUTION));
		selectPrescrivedInvestorRate(retirementInfo.get(CalculatorFieldConstants.INVESTOR_RATE));
		setKiwiSaverBalance(retirementInfo.get(CalculatorFieldConstants.KIVISAVER_BALANCE));
		setVoluntaryContribution(retirementInfo.get(CalculatorFieldConstants.VOLUNTARY_CONTRIBUTION),retirementInfo.get(CalculatorFieldConstants.VOLUNTARY_FREQUENCY));
		selectRiskProfile(retirementInfo.get(CalculatorFieldConstants.RISK_PROFILE));
		setSavingAtRetirement(retirementInfo.get(CalculatorFieldConstants.SAVING_AT_RETIREMENT));
		click(btnViewRetirmentProjection);	
		if(txtRetirmentProjectionResult.getText().contains(retirementInfo.get(""))){
			result.setStatus(true);
		}
		else{
			result.setStatus(false);
			result.appendMessage("ISSUE IN CALCULATING PROJECTED BALANCE");
		}
		navigateToDefaultFrame();
		driver.navigate().refresh();
		return result;
	}

	/**
	 * This method set salaryAndWages where applicable
	 * @param salaryAndWages
	 */
	private void setSalaryAndWages(String salaryAndWages){
		if(!salaryAndWages.equals("NULL")){
			sendKeys(fieldSalaryAndWages, salaryAndWages);
		}
	}

	/**
	 * This method will select the member contribution of given three values.
	 * Input values should be LOW,MEDIUM,HIGH
	 * 
	 * @param memberContribution
	 */
	private void selectMemeberContribution(String memberContribution) {
		if (!memberContribution.equals("NULL")) {
			if (memberContribution.equals("LOW")) {
				rowMemberContribution.findElement(By.cssSelector(rowMemberContributionLOWcss)).click();
				;
			} else if (memberContribution.equals("MEDIUM")) {
				rowMemberContribution.findElement(By.cssSelector(rowMemberContributionMEDIUMcss)).click();
				;
			} else {
				rowMemberContribution.findElement(By.cssSelector(rowMemberContributionHIGHcss)).click();
			}
		}
	}

	/**
	 * This method will select the risk profile of given three values. Input
	 * values should be LOW,MEDIUM,HIGH
	 * 
	 * @param riskPRofile
	 */
	private void selectRiskProfile(String riskPRofile) {
		if (MODE.equals(EMPLOYED_MODE)) {
			if (riskPRofile.equals("LOW")) {
				rowRadioRiskProfile.findElement(By.cssSelector(riskProfileLOWcss)).click();
				;
			} else if (riskPRofile.equals("MEDIUM")) {
				rowRadioRiskProfile.findElement(By.cssSelector(riskProfileMEDIUMcss)).click();
				;
			} else {
				rowRadioRiskProfile.findElement(By.cssSelector(riskProfileHIGHcss)).click();
				;
			}
		}
		else{
			if (riskPRofile.equals("LOW")) {
				rowRadioRiskProfileUNEMP_MODE.findElement(By.cssSelector(riskProfileLOWcss)).click();
				;
			} else if (riskPRofile.equals("MEDIUM")) {
				rowRadioRiskProfileUNEMP_MODE.findElement(By.cssSelector(riskProfileMEDIUMcss)).click();
				;
			} else {
				rowRadioRiskProfileUNEMP_MODE.findElement(By.cssSelector(riskProfileHIGHcss)).click();
				;
			}
		}
	}

	/**
	 * This method will select the given Employment status from the dropdown
	 * 
	 * @param employmentStatus
	 */
	private void selectEmploymentStatus(String employmentStatus) {
		if (employmentStatus != null) {
			hardWait(1);
			if (employmentStatus.equals("Employed")) {
				selectFromANGDropdown(optEmploymentStatus, employmentStatusItems_EmployedCss);
			} else if(employmentStatus.equals("Self-employed")) {
				selectFromANGDropdown(optEmploymentStatus, employmentStatusItems_Self_EmployedCss);
			}
			else{
				selectFromANGDropdown(optEmploymentStatus, employmentStatusItems_Not_EmployedCss);
			}
		}
	}

	/**
	 * This method will select the given prescribed investor rate
	 * 
	 * @param investorRisate
	 */
	private void selectPrescrivedInvestorRate(String investorRate) {
		if (investorRate != null) {
			if(MODE.equals(EMPLOYED_MODE)){
				if (investorRate.equals("28")) {
					selectFromANGDropdown(optPrescribedInvestorRate, prescribedInvestorRateItems_28css);
				} else if (investorRate.equals("17.5")) {
					selectFromANGDropdown(optPrescribedInvestorRate, prescribedInvestorRateItems_17D5css);
				} else {
					selectFromANGDropdown(optPrescribedInvestorRate, prescribedInvestorRateItems_10D5css);
				}
			}
			else{
				if (investorRate.equals("28")) {
					selectFromANGDropdown(optPrescribedInvestorRateMODE2, prescribedInvestorRateItems_28cssUNEMP_MODE);
				} else if (investorRate.equals("17.5")) {
					selectFromANGDropdown(optPrescribedInvestorRateMODE2, prescribedInvestorRateItems_17D5cssUNEMP_MODE);
				} else {
					selectFromANGDropdown(optPrescribedInvestorRateMODE2, prescribedInvestorRateItems_10D5cssUNEMP_MODE);
				}
			}
		}
	}

	/**
	 * This method set KiwiSaver balance contribution according to Employment status
	 * @param kiwiSaverBalance
	 */
	private void setKiwiSaverBalance(String kiwiSaverBalance){
		if(MODE.equals(EMPLOYED_MODE)){
			sendKeys(fieldCurrentKiwisaverBalance, kiwiSaverBalance);
		}
		else{
			sendKeys(fieldCurrentKiwisaverBalanceUNEMP_MODE, kiwiSaverBalance);
		}
	}

	/**
	 * This method set voluntary contribution according to employment status
	 * @param voluntaryContribution
	 */
	private void setVoluntaryContribution(String voluntaryContribution,String voluntaryFrequency){
		if(MODE.equals(EMPLOYED_MODE)){
			sendKeys(fieldVoluntaryContributions, voluntaryContribution);
		}
		else{
			sendKeys(fieldVoluntaryContributionsUNEMP_MODE, voluntaryContribution);
			if(voluntaryFrequency.equals("One-off")){
				selectFromANGDropdown(optVoluntaryFrequency, voluntoryFreQuencyONEOFFcss_UNEMP_MODE);
			}
			else if(voluntaryFrequency.equals("Weekly")){
				selectFromANGDropdown(optVoluntaryFrequency, voluntoryFreQuencyWEEKLYcss_UNEMP_MODE);
			}
			else if(voluntaryFrequency.equals("Fortnightly")){
				selectFromANGDropdown(optVoluntaryFrequency, voluntoryFreQuencyFORTNIGHTLY_UNEMP_MODE);
			}
			else if(voluntaryFrequency.equals("Monthly")){
				selectFromANGDropdown(optVoluntaryFrequency, voluntoryFreQuencyMONTHLYcssUNEMP_MODE);
			}
			else if(voluntaryFrequency.equals("Annually")){
				selectFromANGDropdown(optVoluntaryFrequency, voluntoryFreQuencyANNUALLYFcssUNEMP_MODE);
			}
		}
	}

	private void setEmployementMode(String status){
		if(!status.equals("Employed")){
			MODE = UN_EMPLOYED_MODE;
		}
	}

	/**
	 * This method set Saving At Retirement value according to employment status
	 * @param savingAtRetirement
	 */
	private void setSavingAtRetirement(String savingAtRetirement){
		if(MODE.equals(EMPLOYED_MODE)){
			sendKeys(fieldsavingGoalAtRetierment, savingAtRetirement);
		}
		else{
			sendKeys(fieldsavingGoalAtRetiermentUNEMP_MODE, savingAtRetirement);
		}
	}

}
