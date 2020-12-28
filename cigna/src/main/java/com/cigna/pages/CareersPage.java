package com.cigna.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends TestBase {

    @FindBy(linkText = "Careers")
    private WebElement clickOnCareers;

    @FindBy(linkText = "About Us")
    private WebElement clickAboutUs;

    @FindBy(linkText = "Careers with Cigna")
    private WebElement clickCareersWithCigna;

    @FindBy(linkText = "See careers for veterans")
    private WebElement clickCareersForVeterans;

    public void scrollToCareersThenCLick() {
        WebElement element = driver.findElement(By.linkText("Careers"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        ExtentTestManager.log("User Scroll to Careers");
        sleepFor(3);
        clickOnCareers.click();
        ExtentTestManager.log("User clicked on Careers");
        sleepFor(3);
    }

    public void checkWhatTheyOfferForMilitaryVeteran() {
        clickAboutUs.click();
        ExtentTestManager.log("Clicked on About Us");
        sleepFor(2);
        clickCareersWithCigna.click();
        ExtentTestManager.log("Clicked Careers with Cigna");
        sleepFor(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1380)");
        ExtentTestManager.log("Page scrolled down");
        sleepFor(3);
        clickCareersForVeterans.click();
        ExtentTestManager.log("Clicked on See careers for veterans");
        sleepFor(3);
    }
}
