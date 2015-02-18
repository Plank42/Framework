package com.hma.pages;

import com.hma.pages.feature.HomePage;
import com.hma.pages.stable.Footer;
import com.hma.pages.stable.Menu;
import com.hma.pages.stable.ToolsAndContacts;
import com.hma.webdriver.DriverInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageInitialisation {

    protected static WebDriver driver;

    private PageInitialisation() {

        DriverInit di = new DriverInit();
        driver = di.init();
    }

    public static HomePage homePage(WebDriver driver) {

        HomePage h = PageFactory.initElements(driver, HomePage.class);
        //HomePage h = new HomePage(driver);
        return h;
    }

    public static Menu menuBar(WebDriver driver) {

         Menu m = PageFactory.initElements(driver, Menu.class);
        //Menu m = new Menu(driver);
        return m;
    }

    public static ToolsAndContacts toolsAndContactMenu(WebDriver driver) {

        ToolsAndContacts t = PageFactory.initElements(driver, ToolsAndContacts.class);
        //ToolsAndContacts t = new ToolsAndContacts(driver);
        return t;
    }

    public static Footer footer(WebDriver driver) {

        Footer f = PageFactory.initElements(driver, Footer.class);
        //Footer f = new Footer(driver);
        return f;
    }

}
