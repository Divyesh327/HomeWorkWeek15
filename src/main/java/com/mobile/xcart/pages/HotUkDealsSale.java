package com.mobile.xcart.pages;

import com.mobile.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HotUkDealsSale extends Utility
{
    By hotukdeal = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By sale = By.xpath("//a[text()='Sale']");
    By salepage = By.xpath("//h1[@id='page-title']");
    By recommended = By.xpath("//span[contains(text(),'Recommended')]");
    By aToZ = By.linkText("Name A - Z");

    By lowToHigh = By.linkText("Price Low - High");
    By rates = By.partialLinkText("Rates");
    By productArea = By.xpath("//ul[@class='products-grid grid-list']");

    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        mouseclickToElement(hotukdeal, 10);
        mouseclickToElement(sale, 20);
        verifyMessage(salepage, 15, "Sale");
        mouseHoverToElement(recommended, 15);
        mouseclickToElement(aToZ, 20);
        Thread.sleep(700);
        verifyDecendingorder(productArea);
        Reporter.log("user is on sale page " + sale + "<br>");
    }

    public void verifySaleProductsPriceArrangeLowToHigh()
    {
        Reporter.log("user is on sale page " + sale + "<br>");
        mouseclickToElement(hotukdeal, 15);
        mouseclickToElement(sale, 20);
        verifyMessage(salepage, 15, "Sale");
        mouseHoverToElement(recommended, 15);
        mouseclickToElement(lowToHigh, 20);
        verifyDecendingorder(productArea);
    }

    public void verifySaleProductsArrangeByRates() throws InterruptedException
    {
        Reporter.log("user is on sale page " + sale + "<br>");
        mouseclickToElement(hotukdeal, 15);
        mouseclickToElement(sale, 20);
        verifyMessage(salepage, 15, "Sale");
        Thread.sleep(700);
        mouseHoverToElement(recommended, 15);
        Thread.sleep(700);
        mouseclickToElement(rates, 20);
        Thread.sleep(6000);
        verifyDecendingorder(productArea);

    }

}
