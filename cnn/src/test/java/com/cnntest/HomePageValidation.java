package com.cnntest;

import com.cnn.pages.HomePage;
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
    public void validateLanguageChange() {

        homePage.changeLanguage();
    }

    @Test(enabled = false)
    public void validateNewsOnUSAbleToBeClicked() {

        homePage.newOnUS();
    }

    @Test(enabled = false)
    public void validateUserCanWatchLiveTv() {

        homePage.watchLiveTv();
    }

    @Test(enabled = false)
    public void validateUserCanGoPageBackward() {

        homePage.pageCanGoBackward();
    }
}
