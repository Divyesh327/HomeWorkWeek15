package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;

public class Shopping extends Utility
{
    By hotUkDeal = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By sale = By.xpath("//a[text()='Sale']");
    By salePage = By.xpath("//h1[@id='page-title']");
    By recommended = By.xpath("//span[contains(text(),'Recommended')]");
    By aToZ = By.linkText("Name A - Z");
    By productAToZ =By.xpath("//ul[@class='products-grid grid-list']");
    By avenger = By.linkText("Avengers: Fabrikations Plush [Related Products]");
    By addToCartButton = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-16']");
    By miniCart = By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By viewCart = By.xpath("//span[contains(text(),'View cart')]");
    By yourShoppingCart = By.xpath("//h1[@id='page-title']");
    By amount16 = By.xpath("//input[@id='amount16']");
    By subTotal = By.xpath("//li[@class='subtotal']");
    By total46 = By.xpath("//li[@class='total']");
    By checkOut = By.xpath("//span[contains(text(),'Go to checkout')]");
    By loginAccount = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By email = By.xpath("//input[@id='email']");
    By emailButton = By.xpath("//tbody/tr[2]/td[1]/button[1]");
    By secureCheckOut = By.xpath("//h1[@class='title']");
    String emailId = generatRandomString(3)+"@gmail.com";
    By customerFirstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By customerLastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By shippingStreet = By.xpath("//input[@id='shippingaddress-street']");
    By shippingCity = By.xpath("//input[@id='shippingaddress-city']");
    By shippingCountry = By.xpath("//select[@id='shippingaddress-country-code']");
    By shippingState = By.xpath("//input[@id='shippingaddress-custom-state']");
    By shippingZipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By shippingPhoneNumber = By.xpath("//input[@id='shippingaddress-phone']");
    By profileButton = By.xpath("//input[@id='create_profile']");
    By profilePassword = By.xpath("//input[@id='password']");
    By butoon1 = By.cssSelector("#method128");
    By butoon2 = By.cssSelector("#pmethod6");
    By amount47 = By.xpath("//div[@class='total clearfix']/span[2]");
    By placeOrder = By.xpath("//span[contains(text(),'Place order: $47.22')]");
    By thankYouForOrder = By.xpath("//h1[@id='page-title']");

    String firstName = "Div";
    String lastName = "Soni";
    String streetName= "Morland Gardens";
    String cityName= "Southall";
    String countryName = "UnitedKingdom";
    String stateName = "MiddleSex";
    String password = generatRandomString(3)+generateRandomNumber();
    String zipcode = String.valueOf(generateRandomNumber());
    String phone = String.valueOf(generateRandomNumber());

    public void placeAnOrderAndCreateAAccount () throws InterruptedException
    {
        mouseHoverToElement(hotUkDeal,15);
        mouseclickToElement(sale,15);
        verifyMessage(salePage,15,"Sale");
        Thread.sleep(700);
        mouseHoverToElement(recommended,15);
        Thread.sleep(7000);
        mouseclickToElement(aToZ,15);
        verifyDecendingorder(productAToZ);
        Thread.sleep(700);
        mouseHoverToElement(avenger,15);
        clickOnElement(addToCartButton,15);
        clickOnElement(miniCart,15);
        clickOnElement(viewCart,20);
        Thread.sleep(7000);
        driver.findElements(amount16).clear();
        Thread.sleep(7000);
        sendTextFromElement(amount16,15,"2");
        Thread.sleep(7000);
        mouseHoverToElement(checkOut);
        mouseclickToElement(checkOut,15);
        Thread.sleep(700);
        sendTextFromElement(email,20,emailId);
        clickOnElement(emailButton,20);
        verifyMessage(secureCheckOut,20,"Secure Checkout");
        sendTextFromElement(customerFirstName,20,firstName);
        sendTextFromElement(customerLastName,5,lastName);
        Thread.sleep(7000);
        sendTextFromElement(shippingStreet,5,streetName);

        driver.findElements(shippingCity).clear();
        sendTextFromElement(shippingCity,15,cityName);
        Thread.sleep(700);
        sendTextFromElement(shippingCountry,15,countryName);
        Thread.sleep(700);
        sendTextFromElement(shippingState,15,stateName);
        Thread.sleep(700);
        sendTextFromElement(shippingZipCode,15,zipcode);
        sendTextFromElement(shippingPhoneNumber,15,phone);
        clickOnElement(profileButton,10);
        sendTextFromElement(profilePassword,15,password);
        mouseclickToElement(butoon1,15);
        mouseclickToElement(butoon2,15);
        clickOnElement(placeOrder,15);
        verifyMessage(thankYouForOrder,15,"Thank you for your order");

    }

}
