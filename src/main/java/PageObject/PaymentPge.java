package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPge {
public PaymentPge(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(id="card_nmuber")
private WebElement cardnumtxt;
@FindBy(id="month")
private WebElement month;
@FindBy(id="year")
private WebElement year;
@FindBy(id="cvv_code")
private WebElement cvv_code;
@FindBy(name="submit")
private WebElement submitbtn;
public WebElement getSubmitbtn() {
	return submitbtn;
}
public WebElement getCardnumtxt() {
	return cardnumtxt;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvv_code() {
	return cvv_code;
}

}
