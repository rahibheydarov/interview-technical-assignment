package com.amazon.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    static Actions actions = new Actions(Driver.getDriver());

    public static void hover(WebElement element) {
        actions.moveToElement(element).perform();
    }

    public static void hoverThenClick(WebElement element) {
        actions.click(element).perform();
    }

    public static void waitUntilPresenceOfElement(String xpath, int timeToWaitInSec){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }


}
