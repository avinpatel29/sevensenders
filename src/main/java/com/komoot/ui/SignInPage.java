package com.komoot.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

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

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'tw-flex-none tw-flex')]/div[4]//button")
    private WebElement NEXT_BUTTON;

    @FindBy(how = How.XPATH, using = "//a[@class='c-topmenu__toggle tw-inline-flex']/div/div")
    private WebElement USERNAME_BUTTON;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Unfortunately we couldn’t log you in. Please verify')]")
    private WebElement INVALID_CREDENTIALS_ERROR_MSG;


    public void inputEmail(String emailID){
        inputText(EMAIL_TEXTFIELD,emailID);
        click(CONTINUE_WITH_EMAIL_BUTTON);
    }

    public void inputUsername(String username){
        inputText(USERNAME_TETFIELD,username);
    }

    public void inputPassword(String password){
        inputText(PASSWORD_TEXTFIELD, password);
    }

    public boolean clickLogInButton(String username){
        boolean login=false;
        click(CONTINUE_WITH_EMAIL_BUTTON);
        waitForPageToLoad();
        if(isElementPresent(USERNAME_BUTTON)){
            Assert.assertEquals(getText(USERNAME_BUTTON), username );
            login=true;
        }
        else if(isElementPresent(INVALID_CREDENTIALS_ERROR_MSG)){

        }
        return login;
    }


    public void clickNextButton(){
        click(NEXT_BUTTON);
    }
}
