package com.facebooktest;

import com.facebook.pages.LogInPage;
import com.facebook.pages.ProfilePage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageValidation extends TestBase {


    private LogInPage logInPage;

    @BeforeMethod
    public void pageFactorySetup() {

        logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.ableToSignIn();
    }

    private ProfilePage profilePage;

    @BeforeMethod
    public void pageFactorySetup2() {

        profilePage = PageFactory.initElements(driver, ProfilePage.class);

    }

    @Test (enabled = false)
    public void validateUserAbleToUploadPhoto(){
        profilePage.ableToUploadAPhoto();
    }

    @Test (enabled = false)
    public void validateUserAbleToAddBioInProfile(){
        profilePage.ableToAddBioInMyProfile();
    }
}
