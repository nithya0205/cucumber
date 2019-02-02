package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {


public HomePageObject(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Payment Gateway Project']")
private WebElement pgtewayclick;
public WebElement getPgtewayclick() {
	return pgtewayclick;
}
}
