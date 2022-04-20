package pages;

import org.openqa.selenium.By;
import helpers.WebDriverClass;

public class HomePage extends BasePage<HomePage>{
    private By logoButton= By.xpath("//*[@id=\"__next\"]/div/div[1]/div/nav/div[2]/a/svg/path[1]");
    private By sneakersButton = By.cssSelector("#__next > div > div.orfszq-2.gKhOmF > div > nav > div.orfszq-7.ihmLHx > div.orfszq-9.bhCDnW > a:nth-child(1) > span > button");
    private By shopNowButton = By.xpath("//*[@id=\"__next\"]/div/div[2]/section[1]/div[3]/div/h2");


    public String getUrl() {
        return baseURL;
    }

    protected void load() {
        WebDriverClass.getDriver().get(getUrl());
    }

    protected void isLoaded() throws Error {
        displayCheck();
    }
    public boolean displayCheck() {
        return displayCheckElement(shopNowButton);
    }
}
