package nz.co.westpac.automation.famework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePageObjects extends BaseFramework {

	/**
	 * This method mouse-hovers on the given element
	 * @param element
	 */
	protected void mouseHover(WebElement element){
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	/**
	 * wrapped method for Webdriver sendkeys
	 * This method should be improved to log the behavior
	 * @param element
	 */
	public void click(WebElement element){
		element.click();
	}
	
	/**
	 * Wrapped method for Webdriver sendKeys 
	 * This method should be improved to log the behavior
	 * @param element
	 * @param text
	 */
	protected void sendKeys(WebElement element,String text){
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * This method will return true if the give element is displayed
	 * @param element
	 * @return boolean
	 */
	protected Result verifyPresence(WebElement element,Result result){
		if(element.isDisplayed()){
			result.setStatus(true);
		}
		else{
			result.setStatus(false);
			result.appendMessage(element+" Element is not found");
		}
		
		return result;
	}

	/**
	 * This method select the given item from the dropdown
	 * @param element
	 * @param text
	 */
	protected void selectDropdownByVisibleText(WebElement element,String text){
		new Select(element).selectByVisibleText(text);
	}

	public void waitForElement(WebElement element){
		int CURRENT=0;
		for(int i=1;i<10;i++){
			try{
				if(element.isDisplayed()){
					System.out.println("element displayed "+element);
					break;
				}
			}
			catch(Exception e){
				try {
					Thread.sleep(1000);
					CURRENT=i;
				} catch (InterruptedException ie) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i+ "Seconds");
			}
			if(CURRENT > 9){
				try {
					throw new Exception("ELEMENT "+element+ " NOT FOUND");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void hardWait(int seconds){
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void selectFromANGDropdown(WebElement element,String itemCss){
		waitForElement(element);
		element.click();
		driver.findElement(By.cssSelector(itemCss)).click();
	}
	
	public void navigateToIframe() {
		hardWait(2);
		WebElement iFrame = driver.findElement(By.cssSelector("body #calculator-embed>iframe"));
		driver.switchTo().frame(iFrame);
	}

	public void navigateToDefaultFrame() {
		driver.switchTo().defaultContent();
	}
}

