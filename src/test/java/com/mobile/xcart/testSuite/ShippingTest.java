package com.mobile.xcart.testSuite;

import com.mobile.xcart.customListner.CustomeListner;
import com.mobile.xcart.pages.Shipping;
import com.mobile.xcart.testBase.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomeListner.class)
public class ShippingTest extends TestBase
{
    Shipping homepage = new Shipping();
    @Test(groups = {"sanity","regression",},priority =7)
    public void shippingPage (){
        homepage.userIsOnShippingPage();
    }
}
