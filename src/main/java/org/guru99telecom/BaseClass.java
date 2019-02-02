package org.guru99telecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
static WebDriver driver;
public static void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ns43\\GitTest-workspace\\Cucumber\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
}
public static void getUrl(String url) {
	driver.get(url);
}
public static void quitBrowser() {
	driver.quit();

}
public static void click(WebElement e) {
	e.click();
}
public static void enterValue(WebElement e, String txt) {
	e.sendKeys(txt);
}
}
