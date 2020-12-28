package com.facebooktest;

import com.facebook.pages.HomePage;
import com.facebook.pages.LogInPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class HomePageValidation extends TestBase {


    private LogInPage logInPage;

    @BeforeMethod
    public void pageFactorySetup() {

        logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.ableToSignIn();
    }

    private HomePage homePage;

    @BeforeMethod
    public void pageFactorySetup4() {

        homePage = PageFactory.initElements(driver, HomePage.class);

    }

}
