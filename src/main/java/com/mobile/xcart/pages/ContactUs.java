package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;



public class ContactUs extends Utility {
    By contactUs = By.xpath("//a[text()='Contact us']");
    By actualMessage = By.xpath("//h1[@id='page-title']");

    public void userIscontactUsPage() {
        Reporter.log("User is on Contact Us page" + contactUs + "<br>");
        mouseclickToElement(contactUs, 10);
        verifyMessage(actualMessage, 10, "Contact us");


    }
}
