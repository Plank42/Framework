package com.hma.pages.feature;

import com.hma.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {


	@FindBy(how = How.CSS, using = "img.jack") protected WebElement IronManImg;
	@FindBy(how = How.CSS, using = "div.xmas-arched-banner div.arched") protected WebElement xmasBnr;
	@FindBy(how = How.CSS, using = "div.iron-man-heading  a.button*") protected WebElement JoinNowBtn;
	@FindBy(how = How.CSS, using = "img.three-princes-image") protected WebElement ThreePrincesImg;

	/* Prices */
	@FindBy(how = How.CSS, using = "#pricing > div > div.pricing-table-container.inner.row > div:nth-child(1) > ul > li:nth-child(8) > a") protected WebElement TwelveMonthPlanBtn;
	@FindBy(how = How.CSS, using = "#pricing > div > div.pricing-table-container.inner.row > div:nth-child(2) > ul > li:nth-child(8) > a") protected WebElement SixMonthPlanBtn;
	@FindBy(how = How.CSS, using = "#pricing > div > div.pricing-table-container.inner.row > div:nth-child(3) > ul > li:nth-child(8) > a") protected WebElement OneMonthPlanBtn;


	/* Read */ //All CSS
	@FindBy(how = How.CSS, using="body > div.ng-view.ng-scope > section > section.tissue-box.section-component > div:nth-child(2) > div:nth-child(1) > a") 	protected WebElement ForbesElement;
	@FindBy(how = How.CSS, using ="body > div.ng-view.ng-scope > section > section.tissue-box.section-component > div:nth-child(2) > div:nth-child(2) > a") 	protected WebElement GuardianElement;

    // TODO CSS details to complete
	@FindBy(how = How.CSS, using ="") protected WebElement element02; // body > div.ng-view.ng-scope > section > section.tissue-box.section-component > div:nth-child(2) > div:nth-child(1) > a
	@FindBy(how = How.CSS, using ="") protected WebElement element03; // inner text  div.tissue-box-text
	@FindBy(how = How.CSS, using ="") protected WebElement element04; // body > div.ng-view.ng-scope > section > section.tissue-box.section-component > div:nth-child(2) > div:nth-child(2) > a
	@FindBy(how = How.CSS, using ="") protected WebElement element05; // body > div.ng-view.ng-scope > section > section.tissue-box.section-component > div:nth-child(2) > div:nth-child(3) > a
	@FindBy(how = How.CSS, using ="") protected WebElement element06; // body > div.ng-view.ng-scope > section > section.tissue-box.section-component > div:nth-child(2) > div:nth-child(4) > a
    @FindBy(how = How.CSS, using ="") protected WebElement element07; //body > div.ng-view.ng-scope > section > section.tissue-box.section-component > div:nth-child(2) > div:nth-child(5) > a

    public HomePage(WebDriver driver){

    }

    @Override
    public void Goto() {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    protected String setTitle(String name) {
        return null;
    }

    @Override
    protected String setPageName(String name) {
        return null;
    }

    @Override
    protected String RelativeUrl() {
        return null;
    }

}
