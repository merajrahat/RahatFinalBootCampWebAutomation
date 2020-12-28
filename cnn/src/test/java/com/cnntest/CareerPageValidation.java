package com.cnntest;

import com.cnn.pages.CareerPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CareerPageValidation extends TestBase {

    @Test(enabled = false)
    public void validateUserAbleCheckCareerPage() {
        CareerPage careerPage = PageFactory.initElements(driver, CareerPage.class);
        careerPage.seeTheirCareerOptions();
    }
}
