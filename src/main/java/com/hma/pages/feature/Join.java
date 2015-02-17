package com.hma.pages.feature;

import com.hma.pages.BasePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by anewton on 05/12/2014.
 */
public class Join extends BasePage {

    WebDriver driver;

    public Join (WebDriver driver){
        this.driver = driver;
    }


    @Override
    public void Goto() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    protected String setTitle(String name) {
        return null;
    }

    @Override
    protected String setPageName(String name) {
        return null;
    }

    @Override
    protected String RelativeUrl() {
        return null;
    }
}
