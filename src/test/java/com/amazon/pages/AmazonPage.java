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

    @FindBy(xpath = "//div[@class='nav-signin-tt nav-flyout']")
    public WebElement signInNavFlyout;

    @FindBy(xpath = "//div[@id='nav-al-signin']//a[@class='nav-action-button']")
    public WebElement signInButtonInNavigation;

    public void clickToReachLogInPage() {
        Actions actions = new Actions(Driver.getDriver());
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nav-signin-tt nav-flyout']")));
            actions.moveToElement(signInNavFlyout).perform();
            actions.click(signInButtonInNavigation).perform();
        } catch (Exception e) {
            System.out.println(e.getCause());
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
