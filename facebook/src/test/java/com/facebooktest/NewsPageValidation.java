package com.facebooktest;

import com.facebook.pages.LogInPage;
import com.facebook.pages.NewsPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewsPageValidation extends TestBase {


    private LogInPage logInPage;
    private NewsPage newsPage;

    @BeforeMethod
    public void pageFactorySetup() {

        logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.ableToSignIn();
    }

    @BeforeMethod
    public void pageFactorySetup2() {

        newsPage = PageFactory.initElements(driver, NewsPage.class);

    }

    @Test(enabled = false)
    public void validateUserAbleToSearchForNews() {
        newsPage.searchNews();
    }
}
