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

}
