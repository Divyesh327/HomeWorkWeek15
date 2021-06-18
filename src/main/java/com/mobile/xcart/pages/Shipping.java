package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


public class Shipping extends Utility
{
    By shipping = By.xpath("//a[text()='Shipping']");
    By actualMessage = By.id("page-title");

    public void userIsOnShippingPage(){
        Reporter.log("User is on shipping page" + shipping + "<br>");
        mouseclickToElement(shipping,20);
        verifyMessage(actualMessage,15,"Shipping");
    }

}
