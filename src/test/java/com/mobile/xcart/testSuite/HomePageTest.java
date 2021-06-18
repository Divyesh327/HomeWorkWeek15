package com.mobile.xcart.testSuite;

import com.mobile.xcart.customListner.CustomeListner;
import com.mobile.xcart.pages.HomePage;
import com.mobile.xcart.testBase.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomeListner.class)
public class HomePageTest extends TestBase
{
    HomePage xCart = new HomePage();

    @Test (groups = {"smoke"},priority =1)
    public void userIsOnHomePage (){
        xCart.homePage();

    }
}
