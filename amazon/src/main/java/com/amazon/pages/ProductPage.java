package com.amazon.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ProductPage extends TestBase {

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(linkText = "HP")
    private WebElement clickFilterChoiceHP;

    @FindBy(linkText = "Under $500")
    private WebElement selectPrice;

    public void clickOnSearchBar() {
        searchBox.sendKeys("Laptop", Keys.RETURN);
        ExtentTestManager.log("User was able to type in search box and press enter");
        sleepFor(3);
    }


    public void productPageValidate() {
        clickOnSearchBar();
        String currentUrl = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/s?k=Laptop&ref=nb_sb_noss";
        Assert.assertTrue(currentUrl.contains(expectedURL));
        ExtentTestManager.log("Able to verify the url is correct");
        sleepFor(3);


    }

    public void ableToFilterSpecificBrandOfLaptop() {
        clickOnSearchBar();
        clickFilterChoiceHP.click();
        ExtentTestManager.log("User choose HP Brand");
        sleepFor(3);

    }

    public void selectSpecificPrice() {
        clickOnSearchBar();
        selectPrice.click();
        ExtentTestManager.log("User choose price under $500");
        sleepFor(3);
    }

}
