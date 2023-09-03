package com.Calculator.pomrespository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="selectBuild")
	public WebElement buildDropdown;
	public WebElement buildDropdown() {
		return buildDropdown;
	}
	
	@FindBy(id="number1Field")
	public WebElement firstNumberTextField;
	public WebElement firstNumberTextField() {
		return firstNumberTextField;
	}
	
	@FindBy(id="number2Field")
	public WebElement secondNumberTextField;
	public WebElement secondNumberTextField() {
		return secondNumberTextField;
	}
	
	@FindBy(id="selectOperationDropdown")
	public WebElement operationDropdown;
	public WebElement operationDropdown() {
		return operationDropdown;
	}
	
	@FindBy(id="calculateButton")
	public WebElement calculatebutton;
	public WebElement calculatebutton() {
		return calculatebutton;
	}
	
	@FindBy(id="numberAnswerField")
	public WebElement answerText;
	public WebElement answerText() {
		return answerText;
	}
	@FindBy(id="clearButton")
	public WebElement clearButton;
	public WebElement clearButton() {
		return clearButton;
	}
}
