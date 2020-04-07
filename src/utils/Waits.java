package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	WebDriver driver;

	public Waits(WebDriver webDriver) {
		driver = webDriver;		
	}

	public void waitForPageTitle(String title, int timeWait){
		WebDriverWait wait = new WebDriverWait(driver, timeWait);
		try {
			wait.until(ExpectedConditions.titleIs(title));
		} catch (StaleElementReferenceException e){
			e.printStackTrace();
		}
	}

	public void waitForElement(WebElement element, int timeWait)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeWait);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (StaleElementReferenceException e){
			e.printStackTrace();
			wait.until(ExpectedConditions.stalenessOf(element));
		}
	}

	public void waitForElementToBeEnabled(String elementId, int timeWait){
		WebDriverWait wait = new WebDriverWait(driver, timeWait);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
		} catch(StaleElementReferenceException e){
			e.printStackTrace();
		}
	}
	
	public void waitForElementToBeEnabled(WebElement element, int timeWait){
		WebDriverWait wait = new WebDriverWait(driver, timeWait);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch(StaleElementReferenceException e){
			e.printStackTrace();
		}
	}

	public void waitForElementStaleness(WebElement element, int timeWait){
		WebDriverWait wait = new WebDriverWait(driver, timeWait);
		try {
			wait.until(ExpectedConditions.stalenessOf(element));
		} catch (StaleElementReferenceException e){
			e.printStackTrace();
		}
	}

	public void waitForElementToBeClickable(WebElement element, int timeWait){
		WebDriverWait wait = new WebDriverWait(driver, timeWait);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (StaleElementReferenceException e){
			e.printStackTrace();
			wait.until(ExpectedConditions.stalenessOf(element));
		}
	}

	public void waitForAlert(int timeWait){
		WebDriverWait wait = new WebDriverWait(driver, timeWait, 500);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void waitForServiceTagDataLoad(int timeWait)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeWait, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("span-text-loader")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("span-text-loader")));
	}

	public void waitForAjaxLoad(String id, int timeWait)
	{
		WebDriverWait wait = new WebDriverWait(driver, timeWait, 300);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
		} catch (TimeoutException e){
		}
	}	

	public void waitForTextToBePresentInElement(WebElement element, String text, int timeWait){
		WebDriverWait wait = new WebDriverWait(driver, timeWait, 100);
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
	}

	public void waitShort(int secs) {
		int time = secs * 1000;
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
