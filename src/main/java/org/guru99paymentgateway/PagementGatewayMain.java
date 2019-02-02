package org.guru99paymentgateway;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CucumberHelper.TestContext;
import PageObject.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class PagementGatewayMain extends TestContext{
	@Given("User to go to GurupaymentGateway Page")
	public void user_to_go_to_GurupaymentGateway_Page() {
	  Hook.driver.get("http://demo.guru99.com/");
	  Hook.driver.manage().window().maximize();
	  Hook.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  HomePageObject home = new HomePageObject(Hook.driver);
	  home.getPgtewayclick().click();
	}

	@Given("User to click Generate Card number option")
	public void user_to_click_Generate_Card_number_option() {
		PagementGatePage pgp = new PagementGatePage(Hook.driver);
		pgp.getCardGenerationLink().click();
		
	}

	@Then("Store the Card details.")
	public void store_the_Card_details() {
		String Parentwindow = Hook.driver.getWindowHandle();
		Set<String> all_window = Hook.driver.getWindowHandles();
		for (String window : all_window) {
			if(!Parentwindow.equals(window))
				Hook.driver.switchTo().window(window);
		}
	   GenerateCard obj = new GenerateCard(Hook.driver);
	   String CardNumber = obj.getCardNumber().getText();
	   String CVV = obj.getCVV().getText();
	   String Exp = obj.getExp().getText();
	   String CardLimit = obj.getCreditcard().getText();
	   System.out.println("*****Card Details****");
	   System.out.println(CardNumber);
	   System.out.println(CVV);
	   System.out.println(Exp);
	   System.out.println(CardLimit);
	   setCardNumber(CardNumber);
	   setCVV(CVV);
	   setExp(Exp);
	   setCardLimit(CardLimit);
	}


	@Then("User to click cart")
	public void user_to_click_cart() {
		PagementGatePage pgp = new PagementGatePage(Hook.driver);
		pgp.getCartLink().click();
	}

	@Given("User to click on Buy now")
	public void user_to_click_on_Buy_now() {
	    Card cartobj = new Card(Hook.driver);
	    WebElement selectqty = cartobj.getSelectqty();
	    Select s = new Select(selectqty);
	    s.selectByIndex(0);
	    cartobj.getBuynowbtn().click();
	    
	}

	@When("User to enter the card details")
	public void user_to_enter_the_card_details()  {
	String cardNumber2 = getCardNumber();
	String cvv2 = getCVV();
	String exp2 = getExp();
	String[] crdnum = cardNumber2.split("-");
	String[] CV = cvv2.split("-");
	String[] exp = exp2.split("-");
	String[] date = exp[1].split("/");
	System.out.println("Entered Card Number: "+crdnum[1]);
	System.out.println("Entered CVV Number: "+CV[1]);
	System.out.println("Entered Month: "+date[0]);
	System.out.println("Entered Year: "+date[1]);
	PaymentPge pay = new PaymentPge(Hook.driver);
	pay.getCardnumtxt().sendKeys(crdnum[1]);
	pay.getCvv_code().sendKeys(CV[1]);
	pay.getMonth().sendKeys(date[0]);
	pay.getYear().sendKeys(date[1]);
	
	}

	@When("Click on the Payment button")
	public void click_on_the_Payment_button() {
		PaymentPge pay = new PaymentPge(Hook.driver);
		pay.getSubmitbtn().click();
	}

	@Then("User to verify the payment successful message")
	public void user_to_verify_the_payment_successful_message() {
	    PaymentSuccess paysuccess = new PaymentSuccess(Hook.driver);
	    Assert.assertEquals("Payment successfull!", paysuccess.getPaymentsuccess().getText());
	}
	
	@Given("User to click on Check the Credit tab")
	public void user_to_click_on_Check_the_Credit_tab() {
		PagementGatePage pgp = new PagementGatePage(Hook.driver);
		pgp.getCerditCardLimit().click();
	}

	@When("User to enter the card number")
	public void user_to_enter_the_card_number() {
	    String cardNumber2 = getCardNumber();
	    String[] crdnum = cardNumber2.split("-");
	    System.out.println("****Credit Card Balance****");
	    CardBalance cardbal = new CardBalance(Hook.driver);
	    cardbal.getCardNum().sendKeys(crdnum[1]);
	    System.out.println("Entered Card Number: "+crdnum[1]);
	    
	}

	@When("Click on the Submit Button")
	public void click_on_the_Submit_Button() {
		CardBalance cardbal = new CardBalance(Hook.driver);
		cardbal.getSubmitbtn().click();
	}
	@Then("User to check Card balance amount")
	public void user_to_check_Card_balance_amount() {
		CardBalance cardbal = new CardBalance(Hook.driver);
		String bal_card = cardbal.getBal().getText();
		System.out.println("Balance of the card: "+bal_card);

}
}
