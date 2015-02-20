package com.hma.pages.tests.feature;

import com.hma.pages.feature.HomePage;
import com.hma.pages.stable.Menu;
import com.hma.pages.stable.ToolsAndContacts;
import com.hma.pages.tests.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


@Test
public class HomePageTest extends BaseTest {

    HomePage hp;
    Menu mn;
    ToolsAndContacts tc;

	@BeforeTest
	public void testInit() {

        //hp = (HomePage) homePage(/*webdriver*/).get();
        hp = PageFactory.initElements(webdriver, HomePage.class);
        mn = PageFactory.initElements(webdriver, Menu.class);
        tc = PageFactory.initElements(webdriver, ToolsAndContacts.class);
	}

	@Test(groups = { "p1", "smoke" })
	public void testSomething() {

        hp.ClickHome();
		String PageName = hp.getPageName(/*webdriver*/);
	}

	@Test
	public void test2() throws InterruptedException {
		Assert.assertTrue(true);
	}
}
