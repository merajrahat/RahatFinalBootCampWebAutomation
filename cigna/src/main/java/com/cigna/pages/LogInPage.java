package com.cigna.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends TestBase {

    @FindBy(linkText = "Get an ID card")
    private WebElement clickLogIn;

    @FindBy(id = "username")
    private WebElement clickUsername;

    @FindBy(id = "password")
    private WebElement clickPassword;


    public void userUnableToLogInWithInvalidCredentials() {

        WebElement element = driver.findElement(By.linkText("Get an ID card"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        ExtentTestManager.log("User Scroll to Get an ID card");
        sleepFor(3);
        clickLogIn.click();
        ExtentTestManager.log("Clicked Get an ID card");
        sleepFor(3);
        clickUsername.sendKeys("SteveRoger@gmail.com");
        ExtentTestManager.log("User put email address");
        sleepFor(3);
        clickPassword.sendKeys("MyBenefits", Keys.RETURN);
        ExtentTestManager.log("User put password");
        sleepFor(3);
    }


}
