package com.mobile.xcart.testSuite;

import com.mobile.xcart.customListner.CustomeListner;
import com.mobile.xcart.pages.ComingSoon;
import com.mobile.xcart.testBase.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomeListner.class)
public class ComingSoonTest extends TestBase
{
    ComingSoon home = new ComingSoon();

    @Test(groups = {"sanity","regression",},priority =2)
    public void userIsOnComingSoonPage(){
        home.comingSoon();
    }
}
