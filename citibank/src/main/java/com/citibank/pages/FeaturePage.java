package com.citibank.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FeaturePage extends TestBase {

    @FindBy(id = "creditcards")
    private WebElement clickOnCreditCards;

    @FindBy(linkText = "View All Credit Cards")
    private WebElement clickViewAllCreditCards;

    @FindBy(linkText = "0% Intro APR Credit Cards")
    private WebElement clickZeroAPROption;

    public void checkFreaturedCreditCardOptions() {
        clickOnCreditCards.click();
        ExtentTestManager.log("Clicked on Credit Cards");
        sleepFor(3);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://online.citi.com/US/login.do";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the link is correct");
        sleepFor(3);
    }

    public void checkAllCreditCards(){
        checkFreaturedCreditCardOptions();
        clickViewAllCreditCards.click();
        ExtentTestManager.log("Click View All Credit Cards");
        sleepFor(3);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.citi.com/credit-cards/compare/view-all-credit-cards";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the link is correct");
        sleepFor(3);
    }

    public void checkThierAllZeroAPRCreditCards(){
        checkFreaturedCreditCardOptions();
        clickZeroAPROption.click();
        ExtentTestManager.log("CLicked 0% Intro APR Credit Cards");
        sleepFor(3);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.citi.com/credit-cards/compare/0-percent-intro-apr-credit-cards";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the link is correct");
        sleepFor(3);
    }
}
