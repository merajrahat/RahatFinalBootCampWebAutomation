package com.citibank.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends TestBase {


    @FindBy(id = "username")
    private WebElement clickOnUsername;

    @FindBy(id = "password")
    private WebElement clickOnPassword;

    @FindBy(id = "signInBtn")
    private WebElement clickSignOnButton;


    public void userUnableToLogInWithInvalidCredentials() {
        clickOnUsername.sendKeys("RogerPark@gmail.com");
        ExtentTestManager.log("User put email address");
        sleepFor(3);
        clickOnPassword.sendKeys("SeeMyBankInfo");
        ExtentTestManager.log("User put password");
        sleepFor(3);
        clickSignOnButton.click();
        ExtentTestManager.log("User clicked Sign On Button");
        sleepFor(3);

    }
}
