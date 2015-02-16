package com.hma.pages;

public class PageInitialisation {

    public PageInitialisation() {

    }

    public static com.hma.pages.feature.HomePage HomePage() {

        return new com.hma.pages.feature.HomePage();
    }

    public static com.hma.pages.stable.Menu MenuBar() {

        return new com.hma.pages.stable.Menu();
    }

    public static com.hma.pages.stable.ToolsAndContacts ToolsAndContactMenu() {

        return new com.hma.pages.stable.ToolsAndContacts();
    }

    public static com.hma.pages.stable.Footer Footer() {

        return new com.hma.pages.stable.Footer();
    }
}
