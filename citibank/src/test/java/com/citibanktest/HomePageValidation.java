package com.citibanktest;

import com.citibank.pages.HomePage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidation extends TestBase {

    private HomePage homePage;

    @BeforeMethod
    public void pageFactorySetup(){

        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test (enabled = false)
    public void validateSpecialOffersPageCanBeChecked(){

        homePage.chekoutTheirSpecialOffers();
    }

    @Test (enabled = false)
    public void validateScrollToElement(){
        homePage.scrollToElement();
    }

    @Test (enabled = false)
    public void validateUserAbleToLearnMoreAboutCitiBank(){
        homePage.seeTheirStory();
    }
}
