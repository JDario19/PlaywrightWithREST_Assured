package com.practice.automation.common;

import com.microsoft.playwright.*;
import org.testng.annotations.*;

public class BaseUiTest {

    protected static Playwright playwright;
    protected static Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeClass
    public void setUpClass() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        );
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }

    @BeforeMethod
    public void setUp() {
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterMethod(alwaysRun = true)
    public void cleanUp() {
        if (context != null) context.close();
    }
}
