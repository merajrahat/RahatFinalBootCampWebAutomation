package com.amazon.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends TestBase {


    @FindBy(linkText = "Sign in")
    private WebElement clickSignIn;

    @FindBy(linkText = "Sign Out")
    private WebElement clickSignOut;

    @FindBy(id = "ap_email")
    private WebElement clickEmail;

    @FindBy(id = "ap_password")
    private WebElement clickPassword;

    @FindBy(id = "signInSubmit")
    private WebElement clickSignInButton;


    public void userAbleToSignIn(){
        clickSignIn.click();
        ExtentTestManager.log("Click On Sign in");
        sleepFor(3);
        clickEmail.sendKeys("tester.auto@yahoo.com", Keys.RETURN);
        ExtentTestManager.log("Email address entered");
        sleepFor(3);
        clickPassword.sendKeys("practice18");
        ExtentTestManager.log("Password address entered");
        sleepFor(3);
        clickSignInButton.click();
        sleepFor(3);
    }

    public void userAbleToSignOut(){
        userAbleToSignIn();
        WebElement user = driver.findElement(By.id("nav-link-accountList"));

        Actions actions = new Actions(driver);
        actions.moveToElement(user).build().perform();
        ExtentTestManager.log("Hover Over 'Hello, John'");
        sleepFor(3);
        clickSignOut.click();
        ExtentTestManager.log("Clicked on Sign Out");
        sleepFor(3);
    }


}
