package com.amazontest;

import com.amazon.pages.HomePage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    private HomePage homePage;

    @BeforeMethod
    public void pageFactorySetup() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = false)
    public void validateTypeInSearchBox() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearchBar();
    }

    @Test(enabled = false)
    public void validateScrollDownAndUp() {
        homePage.ableToScrollDownAndUp();
    }

    @Test(enabled = false)
    public void validateHoverMethod() {
        homePage.hoverOverText();
    }

    @Test(enabled = false)
    public void validatePageBackwardAndForward() {
        homePage.pageBackwardAndForward();
    }

    @Test(enabled = false)
    public void validatePageRefresh() {
        homePage.seeIfThePageRefreshProperlyAfterSearchingAnTiem();
    }

    @Test(enabled = false)
    public void validateUserAbleToClickOnCart() {
        homePage.ableToClickOnCart();
    }
}
