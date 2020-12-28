package com.cnn.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareerPage extends TestBase {

    @FindBy(linkText = "Work for CNN")
    private WebElement clickWorkForCNN;

    public void seeTheirCareerOptions(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Scroll Down");
        sleepFor(3);
        clickWorkForCNN.click();
        ExtentTestManager.log("Clicked on Work for CNN");
        sleepFor(3);
    }
}
