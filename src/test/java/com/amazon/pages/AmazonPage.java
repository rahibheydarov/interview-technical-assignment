package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AmazonPage extends BrowserUtils {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement accountNavigation;

    @FindBy(xpath = "//a[@data-nav-ref='nav_signin']/span")
    public WebElement signInButtonInNavigation;

    public void clickToReachLogInPage() {
        hover(accountNavigation);
        waitUntilPresenceOfElement("//a[@id='nav-link-accountList']", 30);
        hoverThenClick(signInButtonInNavigation);
    }

    @FindBy(id = "ap_email")
    public WebElement emailBox;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "ap_password")
    public WebElement passwordBox;

    @FindBy(id = "signInSubmit")
    public WebElement signInButton;

}
