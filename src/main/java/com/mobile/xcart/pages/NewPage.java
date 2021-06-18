package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


public class NewPage extends Utility
{
    By newPage = By.xpath("//a[text()='New!']");
    By actualMessage = By.xpath("//h1[@id='page-title']");

    public void userIsOnNewArrivalPage(){
        Reporter.log("User is on new page" + newPage + "<br>");
        mouseclickToElement(newPage,20);
        verifyMessage(actualMessage,15,"New arrivals");
    }

}
