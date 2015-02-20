package com.hma.pages;

import com.hma.pages.stable.Menu;
import com.hma.pages.stable.ToolsAndContacts;
import com.hma.util.PropertyLoader;
import org.openqa.selenium.support.ui.LoadableComponent;

public abstract class BasePage extends LoadableComponent<BasePage> {

    protected String Title;
    protected String RelativeURL;
    protected String URL;
    protected String BaseURL = PropertyLoader.loadProperty("site.url");
    //protected WebDriver driver;

    protected Menu menuBar;
    protected ToolsAndContacts toolsAndContactsMenu;


//    public BasePage(WebDriver driver) {
//          PageFactory.initElements(driver, this);
//    }

    protected abstract void navigate();

    protected abstract void load();

    protected abstract String getTitle(/*WebDriver driver*/);

    protected abstract String getPageName(/*WebDriver driver*/);

    protected abstract String RelativeUrl();

    public abstract boolean isAt(/*WebDriver driver*/);

    public abstract boolean verifyAt(/*WebDriver driver*/);

    protected String baseUrl()    {
        return BaseURL;
    }

    /*public void goToSignIn(WebDriver driver) {

        if (menuBar != null) {
            menuBar = PageFactory.initElements(driver, Menu.class);
        }
        menuBar.ClickSignInButton();
    }*/

    /*public void goToToolsAndContactMenu(char navigation) {

        if (menuBar != null) {
            menuBar = PageFactory.initElements(driver, Menu.class);
        }
        menuBar.ClickToolsAndContactsLink();

        switch (navigation) {

            // case 'a': toolsAndContactsMenu.businessLink.click();
        }

    }*/


}
