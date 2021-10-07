package com.amazon.pages;

import com.amazon.utilities.BrowserUtils;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPage {


    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement accountNavigation;

    @FindBy(xpath = "//a[@data-nav-ref='nav_signin']/span")
    public WebElement signInButtonInNavigation;

    public void clickToReachLogInPage() {
        Actions actions = new Actions(Driver.getDriver());
        try {
            actions.moveToElement(accountNavigation).perform();
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='nav-link-accountList']")));
            actions.click(signInButtonInNavigation).perform();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

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
