package com.komoot.ui;

import com.komoot.commonutilities.GetConfig;
import org.apache.commons.configuration.ConfigurationException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UI_Tests extends TestBaseUI  {

    @Test(priority = 1, description="Verify Landing page header links")
    public void verify_Landing_Page_HeaderLinks() throws ConfigurationException {
        container.landingPage.enterURL(GetConfig.getProperties("SITE_URL"));
        Assert.assertTrue(container.landingPage.isKomootLogoPresent(), "Komoot logo link is not available");
        Assert.assertTrue(container.landingPage.isDiscoverLinkPresent(), "Discover link is not available");
        Assert.assertTrue(container.landingPage.isRoutePlanerLinkPresent(), "Route Planner link is not available");
        Assert.assertTrue(container.landingPage.isFeatureLinkPresent(), "Features link is not available");
        Assert.assertTrue(container.landingPage.isShopButtonPresent(), "Shop button is not available");
        Assert.assertTrue(container.landingPage.isLanguageDropdownPresent(), "Language dropdown is not available");
        Assert.assertTrue(container.landingPage.isLoginButtonPresent(), "Komoot logo link is not available");
    }


    @Test(priority = 2, description="Verify languages available in the site")
    public void verifyLanguagesAvailable() throws ConfigurationException {
        container.landingPage.enterURL(GetConfig.getProperties("SITE_URL"));
        container.landingPage.acceptAllCookies();
        container.landingPage.verifyLanguageAvailable();
    }

    @Test(priority = 3, description="Log into Kamoot with valid credentials")
    public void loginWithValidCredentials() throws ConfigurationException {
        container.landingPage.enterURL(GetConfig.getProperties("SITE_URL"));
        container.landingPage.acceptAllCookies();
        container.landingPage.clickSignIn_LoginButton();
        container.signInPage.inputEmail(data.get("email"));
        container.signInPage.inputPassword(data.get("password"));
        Assert.assertTrue(container.signInPage.clickLogInButton(data.get("username")));
    }

    @Test(priority = 4, description="Log into Kamoot with invalid credentials")
    public void loginWithInvalidCredentials() throws ConfigurationException {
        container.landingPage.enterURL(GetConfig.getProperties("SITE_URL"));
        container.landingPage.acceptAllCookies();
        container.landingPage.clickSignIn_LoginButton();
        container.signInPage.inputEmail(data.get("email"));
        container.signInPage.inputPassword(data.get("password"));
        Assert.assertFalse(container.signInPage.clickLogInButton(data.get("username")));
    }

    @Test(priority = 5, description="Log into Kamoot with invalid credentials")
    public void verifyDiscover_BikeTouring() throws ConfigurationException {
        container.landingPage.enterURL(GetConfig.getProperties("SITE_URL"));
        container.landingPage.acceptAllCookies();
        container.landingPage.clickSignIn_LoginButton();
        container.signInPage.loginToKomoot(data.get("email"),data.get("password"),data.get("username"));
        container.landingPage.clickDiscoverLink();
        container.discoverPage.verifyTouringTypes();
    }

}
