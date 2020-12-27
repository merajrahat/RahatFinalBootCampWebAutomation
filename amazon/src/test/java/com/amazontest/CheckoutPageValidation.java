package com.amazontest;


import com.amazon.pages.CheckoutPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CheckoutPageValidation extends TestBase {


    @Test (enabled = false)
    public void validateCheckoutPage(){
        CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
        checkoutPage.userAbleToCheckoutAProduct();
    }
}
