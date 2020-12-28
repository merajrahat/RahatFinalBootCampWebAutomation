package com.amazon.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TestBase {
    private static org.apache.log4j.Logger LOGGER = Logger.getLogger(HomePage.class);


    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(linkText = "Best Sellers")
    private WebElement clickBestSellers;

    @FindBy(id = "nav-cart")
    private WebElement clickOnCart;


    public void clickOnSearchBar() {
        searchBox.sendKeys("Laptop", Keys.RETURN);
        ExtentTestManager.log("User was able to type in search box and press enter");
        sleepFor(3);

    }


    public void ableToScrollDownAndUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleepFor(3);
        ExtentTestManager.log("Scroll Down");
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        sleepFor(3);
        ExtentTestManager.log("Scroll Up");
    }

    public void hoverOverText() {
        WebElement user = driver.findElement(By.linkText("Prime"));

        Actions actions = new Actions(driver);
        actions.moveToElement(user).build().perform();
        ExtentTestManager.log("Hover Over Prime");
        sleepFor(3);
    }

    public void pageBackwardAndForward() {
        clickBestSellers.click();
        ExtentTestManager.log("Click on Best Sellers");
        sleepFor(3);
        driver.navigate().back();
        ExtentTestManager.log("Page Goes Backword");
        sleepFor(2);
        driver.navigate().forward();
        ExtentTestManager.log("Page Goes Forward");
        sleepFor(2);
    }

    public void seeIfThePageRefreshProperlyAfterSearchingAnTiem() {
        clickOnSearchBar();
        driver.navigate().refresh();
        ExtentTestManager.log("Able to refresh the page");
        sleepFor(2);
    }

    public void ableToClickOnCart() {
        clickOnCart.click();
        ExtentTestManager.log("Able to click on cart");
        sleepFor(3);
    }
}