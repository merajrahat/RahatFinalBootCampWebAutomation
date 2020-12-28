package com.cignatest;

import com.cigna.pages.ProductPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPageValidation extends TestBase {

    private ProductPage productPage;

    @BeforeMethod
    public void pageFactorySetup() {

        productPage = PageFactory.initElements(driver, ProductPage.class);
    }


    @Test(enabled = false)
    public void validateProductsTheyOffer() {
        productPage.checkTheirProducts();

    }

    @Test(enabled = false)
    public void validateProductForDentalPlans() {
        productPage.checkProductForDentalPlans();
    }
}
