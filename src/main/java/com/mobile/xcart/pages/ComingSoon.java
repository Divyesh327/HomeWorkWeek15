package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


public class ComingSoon extends Utility {
    By comingSoon = By.xpath("//a[text()='Coming soon']");
    By actualMessage = By.xpath("//h1[@id='page-title']");
    public void comingSoon()
    {
        Reporter.log("User is on Coming Soon Page " + comingSoon + "<br>");
        mouseclickToElement(comingSoon,10);
        verifyMessage(actualMessage,10,"Coming soon");
    }


}
