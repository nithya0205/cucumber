package org.guru99telecom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;

public class AddCustomerPage extends BaseClass {
	@Given("User to Login to the GuruHome")
	public void user_to_Login_to_the_GuruHome() {
	    launchBrowser();
	    getUrl("http://demo.guru99.com/telecom/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Given("User to Navitgate to Add customer page")
	public void user_to_Navitgate_to_Add_customer_page() {
	    WebElement addcustbtn = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
	    click(addcustbtn);
	}

	@When("User to fill the required Details")
	public void user_to_fill_the_required_Details() {
	    WebElement radiobtn = driver.findElement(By.xpath("//label[text()='Done']"));
	    click(radiobtn);
	    WebElement fname = driver.findElement(By.id("fname"));
	    enterValue(fname, "Nithya");
	    WebElement lname = driver.findElement(By.id("lname"));
	    enterValue(lname, "Subbu");
	    WebElement email = driver.findElement(By.id("email"));
	    enterValue(email, "nits@gmail.com");
	    WebElement addr = driver.findElement(By.xpath("//textarea[@name='addr']"));
	    enterValue(addr, "Adyar");
	    WebElement telephoneno = driver.findElement(By.id("telephoneno"));
	    enterValue(telephoneno, "9790979833");	      
	}

	@When("User to click submit button")
	public void user_to_click_submit_button() {
		WebElement submitbtn = driver.findElement(By.xpath("//input[@name='submit']"));
	    click(submitbtn);  
	}

	@Then("Validate the success message")
	public void validate_the_success_message() {
		String verifytxt = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[2]/td/b")).getText();
		Assert.assertEquals("Please Note Down Your CustomerID", verifytxt);
		quitBrowser();
	}
	
}
