package com.komoot.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DiscoverPage extends PageBase {

    public DiscoverPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='tw-shadow-xl']")
    private WebElement TOURINGTYPES_SECTION;

    @FindBy(how = How.XPATH, using = "//div[@class='tw-shadow-xl']/div/div[1]/div/ul/li[1]//div[@data-name='sport']")
    private WebElement HIKING_ICON;

    @FindBy(how = How.XPATH, using = "//div[@class='tw-shadow-xl']/div/div[1]/div/ul/li[2]//div[@data-name='sport']")
    private WebElement TOURING_BICYCLE_ICON;
    
    @FindBy(how = How.XPATH, using = "//div[@class='tw-shadow-xl']/div/div[1]/div/ul/li[3]//div[@data-name='sport']")
    private WebElement MOUNTAINBIKE_ICON;

    @FindBy(how = How.XPATH, using = "//div[@class='tw-shadow-xl']/div/div[1]/div/ul/li[4]//div[@data-name='sport']")
    private WebElement RACEBIKE_ICON;

    @FindBy(how = How.XPATH, using = "//div[@class='tw-shadow-xl']/div/div[1]/div/ul/li[5]//div[@data-name='sport']")
    private WebElement JOGGING_ICON;

    public void verifyTouringTypes(){
        waitForElementToBePresent(TOURINGTYPES_SECTION);
        Assert.assertTrue(isElementPresent(HIKING_ICON),"Hiking option is not available");
        Assert.assertTrue(isElementPresent(TOURING_BICYCLE_ICON),"Touring Bicycle option is not available");
        Assert.assertTrue(isElementPresent(MOUNTAINBIKE_ICON),"Mountain Bike option is not available");
        Assert.assertTrue(isElementPresent(RACEBIKE_ICON),"Race Bike option is not available");
        Assert.assertTrue(isElementPresent(JOGGING_ICON),"Jogging option is not available");
    }
}
