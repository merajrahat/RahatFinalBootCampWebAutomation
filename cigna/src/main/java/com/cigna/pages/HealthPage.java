package com.cigna.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HealthPage extends TestBase {

    @FindBy(id = "health-wellness-tab")
    private WebElement clickHealthAndWellness;

    @FindBy(linkText = "Health and Wellness Overview")
    private WebElement clickHealthAndWellnessOverview;

    @FindBy(linkText = "Autism")
    private WebElement clickOnAutism;

    public void hoverOverIndividualsAndFamilies() {
        WebElement user = driver.findElement(By.id("individuals-families-level-one-link"));
        Actions actions = new Actions(driver);
        actions.moveToElement(user).build().perform();
        ExtentTestManager.log("User hover over Individuals and Families");
        sleepFor(2);
    }

    public void checkTheirHealthPage(){
        hoverOverIndividualsAndFamilies();
        clickHealthAndWellness.click();
        ExtentTestManager.log("Clicked on Health And Wellness");
        sleepFor(3);
        clickHealthAndWellnessOverview.click();
        ExtentTestManager.log("Clicked on Health And Wellness Overview");
        sleepFor(3);
    }

    public void checkSpecificHealthCoverageOffer(){
        checkTheirHealthPage();
        clickOnAutism.click();
        ExtentTestManager.log("Clicked on Autism");
        sleepFor(3);

    }
}
