package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenerateCard {
public GenerateCard(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@id=\"three\"]/div/h4[1]")
private WebElement cardNumber;
@FindBy(xpath="//*[@id=\"three\"]/div/h4[2]")
private WebElement CVV;
@FindBy(xpath="//*[@id=\"three\"]/div/h4[3]")
private WebElement Exp;
@FindBy(xpath="//*[@id=\"three\"]/div/h4[4]")
private WebElement creditcard;
public WebElement getCardNumber() {
	return cardNumber;
}
public WebElement getCVV() {
	return CVV;
}
public WebElement getExp() {
	return Exp;
}
public WebElement getCreditcard() {
	return creditcard;
}

}
