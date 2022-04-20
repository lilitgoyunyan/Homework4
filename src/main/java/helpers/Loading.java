package helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Loading {
    private static final Duration DURATION = Duration.ofSeconds(10);
    public static Loading getInstance() {
        return new Loading();
    }
    public Loading displayElement(By location) {
        try {
            new WebDriverWait(WebDriverClass.getDriver(), DURATION).until(ExpectedConditions.visibilityOfElementLocated(location));
            return this;
        } catch (WebDriverException ignored) {
            throw new Error("Element could not be found");
        }
    }
    public Loading displayWebElement(WebElement element) {
        try {
            new WebDriverWait(WebDriverClass.getDriver(), DURATION).until(ExpectedConditions.visibilityOf(element));
            return this;
        } catch (WebDriverException ignored) {
            throw new Error("Element: " + element + "could not be found");
        }
    }


}
