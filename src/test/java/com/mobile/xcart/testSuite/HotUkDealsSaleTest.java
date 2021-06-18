package com.mobile.xcart.testSuite;

import com.mobile.xcart.customListner.CustomeListner;
import com.mobile.xcart.pages.HotUkDealsSale;
import com.mobile.xcart.testBase.TestBase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomeListner.class)
public class HotUkDealsSaleTest extends TestBase
{
    HotUkDealsSale sale = new HotUkDealsSale();
    @Test(groups = {"sanity","regression",},priority =5)
    public void salePage () throws InterruptedException
    {
        sale.verifySaleProductsArrangeAlphabetically();
        sale.verifySaleProductsArrangeByRates();
        sale.verifySaleProductsPriceArrangeLowToHigh();
    }
}
