package com.facebook.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FriendPage extends TestBase {


    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]//div[@role='banner']/div[2]/div//input[@role='combobox']")
    private WebElement clickSearchButton;

    @FindBy(linkText = "See All")
    private WebElement clickSeeAll;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]//div[@role='main']//div[@role='feed']/div/div" +
            "[1]/div/div[@role='article']/div/div//div[@role='button']/i[@class='hu5pjgll lzf7d6o1 sp_MmWvPypDoMD sx_d4cc6e']")
    private WebElement clickOnFriend;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]//div[@role='banner']/div[3]//div[@role='navigation']/ul/li[2]/span/div/a[@role='link']")
    private WebElement clickIcon;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[@role='navigation']/div//div[@class='rtmu0sqt']" +
            "/div[2]/div/div/a[@role='link']//div[@class='d2edcug0']/div/div[1]/div[@role='button']/div[1]/div/span/span[.='Confirm']")
    private WebElement clickConfirm;


    public void ableToFindFriends() {
        clickSearchButton.sendKeys("Ami Real", Keys.RETURN);
        ExtentTestManager.log("Clicked Find Friends");
        sleepFor(3);
        clickSeeAll.click();
        ExtentTestManager.log("Clicked See All");
        sleepFor(3);
    }

    public void ableToSendFriendRequest(){
        ableToFindFriends();
        clickOnFriend.click();
        ExtentTestManager.log("Clicked on specific name");
        sleepFor(3);
    }

    public void ableToAcceptFriendRequest(){
        clickIcon.click();
        ExtentTestManager.log("Clicked on Icon");
        sleepFor(3);
        clickConfirm.click();
        ExtentTestManager.log("Clicked on Confirm");
        sleepFor(3);
    }

}
