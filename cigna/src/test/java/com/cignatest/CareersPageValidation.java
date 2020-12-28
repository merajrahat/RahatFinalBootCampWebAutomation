package com.cignatest;

import com.cigna.pages.CareersPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CareersPageValidation extends TestBase {

    private CareersPage careersPage;

    @BeforeMethod
    public void pageFactorySetup() {

        careersPage = PageFactory.initElements(driver, CareersPage.class);
    }

    @Test(enabled = false)
    public void validateTheirCareersPageIsAccessible() {
        careersPage.scrollToCareersThenCLick();
    }

    @Test(enabled = false)
    public void validateUserCanCheckCareersForVeterans() {
        careersPage.checkWhatTheyOfferForMilitaryVeteran();
    }
}
