package com.Calculator.Testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Calculator.pomrespository.Homepage;
import com.Calculator.genericutility.BaseClass;

public class TC_build1_006 extends BaseClass{
	@Test

	public void textAndClaer() throws IOException, Throwable {
		webdriverUtils.implicitWait(driver);
		Homepage homepage = new Homepage(driver);
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,980)", "");
		WebElement drop = homepage.buildDropdown;
		Select select = new Select((WebElement) drop);
		select.selectByIndex(1);
		homepage.firstNumberTextField.sendKeys(fileUtils.readDataFromPropertyFile("firstText4"));
		homepage.secondNumberTextField.sendKeys(fileUtils.readDataFromPropertyFile("secondText4"));
		WebElement operations = homepage.operationDropdown;
		Select select1 = new Select((WebElement) operations);

		// ADD
		select1.selectByIndex(0);
		jsx.executeScript("window.scrollBy(0,950)", "");
		homepage.calculatebutton.click();
		Thread.sleep(2000);
		homepage.clearButton.click();

		// subtract
		select1.selectByIndex(1);
		homepage.calculatebutton.click();
		Thread.sleep(2000);
		homepage.clearButton.click();

		// multiply
		select1.selectByIndex(2);
		homepage.calculatebutton.click();
		Thread.sleep(2000);
		homepage.clearButton.click();

		// divide
		select1.selectByIndex(3);
		homepage.calculatebutton.click();
		Thread.sleep(2000);
		homepage.clearButton.click();
		
		// concatenate
		select1.selectByIndex(4);
		homepage.calculatebutton.click();
		Thread.sleep(2000);
		homepage.clearButton.click();
	}
}
