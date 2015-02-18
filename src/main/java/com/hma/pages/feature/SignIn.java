package com.hma.pages.feature;

import com.hma.pages.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sentinel on 15/02/2015.
 */
public class SignIn extends BasePage {

    public SignIn(WebDriver driver) {
        super(driver);
    }

    @Override
    public void Goto(WebDriver driver) {

    }

    @Override
    public String getTitle(WebDriver driver) {
        return null;
    }

    @Override
    public String getPageName(WebDriver driver) {
        return null;
    }

    @Override
    protected String RelativeUrl() {
        return null;
    }

    @Override
    public boolean isAt(WebDriver driver) {
        return false;
    }

    @Override
    public boolean verifyAt(WebDriver driver) {
        return false;
    }
}
