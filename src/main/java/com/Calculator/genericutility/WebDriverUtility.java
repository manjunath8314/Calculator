package com.Calculator.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public boolean verifyCompleteTitle(WebDriver driver, String expectedTitle) {
		boolean verifiedTitle = new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.titleIs(expectedTitle));
		return verifiedTitle;
	}
	
	public WebElement elementClickableState(WebDriver driver, WebElement element) {
		WebElement interactableElement = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(element));
		return interactableElement;
	}
}
