package org.guru99telecom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SelectDropDown extends BaseClass {

	@Given("User to click the Input form DropDown and navigate to Select Drop Down Page")
	public void user_to_click_the_Input_form_DropDown_and_navigate_to_Select_Drop_Down_Page() {
		 WebElement element_inputTab = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		    click(element_inputTab);
		    WebElement element_select = driver.findElement(By.xpath("(//a[text()='Select Dropdown List'])[1]"));
		    click(element_select);
	}

	@When("Select the option Friday under List Select Demo")
	public void select_the_option_Friday_under_List_Select_Demo() {
	   WebElement select_ele = driver.findElement(By.id("select-demo"));
	   Select s = new Select(select_ele);
	   s.selectByIndex(6);
	}

	@When("Select the Option Ohio and Texas under Multiselect List Demo")
	public void select_the_Option_Ohio_and_Texas_under_Multiselect_List_Demo() throws AWTException {
		/*WebElement element_multisele = driver.findElement(By.name("States"));
	    Select s1 = new Select(element_multisele);
	    s1.selectByValue("Ohio");
	    s1.selectByVisibleText("Texas");*/
		driver.findElement(By.xpath("//option[@value='Ohio']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		driver.findElement(By.xpath("//option[@value='Texas']")).click();
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	@Then("Validate the Selected option under List select Demo")
	public void validate_the_Selected_option_under_List_select_Demo() {
	     String text = driver.findElement(By.xpath("//p[text()='Day selected :- Friday']")).getText();
	     Assert.assertEquals("Day selected :- Friday", text);
	}

	@Then("Validate the FirstSelected and GetAllSelected Button")
	public void validate_the_FirstSelected_and_GetAllSelected_Button() {
		System.out.println("yet to Test");
		/*driver.findElement(By.id("Print All")).click();
		String text1 = driver.findElement(By.xpath("//p[text()='Options selected are : Ohio,Texas']")).getText();
		Assert.assertEquals("Options selected are : Ohio,Texas", text1);
	   driver.findElement(By.id("printMe")).click();
	   String text = driver.findElement(By.xpath("//p[text()='First selected option is : Ohio']")).getText();
	   System.out.println(text);
	   Assert.assertEquals("First selected option is : Ohio", text);*/
	   
	   
	}

	@Then("Quit Browser")
	public void quit_Browser() {
	    quitBrowser();
	}
}
