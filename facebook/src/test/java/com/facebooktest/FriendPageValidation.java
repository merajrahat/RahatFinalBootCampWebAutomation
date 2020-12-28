package com.facebooktest;

import com.facebook.pages.FriendPage;
import com.facebook.pages.LogInPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FriendPageValidation extends TestBase {


    private LogInPage logInPage;

    @BeforeMethod
    public void pageFactorySetup() {

        logInPage = PageFactory.initElements(driver, LogInPage.class);
        logInPage.ableToSignIn();
    }

    private FriendPage friendPage;

    @BeforeMethod
    public void pageFactorySetup3() {

        friendPage = PageFactory.initElements(driver, FriendPage.class);

    }

    @Test (enabled = false)
    public void validateUserAbleToFindFriend(){
        friendPage.ableToFindFriends();
    }

    @Test (enabled = false)
    public void validateUserAbleToSendFriendRequest(){
        friendPage.ableToSendFriendRequest();
    }

    @Test (enabled = false)
    public void validateUserAbleToAcceptFriendRequest(){
        friendPage.ableToAcceptFriendRequest();
    }

    @Test (enabled = false)
    public void validateUserAbleToCommentOnAFriend(){
        friendPage.ableToCommentOnAFriend();
    }

}
