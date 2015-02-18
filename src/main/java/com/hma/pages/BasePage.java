package com.hma.pages;

import com.hma.pages.stable.Menu;
import com.hma.pages.stable.ToolsAndContacts;
import com.hma.util.PropertyLoader;
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


    public BasePage(WebDriver driver) {
          PageFactory.initElements(driver, this);
    }

    public abstract void Goto(WebDriver driver);

    public abstract String getTitle(WebDriver driver);

    public abstract String getPageName(WebDriver driver);

    protected abstract String RelativeUrl();

    public abstract boolean isAt(WebDriver driver);

    public abstract boolean verifyAt(WebDriver driver);

    protected String baseUrl()    {

        BaseURL = PropertyLoader.loadProperty("site.url");
        return BaseURL;
    }

    public void goToSignIn(WebDriver driver) {

        if (menuBar != null) {
            menuBar = PageFactory.initElements(driver, Menu.class);
        }
        menuBar.ClickSignInButton();
    }


    public void goToToolsAndContactMenu(char navigation) {

        if (menuBar != null) {
            menuBar = PageFactory.initElements(driver, Menu.class);
        }
        menuBar.ClickToolsAndContactsLink();

        switch (navigation) {

            // case 'a': toolsAndContactsMenu.businessLink.click();
        }

    }



}
