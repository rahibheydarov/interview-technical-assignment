package com.amazon.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //Creating the private constructor so this class' object is not reachable from outside
    private Driver() {
    }

    /*
    Making the 'driver' instance private so that it is not reachable from outside of the class.
    I make it static, because I'd like it to run before everything else, and also I will use it in a static method
     */

    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();


    //Creating re-usable utility method that will return same 'driver' instance everytime I call it.
    public static WebDriver getDriver() {

        if (driverPool.get() == null) {

            synchronized (Driver.class) {
            /*
            Reading the browser type from configuration.properties file using
            .getProperty method I created in ConfigurationReader class.
             */
                String browserType = ConfigurationReader.getProperty("browser");

            /*
            Depending on the browser type this switch statement will determine
            to open specific type of browser/driver
             */
                switch (browserType) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "safari":
                        WebDriverManager.getInstance(SafariDriver.class).setup();
                        driverPool.set(new SafariDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }
            }
        }


        //Same driver instance will be returned every time while calling Driver.getDriver(); method
        return driverPool.get();


    }

}
