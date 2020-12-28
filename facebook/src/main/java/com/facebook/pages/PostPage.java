package com.facebook.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostPage extends TestBase {



    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]//div[@role='banner']/div[2]/div//input[@role='combobox']")
    private WebElement clickSearchButton;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[2]/div[1]/div[@role='region']//div[@class='aov4n071']/div/div/" +
            "div[2]/div[2]/a[@role='link']/div[1]/div[2]/div/div/div/div/span/span[.='Posts']")
    private WebElement clickOnPost;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]//div[@role='main']//div[@role='feed']/div/div[1]/div/div" +
            "[@role='article']/div/div//div[@class='pfnyh3mw']/div[@role='button']/span[.='44 Comments']")
    private WebElement clickOnComments;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[2]/div[1]/div[@role='main']/div/div//div[@class='du4w35lb l9j0dhe7']" +
            "/div/div/div[@role='article']/div/div/div/div/div/div[2]/div/div[4]/div//div[@class='cwj9ozl2 tvmbv18p']/ul/li[23]/div[1]/div[@role='article']//ul//div[@class='l9j0dhe7 q9uorilb']/span/div[1]/div")
    private WebElement clickOnLike;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[2]/div[1]/div[@role='main']/div/div/div[@class='du4w35lb k4urcfbm l9j0dhe7 sjgh65i0']" +
            "/div/div/div/div[@role='article']/div/div/div/div/div/div[2]/div/div[4]/div//form[@role='presentation']/div//div[@role='textbox']/div/div/div[@class='_1mf _1mj']")
    private WebElement clickOnWriteComment;




    public void ableToLikeAPost(){
        clickSearchButton.sendKeys("Ami Real", Keys.RETURN);
        ExtentTestManager.log("Clicked Find Friends");
        sleepFor(3);
        clickOnPost.click();
        ExtentTestManager.log("Clicked on Post");
        sleepFor(3);
        clickOnComments.click();
        ExtentTestManager.log("Cliked On Comments");
        sleepFor(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ExtentTestManager.log("Scroll Down");
        sleepFor(3);
        clickOnLike.click();
        ExtentTestManager.log("Clicked on Like");
        sleepFor(3);

    }

    public void ableToCommentOnAPost(){
        clickSearchButton.sendKeys("Ami Real", Keys.RETURN);
        ExtentTestManager.log("Clicked Find Friends");
        sleepFor(3);
        clickOnPost.click();
        ExtentTestManager.log("Clicked on Post");
        sleepFor(3);
        clickOnComments.click();
        sleepFor(3);
        ExtentTestManager.log("Cliked On Comments");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleepFor(3);
        ExtentTestManager.log("Scroll Down");

        clickOnWriteComment.sendKeys("Nice Picture",Keys.RETURN);

    }
}
