package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardBalance {
public CardBalance(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(id="card_nmuber")
private WebElement CardNum;
@FindBy(name="submit")
private WebElement submitbtn;

public WebElement getCardNum() {
	return CardNum;
}
public WebElement getSubmitbtn() {
	return submitbtn;
}
@FindBy(xpath="//h4[text()='Credit Card Balance ']")
private WebElement bal;

public WebElement getBal() {
	return bal;
}
}
