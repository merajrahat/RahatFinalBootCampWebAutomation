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

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]//div[@role='banner']/div[4]/div[@role='navigation']" +
            "//div[@class='j83agx80 l9j0dhe7']/div[@role='button']/img")
    private WebElement clickMyIcon;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[@role='banner']/div[4]/div[2]/div/div/" +
            "div[1]/div[1]/div//div[@role='dialog']/div/div/div/div/div/div[1]/div/div[1]/a[@role='link']//span[.='Roger Steve']")
    private WebElement clickMyName;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[2]/div[1]//div[@role='main']" +
            "/div[3]//div[@role='tablist']/div/div/a[3]/div[1]/span")
    private WebElement clickMyFriends;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[2]/div[1]//div[@role='main']/div[4]" +
            "/div/div/div/div[1]/div/div//div[@class='buofh1pr hv4rvrfc']/div[1]/a[@role='link']/span[.='Rahat Meraj']")
    private WebElement clickFriendName;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]//div[@role='main']/div[4]/div[2]" +
            "/div/div[2]/div[1]/div/div/div/div[1]/div[@role='button']//span[.='Write something to Rahat...']")
    private WebElement clickCommentToFriend;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[4]/div/div[@class='l9j0dhe7 tkr6xdv7']//div[@class='h3gjbzrl l9j0dhe7']/div[2]/div/div/div" +
            "[@role='dialog']/form[@method='POST']/div/div[1]//div[@role='presentation']//div[@role='textbox']/div/div/div[@class='_1mf _1mj']")
    private WebElement writeCommentToFriend;

    public void ableToFindFriends() {
        clickSearchButton.sendKeys("Ami Real", Keys.RETURN);
        ExtentTestManager.log("Clicked Find Friends");
        sleepFor(3);
        clickSeeAll.click();
        ExtentTestManager.log("Clicked See All");
        sleepFor(3);
    }

    public void ableToSendFriendRequest() {
        ableToFindFriends();
        clickOnFriend.click();
        ExtentTestManager.log("Clicked on specific name");
        sleepFor(3);
    }

    public void ableToAcceptFriendRequest() {
        clickIcon.click();
        ExtentTestManager.log("Clicked on Icon");
        sleepFor(3);
        clickConfirm.click();
        ExtentTestManager.log("Clicked on Confirm");
        sleepFor(3);
    }

    public void ableToCommentOnAFriend() {
        clickMyIcon.click();
        ExtentTestManager.log("Clicked on My Icon");
        sleepFor(3);
        clickMyName.click();
        ExtentTestManager.log("Clicked on My Name");
        sleepFor(3);
        clickMyFriends.click();
        ExtentTestManager.log("Clicked on My Friends");
        sleepFor(3);
        clickFriendName.click();
        ExtentTestManager.log("Cliked on Friend Name");
        sleepFor(3);
        clickCommentToFriend.click();
        ExtentTestManager.log("Clicked Comment");
        sleepFor(3);
        writeCommentToFriend.sendKeys("Nice Photos", Keys.RETURN);
        ExtentTestManager.log("Commented Nice Photos on Friend");
        sleepFor(3);


    }
}
