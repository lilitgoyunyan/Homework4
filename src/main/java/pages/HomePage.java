package pages;

import helpers.Waiter;
import locators.HomePageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    private By sneakersButton = By.cssSelector(HomePageConstants.sneakersButton);
    private By shopNow = By.xpath(HomePageConstants.shopNowButton);

    @Override
    public String getUrl() {
        return baseURL;
    }
    public FlightClubSneakers clickSneakersButton(){
        WebElement snkButton = Waiter.getInstance().waitForElementToBeClickable(sneakersButton);
        snkButton.click();
        return new FlightClubSneakers();
    }
    public boolean isSneakersButtonDisplayed() {
        return isElementDisplayed(sneakersButton);
    }
    public boolean isShopNowDisplayed() {
        return isElementDisplayed(shopNow);
    }




}
