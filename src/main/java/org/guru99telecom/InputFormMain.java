package org.guru99telecom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class InputFormMain extends BaseClass {

	@Given("User to click the Input form DropDown and navigate to Input Form Demo")
	public void user_to_click_the_Input_form_DropDown_and_navigate_to_Input_Form_Demo() {
		WebElement element_inputTab = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
	    click(element_inputTab);
	    WebElement element_inputForm = driver.findElement(By.xpath("(//a[text()='Input Form Submit'])[1]"));
	    click(element_inputForm);
	}

	@When("Fill the Required details")
	public void fill_the_Required_details(DataTable dataTable) {
	  List<String> list = dataTable.asList();
	  driver.findElement(By.name("first_name")).sendKeys(list.get(0));
	  driver.findElement(By.name("last_name")).sendKeys(list.get(1));
	  driver.findElement(By.name("email")).sendKeys(list.get(2));
	  driver.findElement(By.name("phone")).sendKeys(list.get(3));
	  driver.findElement(By.name("address")).sendKeys(list.get(4));
	  driver.findElement(By.name("city")).sendKeys(list.get(5));
	  driver.findElement(By.name("state")).sendKeys(list.get(6));
	  driver.findElement(By.name("zip")).sendKeys(list.get(7));
	  driver.findElement(By.name("website")).sendKeys(list.get(8));
	  driver.findElement(By.name("hosting")).click();
	  driver.findElement(By.name("comment")).sendKeys(list.get(9));
	}

	@When("Click submit Button")
	public void click_submit_Button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User to Quit the Browswer")
	public void user_to_Quit_the_Browswer() {
	    quitBrowser();
	}
}
