package com.facebook.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends TestBase {


    @FindBy(id = "email")
    private WebElement clickEmail;

    @FindBy(id = "pass")
    private WebElement clickPassword;


    public void ableToSignIn(){
        clickEmail.sendKeys("carnal.mcmuffin@yahoo.com");
        ExtentTestManager.log("Email was entered");
        sleepFor(3);
        clickPassword.sendKeys("practice18", Keys.RETURN);
        ExtentTestManager.log("Password was entered");
        sleepFor(10);

    }


}
