package nz.co.westpac.automation.tests;

import java.util.HashMap;

import nz.co.westpac.util.CalculatorFieldConstants;

public class KivisaverRetirementInfoDAO {

	public static HashMap<String, String> scenario1DAO(){
		HashMap<String, String> scenario = new HashMap<String, String>();
		scenario.put(CalculatorFieldConstants.CURRENT_AGE, "30");
		scenario.put(CalculatorFieldConstants.EMPLOYMENT_STATUS, "Employed");
		scenario.put(CalculatorFieldConstants.SALARY_AND_WAGES, "82000");
		scenario.put(CalculatorFieldConstants.MEMBER_CONTRIBUTION, "MEDIUM");
		scenario.put(CalculatorFieldConstants.INVESTOR_RATE, "17.5");
		scenario.put(CalculatorFieldConstants.RISK_PROFILE, "HIGH");
		scenario.put("EXPECTED_PROJECT_BALANCE","400,615");
		return scenario;
	}
	
	public static HashMap<String, String> scenario2DAO(){
		HashMap<String, String> scenario = new HashMap<String, String>();
		scenario.put(CalculatorFieldConstants.CURRENT_AGE, "45");
		scenario.put(CalculatorFieldConstants.EMPLOYMENT_STATUS, "Self-employed");
		scenario.put(CalculatorFieldConstants.SALARY_AND_WAGES, "NULL");
		scenario.put(CalculatorFieldConstants.MEMBER_CONTRIBUTION, "NULL");
		scenario.put(CalculatorFieldConstants.INVESTOR_RATE, "10.5");
		scenario.put(CalculatorFieldConstants.RISK_PROFILE, "MEDIUM");
		scenario.put(CalculatorFieldConstants.KIVISAVER_BALANCE, "100000");
		scenario.put(CalculatorFieldConstants.VOLUNTARY_CONTRIBUTION, "90");
		scenario.put(CalculatorFieldConstants.VOLUNTARY_FREQUENCY, "Fortnightly");
		scenario.put(CalculatorFieldConstants.SAVING_AT_RETIREMENT, "290000");
		scenario.put("EXPECTED_PROJECT_BALANCE","281,438");
		return scenario;
	}
	
	public static HashMap<String, String> scenario3DAO(){
		HashMap<String, String> scenario = new HashMap<String, String>();
		scenario.put(CalculatorFieldConstants.CURRENT_AGE, "55");
		scenario.put(CalculatorFieldConstants.EMPLOYMENT_STATUS, "Not employed");
		scenario.put(CalculatorFieldConstants.SALARY_AND_WAGES, "NULL");
		scenario.put(CalculatorFieldConstants.KIVISAVER_BALANCE, "100000");
		scenario.put(CalculatorFieldConstants.MEMBER_CONTRIBUTION, "NULL");
		scenario.put(CalculatorFieldConstants.VOLUNTARY_CONTRIBUTION, "10");
		scenario.put(CalculatorFieldConstants.VOLUNTARY_FREQUENCY, "Annually");
		scenario.put(CalculatorFieldConstants.INVESTOR_RATE, "10.5");
		scenario.put(CalculatorFieldConstants.RISK_PROFILE, "MEDIUM");
		scenario.put(CalculatorFieldConstants.SAVING_AT_RETIREMENT, "200000");
		scenario.put("EXPECTED_PROJECT_BALANCE","141,357");
		return scenario;
	}
}
