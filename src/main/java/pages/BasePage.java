package pages;

import helpers.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.WebDriverClass.getDriver;

public abstract class BasePage{
    public static WebDriver webDriver;
    public static String baseURL = "https://www.flightclub.com";


    public BasePage() {
        webDriver = getDriver();
    }

    public abstract String getUrl();

    public boolean isElementDisplayed(By location) {
        return findElement(location).isDisplayed();
    }
    public WebElement findElement(By location) {
        Waiter.getInstance().displayElement(location);
        return webDriver.findElement(location);
    }


}