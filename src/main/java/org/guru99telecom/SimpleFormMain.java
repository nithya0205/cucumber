package org.guru99telecom;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class SimpleFormMain extends BaseClass {
	@Given("User to go to Selenium Easy Home Page")
	public void user_to_go_to_Selenium_Easy_Home_Page() {
	    launchBrowser();
	    getUrl("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
	}

	@Given("User to click the Input form DropDown and navigate to Simple Form")
	public void user_to_click_the_Input_form_DropDown_and_navigate_to_Simple_Form() {
	    WebElement element_inputTab = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
	    click(element_inputTab);
	    WebElement element_SimpleForm = driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[1]"));
	    click(element_SimpleForm);    
	}

	@When("Enter the Value Single input Field")
	public void enter_the_Value_Single_input_Field(DataTable dataTable) {
	    List<String> list_data = dataTable.asList(); 
	    WebElement txt_ele = driver.findElement(By.id("user-message"));
	    enterValue(txt_ele, list_data.get(0));
	    WebElement showbtn = driver.findElement(By.xpath("//button[text()='Show Message']"));
		click(showbtn);
	}

	@When("Enter the value Two Input Field")
	public void enter_the_value_Two_Input_Field(DataTable dataTable) {
		List<String> list_data = dataTable.asList();
		WebElement txt1 = driver.findElement(By.id("sum1"));
		WebElement txt2 = driver.findElement(By.id("sum2"));
		enterValue(txt1, list_data.get(0));
		enterValue(txt2, list_data.get(1));
		WebElement totalbtn = driver.findElement(By.xpath("//button[text()='Get Total']"));
		click(totalbtn);
		
	}

	

	@Then("User validate the outcomes of Single Input Field Entery")
	public void user_validate_the_outcomes_of_Single_Input_Field_Entery() {
		String text = driver.findElement(By.id("display")).getText();
	   Assert.assertEquals("Nithya", text);
	}

	@Then("User validate the outcomes of Two Input Field Entery")
	public void user_validate_the_outcomes_of_Two_Input_Field_Entery() {
		String texttotal = driver.findElement(By.id("displayvalue")).getText();
		   Assert.assertEquals("6", texttotal);
	}
	
	@Then("User quit the Browser")
	public void user_quit_the_Browser() {
	    quitBrowser();
	}

}
