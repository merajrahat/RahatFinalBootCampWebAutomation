package com.amazontest;

import com.amazon.pages.HomePage;
import com.amazon.pages.ProductPage;
import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPageValidation extends TestBase {

    private ProductPage productPage;

    @BeforeMethod
    public void pageFactorySetup(){
        productPage = PageFactory.initElements(driver, ProductPage.class);
    }


    @Test (enabled = false)
    public void validateFilterChoice(){
        productPage.ableToFilterSpecificBrandOfLaptop();
    }

    @Test (enabled = false)
    public void validateProductPageValidation(){
        productPage.productPageValidate();
    }

    @Test (enabled = false)
    public void validateUserAbleToSelectSpecificPrice(){
        productPage.selectSpecificPrice();
    }
}
