package pages;

import helpers.Loading;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import static helpers.WebDriverClass.getDriver;

public abstract class BasePage<T> extends LoadableComponent<BasePage<T>> {
    public static WebDriver webDriver;
    public static String baseURL = "https://www.flightclub.com";
    protected Actions actions;

    public BasePage() {
        webDriver = getDriver();
        actions = new Actions(webDriver);
    }

    public abstract String getUrl();

    public final void open() {
        webDriver.get(getUrl());
    }

    public T init() {
        PageFactory.initElements(getDriver(), this);
        return (T) this;
    }

    public boolean isTextPresent(String text) {
        return webDriver.getPageSource().contains(text);
    }
    public boolean displayCheckElement(By location) {
        return findElement(location).isDisplayed();
    }
    public WebElement findElement(By location) {
        Loading.getInstance().displayElement(location);
        return webDriver.findElement(location);
    }
    public boolean displayCheckWebElement(WebElement element) {
        Loading.getInstance().displayWebElement(element);
        return element.isDisplayed();
    }

}