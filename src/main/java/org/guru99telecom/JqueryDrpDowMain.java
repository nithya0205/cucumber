package org.guru99telecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class JqueryDrpDowMain extends BaseClass {

	@Given("User to click the Input form DropDown and navigate to JQuery Select Drop Down Page")
	public void user_to_click_the_Input_form_DropDown_and_navigate_to_JQuery_Select_Drop_Down_Page() {
		WebElement element_inputTab = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
	    click(element_inputTab);
	    WebElement element_select = driver.findElement(By.xpath("(//a[text()='JQuery Select dropdown'])[1]"));
	    click(element_select);
	}

	@When("User to select India under DropDown with Search Box Section")
	public void user_to_select_India_under_DropDown_with_Search_Box_Section() {
	    WebElement select_country = driver.findElement(By.id("country"));
	    Select s = new Select(select_country);
	    s.selectByIndex(1);
	}

	@When("User to Select the Option Ohio and Texas under Multiselect List")
	public void user_to_Select_the_Option_Ohio_and_Texas_under_Multiselect_List() {
	    WebElement multi_select = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/select"));
	    Select s = new Select(multi_select);
	    s.selectByValue("TX");
	    s.selectByVisibleText("Ohio");
	    
	}

	@When("User to Select the Option American Samoa under Drop Down Disabled")
	public void user_to_Select_the_Option_American_Samoa_under_Drop_Down_Disabled() {
		 WebElement select3 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div[2]/select"));
		    Select s = new Select(select3);
		    //s.selectByValue("AS");
		    s.selectByIndex(1);
	}

	@When("User to Select the Option Java under Drop-down with Category related options")
	public void user_to_Select_the_Option_Java_under_Drop_down_with_Category_related_options() {
	  WebElement select4 = driver.findElement(By.id("files"));
	  Select s = new Select(select4);
	  s.selectByVisibleText("Java");
	}
}
