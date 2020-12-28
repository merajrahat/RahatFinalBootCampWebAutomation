package com.citibanktest;

import com.citibank.pages.FeaturePage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FeaturePageValidation extends TestBase {

    private FeaturePage featurePage;

    @BeforeMethod
    public void pageFactorySetup(){

        featurePage = PageFactory.initElements(driver, FeaturePage.class);
    }

    @Test (enabled = false)
    public void validateAbleToLookAtFeaturedCreditCardOptions(){

        featurePage.checkFreaturedCreditCardOptions();
    }

    @Test (enabled = false)
    public void validateAbleToSeeAllCreditCards(){

        featurePage.checkAllCreditCards();
    }

    @Test (enabled = false)
    public void validateUserAbleToCheckAllTheirZeroAPRCreditCards(){
        featurePage.checkThierAllZeroAPRCreditCards();
    }

}
