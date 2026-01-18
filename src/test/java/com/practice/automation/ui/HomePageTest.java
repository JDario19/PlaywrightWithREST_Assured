package com.practice.automation.ui;

import com.practice.automation.common.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseUiTest {

    @Test
    public void shouldOpenHomePage() {
        page.navigate("https://automationexercise.com/");
        String title = page.title();
        Assert.assertTrue(title.contains("Automation"),
                "Expected title to contain 'Automation'");
    }
}
