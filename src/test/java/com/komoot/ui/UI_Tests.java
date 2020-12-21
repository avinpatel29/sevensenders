package com.komoot.ui;

import com.komoot.commonutilities.GetConfig;
import org.apache.commons.configuration.ConfigurationException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class UI_Tests extends TestBaseUI  {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");

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


    @Test(priority = 2, description="Log into Kamoot with valid credentials")
    public void loginWithValidCredentials() throws ConfigurationException {
        container.landingPage.enterURL(GetConfig.getProperties("SITE_URL"));
        container.landingPage.acceptAllCookies();
        container.landingPage.clickSignIn_LoginButton();
        container.signInPage.inputEmail(data.get("email"));
        container.signInPage.inputPassword(data.get("password"));
        Assert.assertTrue(container.signInPage.clickLogInButton(data.get("username")));
    }

}
