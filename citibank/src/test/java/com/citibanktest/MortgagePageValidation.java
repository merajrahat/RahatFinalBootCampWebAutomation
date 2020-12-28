package com.citibanktest;

import com.citibank.pages.MortgagePage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MortgagePageValidation extends TestBase {

    @Test(enabled = false)
    public void validateUserAbleToFindMortgageCalculator() {
        MortgagePage mortgagePage = PageFactory.initElements(driver, MortgagePage.class);
        mortgagePage.findMortgageCalculator();
    }
}
