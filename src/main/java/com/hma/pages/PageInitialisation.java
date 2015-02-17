package com.hma.pages;

import com.hma.pages.feature.HomePage;
import com.hma.pages.stable.Footer;
import com.hma.pages.stable.Menu;
import com.hma.pages.stable.ToolsAndContacts;
import com.hma.webdriver.DriverInit;
import org.openqa.selenium.WebDriver;

public class PageInitialisation {

    protected static WebDriver driver;

    private PageInitialisation() {
        driver = new DriverInit().init();
    }

    public static HomePage homePage() {

        // HomePage h = PageFactory.initElements(Browser.webDriver(), HomePage.class );
        HomePage h = new HomePage(driver);
        return h;
    }

    public static Menu menuBar() {

        // Menu m = PageFactory.initElements(Browser.webDriver(), Menu.class );
        Menu m = new Menu(driver);
        return m;
    }

    public static ToolsAndContacts toolsAndContactMenu() {

        // ToolsAndContacts t = PageFactory.initElements(Browser.webDriver(), ToolsAndContacts.class);
        ToolsAndContacts t = new ToolsAndContacts(driver);
        return t;
    }

    public static Footer footer() {

        //Footer f = PageFactory.initElements(Browser.webDriver(), Footer.class);
        Footer f = new Footer(driver);
        return f;
    }

}
