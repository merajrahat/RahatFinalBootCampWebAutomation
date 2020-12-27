package com.cignatest;

import com.cigna.pages.HealthPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HealthPageValidation extends TestBase {

    private HealthPage healthPage;

    @BeforeMethod
    public void pageFactorySetup(){

        healthPage = PageFactory.initElements(driver, HealthPage.class);
    }


    @Test (enabled = false)
    public void validateTheirHealthPageOffers(){

        healthPage.checkTheirHealthPage();
    }

    @Test (enabled = false)
    public void validateUserAbleToCheckSpecficDetailsOfAHealthCoverage(){
        healthPage.checkSpecificHealthCoverageOffer();
    }
}
