package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility
{
    By welcome = By.xpath("//h1[contains(text(),'Welcome to X-Cart Demo Store!')]");

    public void homePage()
    {
        Reporter.log("Welcome to X-Cart Demo Store!" + welcome + "<br>");
        verifyMessage(welcome, 15, "Welcome to X-Cart Demo Store!");
    }

}
