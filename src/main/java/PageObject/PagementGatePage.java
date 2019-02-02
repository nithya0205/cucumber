package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagementGatePage {
public PagementGatePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//a[text()='Cart'])[1]")
private WebElement cartLink;
@FindBy(xpath="(//a[text()='Generate Card Number'])[1]")
private WebElement cardGenerationLink;
@FindBy(xpath="(//a[text()='Check Credit Card Limit'])[1]")
private WebElement cerditCardLimit;
public WebElement getCartLink() {
	return cartLink;
}
public WebElement getCardGenerationLink() {
	return cardGenerationLink;
}
public WebElement getCerditCardLimit() {
	return cerditCardLimit;
}

}
