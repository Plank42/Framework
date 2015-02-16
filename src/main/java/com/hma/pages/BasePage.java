package com.hma.pages;

import com.hma.pages.stable.Menu;
import com.hma.pages.stable.ToolsAndContacts;
import com.hma.util.PropertyLoader;

import static com.hma.pages.PageInitialisation.menuBar;
import static com.hma.pages.PageInitialisation.toolsAndContactMenu;

public abstract class BasePage {

    protected String pageName;
    protected String relativeURL;
    protected String URL;

    protected Menu menuBar;
    protected ToolsAndContacts toolsAndContactsMenu;


    public BasePage () {
        this.menuBar = menuBar();
        this.toolsAndContactsMenu = toolsAndContactMenu();
    }

    public abstract void Goto();

    public abstract String getTitle();

    protected abstract String setTitle(String name);

    protected abstract String RelativeUrl();

    protected String baseUrl()    {
        return PropertyLoader.loadProperty("site.url");
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
