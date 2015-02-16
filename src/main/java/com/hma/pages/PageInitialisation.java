package com.hma.pages;

import com.hma.pages.feature.HomePage;
import com.hma.pages.stable.Footer;
import com.hma.pages.stable.Menu;
import com.hma.pages.stable.ToolsAndContacts;
import com.hma.webdriver.Browser;
import org.openqa.selenium.support.PageFactory;

public class PageInitialisation {

    public PageInitialisation() {

    }

    public static com.hma.pages.feature.HomePage homePage() {

        HomePage h = new HomePage();
        PageFactory.initElements(Browser.webDriver(), h );
        return h;
    }

    public static Menu menuBar() {

        Menu m = new Menu();
        PageFactory.initElements(Browser.webDriver(), m );
        return m;
    }

    public static ToolsAndContacts toolsAndContactMenu() {

        ToolsAndContacts t = new ToolsAndContacts();
        PageFactory.initElements(Browser.webDriver(), t);
        return t;
    }

    public static Footer footer() {

        Footer f = new Footer();
        PageFactory.initElements(Browser.webDriver(), f);
        return f;
    }
}
