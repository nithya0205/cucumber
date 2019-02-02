package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentSuccess {
public PaymentSuccess(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//h2[text()='Payment successfull!']")
private WebElement paymentsuccess;
public WebElement getPaymentsuccess() {
	return paymentsuccess;
}
}
