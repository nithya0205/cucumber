package org.guru99telecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RadioBtnDemoMain extends BaseClass{

	@Given("User to click the Input form DropDown and navigate to Radio Button Demo")
	public void user_to_click_the_Input_form_DropDown_and_navigate_to_Radio_Button_Demo() {
		WebElement element_inputTab = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
	    click(element_inputTab);
	    WebElement element_radiobtndemo = driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[1]"));
	    click(element_radiobtndemo);
	}

	@When("Click the Radio Button Male under Radio Button Demo")
	public void click_the_Radio_Button_Male_under_Radio_Button_Demo() {
	    driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	}

	@When("Click the Radio Button Female and age Group as {int} to {int} under Group Radio Button Demo")
	public void click_the_Radio_Button_Female_and_age_Group_as_to_under_Group_Radio_Button_Demo(Integer int1, Integer int2) {
		driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[6]")).click();
	}

	@Then("validate the outcomes by clicking get checked value Buuton under radio Demo section")
	public void validate_the_outcomes_by_clicking_get_checked_value_Buuton_under_radio_Demo_section() {
		driver.findElement(By.xpath("//button[text()='Get Checked value']")).click();
	    String text = driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
	    Assert.assertEquals("Valid", "Radio button 'Male' is checked", text);
	}


	@Then("validate the outcomes by clicking get value Buuton under group radio Demo section")
	public void validate_the_outcomes_by_clicking_get_value_Buuton_under_group_radio_Demo_section() {
		driver.findElement(By.xpath("//button[text()='Get values']")).click();
		String text = driver.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
		Assert.assertEquals("Valid", "Sex : Female"+"\n"+"Age group: 5 - 15",text);
		
	}
}
