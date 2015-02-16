package com.hma.pages;

import com.hma.pages.stable.*;

import static com.hma.pages.PageInitialisation.MenuBar;
import static com.hma.pages.PageInitialisation.ToolsAndContactMenu;

public abstract class BasePage {

    protected String pageName;
    protected String relativeURL;
    protected String URL;

    protected Menu menuBar;
    protected ToolsAndContacts toolsAndContactsMenu;


    public BasePage () {

        menuBar = MenuBar();
        toolsAndContactsMenu = ToolsAndContactMenu();
    }

    public abstract void Goto();

    public abstract String getTitle();

    protected abstract String setTitle(String name);

    protected abstract String RelativeUrl();

    protected String baseUrl()    {
        return "http://www.hidemyass.com";
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
