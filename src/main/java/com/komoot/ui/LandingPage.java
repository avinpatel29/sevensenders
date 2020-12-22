package com.komoot.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import java.util.List;

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

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'tw-flex-none tw-flex')]/div[4]//button/span")
    private WebElement SIGNIN_LOGIN_BUTTON;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    private WebElement EMAIL_TEXTFIELD;

    @FindBy(how = How.XPATH, using = "//div[@id='gdpr_banner_portal']")
    private WebElement COOKIES_SECTION;

    @FindBy(how = How.XPATH, using = "//div[@id='gdpr_banner_portal']/div/div/div/div[2]/div/div[1]/button")
    private WebElement COOKIES_ACCEPTALL_BUTTON;

    @FindBy(how = How.XPATH, using = "//div[@id='gdpr_banner_portal']/div/div/div/div[2]/div/div[3]/button")
    private WebElement COOKIES_DECLINE_BUTTON;

    @FindBy(how = How.XPATH, using = "//div[@class='tw-shadow-xl']")
    private WebElement TOURING_OPTIONS;

    @FindBy(how = How.XPATH, using = "//span[@class='tw-font-bold tw-mr-1']")
    private WebElement SELECTED_LANGUAGE;

    @FindBy(how = How.XPATH, using = "//ul[@class='c-dropdown__menu tw-z-6']")
    private WebElement LANGUAGE_OPTIONS_SECTION;

    @FindBy(how = How.XPATH, using = "//ul[@class='c-dropdown__menu tw-z-6']/li")
    private List<WebElement> LANGUAGE_OPTIONS_LIST;

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

    public void clickSignIn_LoginButton(){
        clickAndWait(SIGNIN_LOGIN_BUTTON,EMAIL_TEXTFIELD);
    }

    public void acceptAllCookies(){
        waitForElementToBePresent(COOKIES_SECTION);
        click(COOKIES_ACCEPTALL_BUTTON);
        waitForElementTillnotPresent(COOKIES_SECTION);
    }

    public void clickDiscoverLink(){
        clickAndWait(DISCOVER_LINK, TOURING_OPTIONS);
    }

    public void verifyLanguageAvailable(){
        waitForPageToLoad();
        waitForElementTobeClickable(SELECTED_LANGUAGE);
        clickAndWait(SELECTED_LANGUAGE, LANGUAGE_OPTIONS_SECTION);
        String[] exp = {"Deutsch","English","Français","Italiano","Español","Nederlands"};
        for(WebElement we:LANGUAGE_OPTIONS_LIST)
        {
            for (int i=0; i<exp.length; i++){
                if (we.getText().equals(exp[i])){
                    break;
                }
            }
        }
    }
}
