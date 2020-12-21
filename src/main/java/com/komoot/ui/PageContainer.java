package com.komoot.ui;

import org.openqa.selenium.WebDriver;


public class PageContainer {

    public WebDriver driver;
    public LandingPage landingPage;

    /**
     * Constructor of the class
     *
     * @param driver WebDriver
     */
    public PageContainer(WebDriver driver) {
        this.driver = driver;
        initPages();
    }

    /**
     * Intialise & use the methods implemented in the pages
     */
    public void initPages() {
        landingPage= new LandingPage(driver);
    }

}
