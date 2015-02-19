package com.hma.pages.tests.feature;

import com.hma.pages.feature.HomePage;
import com.hma.pages.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.hma.pages.PageInitialisation.homePage;


@Test
public class HomePageTest extends BaseTest {

    HomePage hp;

	@BeforeTest
	public void testInit() {

        hp = (HomePage) homePage(webdriver).get();
	}

	@Test(groups = { "p1", "smoke" })
	public void testSomething() {

        hp.ClickHome();
		hp.getPageName(webdriver);
	}

	@Test
	public void test2() throws InterruptedException {
		Assert.assertTrue(true);
	}
}
