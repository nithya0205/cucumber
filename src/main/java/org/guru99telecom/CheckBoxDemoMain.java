package org.guru99telecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CheckBoxDemoMain extends BaseClass {
	@Given("User to click the Input form DropDown and navigate to Check Box Demo")
	public void user_to_click_the_Input_form_DropDown_and_navigate_to_Check_Box_Demo() {
		 WebElement element_inputTab = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		    click(element_inputTab);
		    WebElement element_checkboxdemo = driver.findElement(By.xpath("(//a[text()='Checkbox Demo'])[1]"));
		    click(element_checkboxdemo);
	}

	@When("check the Single checkbox Field")
	public void check_the_Single_checkbox_Field() {
	    WebElement checkbox1 = driver.findElement(By.id("isAgeSelected"));
	    click(checkbox1);
	}

	@When("check the multiple checkbox Field")
	public void check_the_multiple_checkbox_Field() {
		WebElement opt1 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
	    click(opt1);
	    WebElement opt2 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[3]"));
	    click(opt2);
	    String text = driver.findElement(By.id("check1")).getAttribute("value");
	    Assert.assertEquals("Check All", text);
	    
	}

	@Then("click checkAll button to select all the option")
	public void click_checkAll_button_to_select_all_the_option() {
		 WebElement checkAll = driver.findElement(By.id("check1"));
		    click(checkAll);
		    String text = checkAll.getAttribute("value");
		    Assert.assertEquals("Uncheck All", text);
	}

	@Then("validate the Single checkbox field")
	public void validate_the_Single_checkbox_field() {
		  String text = driver.findElement(By.id("txtAge")).getText();
		  Assert.assertEquals("Success - Check box is checked", text);
	}
	
	@Then("User Quit the Browser")
	public void user_Quit_the_Browser() {
	   quitBrowser();
	}
	
	


	
}
