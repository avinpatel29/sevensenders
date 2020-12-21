package com.komoot.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage extends PageBase {

    public LandingPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'tw-flex tw-items-center tw-justify-between')]/a")
    private WebElement KOMOOT_LOGO;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'tw-flex-auto tw-h-full')]/ul/li[1]/a")
    private WebElement DISCOVER_LINK;
    
    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'tw-flex-auto tw-h-full')]/ul/li[2]/a")
    private WebElement ROUTEPLANNER_LINK;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'tw-flex-auto tw-h-full')]/ul/li[3]/a")
    private WebElement FEATURES_LINK;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'tw-flex-none tw-flex')]/div[2]/a")
    private WebElement SHOP_BUTTON;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'tw-flex-none tw-flex')]/div[3]")
    private WebElement LANGUAGE_DROPDOWN;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'tw-flex-none tw-flex')]/div[4]//button")
    private WebElement SIGNIN_LOGIN_BUTTON;

    
    public boolean isKomootLogoPresent(){
        waitForElementTobeClickable(KOMOOT_LOGO);
        if(isElementPresent(KOMOOT_LOGO))
            return true;
        else
            return false;
    }

    public boolean isDiscoverLinkPresent(){
        waitForElementTobeClickable(DISCOVER_LINK);
        if(isElementPresent(DISCOVER_LINK))
            return true;
        else
            return false;
    }

    public boolean isRoutePlanerLinkPresent(){
        waitForElementTobeClickable(ROUTEPLANNER_LINK);
        if(isElementPresent(ROUTEPLANNER_LINK))
            return true;
        else
            return false;
    }

    public boolean isFeatureLinkPresent(){
        waitForElementTobeClickable(FEATURES_LINK);
        if(isElementPresent(FEATURES_LINK))
            return true;
        else
            return false;
    }

    public boolean isShopButtonPresent(){
        waitForElementTobeClickable(SHOP_BUTTON);
        if(isElementPresent(SHOP_BUTTON))
            return true;
        else
            return false;
    }

    public boolean isLanguageDropdownPresent(){
        waitForElementTobeClickable(LANGUAGE_DROPDOWN);
        if(isElementPresent(LANGUAGE_DROPDOWN))
            return true;
        else
            return false;
    }

    public boolean isLoginButtonPresent(){
        waitForElementTobeClickable(SIGNIN_LOGIN_BUTTON);
        if(isElementPresent(SIGNIN_LOGIN_BUTTON))
            return true;
        else
            return false;
    }

}
