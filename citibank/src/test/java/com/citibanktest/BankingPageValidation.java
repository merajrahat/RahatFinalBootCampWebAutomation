package com.citibanktest;

import com.citibank.pages.BankingPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankingPageValidation extends TestBase {

    private BankingPage bankingPage;

    @BeforeMethod
    public void pageFactorySetup() {

        bankingPage = PageFactory.initElements(driver, BankingPage.class);
    }

    @Test(enabled = false)
    public void validateUserCanSeeBankingOptions() {
        bankingPage.checkTheirBankingOptions();
    }

    @Test(enabled = false)
    public void validateUserCanSeeDeatailsOfSpecificBanking() {
        bankingPage.seeCheckingDetails();
    }

    @Test(enabled = false)
    public void validateUserCanCheckThierPremiumBankingOffer() {
        bankingPage.seeTheirPremiumBankingOffer();
    }
}
