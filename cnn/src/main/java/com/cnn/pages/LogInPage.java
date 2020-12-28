package com.cnn.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends TestBase {

    @FindBy(id = "account-icon-button")
    private WebElement clickSignIn;

    @FindBy(xpath = "//input[@name='loginEmail']")
    private WebElement clickEmail;

    @FindBy(xpath = "//input[@name='loginPassword']")
    private WebElement clickPassword;

    @FindBy(id = "login-form-button")
    private WebElement clickLogIn;

    @FindBy(linkText = "Log Out")
    private WebElement clickLogOut;

    public void signIn(){
        clickSignIn.click();
        ExtentTestManager.log("Clicked Sign in");
        sleepFor(3);
    }

    public void typeEmail(){
        clickEmail.sendKeys("tester.auto@yahoo.com");
        ExtentTestManager.log("Clicked and typed email");
        sleepFor(3);
    }

    public void typePassword(){
        clickPassword.sendKeys("Practice#18");
        ExtentTestManager.log("Clicked and typed password");
        sleepFor(3);
    }

    public void clickOnLogInButton(){
        clickLogIn.click();
        ExtentTestManager.log("Clicked on Log In button");
        sleepFor(3);
    }

    public void clickLogOutButton(){
        signIn();
        typeEmail();
        typePassword();
        clickOnLogInButton();
        signIn();
        clickLogOut.click();
        ExtentTestManager.log("Clicked Log Out");
        sleepFor(3);
    }
}
