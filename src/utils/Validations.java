package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

public class Validations {

	WebDriver driver;

	public Validations(WebDriver webDriver) {
		driver = webDriver;
	}

	public void validateTitle(String expectedTitle){
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "The title is not the expected");
		Reporter.log("Title validation successfully completed for page: '" + expectedTitle + "'<br>");
	}


	public void validateIsEnabled(WebElement element){
		Assert.assertTrue(element.isEnabled());
	}

	public void validateIsDisabled(WebElement element){
		Assert.assertFalse(element.isEnabled());
	}
	

	public void validateIsDisabledByAttribute(WebElement element){
		//Use only the Element is disabled by HTML attribute (disabled="disabled" ).
		String value = element.getAttribute("disabled");
		Boolean blnObj1 = new Boolean(value);
		Assert.assertTrue(blnObj1);
	}
	
	public void validateIsNotDisplayedByAttribute(WebElement element){
		Assert.assertFalse(element.isDisplayed());
	}
	
	
	
	public void validateNotEquals(Object arg0, Object arg1) {
		Assert.assertNotEquals(arg0, arg1);
	}

	public void validateEquals(Object expected, Object actual) {
		Assert.assertEquals(actual, expected);
	}
	
	public void validateEquals(List<String> expected, List<String> actual){
		Assert.assertTrue(actual.containsAll(expected));
	}
	
	public void validateEquals(String[] expected, List<String> actual){
		for(int i = 0 ; i < actual.size() ; i ++){
			Assert.assertTrue(actual.get(i).contains(expected[i]));
		}
	}

	public void validateIsDisplayed(Select element) {
		Assert.assertTrue(element != null);
	}

	public void validateIsDisplayed(WebElement element) {
		Assert.assertTrue(element != null);
		Reporter.log("Element " + element.getLocation() + " validated successfully.<br>");
	}
	
	public void validateIsDisplayed(List<WebElement> elements) {
		for(WebElement element : elements){
		Assert.assertTrue(element != null);
		Reporter.log("Element " + element.getLocation() + " validated successfully.<br>");
		}
	}
	
	public void validateLinkIsNotDisplayed(String linkText){
		List<WebElement> options = driver.findElements(By.linkText(linkText));
		Assert.assertTrue(options.isEmpty());
	}

	public void validateSelect(Select select, String value){
		List<WebElement> options = select.getOptions();
		boolean result = false;
		for(WebElement option : options){
			if(option.getText().equals(value)) {
				result = true;
				break;
			} else {
				result = false;
			}
		}
		Assert.assertTrue(result);
		Reporter.log("'" + select + "' element validated successfully. <br>");
	}

	public void validateIsEmpty(Select element) {
		Assert.assertTrue(element.getOptions().isEmpty());
	}

	public void validateIsEmpty(WebElement element) {
		Assert.assertTrue(element.getText().isEmpty());
	}
	

	public void validateTableContains(WebElement table, String expected){
		Reporter.log("Validating if table contains the following string: '"+ expected +"'...<br>");
		String text = table.getText();
		Assert.assertTrue(text.contains(expected));	
		Reporter.log("Table validated successfully.<br>");
	}

	public void validateTableContains(String table, String expected){
		Reporter.log("Validating if table contains the following string: '"+ expected +"'...<br>");
		String text = table;
		Assert.assertTrue(text.contains(expected));	
		Reporter.log("Table validated successfully.<br>");
	}

	public void validateIsChecked(WebElement checkbox){
		Assert.assertTrue(checkbox.isSelected());
	}
	
	public void validateStringContains(String current,String expected){
			Assert.assertTrue(current.contains(expected));
			if(!current.contains(expected)){
				System.out.println("Found: "+current+" ,but it was expected: "+expected+".");	
			}
	}
	
	public void validateIsPresent(WebElement we){
		Assert.assertTrue(we.isDisplayed());
	}
	
	public void validateListContains(List<String> ls,String expected){
		Assert.assertTrue(ls.contains(expected));
	}
	
}
