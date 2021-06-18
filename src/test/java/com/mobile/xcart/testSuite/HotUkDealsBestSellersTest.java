package com.mobile.xcart.testSuite;

import com.mobile.xcart.customListner.CustomeListner;
import com.mobile.xcart.pages.HotUkDealsBestSellers;
import com.mobile.xcart.testBase.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomeListner.class)
public class HotUkDealsBestSellersTest extends TestBase
{
    HotUkDealsBestSellers bestSellers = new HotUkDealsBestSellers();
    @Test(groups = {"sanity","regression",},priority =4)
    public void bestSellers () throws InterruptedException
    {
        bestSellers.ProductsArrangeByZToA();
        bestSellers.ProductsPriceArrangeHighToLow();

    }
}
