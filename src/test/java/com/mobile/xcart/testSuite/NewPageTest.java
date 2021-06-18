package com.mobile.xcart.testSuite;

import com.mobile.xcart.customListner.CustomeListner;
import com.mobile.xcart.pages.NewPage;
import com.mobile.xcart.testBase.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomeListner.class)
public class NewPageTest extends TestBase
{
    NewPage homepage = new NewPage();
    @Test(groups = {"sanity","regression",},priority =6)
    public void newArrivalPage ()
    {
        homepage.userIsOnNewArrivalPage();
    }
}
