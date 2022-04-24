package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {
    private static final Duration DURATION = Duration.ofSeconds(25);

    public static Waiter getInstance() {
        return new Waiter();
    }

    public Waiter displayElement(By location) {
        new WebDriverWait(WebDriverClass.getDriver(), DURATION).until(ExpectedConditions.visibilityOfElementLocated(location));
        return this;

    }

    public Waiter displayWebElement(WebElement element) {
        new WebDriverWait(WebDriverClass.getDriver(), DURATION).until(ExpectedConditions.visibilityOf(element));
        return this;

    }

    public WebElement waitForElementToBeClickable(By location) {
        return new WebDriverWait(WebDriverClass.getDriver(), DURATION).until(ExpectedConditions.elementToBeClickable(location));

    }


}
