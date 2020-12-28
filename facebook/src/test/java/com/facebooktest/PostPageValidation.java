package com.facebooktest;

import com.facebook.pages.LogInPage;
import com.facebook.pages.PostPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PostPageValidation extends TestBase {

    private LogInPage logInPage;

    @BeforeMethod
    public void pageFactorySetup() {

        logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.ableToSignIn();
    }

    private PostPage postPage;

    @BeforeMethod
    public void pageFactorySetup5() {

        postPage = PageFactory.initElements(driver, PostPage.class);

    }

    @Test (enabled = false)
    public void validateUserAbleToLikeAPost(){

        postPage.ableToLikeAPost();
    }

    @Test
    public void validateUserAbleToCommentOnAPost(){
        postPage.ableToCommentOnAPost();
    }
}
