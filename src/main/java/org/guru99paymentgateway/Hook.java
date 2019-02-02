package org.guru99paymentgateway;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
static WebDriver driver;
@Before("@first")
public void launchBrowser() {
	System.out.println("****start****");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ns43\\GitTest-workspace\\Cucumber\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
}

@After("@second")
public void QuitBrowser() {
	driver.close();
	driver.quit();
	System.out.println("****Completed****");

}}

