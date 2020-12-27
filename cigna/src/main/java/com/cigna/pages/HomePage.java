package com.cigna.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TestBase {

    @FindBy(linkText = "Health and Wellness")
    private WebElement clickHealthAndWellness;

    @FindBy(id = "search-desktop")
    private WebElement clickSearchBar;


    public void scrollToElement() {
        WebElement element = driver.findElement(By.linkText("Health and Wellness"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        ExtentTestManager.log("User Scroll to Element");
        sleepFor(3);
    }

    public void clickOnElementAfterScrollDown() {
        scrollToElement();
        clickHealthAndWellness.click();
        ExtentTestManager.log("User click Health And Wellness");
        sleepFor(3);
    }

    public void searchForMedicalTools() {
        clickSearchBar.sendKeys("Medical Tools", Keys.RETURN);
    }

    public void tryHover() {
        WebElement user = driver.findElement(By.id("individuals-families-level-one-link"));
        Actions actions = new Actions(driver);
        actions.moveToElement(user).build().perform();
        ExtentTestManager.log("User hover over Individuals and Families");
        sleepFor(2);
    }
}
