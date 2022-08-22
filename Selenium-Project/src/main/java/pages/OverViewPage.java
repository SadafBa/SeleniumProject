package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverViewPage {
    @FindBy(linkText = "Open New Account") private WebElement OpenAccountLink;

    public void ClickOpenAccountLink(){
        OpenAccountLink.click();
    }

}
