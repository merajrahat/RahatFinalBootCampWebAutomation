package com.facebook.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends TestBase {

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]//div[@role='banner']/div[4]/div[@role='navigation']" +
            "//div[@class='j83agx80 l9j0dhe7']/div[@role='button']/img")
    private WebElement clickMyIcon;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[@role='banner']/div[4]/div[2]/div/div/" +
            "div[1]/div[1]/div//div[@role='dialog']/div/div/div/div/div/div[1]/div/div[1]/a[@role='link']//span[.='Roger Steve']")
    private WebElement clickMyName;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]//div[@role='main']//div[@class='cbu4d94t j83agx80']" +
            "/div[1]/div/div/div/div[@role='button']/div/div[2]//div[@role='button']/i[@class='hu5pjgll lzf7d6o1 sp_yjnFlCrNQJ_ sx_e6c583']")
    private WebElement clickPhoto;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]//div[@class='h3gjbzrl l9j0dhe7']/div[2]/div/div/div[@role='dialog']/div[3]" +
            "/div[1]/div[1]/div[@role='button']/div[1]/div[2]/span/span[.='Upload Photo']")
    private WebElement clickUploadPhoto;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]//div[@role='main']" +
            "//div[@class='cbu4d94t j83agx80']/div[2]/div/div/div[2]/div/span//div[@role='button']")
    private WebElement clickAddBio;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[@role='main']" +
            "//div[@class='cbu4d94t j83agx80']/div[2]/div/div/div[2]/div/span//textarea[@placeholder='Describe who you are']")
    private WebElement writeBio;

    @FindBy(xpath = "//html[@id='facebook']/body/div[1]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[@role='main']/div[1]" +
            "//div[@class='cbu4d94t j83agx80']/div[2]/div/div/div[2]/div/span//div[@class='j83agx80']/div[@role='button']/div[1]/div/span/span[.='Save']")
    private WebElement clickSave;


    public void ableToUploadAPhoto() {
        clickMyIcon.click();
        ExtentTestManager.log("Clicked on My Icon");
        sleepFor(3);
        clickMyName.click();
        ExtentTestManager.log("Clicked on My Name");
        sleepFor(3);
        clickPhoto.click();
        ExtentTestManager.log("Clicked on Photo");
        sleepFor(3);
        clickUploadPhoto.click();
        ExtentTestManager.log("Clicked on Upload Photo");
        sleepFor(3);
    }

    public void ableToAddBioInMyProfile(){
        clickMyIcon.click();
        ExtentTestManager.log("Clicked on My Icon");
        sleepFor(3);
        clickMyName.click();
        ExtentTestManager.log("Clicked on My Name");
        sleepFor(3);
        clickAddBio.click();
        ExtentTestManager.log("Clicked on Add Bio");
        sleepFor(3);
        writeBio.sendKeys("I like Automation");
        ExtentTestManager.log("Wrote: I like Automation");
        sleepFor(3);
        clickSave.click();
        ExtentTestManager.log("Clicked Saved");
        sleepFor(3);

    }
}
