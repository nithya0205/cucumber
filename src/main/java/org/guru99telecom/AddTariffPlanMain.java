package org.guru99telecom;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class AddTariffPlanMain extends BaseClass{
	AddTraiffPlanLoc loc;
	@Given("The User in GuruHome Page")
	public void the_User_in_GuruHome_Page() {
	   launchBrowser();
	    getUrl("http://demo.guru99.com/telecom/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    loc = new AddTraiffPlanLoc();
	}

	@Given("The User Navigate to Add Traiff plan")
	public void the_User_Navigate_to_Add_Traiff_plan() {
	click(loc.getAddtariffplanclk());
	}
	
	@When("The User to fill the Details")
	public void the_User_to_fill_the_Details(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		enterValue(loc.getMontlyRent(), asList.get(0));
		enterValue(loc.getLocal_minutes(), asList.get(1));
		enterValue(loc.getFreeInternation(), asList.get(2));
		enterValue(loc.getSms_pack(), asList.get(3));
		enterValue(loc.getLocperminchar(), asList.get(4));
		enterValue(loc.getInterperminchar(), asList.get(5));
		enterValue(loc.getSmsperchar(), asList.get(6));
	}


	@When("The User click the Submit button")
	public void the_User_click_the_Submit_button() {
		click(loc.getSubmitbtn());
	}

	@Then("The User validate the outcome")
	public void the_User_validate_the_outcome() {
	    Assert.assertEquals("Congratulation you add Tariff Plan", loc.getValidation().getText());
	}
}
