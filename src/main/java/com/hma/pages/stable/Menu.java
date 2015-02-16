package com.hma.pages.stable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Menu {

    @FindBy(how = How.CSS, using = "* div.europa-dip-fixed > div.europa-dip-bar > a") protected WebElement hmaHomeLink;
    @FindBy(how = How.CSS, using = "* nav > ul:nth-child(1) > li:nth-child(1) > a > span") protected WebElement vpnLink;
    @FindBy(how = How.CSS, using = "* nav > ul:nth-child(1) > li:nth-child(2) > a > span") protected WebElement howVPNWorksLink;
    @FindBy(how = How.CSS, using = "* nav > ul:nth-child(1) > li:nth-child(3) > a > span") protected WebElement pricingLink;
    @FindBy(how = How.CSS, using = "* nav > ul:nth-child(1) > li:nth-child(4) > a > span") protected WebElement toolsAndContactsLink;
    @FindBy(how = How.CSS, using = "* nav > ul:nth-child(1) > li:nth-child(5) > a > span") protected WebElement helpLink;
    @FindBy(how = How.CSS, using = "* nav > ul.nav-main.nav-language > language-selector > li > div") protected WebElement languageDropDown;

    @FindBy(how = How.CSS, using = "* nav > ul.nav-sub > li > a") protected WebElement signInButton;

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


}
