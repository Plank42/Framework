package com.hma.pages;

import com.hma.pages.stable.Menu;
import com.hma.pages.stable.ToolsAndContacts;
import com.hma.util.PropertyLoader;
import com.hma.webdriver.DriverInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected String Title;
    protected String RelativeURL;
    protected String URL;
    protected String BaseURL;
    protected WebDriver driver;

    protected Menu menuBar;
    protected ToolsAndContacts toolsAndContactsMenu;


    public BasePage() {
        driver = new DriverInit().init();

        PageFactory.initElements(driver, this);
        this.menuBar = PageInitialisation.menuBar();
        this.toolsAndContactsMenu = PageInitialisation.toolsAndContactMenu();
    }

    public abstract void Goto();

    public abstract String getTitle();

    protected abstract String setTitle(String name);
    protected abstract String setPageName(String name);

    protected abstract String RelativeUrl();

    public boolean isAt(){
        return driver.getTitle() == Title;
    }

    public boolean verifyAt() throws Exception{
        if (!isAt()) {
             throw new Exception("unable to verify location as " + this.getTitle());
        }

        return true;
    }

    protected String baseUrl()    {

        BaseURL = PropertyLoader.loadProperty("site.url");
        return BaseURL;
    }

    public void goToSignIn() {

        menuBar.ClickSignInButton();
    }


    public void goToToolsAndContactMenu(char navigation) {

        menuBar.ClickToolsAndContactsLink();

        switch (navigation) {

            // case 'a': toolsAndContactsMenu.businessLink.click();
        }

    }



}
