package com.hma.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;

public final class Browser {

    private static boolean disableJavaScript;

    private static String name;
	private static String version;
	private static String platform;
    private static WebDriver Driver;

    private Browser() {

    }

    public static WebDriver webDriver(){
        return CreateDriver();
    }

	public static String getName() {
		return name;
	}

    public static void setName(String newName) {
		name = newName;
	}

    public static String getPlatform() {
		return platform;
	}

    public static void setPlatform(String newPlatform) {
		platform = newPlatform;
	}

    public static void Back()
    {
        Driver.navigate().back();
    }

    public static void Close()
    {
        if (Driver != null)
            Driver.quit();
        Driver = null;
    }

    public static void DisableJavaScript()
    {
        disableJavaScript = true;
    }

    protected static WebDriver CreateDriver() {

        name = BrowserType.CHROME;
        return CreateDriver(BrowserType.FIREFOX);

    }

    protected static WebDriver CreateDriver(String driverType) {

        if (driverType.equals(BrowserType.FIREFOX)) {
            name = BrowserType.FIREFOX;
            return new FirefoxDriver();
        }
        else if (driverType.equals(BrowserType.IE)) {
            name = BrowserType.IE;
            return new InternetExplorerDriver();
        }
        else if (driverType.equals(BrowserType.SAFARI))
        {
            name = BrowserType.SAFARI;
            return new SafariDriver();

        }
        return new ChromeDriver();

    }

    protected static String getVersion() {
        return version;
    }

    protected static  void setVersion(String newVersion) {
        version = newVersion;
    }
}

