package com.hma.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {

    private static boolean disableJavaScript;

    private static String name;
	private String version;
	private String platform;
    private static WebDriver Driver;

    public Browser() {
          WebDriver();
    }

    public WebDriver WebDriver ()
    {
        return CreateDriver();
    }

	public String getName() {
		return name;
	}

    public void setName(String name) {
		this.name = name;
	}

    public String getPlatform() {
		return platform;
	}

    public void setPlatform(String platform) {
		this.platform = platform;
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
        return CreateDriver(BrowserType.CHROME);

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

