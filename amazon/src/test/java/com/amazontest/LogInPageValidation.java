package com.amazontest;

import com.amazon.pages.LogInPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogInPageValidation extends TestBase {

    @Test(enabled = false)
    public void validateUserAbleToLogIn() {
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.userAbleToSignIn();
    }

    @Test(enabled = false)
    public void vaidateUserAbleToLogOut() {
        LogInPage logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.userAbleToSignOut();
    }
}
