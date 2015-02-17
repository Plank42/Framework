package com.hma.pages.stable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by anewton on 13/02/2015.
 */
public class ToolsAndContacts {

    WebDriver driver;

    public ToolsAndContacts(WebDriver webDriver) {
        this.driver = webDriver;
    }

    @FindBy(how = How.CSS, using = "* div.europa-dip-fixed > div.reveal-container-top > a") protected WebElement closeButton;

    @FindBy(how = How.CSS, using = "* li:nth-child(1) > ul:nth-child(3) > li:nth-child(1) > a") protected WebElement jobsLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(1) > ul:nth-child(3) > li:nth-child(2) > a") protected WebElement privacyLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(1) > ul:nth-child(3) > li:nth-child(3) > a") protected WebElement affiliatesLinks;
    @FindBy(how = How.CSS, using = "* li:nth-child(1) > ul:nth-child(3) > li:nth-child(4) > a") protected WebElement reviewsLink;

    @FindBy(how = How.CSS, using = "* li:nth-child(2) > ul > li:nth-child(1) > a > span") protected WebElement proxyLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(2) > ul > li:nth-child(2) > a > span") protected WebElement serversLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(2) > ul > li:nth-child(3) > a > span") protected WebElement ipPortLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(2) > ul > li:nth-child(4) > a > span") protected WebElement anonEmailLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(2) > ul > li:nth-child(5) > a > span") protected WebElement anonRferLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(2) > ul > li:nth-child(6) > a > span") protected WebElement privSWLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(2) > ul > li:nth-child(7) > a > span") protected WebElement routersLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(2) > ul > li:nth-child(8) > a > span") protected WebElement vpnSWLink;

    @FindBy(how = How.CSS, using = "* li:nth-child(3) > ul > li:nth-child(1) > a > span") protected WebElement fbLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(3) > ul > li:nth-child(2) > a > span") protected WebElement twitterLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(3) > ul > li:nth-child(3) > a > span") protected WebElement gPLusLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(3) > ul > li:nth-child(1) > a > span") protected WebElement blogLink;
    @FindBy(how = How.CSS, using = "* li:nth-child(3) > ul > li:nth-child(1) > a > span") protected WebElement communityLink;

    @FindBy(how = How.CSS, using = "* li.show-for-large-up > ul > li:nth-child(1) > a > span") protected WebElement emailLink;
    @FindBy(how = How.CSS, using = "* li.show-for-large-up > ul > li:nth-child(2) > a > span") protected WebElement liveChat;
    @FindBy(how = How.CSS, using = "* li.show-for-large-up > ul > li:nth-child(3) > a > span") public WebElement businessLink;

    @FindBy(how = How.CSS, using="div.reveal-container-top") protected WebElement Menu;

    public boolean checkToolsAndContactsState() {

        if(Menu.isDisplayed()) {
            return true;
        }

        return false;
    }



}


