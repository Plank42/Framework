package com.hma.pages.stable;

import com.hma.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToolsAndContacts extends BasePage{



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

/*    private WebDriver Driver;


    public ToolsAndContacts(WebDriver webDriver){

        super(webDriver);
        this.Driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }*/

    @Override
    public void navigate() {
        /*Driver.get(baseUrl());*/
    }

    @Override
    protected void load() {

        /*Driver.navigate();*/
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
        return null;
    }

    @Override
    public boolean isAt(/*WebDriver driver*/) {
        return false;
    }

    @Override
    public boolean verifyAt(/*WebDriver driver*/) {
        return false;
    }

    public boolean checkToolsAndContactsState() {

        if(Menu.isDisplayed()) {
            return true;
        }

        return false;
    }

    public WebElement getCloseButton() {
        return closeButton;
    }

    public WebElement getJobsLink() {
        return jobsLink;
    }

    public WebElement getPrivacyLink() {
        return privacyLink;
    }

    public WebElement getAffiliatesLinks() {
        return affiliatesLinks;
    }

    public WebElement getReviewsLink() {
        return reviewsLink;
    }

    public WebElement getProxyLink() {
        return proxyLink;
    }

    public WebElement getServersLink() {
        return serversLink;
    }

    public WebElement getIpPortLink() {
        return ipPortLink;
    }

    public WebElement getAnonEmailLink() {
        return anonEmailLink;
    }

    public WebElement getAnonRferLink() {
        return anonRferLink;
    }

    public WebElement getPrivSWLink() {
        return privSWLink;
    }

    public WebElement getRoutersLink() {
        return routersLink;
    }

    public WebElement getVpnSWLink() {
        return vpnSWLink;
    }

    public WebElement getFbLink() {
        return fbLink;
    }

    public WebElement getTwitterLink() {
        return twitterLink;
    }

    public WebElement getgPLusLink() {
        return gPLusLink;
    }

    public WebElement getBlogLink() {
        return blogLink;
    }

    public WebElement getCommunityLink() {
        return communityLink;
    }

    public WebElement getEmailLink() {
        return emailLink;
    }

    public WebElement getLiveChat() {
        return liveChat;
    }

    public WebElement getBusinessLink() {
        return businessLink;
    }

    public WebElement getMenu() {
        return Menu;
    }
}


