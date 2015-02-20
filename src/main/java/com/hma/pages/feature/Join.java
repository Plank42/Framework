package com.hma.pages.feature;

import com.hma.pages.BasePage;

/**
 * Created by anewton on 05/12/2014.
 */
public class Join extends BasePage {

    /*WebDriver driver;

    public Join (*//*WebDriver driver*//*){

    }*/

    @Override
    protected void navigate() {
        /*driver.get(baseUrl() + RelativeUrl() );*/
    }

    @Override
    protected void load() {
        this.navigate();
    }

    @Override
    protected void isLoaded() throws Error {

    }

    @Override
    public String getTitle(/*WebDriver driver*/) {
        return null;
    }

    @Override
    public String getPageName(/*WebDriver driver*/) {
        return null;
    }

    @Override
    protected String RelativeUrl() {

        return "/vpncontrol/join/";
    }

    @Override
    public boolean isAt(/*WebDriver driver*/) {
        return false;
    }

    @Override
    public boolean verifyAt(/*WebDriver driver*/) {
        return false;
    }
}
