package com.test.pages;

import com.test.base.BasePage;
import com.test.locators.*;

import java.util.List;

public class ThankYouPage extends BasePage {
    private Locator submitButton = new CSS("h1.success-title");

    public void waitForSuccessMessage(){
        waitForElementVisibility(submitButton);
    }


}
