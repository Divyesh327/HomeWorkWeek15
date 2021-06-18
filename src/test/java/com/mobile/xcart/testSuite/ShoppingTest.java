package com.mobile.xcart.testSuite;

import com.mobile.xcart.customListner.CustomeListner;
import com.mobile.xcart.pages.Shopping;
import com.mobile.xcart.testBase.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(CustomeListner.class)
public class ShoppingTest extends TestBase
{
    Shopping order = new Shopping();

    @Test(groups = {"sanity","regression",},priority =8)
    public void placeOrderForCupOfMojoBluetoothSpeaker() throws InterruptedException {
        order.placeAnOrderAndCreateAAccount();


    }
}
