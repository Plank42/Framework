package com.hma.pages;

import com.hma.pages.feature.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HomePageTest extends TestBase {

	HomePage homepage;
	
	// @Parameters({ "path" })

	@BeforeClass(enabled=true)
	public void testInit(String path) {

		// Load the page in the browser
		webdriver.get(websiteUrl + path);
		homepage = PageFactory.initElements(webdriver, HomePage.class);
	}

	@Test(enabled=true,groups="p1", testName = "Something")
	public void testSomething() throws InterruptedException {

        BasePage.HomePage().Goto();
		BasePage.MenuBar().ClickHmaHomeLink();

	}

	@Test
	public void test2() throws InterruptedException {
		Assert.assertTrue(true);
	}
}
