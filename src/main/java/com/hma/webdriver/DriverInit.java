package com.hma.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;

public final class DriverInit {

    private static boolean disableJavaScript;

    private String name;
	private String version;
	private String platform;
    private WebDriver Driver = null;

    public WebDriver init() {

        //name = BrowserType.CHROME;
        // return CreateDriver(BrowserType.FIREFOX);
        //TODO Work on CrossBrowser Implementation
        if(Driver == null) {

            name = BrowserType.FIREFOX;
            return new FirefoxDriver();
        }
        return Driver;
    }

    protected WebDriver init(String driverType) {

        if (driverType.equals(BrowserType.FIREFOX)){
            name = BrowserType.FIREFOX;
            return new FirefoxDriver();
        }
        else if (driverType.equals(BrowserType.IE)) {
            name = BrowserType.IE;
            return new InternetExplorerDriver();
        }
        else if (driverType.equals(BrowserType.SAFARI)){
            name = BrowserType.SAFARI;
            return new SafariDriver();
        }
        return new ChromeDriver();

    }

    public WebDriver getDriver(){
        return Driver;
    }

	public String getName() {
		return name;
	}

    /*public static void setName(String newName) {
		name = newName;
	}*/

    public String getPlatform() {
		return platform;
	}

    /*public static void setPlatform(String newPlatform) {
		platform = newPlatform;
	}*/

    public void Back()
    {
        Driver.navigate().back();
    }

    public void Close()
    {
        if (Driver != null)
            Driver.quit();
        Driver = null;
    }

    public  void DisableJavaScript()
    {
        disableJavaScript = true;
    }

    protected String getVersion() {
        return version;
    }

    protected void setVersion(String newVersion) {
        version = newVersion;
    }
}

