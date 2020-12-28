package com.amazon.pages;

import com.peoplentech.finalbootcampwebautomation.base.TestBase;
import com.peoplentech.finalbootcampwebautomation.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends TestBase {

    @FindBy(linkText = "Sign in")
    private WebElement clickSignIn;

    @FindBy(linkText = "Sign Out")
    private WebElement clickSignOut;

    @FindBy(id = "ap_email")
    private WebElement clickEmail;

    @FindBy(id = "ap_password")
    private WebElement clickPassword;

    @FindBy(id = "signInSubmit")
    private WebElement clickSignInButton;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(linkText = "Sony MDRZX110/BLK ZX Series Stereo Headphones (Black)")
    private WebElement clickAnItem;

    @FindBy(id = "add-to-cart-button")
    private WebElement clickAddToCart;

    @FindBy(xpath = "(//input[@class='a-button-input'])[2]")
    private WebElement clickOnCheckout;


    public void userAbleToSignIn() {
        clickSignIn.click();
        ExtentTestManager.log("Click On Sign in");
        sleepFor(3);
        clickEmail.sendKeys("tester.auto@yahoo.com", Keys.RETURN);
        ExtentTestManager.log("Email address entered");
        sleepFor(3);
        clickPassword.sendKeys("practice18");
        ExtentTestManager.log("Password address entered");
        sleepFor(3);
        clickSignInButton.click();
        sleepFor(3);
    }

    public void userAbleToCheckoutAProduct() {
        userAbleToSignIn();
        searchBox.sendKeys("headphone", Keys.RETURN);
        ExtentTestManager.log("User was able to type in search box and press enter");
        sleepFor(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        sleepFor(3);
        clickAnItem.click();
        ExtentTestManager.log("User clicked an item");
        sleepFor(3);
        clickAddToCart.click();
        ExtentTestManager.log("User click add to cart");
        sleepFor(3);
        clickOnCheckout.click();
        ExtentTestManager.log("User click on Proceed to Checkout");
        sleepFor(3);
    }
}
