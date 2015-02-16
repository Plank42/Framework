package com.hma.pages;

import com.hma.pages.feature.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.hma.pages.PageInitialisation.homePage;
import static com.hma.pages.PageInitialisation.menuBar;


@Test
public class HomePageTest extends TestBase {

	@BeforeTest
	public void testInit() {
        PageFactory.initElements(webdriver, HomePage.class);
		webdriver.get(websiteUrl);
	}

	@Test(groups = { "p1", "smoke" })
	public void testSomething() {

        homePage().Goto();
		menuBar().ClickHmaHomeLink();

	}

	@Test
	public void test2() throws InterruptedException {
		Assert.assertTrue(true);
	}
}
