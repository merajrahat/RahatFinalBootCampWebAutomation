package com.cnn.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NewsPage extends TestBase {

    @FindBy(linkText = "Asia")
    private WebElement clickOnAsia;

    @FindBy(id = "footer-search-bar")
    private WebElement clickOnSearchBox;


    public void scrollToNewsOnAfrica() {
        WebElement element = driver.findElement(By.linkText("Africa"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        ExtentTestManager.log("User Scroll to Africa");
        sleepFor(3);

    }

    public void scrollAndClickAsia() {
        scrollToNewsOnAfrica();
        clickOnAsia.click();
        ExtentTestManager.log("Clicked on Asia");
        sleepFor(2);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/asia";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the link is correct");
        sleepFor(3);
    }

    public void typeOnSearchBarForNews() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 2100)");
        ExtentTestManager.log("Page scrolled down");
        sleepFor(3);
        clickOnSearchBox.sendKeys("Global Warming", Keys.RETURN);
        ExtentTestManager.log("Clicked, typed and pressed entered in search box");
        sleepFor(3);

        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.cnn.com/search?q=Global+Warming";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the link is correct");
        sleepFor(3);
    }
}