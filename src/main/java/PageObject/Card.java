package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Card {
public Card(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(name="quantity")
private WebElement selectqty;
@FindBy(xpath="//input[@value='Buy Now']")
private WebElement buynowbtn;
public WebElement getSelectqty() {
	return selectqty;
}
public WebElement getBuynowbtn() {
	return buynowbtn;
}

}
