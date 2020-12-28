package com.facebook.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends TestBase {



    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]//div[@role='banner']/div[2]/div//input[@role='combobox']")
    private WebElement clickSearchButton;


    public void searchNews(){
        clickSearchButton.sendKeys("News", Keys.RETURN);
        ExtentTestManager.log("Searched for news");
        sleepFor(4);
    }

}
