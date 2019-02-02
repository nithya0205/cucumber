package org.guru99telecom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTraiffPlanLoc extends BaseClass {
public AddTraiffPlanLoc() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Add Tariff Plan']")
private WebElement Addtariffplanclk;
@FindBy(id="rental1")
private WebElement MontlyRent;
@FindBy(id="local_minutes")
private WebElement local_minutes;
@FindBy(xpath="//h2[text()='Congratulation you add Tariff Plan']")
private WebElement validation;
public WebElement getValidation() {
	return validation;
}
public WebElement getAddtariffplanclk() {
	return Addtariffplanclk;
}
public WebElement getMontlyRent() {
	return MontlyRent;
}
public WebElement getLocal_minutes() {
	return local_minutes;
}
public WebElement getFreeInternation() {
	return FreeInternation;
}
public WebElement getSms_pack() {
	return sms_pack;
}
public WebElement getLocperminchar() {
	return locperminchar;
}
public WebElement getInterperminchar() {
	return interperminchar;
}
public WebElement getSmsperchar() {
	return smsperchar;
}
public WebElement getSubmitbtn() {
	return submitbtn;
}
@FindBy(id="inter_minutes")
private WebElement FreeInternation;
@FindBy(id="sms_pack")
private WebElement sms_pack;
@FindBy(id="minutes_charges")
private WebElement locperminchar;
@FindBy(id="inter_charges")
private WebElement interperminchar;
@FindBy(id="sms_charges")
private WebElement smsperchar;
@FindBy(xpath="//input[@name='submit']")
private WebElement submitbtn;

}
