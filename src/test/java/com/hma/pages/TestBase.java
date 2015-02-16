package com.hma.pages;

// import com.hma.util.PropertyLoader;


import com.hma.util.PropertyLoader;
import com.hma.webdriver.Browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;


public class TestBase {

	private static final String SCREENSHOT_FOLDER = "target/screenshots/";
	private static final String SCREENSHOT_FORMAT = ".jpg";

	protected String gridHubUrl;
	protected String websiteUrl;
    protected WebDriver webdriver;

    protected Browser browser = new Browser();

	@BeforeClass
	public void init() {
        webdriver = browser.WebDriver();
		websiteUrl = PropertyLoader.loadProperty("site.url");
		gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

        browser.getName(); //PropertyLoader.loadProperty("browser.name")
        browser.getVersion(); //PropertyLoader.loadProperty("browser.version"
        browser.getPlatform(); //PropertyLoader.loadProperty("browser.platform")

		String username = PropertyLoader.loadProperty("user.username");
		String password = PropertyLoader.loadProperty("user.password");

	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		if (webdriver != null) {
			webdriver.quit();
		}
	}

/*	@AfterMethod
	public void setScreenshot(TestResult result) {
		if (!result.wasSuccessful()) {
			try {
				WebDriver returned = new Augmenter().augment(webdriver);
				if (returned != null) {
					File f = ((TakesScreenshot) returned)
							.getScreenshotAs(OutputType.FILE);
					try {
						FileUtils.copyFile(f, new File(SCREENSHOT_FOLDER
                                + result.getClass().getName() + SCREENSHOT_FORMAT));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} catch (ScreenshotException se) {
				se.printStackTrace();
			}
		}
	}*/
}
