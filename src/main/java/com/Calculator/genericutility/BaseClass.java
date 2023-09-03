package com.Calculator.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	public WebDriver driver;
	 public FileUtility fileUtils = new FileUtility();
	 public WebDriverUtility webdriverUtils = new WebDriverUtility();

	@BeforeMethod
	public void configBeforeMethod() throws IOException {
		String browserName = fileUtils.readDataFromPropertyFile("browser");
		if (browserName.equals("firefox")) {
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("remote-allow-origins=*");
			options.addArguments("--disable-notifications");
			driver = new FirefoxDriver(options);
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(fileUtils.readDataFromPropertyFile("url"));
	}
	@AfterMethod
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
