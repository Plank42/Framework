package com.hma.pages.stable;

import com.hma.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Menu extends BasePage{

    @FindBy(how = How.CSS, using = "* div.europa-dip-bar > a") protected WebElement hmaHomeLink;
    @FindBy(how = How.CSS, using = "* nav > ul:nth-child(1) > li:nth-child(1) > a > span") protected WebElement vpnLink;
    @FindBy(how = How.CSS, using = "* nav > ul:nth-child(1) > li:nth-child(2) > a > span") protected WebElement howVPNWorksLink;
    @FindBy(how = How.CSS, using = "* nav > ul:nth-child(1) > li:nth-child(3) > a > span") protected WebElement pricingLink;
    @FindBy(how = How.CSS, using = "* nav > ul:nth-child(1) > li:nth-child(4) > a > span") protected WebElement toolsAndContactsLink;
    @FindBy(how = How.CSS, using = "* nav > ul:nth-child(1) > li:nth-child(5) > a > span") protected WebElement helpLink;
    @FindBy(how = How.CSS, using = "* nav > ul.nav-main.nav-language > language-selector > li > div") protected WebElement languageDropDown;
    @FindBy(how = How.CSS, using = "* nav > ul.nav-sub > li > a") protected WebElement signInButton;

    /*private WebDriver Driver;

    public Menu(WebDriver webDriver){
        super(webDriver);
        this.Driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }*/

    @Override
    public void navigate() {}


    @Override
    public void load() {}

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

    public void ClickToolsAndContactsLink() {

        toolsAndContactsLink.click();
    }

    public void ClickPricingLink() {

        pricingLink.click();
    }

    public void ClickHmaHomeLink(){
        hmaHomeLink.click();
    }

    public void ClickSignInButton(){
        signInButton.click();
    }

    public void ClickVpnLink() {
        vpnLink.click();
    }

    public WebElement getHmaHomeLink() {
        return hmaHomeLink;
    }

}
