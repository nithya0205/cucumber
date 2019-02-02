package org.guru99telecom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;


public class AjaxFormMain extends BaseClass{

	@Given("User to click the Input form DropDown and navigate to Ajax Form Demo")
	public void user_to_click_the_Input_form_DropDown_and_navigate_to_Ajax_Form_Demo() {
		WebElement element_inputTab = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
	    click(element_inputTab);
	    WebElement element_AjaxForm = driver.findElement(By.xpath("(//a[text()='Ajax Form Submit'])[1]"));
	    click(element_AjaxForm);
	}

	@When("Fill the Required details in Ajax Form")
	public void fill_the_Required_details_in_Ajax_Form(DataTable dataTable) {
	List<String> list_data = dataTable.asList();
	driver.findElement(By.id("title")).sendKeys(list_data.get(0));
	driver.findElement(By.id("description")).sendKeys(list_data.get(1));
	}

	@When("Click submit Button in Ajax Form")
	public void click_submit_Button_in_Ajax_Form() {
	   driver.findElement(By.id("btn-submit")).click();
	}

	@Then("Validate the Submit Form")
	public void validate_the_Submit_Form() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement element_txt = driver.findElement(By.id("submit-control"));
	  Thread.sleep(2000);
	  String text = element_txt.getText();  
	   Assert.assertEquals("Form submited Successfully!", text);
	}
}
