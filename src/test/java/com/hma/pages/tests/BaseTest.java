package com.hma.pages.tests;

import com.hma.util.PropertyLoader;
import com.hma.webdriver.DriverInit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	private static final String SCREENSHOT_FOLDER = "target/screenshots/";
	private static final String SCREENSHOT_FORMAT = ".jpg";

    public String gridHubUrl;
	public String websiteUrl;
    public WebDriver webdriver;



	@BeforeSuite
	public void init() {
        webdriver = new DriverInit().init();
		websiteUrl = PropertyLoader.loadProperty("site.url");
		//gridHubUrl = PropertyLoader.loadProperty("grid2.hub");

		// String username = PropertyLoader.loadProperty("user.username");
		// String password = PropertyLoader.loadProperty("user.password");

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
