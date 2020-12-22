package com.komoot.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import java.util.List;

public class SignInPage extends PageBase {

    public SignInPage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    private WebElement EMAIL_TEXTFIELD;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement CONTINUE_WITH_EMAIL_BUTTON;
    
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

    @FindBy(how = How.XPATH, using = "//input[@id='display_name']")
    private WebElement USERNAME_TETFIELD;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    private WebElement PASSWORD_TEXTFIELD;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Sign Up')]")
    private WebElement SIGNUP_BUTTON;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Next')]")
    private WebElement NEXT_BUTTON;

    @FindBy(how = How.XPATH, using = "//a[@class='c-topmenu__toggle tw-inline-flex']/div/div")
    private WebElement USERNAME_BUTTON;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Unfortunately we couldn’t log you in. Please verify')]")
    private WebElement INVALID_CREDENTIALS_ERROR_MSG;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Let’s get started')]")
    private WebElement LETS_GET_STARTED;

    @FindBy(how = How.XPATH, using = "//div[@class='tw-mx-auto tw-max-w-md']/div/div[3]/button[1]")
    private WebElement HIKING_OPTION;

    @FindBy(how = How.XPATH, using = "//div[@class='tw-mx-auto tw-max-w-md']/div/div[3]/button[2]")
    private WebElement RUNNING_OPTION;

    @FindBy(how = How.XPATH, using = "//div[@class='tw-mx-auto tw-max-w-md']/div/div[3]/button[3]")
    private WebElement BIKETOURING_OPTION;

    @FindBy(how = How.XPATH, using = "//div[@class='tw-mx-auto tw-max-w-md']/div/div[3]/button[4]")
    private WebElement MOUNTAINBIKING_OPTION;

    @FindBy(how = How.XPATH, using = "//div[@class='tw-mx-auto tw-max-w-md']/div/div[3]/button[5]")
    private WebElement ROADCYCLING_OPTION;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'What’s Next?')]")
    private WebElement WHATSNEXT_BUTTON;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Discover More')]")
    private WebElement DISCOVER_MORE_BUTTON;

    @FindBy(how = How.XPATH, using = "//div[@class='tw-shadow-xl']")
    private WebElement TOURINGTYPES_SECTION;

    @FindBy(how = How.XPATH, using = "//span[@class='tw-font-bold tw-mr-1']")
    private WebElement SELECTED_LANGUAGE;

    @FindBy(how = How.XPATH, using = "//ul[@class='c-dropdown__menu tw-z-6']")
    private WebElement LANGUAGE_OPTIONS_SECTION;

    @FindBy(how = How.XPATH, using = "//ul[@class='c-dropdown__menu tw-z-6']/li")
    private List<WebElement> LANGUAGE_OPTIONS_LIST;

    public void inputEmail(String emailID){
        inputText(EMAIL_TEXTFIELD,emailID);
        click(CONTINUE_WITH_EMAIL_BUTTON);
    }

    public void inputUsername(String username){
        inputText(USERNAME_TETFIELD, username);
    }

    public void inputPassword(String password){
        inputText(PASSWORD_TEXTFIELD, password);
    }

    public void loginToKomoot(String emailID, String password, String username){
        inputEmail(emailID);
        inputPassword(password);
        clickLogInButton(username);
    }

    public boolean clickLogInButton(String username){
        boolean login=false;
        click(CONTINUE_WITH_EMAIL_BUTTON);
        waitForElementToBePresent(USERNAME_BUTTON);
        if(isElementPresent(USERNAME_BUTTON)){
            Assert.assertEquals(getText(USERNAME_BUTTON), username );
            login=true;
        }
        else if(isElementPresent(INVALID_CREDENTIALS_ERROR_MSG)){
            log.error("Unfortunately we couldn’t log you in. Please verify your email and password and try again.");
        }
        return login;
    }



}
