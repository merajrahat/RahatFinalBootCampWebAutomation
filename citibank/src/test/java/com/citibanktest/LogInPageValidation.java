package com.citibanktest;

import com.citibank.pages.LogInPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPageValidation extends TestBase {


    private LogInPage logInPage;

    @BeforeMethod
    public void pageFactorySetup() {

        logInPage = PageFactory.initElements(driver, LogInPage.class);
    }

    @Test(enabled = false)
    public void validateUserUnableToLogInWithInvalidCredentials() {
        logInPage.userUnableToLogInWithInvalidCredentials();
    }
}
