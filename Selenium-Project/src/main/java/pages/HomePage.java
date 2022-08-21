package pages;

import Browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Browser.Browser.getPropertyValue;

public class HomePage {
    @FindBy(id = "_idgpn_5") private WebElement userNameElement;
    @FindBy(id = "") private WebElement passwordElement;
    @FindBy(id = "") private WebElement loginButton;


    public void logIn(){
        userNameElement.sendKeys(getPropertyValue("userName"));
        passwordElement.sendKeys(getPropertyValue("password"));
        loginButton.click();
    }

}
